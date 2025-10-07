package com.ishir.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SiteCrawlerExport {

    private static final String BASE_URL = "https://www.ishir.com";
    private static final Set<String> visited = new HashSet<>();
    private static final Queue<String> toVisit = new LinkedList<>();
    private static WebDriver driver;

    // track templates we already exported
    private static final Set<String> exportedTemplates = new HashSet<>();

    public static void main(String[] args) {
        driver = new ChromeDriver();
        toVisit.add(BASE_URL);

        try (FileWriter csvWriter = new FileWriter("getintouch_links_unique.csv")) {
            csvWriter.append("Template,Page URL,Page Title,Anchor Text,Anchor Href\n");

            while (!toVisit.isEmpty()) {
                String url = toVisit.poll();

                if (visited.contains(url)) continue;
                visited.add(url);

                try {
                    driver.get(url);
                    String title = driver.getTitle().replace(",", " ");

                    List<WebElement> links = driver.findElements(By.tagName("a"));
                    for (WebElement link : links) {
                        String href = link.getAttribute("href");

                        if (href != null && href.contains("get-in-touch.htm")) {
                            String text = link.getText().trim().replace(",", " ");
                            if (text.isEmpty()) text = "N/A";

                            String template = classifyTemplate(url);

                            // only keep first occurrence for each template
                            if (!exportedTemplates.contains(template)) {
                                exportedTemplates.add(template);

                                System.out.println("✅ Exporting: " + template + " → " + url);

                                csvWriter.append(template).append(",")
                                        .append(url).append(",")
                                        .append(title).append(",")
                                        .append(text).append(",")
                                        .append(href).append("\n");
                            }
                        }

                        // Crawl further if same domain
                        if (href != null && href.startsWith(BASE_URL) && !visited.contains(href)) {
                            toVisit.add(href);
                        }
                    }

                } catch (Exception e) {
                    System.out.println("⚠️ Failed to load: " + url);
                }
            }

            System.out.println("\n✅ Done. Exported to getintouch_links_unique.csv");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    private static String classifyTemplate(String url) {
        if (url.contains("/blog/")) return "Blog Page";
        if (url.contains("/event/")) return "Event Page";
        if (url.contains("/job-openings/")) return "Job Opening Page";
        if (url.contains("/newsletter/")) return "Newsletter Page";
        if (url.contains("/company.htm")) return "Company Page";
        if (url.contains("/team.htm")) return "Team Page";
        if (url.contains("/careers.htm")) return "Careers Page";
        // fallback: treat URL as unique
        return "Generic-" + url;
    }
}
