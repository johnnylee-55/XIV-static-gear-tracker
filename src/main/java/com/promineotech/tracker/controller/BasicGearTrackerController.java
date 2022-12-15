package com.promineotech.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
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
    log.debug("raidingStaticId={}", raidingStaticId);
    return trackerService.fetchRaidingStatic(raidingStaticId);
  }

}
