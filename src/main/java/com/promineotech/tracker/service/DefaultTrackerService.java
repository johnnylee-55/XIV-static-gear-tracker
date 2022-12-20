package com.promineotech.tracker.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.promineotech.tracker.dao.TrackerDao;
import com.promineotech.tracker.entity.PlayerCharacter;
import com.promineotech.tracker.entity.RaidingStatic;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultTrackerService implements TrackerService {

  @Autowired
  private TrackerDao trackerDao;

  @Override
  public RaidingStatic fetchRaidingStatic(Integer raidingStaticId) {
    log.info("SERVICE: fetchRaidingStatic method called with raidingStaticId={}", raidingStaticId);

    return trackerDao.fetchRaidingStatic(raidingStaticId);
  }

  @Override
  public List<PlayerCharacter> fetchRaidingStaticMembers(Integer raidingStaticId) {
    log.info("SERVICE: fetchRaidingStaticMembers method called with raidingStaticId={}",
        raidingStaticId);
    return trackerDao.fetchRaidingStaticMembers(raidingStaticId);
  }

}
