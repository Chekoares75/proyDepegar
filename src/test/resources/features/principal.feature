#Author: your.email@your.domain.com
@tag
Feature: Automatización de prueba de página despegar
  proyecto de semillero

  @tag1
  Scenario Outline: Configuracion de datos basicos para la busqueda
    Given Ingreso al navegador y a la pagina web
    When configurar datos basicos del vuelo <ciudadOrigen> <ciudadDestino> <tipoVuelo> <fechaIda> <fechaVuelta> <adultos> <infantes> <checkFecha> <claseVuelo>
    Then enviar datos

    Examples: 
      | ciudadOrigen | ciudadDestino | tipoVuelo | fechaIda     | fechaVuelta  | adultos | infantes | checkFecha | claseVuelo      |
      | "Bog"        | "Lon"         | "ida"     | "19/12/2019" | "10/01/2020" |       2 |        3 | "si"       | "Primera clase" |
