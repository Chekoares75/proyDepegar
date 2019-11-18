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
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Buscar un vuelo para 3 infantes 2 adultos sin decidir fecha validar el precio más alto del vuelo
    Given Ingreso al navegador y a la pagina web
    When configurar datos basicos del vuelo <ciudadOrigen> <ciudadDestino> <fechaIda> <fechaVuelta> <adultos> <infantes> <checkFecha> <claseVuelo>
    And enviar datos
    Then verficar el mayor precio

    Examples: 
      | ciudadOrigen  | ciudadDestino | fechaIda  | fechaVuelta  | adultos | infantes  | checkFecha  | claseVuelo  |
      | "Bog" | "Lon" | "10/01/2020" |"19/12/2019"| 2 | 3 | "si" | "Primera clase" | 
