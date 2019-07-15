package com.tws.refactoring.extract_variable;

public class BannerRender {
    public String renderBanner(String platform, String browser) {
        String upperCaseOfPlatform = platform.toUpperCase();
        String upperCaseOfBrowser =browser.toUpperCase();

        return ((upperCaseOfPlatform.indexOf("MAC") > -1) &&
                (upperCaseOfBrowser.indexOf("IE") > -1))?"IE on Mac?":"banner";

    }
}
