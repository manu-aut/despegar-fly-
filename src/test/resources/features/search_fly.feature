Feature: buscar vuelos baratos reserva flexible
  
   To save money
   As a casual traveler
   I want to be able to buy a cheap flight

  @happyPath
  Scenario: happy path cheapest offer first position
    When mafalda looks at her trip
      | menu option | option       | from | to     | departureDate      | returnDate         | adults | children | cabinClass |
      | Vuelos      | Ida y vuelta | Med  | Bogota | "Jue, 24 sep 2020" | "Lun, 12 oct 2020" |      0 |        0 | Económica  |
    Then she should view any available flights

  @list
  Scenario: happy path all results
    When mafalda looks at her trip
      | menu option | option       | from | to     | departureDate      | returnDate         | adults | children | cabinClass |
      | Vuelos      | Ida y vuelta | Med  | Bogota | "Jue, 24 sep 2020" | "Lun, 12 oct 2020" |      0 |        0 | Económica  |
    Then should see the list of available flights

  @familiaa
  Scenario: happy path family
    When mafalda looks at her trip
      | menu option | option       | from | to     | departureDate      | returnDate         | adults | children | cabinClass |
      | Vuelos      | Ida y vuelta | Med  | Bogota | "Jue, 24 sep 2020" | "Lun, 12 oct 2020" |      2 |        2 | Económica  |
    Then she should view any available flights

  @messageError
  Scenario Outline: validation message
    When mafalda looks at her trip
      | menu option   | option   | from   | to   | departureDate   | returnDate   | adults   | children   | cabinClass   |
      | <menu option> | <option> | <from> | <to> | <departureDate> | <returnDate> | <adults> | <children> | <cabinClass> |
    Then she would not be successful in her search <unsuccessfullyMessage>

    Examples: 
      | menu option | option       | from | to     | departureDate      | returnDate         | adults | children | cabinClass | unsuccessfullyMessage                    |
      | Vuelos      | Ida y vuelta | Car  | Bogota | "Jue, 24 sep 2020" | "Lun, 12 oct 2020" |      0 |        0 | Económica  | Buscamos, pero no encontramos...         |
      | Vuelos      | Ida y vuelta | Med  | Med    | "Jue, 24 sep 2020" | "Lun, 12 oct 2020" |      0 |        0 | Económica  | El destino debe ser diferente del origen |
      | Vuelos      | Ida y vuelta | Med  | Bogota | "Jue, 24 sep 2020" | "Lun, 12 oct 2020" |      3 |        4 | Económica  | Ingresa la edad del menor                |
