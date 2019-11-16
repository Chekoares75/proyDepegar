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
  Scenario: Configuracion de datos basicos para la busqueda
    Given Ingreso al navegador y a la pagina web
    When configurar datos basicos del vuelo <ciudadOrigen><ciudadDestino><fechaIda><fechaVuelta><adultos><infantes><checkFecha>
    Then enviar datos
  @tag2
  Scenario Outline: Automatizacion caso de prueba 3
    Given Configuracion de datos basicos del vuelo
    When buscar el precio mas alto
    Then seleccionar el precio mas alto

    Examples: 
      | ciudadOrigen  | ciudadDestino | fechaIda  | fechaVuelta  | adultos | infantes  | checkFecha  |
      | "Bog" | "Lon" | "10/12/2019" |"19/12/1990"| 2 | 3 | "no" | 
      
