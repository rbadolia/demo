package com.ramakant.demo.test.unit.common;

import com.ramakant.demo.common.SiteMap;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SiteMapTests {
    @Test
    public void SiteMap_SiteIdToSiteNameMap_Returns_desktopSPACEweb_WhenKeyIs_desktopUNDERSCOREweb() {
        assertThat(SiteMap.siteIdToSiteNameMap.get("desktop_web")).isEqualTo("desktop web");
    }

    @Test
    public void SiteMap_SiteIdToSiteNameMap_Returns_mobileSPACEweb_WhenKeyIs_mobileUNDERSCOREweb() {
        assertThat(SiteMap.siteIdToSiteNameMap.get("mobile_web")).isEqualTo("mobile web");
    }

    @Test
    public void SiteMap_SiteIdToSiteNameMap_Returns_android_WhenKeyIs_android() {
        assertThat(SiteMap.siteIdToSiteNameMap.get("android")).isEqualTo("android");
    }

    @Test
    public void SiteMap_SiteIdToSiteNameMap_Returns_iOS_WhenKeyIs_ios() {
        assertThat(SiteMap.siteIdToSiteNameMap.get("ios")).isEqualTo("iOS");
    }

    @Test
    public void SiteMap_SiteNameToSiteIdMapp_Returns_desktopUNDERSCOREweb_WhenKeyIs_desktopSPACEEweb() {
        assertThat(SiteMap.siteNameToSiteIdMap.get("desktop web")).isEqualTo("desktop_web");
    }

    @Test
    public void SiteMap_SiteNameToSiteIdMap_Returns_mobileUNDERSCOREweb_WhenKeyIs_mobileSPACEweb() {
        assertThat(SiteMap.siteNameToSiteIdMap.get("mobile web")).isEqualTo("mobile_web");
    }

    @Test
    public void SiteMap_SiteNameToSiteIdMap_Returns_android_WhenKeyIs_android() {
        assertThat(SiteMap.siteNameToSiteIdMap.get("android")).isEqualTo("android");
    }

    @Test
    public void SiteMap_SiteNameToSiteIdMap_Returns_ios_WhenKeyIs_iOS() {
        assertThat(SiteMap.siteNameToSiteIdMap.get("iOS")).isEqualTo("ios");
    }
}
