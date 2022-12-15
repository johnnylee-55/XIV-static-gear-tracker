package com.promineotech.tracker.service;

import org.springframework.stereotype.Service;
import com.promineotech.tracker.entity.RaidingStatic;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultTrackerService implements TrackerService {

  @Override
  public RaidingStatic fetchRaidingStatic(Integer raidingStaticId) {
    log.info("The fetchRaidingStatic method was called with raidingStaticId={}", raidingStaticId);
    
    return null;
  }

}
