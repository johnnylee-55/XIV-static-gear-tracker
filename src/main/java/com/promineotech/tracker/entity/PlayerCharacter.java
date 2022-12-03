package com.promineotech.tracker.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerCharacter {
  private Integer playerCharacterId;
  private String playerCharacterName;
  private Integer raidingStaticId;
  private Job job;
}
