package com.promineotech.tracker.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.promineotech.tracker.controller.support.FetchJeepTestSupport;
import com.promineotech.tracker.entity.RaidingStatic;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class FetchStaticTest extends FetchJeepTestSupport {

  @Test
  void testThatStaticsAreReturnedWhenAValidStaticIDIsSupplied() {
    // given: a valid static ID and URI
    Integer raidingStaticId = 1;
    String uri = String.format("%s?raidingStaticId=%d", getUri(), raidingStaticId);

    // when: a connection is made to the URI
    ResponseEntity<RaidingStatic> response =
        getRestTemplate().getForEntity(uri, RaidingStatic.class);

    // then: 200 (OK) status code is returned
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

  }

}
