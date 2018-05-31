package com.ramakant.demo.common;

import java.util.HashMap;
import java.util.Map;

public class SiteMap {
    public static final Map<String, String> siteIdToSiteNameMap = new HashMap<String, String>(){{
        put("desktop_web","desktop web");
        put("mobile_web","mobile web");
        put("android","android");
        put("ios","iOS");
    }};

    public static final Map<String, String> siteNameToSiteIdMap = new HashMap<String, String>(){{
        put("desktop web", "desktop_web");
        put("mobile web", "mobile_web");
        put("android","android");
        put("iOS", "ios");
    }};
}
