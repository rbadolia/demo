package com.ramakant.demo.test.unit.common;

import com.ramakant.demo.common.Round;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class RoundTests {
    @Test
    public void Round_IllegalArgumentException_WhenPlacesAreLessThenZero() {
        Throwable thrown = catchThrowable(() ->
                Round.getRoundedDouble(1, -1)
        );
        Assertions.assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void Round_FiveDecimalPlacesToTwo() {
        double rounded = Round.getRoundedDouble(1.89677, 2);
        assertThat(rounded).isEqualTo(1.90);
    }
}
