#Author: your.email@your.domain.com
@tag
Feature: Caso de prueba No 3
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Buscar un vuelo para 3 infantes 2 adultos sin decidir fecha validar el precio más alto del vuelo
    Given Ingreso al navegador y a la pagina web
    When configurar datos basicos del vuelo <ciudadOrigen> <ciudadDestino> <tipoVuelo> <fechaIda> <fechaVuelta> <adultos> <infantes> <checkFecha> <claseVuelo>
    And enviar datos
    Then verficar el mayor precio

    Examples: 
      | ciudadOrigen | ciudadDestino | tipoVuelo | fechaIda     | fechaVuelta  | adultos | infantes | checkFecha | claseVuelo      |
      | "Bog"        | "Lon"         | "ida"     | "19/12/2019" | "10/01/2020" |       2 |        3 | "si"       | "Primera clase" |
