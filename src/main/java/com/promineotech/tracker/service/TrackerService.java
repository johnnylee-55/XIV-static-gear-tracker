package com.promineotech.tracker.service;

import java.util.List;
import com.promineotech.tracker.entity.PlayerCharacter;
import com.promineotech.tracker.entity.RaidingStatic;

public interface TrackerService {

  /**
   * @param raidingStaticId
   * @return
   */
  RaidingStatic fetchRaidingStatic(Integer raidingStaticId);

  /**
   * @param raidingStaticId
   * @return
   */
  List<PlayerCharacter> fetchRaidingStaticMembers(Integer raidingStaticId);
  
}
