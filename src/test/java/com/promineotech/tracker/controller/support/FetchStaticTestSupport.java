package com.promineotech.tracker.controller.support;

import java.util.LinkedList;
import java.util.List;
import com.promineotech.tracker.entity.Job;
import com.promineotech.tracker.entity.PlayerCharacter;

public class FetchStaticTestSupport extends BaseTest {
  
  /**
   * Creates a list of PlayerCharacter for test
   * @return
   */
  protected List<PlayerCharacter> buildExpected() {
    List<PlayerCharacter> list = new LinkedList<>();
    
    // @formatter:off
    list.add(PlayerCharacter.builder()
        .playerCharacterName("Thancred Waters").job(Job.GNB)
        .build());
    list.add(PlayerCharacter.builder()
        .playerCharacterName("Warrior of Light").job(Job.PLD)
        .build());
    list.add(PlayerCharacter.builder()
        .playerCharacterName("Urianger Augurelt").job(Job.AST)
        .build());
    list.add(PlayerCharacter.builder()
        .playerCharacterName("Alphinaud Leveilleur").job(Job.SGE)
        .build());
    list.add(PlayerCharacter.builder()
        .playerCharacterName("Y'shtola Rhul").job(Job.BLM)
        .build());
    list.add(PlayerCharacter.builder()
        .playerCharacterName("Estinien Wymrblood").job(Job.DRG)
        .build());
    list.add(PlayerCharacter.builder()
        .playerCharacterName("Alisaie Leveilleur").job(Job.RDM)
        .build());
    list.add(PlayerCharacter.builder()
        .playerCharacterName("G'raha Tia").job(Job.BLM)
        .build());
    // @formatter:on
    
    return list;
  }


}
