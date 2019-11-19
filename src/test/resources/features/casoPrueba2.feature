#Author: your.email@your.domain.com
@tag
Feature: Caso de prueba No 2
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Buscar un vuelo ida y vuelta para 4 adultos 4 infantes y validar el precio mas alto
    Given Ingreso al navegador y a la pagina web
    When configurar datos basicos del vuelo <ciudadOrigen> <ciudadDestino> <tipoVuelo> <fechaIda> <fechaVuelta> <adultos> <infantes> <checkFecha> <claseVuelo>
    And enviar datos
    Then verficar el menor precio

    Examples: 
      | ciudadOrigen | ciudadDestino | tipoVuelo   | fechaIda     | fechaVuelta  | adultos | infantes | checkFecha | claseVuelo      |
      | "Bog"        | "Lon"         | "idaVuelta" | "19/12/2019" | "10/01/2020" |       4 |        4 | "si"       | "Primera clase" |
