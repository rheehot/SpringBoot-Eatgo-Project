package com.devch.api.eatgo.domain;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * description: Restaurant Test 클래스
 * @author changhwan kim
 * @since 2021/01/04
 */

@SpringBootTest
class RestaurantTests {

  @Test
  void creation() {
    Restaurant restaurant = new Restaurant(" ", "Bab zip");
    assertThat(restaurant.getName()).isEqualTo("Bab zip");
    assertThat(restaurant.getAddress()).isEqualTo("Seoul");
  }

  @Test
  void information(){
    Restaurant restaurant = new Restaurant("Seoul", "Bab zip");
    assertThat(restaurant.getInformation()).isEqualTo("Bab zip in Seoul");
  }
}