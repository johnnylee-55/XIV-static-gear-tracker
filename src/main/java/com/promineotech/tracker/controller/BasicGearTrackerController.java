package com.promineotech.tracker.controller;

import org.springframework.web.bind.annotation.RestController;
import com.promineotech.tracker.entity.RaidingStatic;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BasicGearTrackerController implements GearTrackerController {

  @Override
  public RaidingStatic fetchRaidingStatic(Integer raidingStaticId) {
    log.info("raidingStaticId={}", raidingStaticId);
    return null;
  }

}
