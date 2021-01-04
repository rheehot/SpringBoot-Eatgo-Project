package com.devch.api.eatgo.domain;

/**
 * description: 레스토랑 domain
 *
 * @author changhwan kim
 * @since 2021/01/04
 */
public class Restaurant {

  private String name;

  private String address;

  public Restaurant(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }
  public String getAddress() {
    return address;
  }

  public String getInformation() {
    return name + " in " + address;
  }
}
