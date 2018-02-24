Feature: the details can be retrieved bu /details end point
  Scenario: client makes call to GET /details
    When the client calls /details
	Then the client receives response status code of 200
  Scenario: client makes call GET request /details1
    When the client calls request to /details1
	Then the client receives response negative status code of 404