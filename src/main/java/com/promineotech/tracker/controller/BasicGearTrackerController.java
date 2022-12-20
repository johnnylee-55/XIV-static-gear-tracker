package com.promineotech.tracker.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.tracker.entity.PlayerCharacter;
import com.promineotech.tracker.entity.RaidingStatic;
import com.promineotech.tracker.service.TrackerService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BasicGearTrackerController implements GearTrackerController {

  @Autowired
  private TrackerService trackerService;
  
  @Override
  public RaidingStatic fetchRaidingStatic(Integer raidingStaticId) {
    log.debug("Controller: fetchRaidingStatic called with raidingStaticId={}", raidingStaticId);
    return trackerService.fetchRaidingStatic(raidingStaticId);
  }

  @Override
  public List<PlayerCharacter> fetchRaidingStaticMembers(Integer raidingStaticId) {
    log.debug("Controller: fetchRaidingStaticMembers called with raidingStaticId={]", raidingStaticId);
    return trackerService.fetchRaidingStaticMembers(raidingStaticId);
  }

}
