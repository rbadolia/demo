package com.ramakant.demo.test.unit.common;

import com.ramakant.demo.common.MonthMaps;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MonthMapTests {
    @Test
    public void MonthMap_MonthIdToMonthMap_Returns_JANUARY_WhenKeyIs_1() {
        assertThat(MonthMaps.monthIdToMonthMap.get(1)).isEqualTo("JANUARY");
    }

    @Test
    public void MonthMap_MonthIdToMonthMap_Returns_FEBRUARY_WhenKeyIs_2() {
        assertThat(MonthMaps.monthIdToMonthMap.get(2)).isEqualTo("FEBRUARY");
    }

    @Test
    public void MonthMap_MonthIdToMonthMap_Returns_MARCH_WhenKeyIs_3() {
        assertThat(MonthMaps.monthIdToMonthMap.get(3)).isEqualTo("MARCH");
    }

    @Test
    public void MonthMap_MonthIdToMonthMap_Returns_APRIL_WhenKeyIs_4() {
        assertThat(MonthMaps.monthIdToMonthMap.get(4)).isEqualTo("APRIL");
    }

    @Test
    public void MonthMap_MonthIdToMonthMap_Returns_MAY_WhenKeyIs_5() {
        assertThat(MonthMaps.monthIdToMonthMap.get(5)).isEqualTo("MAY");
    }

    @Test
    public void MonthMap_MonthIdToMonthMap_Returns_JUNE_WhenKeyIs_6() {
        assertThat(MonthMaps.monthIdToMonthMap.get(6)).isEqualTo("JUNE");
    }

    @Test
    public void MonthMap_MonthIdToMonthMap_Returns_JULY_WhenKeyIs_7() {
        assertThat(MonthMaps.monthIdToMonthMap.get(7)).isEqualTo("JULY");
    }

    @Test
    public void MonthMap_MonthIdToMonthMap_Returns_AUGUST_WhenKeyIs_8() {
        assertThat(MonthMaps.monthIdToMonthMap.get(8)).isEqualTo("AUGUST");
    }

    @Test
    public void MonthMap_MonthIdToMonthMap_Returns_SEPTEMBER_WhenKeyIs_9() {
        assertThat(MonthMaps.monthIdToMonthMap.get(9)).isEqualTo("SEPTEMBER");
    }

    @Test
    public void MonthMap_MonthIdToMonthMap_Returns_OCTOBER_WhenKeyIs_10() {
        assertThat(MonthMaps.monthIdToMonthMap.get(10)).isEqualTo("OCTOBER");
    }

    @Test
    public void MonthMap_MonthIdToMonthMap_Returns_NOVEMBER_WhenKeyIs_11() {
        assertThat(MonthMaps.monthIdToMonthMap.get(11)).isEqualTo("NOVEMBER");
    }

    @Test
    public void MonthMap_MonthIdToMonthMap_Returns_DECEMBER_WhenKeyIs_12() {
        assertThat(MonthMaps.monthIdToMonthMap.get(12)).isEqualTo("DECEMBER");
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_1_WhenKeyIs_1() {
        assertThat(MonthMaps.monthToIdMap.get("1")).isEqualTo(1);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_2_WhenKeyIs_2() {
        assertThat(MonthMaps.monthToIdMap.get("2")).isEqualTo(2);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_3_WhenKeyIs_3() {
        assertThat(MonthMaps.monthToIdMap.get("3")).isEqualTo(3);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_4_WhenKeyIs_4() {
        assertThat(MonthMaps.monthToIdMap.get("4")).isEqualTo(4);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_5_WhenKeyIs_5() {
        assertThat(MonthMaps.monthToIdMap.get("5")).isEqualTo(5);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_6_WhenKeyIs_6() {
        assertThat(MonthMaps.monthToIdMap.get("6")).isEqualTo(6);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_7_WhenKeyIs_7() {
        assertThat(MonthMaps.monthToIdMap.get("7")).isEqualTo(7);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_8_WhenKeyIs_8() {
        assertThat(MonthMaps.monthToIdMap.get("8")).isEqualTo(8);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_9_WhenKeyIs_9() {
        assertThat(MonthMaps.monthToIdMap.get("9")).isEqualTo(9);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_10_WhenKeyIs_10() {
        assertThat(MonthMaps.monthToIdMap.get("10")).isEqualTo(10);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_11_WhenKeyIs_11() {
        assertThat(MonthMaps.monthToIdMap.get("11")).isEqualTo(11);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_12_WhenKeyIs_12() {
        assertThat(MonthMaps.monthToIdMap.get("12")).isEqualTo(12);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_1_WhenKeyIs_JAN() {
        assertThat(MonthMaps.monthToIdMap.get("JAN")).isEqualTo(1);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_2_WhenKeyIs_FEB() {
        assertThat(MonthMaps.monthToIdMap.get("FEB")).isEqualTo(2);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_3_WhenKeyIs_MAR() {
        assertThat(MonthMaps.monthToIdMap.get("MAR")).isEqualTo(3);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_4_WhenKeyIs_APR() {
        assertThat(MonthMaps.monthToIdMap.get("APR")).isEqualTo(4);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_5_WhenKeyIs_MAY() {
        assertThat(MonthMaps.monthToIdMap.get("MAY")).isEqualTo(5);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_6_WhenKeyIs_JUN() {
        assertThat(MonthMaps.monthToIdMap.get("JUN")).isEqualTo(6);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_7_WhenKeyIs_JUL() {
        assertThat(MonthMaps.monthToIdMap.get("JUL")).isEqualTo(7);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_8_WhenKeyIs_AUG() {
        assertThat(MonthMaps.monthToIdMap.get("AUG")).isEqualTo(8);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_9_WhenKeyIs_SEP() {
        assertThat(MonthMaps.monthToIdMap.get("SEP")).isEqualTo(9);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_10_WhenKeyIs_OCT() {
        assertThat(MonthMaps.monthToIdMap.get("OCT")).isEqualTo(10);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_11_WhenKeyIs_NOV() {
        assertThat(MonthMaps.monthToIdMap.get("NOV")).isEqualTo(11);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_12_WhenKeyIs_DEC() {
        assertThat(MonthMaps.monthToIdMap.get("DEC")).isEqualTo(12);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_1_WhenKeyIs_JANUARY() {
        assertThat(MonthMaps.monthToIdMap.get("JAN")).isEqualTo(1);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_2_WhenKeyIs_FEBRUARY() {
        assertThat(MonthMaps.monthToIdMap.get("FEB")).isEqualTo(2);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_3_WhenKeyIs_MARCH() {
        assertThat(MonthMaps.monthToIdMap.get("MAR")).isEqualTo(3);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_4_WhenKeyIs_APRIL() {
        assertThat(MonthMaps.monthToIdMap.get("APR")).isEqualTo(4);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_6_WhenKeyIs_JUNE() {
        assertThat(MonthMaps.monthToIdMap.get("JUN")).isEqualTo(6);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_7_WhenKeyIs_JULY() {
        assertThat(MonthMaps.monthToIdMap.get("JUL")).isEqualTo(7);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_8_WhenKeyIs_AUGUST() {
        assertThat(MonthMaps.monthToIdMap.get("AUG")).isEqualTo(8);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_9_WhenKeyIs_SEPTEMBER() {
        assertThat(MonthMaps.monthToIdMap.get("SEP")).isEqualTo(9);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_10_WhenKeyIs_OCTOBER() {
        assertThat(MonthMaps.monthToIdMap.get("OCT")).isEqualTo(10);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_11_WhenKeyIs_NOVEVMBER() {
        assertThat(MonthMaps.monthToIdMap.get("NOV")).isEqualTo(11);
    }

    @Test
    public void MonthMap_MonthToIdMap_Returns_12_WhenKeyIs_DECEMBER() {
        assertThat(MonthMaps.monthToIdMap.get("DEC")).isEqualTo(12);
    }
}
