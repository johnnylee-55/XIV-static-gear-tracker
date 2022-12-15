package com.promineotech.tracker.service;

import com.promineotech.tracker.entity.RaidingStatic;

public interface TrackerService {

  /**
   * @param raidingStaticId
   * @return
   */
  RaidingStatic fetchRaidingStatic(Integer raidingStaticId);
  
}
