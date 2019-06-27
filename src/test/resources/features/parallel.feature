@PPp
@data=$Positive
Feature: PP1

  Background:
    Given print text "background"

  @PP
  Scenario: 111
    When print text "scenario"
    And print text "${Vehicle.brand}" , "${Vehicle.year}" , "${Vehicle.model}"

