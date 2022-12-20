package com.promineotech.tracker.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.promineotech.tracker.entity.Job;
import com.promineotech.tracker.entity.PlayerCharacter;
import com.promineotech.tracker.entity.RaidingStatic;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultTrackerDao implements TrackerDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;

  @Override
  public RaidingStatic fetchRaidingStatic(Integer raidingStaticId) {
    log.debug("DAO: fetchRaidingStatic method called with fetchRaidingStatic={}", raidingStaticId);
    
    return null;
  }

  @Override
  public List<PlayerCharacter> fetchRaidingStaticMembers(Integer raidingStaticId) {
    log.debug("DAO: fetchRaidingStaticMembers called with raidingStaticId={}", raidingStaticId);

    //@formatter:off
    String sql = ""
        + "SELECT * "
        + "FROM static_composition "
        + "WHERE static_id = :static_id";
    //@formatter:on

    Map<String, Object> params = new HashMap<>();
    params.put("static_id", raidingStaticId);

    return jdbcTemplate.query(sql, params, new RowMapper<>() {

      @Override
      public PlayerCharacter mapRow(ResultSet rs, int rowNum) throws SQLException {
        //@formatter:off
        return PlayerCharacter.builder()
            .playerCharacterName(rs.getString("character_name"))
            .job(Job.valueOf(rs.getString("job")))
            .build();
        //@formatter:on
      }
    });
  }

}
