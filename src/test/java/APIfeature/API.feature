Feature: API Automation Test

  @api
  Scenario: Test GET list data users
    Given prepare URL "GET_list_users"
    And hit API request GET
    Then verification status code 200
    Then verification response body GET data
    Then verification response json with JSON Schema "GET_data.json"

  @api
  Scenario: Test POST create new user
    Given prepare URL "POST_new_user"
    And hit API request POST
    Then verification status code 201
    Then verification response body POST create data
    Then verification response json with JSON Schema "POST_data.json"

  @api
  Scenario: Test PUT update data user
    Given prepare URL "PUT_update_data"
    And hit API request POST
    Then verification status code 201
    Then verification response body POST create data
    And hit API request PUT
    Then verification status code 200
    Then verification response body PUT update data

  @api
  Scenario: Test DELETE data user
    Given prepare URL "DELETE_data"
    And hit API request POST
    Then verification status code 201
    Then verification response body POST create data
    And hit API request DELETE
    Then verification status code 204

  @api
  Scenario: Test GET data unregistered user (negative)
    Given prepare URL "GET_unregistered_user"
    And hit API request POST
    Then verification status code 201
    Then verification response body POST create data
    And hit API request DELETE
    Then verification status code 204
    And hit API request GET unregistered_user
    Then verification status code 404

  @api
  Scenario: Test POST create data with incorrect format (negative)
    Given prepare URL "POST_wrong_format"
    And hit API request POST data abnormal
    Then verification status code 422

  @api
  Scenario: Test PATCH update data without Authorization (negative)
    Given prepare URL "PATCH_unauthorized"
    And hit API request GET
    Then verification status code 200
    Then verification response body GET data
    Then hit API request PATCH unauthorized
    Then verification status code 401

  @api
  Scenario: Test DELETE without Authorization (negative)
    Given prepare URL "DELETE_unauthorized"
    And hit API request GET
    Then verification status code 200
    Then verification response body GET data
    And hit API request DELETE unauthorized
    Then verification status code 401