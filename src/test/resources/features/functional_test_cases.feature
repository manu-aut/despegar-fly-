Feature: some functional test cases

  Scenario: find flight ticket one way option Solo ida
    Given Mafalda is on the home page of the web application 'despegar.com'
    When she looks for her flight with the 'Solo ida' option
    Then she would observe that the return field is blocked

  Scenario: find flight ticket one way option Ida y vuelta without writing return date
    Given Mafalda is on the home page of the web application 'despegar.com'
    When she looks for her flight with the 'Ida y vuelta' option without writing return date
    Then she would display the following message on the screen 'Ingresa una fecha de regreso'

  Scenario: find flight ticket one way option Multidestino
    Given Mafalda is on the home page of the web application 'despegar.com'
    When she looks for her flight with the 'Multidestino' option
    Then she could add her next stop in option 'section 2'

  Scenario: find flight ticket one way option Multidestino route 2, route one 'from' input == route two 'to' input
    Given Mafalda is on the home page of the web application 'despegar.com'
    When she looks for her flight with the 'Multidestino' option
    Then she would visualize that the destination city of route number one is equal to the origin of route number two

  Scenario: search plane ticket one way option Multi-destination with 6 stage
    Given Mafalda is on the home page of the web application 'despegar.com' and  'Multidestino' option
    When she wants to visualize '6' different routes
    And she adds and removes 6 new routes
    Then she verifies that all 6 routes can be added and removed

  @bug
  Scenario: route entry 4 'from' editable and changed to another city
    Given Mafalda is on the home page of the web application 'despegar.com' and  'Multidestino' option
    When she edits the 'from' input and changes city
    Then she would visualize that the destination city of route number one is equal to the origin of route number two
    But but she displays a different message on the screen

  @EquivalenceClass
  Scenario: find flight ticket one way option Multidestino limit value
    Given Mafalda is on the home page of the web application 'despegar.com'
    When she completes the information in the 'Multidestino' option, date leg 2 one day before the date leg one
      | route         |        1 |
      | from          | Medellin |
      | to            | Bogota   |
      | departureDate | 14 Sep   |
      | route         |        2 |
      | from          | Medellin |
      | to            | Bogota   |
      | departureDate | 14 Sep   |
    Then she would display an error message 'La partida debe ser posterior a la fecha del tramo anterior'
