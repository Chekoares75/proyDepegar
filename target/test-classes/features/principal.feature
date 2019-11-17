#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Automatización de prueba de página despegar
  proyecto de semillero

  @tag1
  Scenario Outline: Configuracion de datos basicos para la busqueda
    Given Ingreso al navegador y a la pagina web
    When configurar datos basicos del vuelo <ciudadOrigen> <ciudadDestino> <fechaIda> <fechaVuelta> <adultos> <infantes> <checkFecha> <claseVuelo>
    Then enviar datos
  
		Examples: 
      | ciudadOrigen  | ciudadDestino | fechaIda  | fechaVuelta  | adultos | infantes  | checkFecha  | claseVuelo  |
      | "Bog" | "Lon" | "10/01/2020" |"19/12/2019"| 2 | 3 | "si" | "Primera clase" | 
      
