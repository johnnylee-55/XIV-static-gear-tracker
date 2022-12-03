package com.promineotech.tracker.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import com.promineotech.tracker.controller.support.FetchStaticTestSupport;
import com.promineotech.tracker.entity.PlayerCharacter;
import com.promineotech.tracker.entity.RaidingStatic;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class FetchStaticTest extends FetchStaticTestSupport {

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

  @Test
  void testThatListOfPlayerCharacterIsReturnedWhenValidStaticIdIsSupplied() {
    // given: a valid static ID and URI
    Integer raidingStaticId = 2;
    String uri = String.format("%s?raidingStaticId=%d", getUri(), raidingStaticId);

    // when: a connection is made to the URI
    ResponseEntity<List<PlayerCharacter>> response = getRestTemplate().exchange(uri, HttpMethod.GET,
        null, new ParameterizedTypeReference<>() {});

    // then: 200 (OK) status code is returned
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    
    // and: the actual list returned is the same as the expected list
    List<PlayerCharacter> expected = buildExpected();
    System.out.println(expected);
    assertThat(response.getBody()).isEqualTo(expected);
  }


}
