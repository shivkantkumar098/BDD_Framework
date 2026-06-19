package com.javaAT.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String testName) throws IOException {
        String dir = System.getProperty("user.dir") + File.separator + "screenshots";
        File directory = new File(dir);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        String path = dir + File.separator + testName + ".png";

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(path));

        return path;
    }
}