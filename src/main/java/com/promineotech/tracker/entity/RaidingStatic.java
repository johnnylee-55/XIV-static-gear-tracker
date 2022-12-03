package com.promineotech.tracker.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RaidingStatic {
  private Integer raidingStaticId;
  private String raidingStaticName;
}
