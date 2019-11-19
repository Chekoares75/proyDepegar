#Author: your.email@your.domain.com
@tag
Feature: Automatización de prueba de página despegar
  proyecto de semillero

  @tag1
  Scenario Outline: CP001. Buscar un vuelo de ida para 2 adultos 3 infantes y validar el precio mas economico
    Given Ingreso al navegador y a la pagina web
    When configurar datos basicos del vuelo <ciudadOrigen> <ciudadDestino> <tipoVuelo> <fechaIda> <fechaVuelta> <adultos> <infantes> <checkFecha> <claseVuelo>
    And enviar datos
    Then verficar el menor precio <resultadoEsperado>

    Examples: 
      | ciudadOrigen | ciudadDestino | tipoVuelo | fechaIda     | fechaVuelta | adultos | infantes | checkFecha | claseVuelo  | resultadoEsperado |
      | "Bog"        | "Lon"         | "ida"     | "19/12/2019" | "10/1/2020" |       2 |        3 | "no"       | "Económica" | "11017970"        |

  @tag2
  Scenario Outline: CP002. Buscar un vuelo ida y vuelta para 4 adultos 4 infantes y validar el precio mas economico
    Given Ingreso al navegador y a la pagina web
    When configurar datos basicos del vuelo <ciudadOrigen> <ciudadDestino> <tipoVuelo> <fechaIda> <fechaVuelta> <adultos> <infantes> <checkFecha> <claseVuelo>
    And enviar datos
    Then verficar el menor precio <resultadoEsperado>

    Examples: 
      | ciudadOrigen | ciudadDestino | tipoVuelo   | fechaIda     | fechaVuelta  | adultos | infantes | checkFecha | claseVuelo  | resultadoEsperado |
      | "Bog"        | "Lon"         | "idaVuelta" | "19/12/2019" | "24/12/2019" |       4 |        4 | "no"       | "Económica" | "33533866"        |

  @tag3
  Scenario Outline: CP003. Buscar un vuelo para 3 infantes 2 adultos sin decidir fecha validar el precio más alto del vuelo
    Given Ingreso al navegador y a la pagina web
    When configurar datos basicos del vuelo <ciudadOrigen> <ciudadDestino> <tipoVuelo> <fechaIda> <fechaVuelta> <adultos> <infantes> <checkFecha> <claseVuelo>
    And enviar datos
    Then verficar el mayor precio <resultadoEsperado>

    Examples: 
      | ciudadOrigen | ciudadDestino | tipoVuelo | fechaIda     | fechaVuelta  | adultos | infantes | checkFecha | claseVuelo      | resultadoEsperado |
      | "Bog"        | "Lon"         | "ida"     | "20/11/2019" | "15/12/2019" |       2 |        3 | "si"       | "Primera clase" | "4497850"         |
