package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.BannerRender;
import com.tws.refactoring.extract_variable.PriceCalculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BannerRenderTest {
    @Test
    public void should_IE_on_Mac_when_call_renderBanner_with_MAC_and_IE() {
        //given
        BannerRender bannerRender = new BannerRender();
        String s = "IE on Mac?";
        //when
        String result = bannerRender.renderBanner("MAC", "IE");

        //then
        assertEquals(result,s );
    }

    @Test
    public void should_banner_when_call_renderBanner_with_MAC_and_IE() {
        //given
        BannerRender bannerRender = new BannerRender();
        String s = "banner";
        //when
        String result = bannerRender.renderBanner("haha", "IE");

        //then
        assertEquals(result,s );
    }
}
