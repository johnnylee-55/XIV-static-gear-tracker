package com.promineotech.tracker.entity;

import java.util.LinkedList;
import java.util.List;

public class RaidingStatic {
  
  private Integer raidingStaticId;
  private String raidingStaticName;
  private List<PlayerCharacter> playerCharacters = new LinkedList<>();
  
  public Integer getRaidingStaticId() {
    return raidingStaticId;
  }
}
