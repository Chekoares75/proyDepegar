package tcs.semillero.diego.proyDespegar.steps;


import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import tcs.semillero.diego.proyDespegar.pageObjects.PagePrecioMasCaro;

public class StepPrecioMasCaro {
	PagePrecioMasCaro objPagePrecioMasCaro;
	@Step
	public void enviar_la_informacion() throws Exception {
		
	}

	@Step
	public void verficar_el_mayor_precio() throws Exception {
		Thread.sleep(5000);
		objPagePrecioMasCaro.seleccionarPrecioMayor();
		Assert.assertEquals(4482623, objPagePrecioMasCaro.getPrecioMayorNumero());
	}
}
