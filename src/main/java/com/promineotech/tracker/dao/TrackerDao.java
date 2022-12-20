package com.promineotech.tracker.dao;

import java.util.List;
import com.promineotech.tracker.entity.PlayerCharacter;
import com.promineotech.tracker.entity.RaidingStatic;

public interface TrackerDao {

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
