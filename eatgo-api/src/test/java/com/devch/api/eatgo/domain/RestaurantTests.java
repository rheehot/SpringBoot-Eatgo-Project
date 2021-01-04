package com.devch.api.eatgo.domain;

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
  void create() {
    Restaurant restaurant = new Restaurant("bab zip", "");
    assertThat(restaurant.getName()).isEqualTo("bab zip");
  }

  @Test
  void information() {
    Restaurant restaurant = new Restaurant("bab zip", "Seoul");
    assertThat(restaurant.getInformation()).isEqualTo("bab zip in Seoul");
  }
}