package com.promineotech.tracker.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineotech.tracker.entity.PlayerCharacter;
import com.promineotech.tracker.entity.RaidingStatic;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@RequestMapping("/tracker")
@OpenAPIDefinition(info = @Info(title = "XIV static gear tracker"),
    servers = {@Server(url = "http://localhost:8080", description = "Local server")})
public interface GearTrackerController {

  // @formatter:off
  @Operation(
      summary = "Returns a raiding static",
      description = "Returns a raiding static given a valid static ID",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "A raiding static is returned.",
              content = @Content(
                  mediaType = "application/json",
                      schema = @Schema(implementation = RaidingStatic.class))),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid request parameters.",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404",
              description = "No statics found with input criteria.",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500",
              description = "An unplanned error occurred.",
              content = @Content(
                  mediaType = "application/json"))
      },
      parameters = {
          @Parameter(
              name = "raidingStaticId",
              allowEmptyValue = false,
              required = false,
              description = "The static ID, an integer value")
      }
  )
  // @formatter:on
  @GetMapping("/static")
  @ResponseStatus(code = HttpStatus.OK)
  RaidingStatic fetchRaidingStatic(@RequestParam(required = false) Integer raidingStaticId);

  // @formatter:off
  @Operation(
      summary = "Returns a list of player characters that are part of a static.",
      description = "Returns a list of type PlayerCharacter that are assigned to given a valid static ID in the static_composition table.",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "A raiding static is returned.",
              content = @Content(
                  mediaType = "application/json",
                      schema = @Schema(implementation = RaidingStatic.class))),
          @ApiResponse(
              responseCode = "400",
              description = "Invalid request parameters.",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404",
              description = "No statics found with input criteria.",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500",
              description = "An unplanned error occurred.",
              content = @Content(
                  mediaType = "application/json"))
      },
      parameters = {
          @Parameter(
              name = "raidingStaticId",
              allowEmptyValue = false,
              required = false,
              description = "The static ID, an integer value")
      }
  )
  // @formatter:on
  @GetMapping("/staticmembers")
  @ResponseStatus(code = HttpStatus.OK)
  List<PlayerCharacter> fetchRaidingStaticMembers(
      @RequestParam(required = false) Integer raidingStaticId);

}
