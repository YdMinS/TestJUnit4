package com.ydmins.TestJUnit4.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HelloResponseDtoTest {

    @Test
    public void lombok_test(){
        // given
        String name = "test";
        int amount = 10;
        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);
        // then
        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
