package tcs.semillero.diego.proyDespegar.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/casoPrueba2.feature", glue= {"tcs.semillero.diego.proyDespegar.definitions"})
public class RunnerPrecioMasBarato {

}
