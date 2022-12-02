package com.promineotech.tracker.controller;

import org.springframework.web.bind.annotation.RestController;
import com.promineotech.tracker.entity.RaidingStatic;

@RestController
public class BasicGearTrackerController implements GearTrackerController {

  @Override
  public RaidingStatic fetchRaidingStatic(Integer raidingStaticId) {
    
    return null;
  }

}
