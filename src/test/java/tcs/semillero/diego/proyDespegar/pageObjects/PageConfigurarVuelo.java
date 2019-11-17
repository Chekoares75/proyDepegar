package tcs.semillero.diego.proyDespegar.pageObjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.despegar.com.co")
public class PageConfigurarVuelo extends PageObject {
	PagePreciosVuelos objPagePreciosVuelos;
	
	@FindBy(xpath = "//a[contains(@class,'shifu-3-button-circle FLIGHTS')]//div[@class='button-circle-icon']")
	WebElementFacade btnLinkVuelos;
	@FindBy(xpath = "//div[@class='sbox-radio-buttons']//span[2]//label[1]")
	WebElementFacade btnSoloIda;

	@FindBy(xpath = "//div[@class='sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-origin-container places-inline sbox-bind-error-flight-roundtrip-origin-empty']//input[@placeholder='Ingresa desde dónde viajas']")
	WebElementFacade listCiudadOrigen;
	@FindBy(xpath = "//li[@class='item -active']")
	WebElementFacade listSeleccionOrigen;
	@FindBy(xpath = "//div[@class='sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-destination-container sbox-bind-error-flight-roundtrip-destination-empty sbox-bind-error-flight-roundtrip-equal-destination']//input[@placeholder='Ingresa hacia dónde viajas']")
	WebElementFacade listCiudadDestino;
	@FindBy(xpath = "//li[@class='item -active']")
	WebElementFacade listSeleccionDestino;

	@FindBy(xpath = "//input[@placeholder='Ida']")
	WebElementFacade listFechaInicial;

	@FindBy(xpath = "//i[@class='checkbox-check sbox-3-icon-checkmark -mr1 sbox-ui-icon']")
	WebElementFacade chckFechas;

	@FindBy(xpath = "//div[@class='sbox-3-input -md sbox-distri-input sbox-3-validation -top-right sbox-bind-event-click-passengers-input sbox-bind-error-flight-roundtrip-passengers-distribution']//div[@class='input-container']")
	WebElementFacade btnHabitacionesPersonas;
	@FindBy(xpath = "//div[@class='_pnlpk-main _pnlpk-panel _pnlpk-panel--popup _pnlpk-panel--mobile _pnlpk-panel--show']//div[@class='_pnlpk-panel-scroll']//div[@class='_pnlpk-panel__blocks']//div[@class='_pnlpk-itemBlock']//div[@class='_pnlpk-itemBlock__itemRows _pnlpk-dynamicContent']//div//div[@class='_pnlpk-itemRow__item _pnlpk-stepper-adults -medium-down-to-lg']//a[@class='steppers-icon-right sbox-3-icon-plus']")
	WebElementFacade btnMasAdultos;
	@FindBy(xpath = "//div[@class='_pnlpk-main _pnlpk-panel _pnlpk-panel--popup _pnlpk-panel--mobile _pnlpk-panel--show']//div[@class='_pnlpk-panel-scroll']//div[@class='_pnlpk-panel__blocks']//div[@class='_pnlpk-itemBlock']//div[@class='_pnlpk-itemBlock__itemRows _pnlpk-dynamicContent']//div//div[@class='_pnlpk-itemRow__item _pnlpk-stepper-minors -medium-down-to-lg']//a[@class='steppers-icon-right sbox-3-icon-plus']")
	WebElementFacade btnMasInfantes;
	@FindBy(xpath = "//div[@class='_pnlpk-itemRow_item _pnlpk-select-flight-class-type -medium-down-to-lg']//select[@class='select-tag']")
	WebElementFacade slctrClaseVuelo;
	@FindBy(xpath = "//div[@class='_pnlpk-main _pnlpk-panel _pnlpk-panel--popup _pnlpk-panel--mobile _pnlpk-panel--show']//a[@class='_pnlpk-apply-button sbox-3-btn-ghost _pnlpk-panel__button--link-right -md'][contains(text(),'Aplicar')]")
	WebElementFacade btnAplicar;

	@FindBy(xpath = "//div[@class='sbox-button -ml3-l -mt5-l']//a[@class='sbox-3-btn -primary -md sbox-search']")
	WebElementFacade btnBuscar;
	
	
	@FindBy(xpath = "//div[contains(@class,'eva-3-nav-slider -white -sm -eva-3-shadow-line-hover airline-matrix-right')]")
	WebElementFacade btnCambiarPagina;
	/*
	 * @FindBy(xpath = ) WebElementFacade txtfPrecioMasAlto;
	 */
	public void elegirCiudadOrigen(String ciudadOrigen) {
		listCiudadOrigen.clear();
		listCiudadOrigen.click();
		listCiudadOrigen.sendKeys(ciudadOrigen);
		listSeleccionOrigen.click();
	}

	public void elegirCiudadDestino(String ciudadDestino) {
		listCiudadDestino.clear();
		listCiudadDestino.click();
		listCiudadDestino.sendKeys(ciudadDestino);
		listSeleccionDestino.click();
	}

	public void verificarCantidadPersonas(int adultos, int infantes) {
		if ((adultos + infantes) <= 8) {
			elegirCantidadAdultos(adultos);
			elegirCantidadInfantes(infantes);
		}

	}

	public void elegirCantidadAdultos(int adultos) {
		for (int contador = 1; contador < adultos; contador++)
			btnMasAdultos.click();
	}

	public void elegirCantidadInfantes(int infantes) {
		for (int contador = 0; contador < infantes; contador++)
			btnMasInfantes.click();
	}

	public void seleccionarEdadInfantes(int infantes) {
		for (int contador = 1; contador <= infantes; contador++)
			/*find(By.xpath("//div[@class=\"_pnlpk-minors-age-select-wrapper\"]/div[" + contador + "]/div[2]//select"))
					.selectByVisibleText(recrearEdadaleatoria());*/
			find(By.xpath("//div[@class=\"_pnlpk-minors-age-select-wrapper\"]/div[" + contador + "]/div[2]//select")).selectByVisibleText(edadFija9());
	}
	public String edadFija9() {
		return "9 años";
	}

	public String recrearEdadaleatoria() {
		String edad = String.valueOf((int) (Math.random() * 17 + 1));
		if (edad.equalsIgnoreCase("1"))
			edad = edad.concat(" año");
		else
			edad = edad.concat(" años");
		return edad;
	}

	public void seleccionarClaseVuelo(String claseVuelo) {
		claseVuelo = claseVuelo.substring(1, (claseVuelo.length() - 1));
		slctrClaseVuelo.selectByVisibleText(claseVuelo);
	}

	public void verificarCheckFechas(String checkFecha, String fechaIda, String fechaVuelta) {
		if (checkFecha.equalsIgnoreCase("SI"))
			chckFechas.click();
	}

	public void elegirFechaIda(String fechaIda) {
		listFechaInicial.click();
		String fecha[] = fechaIda.split("/");
		String fechaInicial = fecha[2] + "-" + fecha[1];
		find(By.xpath("//div[@data-month=\"" + fechaInicial + "\"]"));
		find(By.xpath(
				"//div[@class='_dpmg2--wrapper _dpmg2--roundtrip _dpmg2--show-info _dpmg2--show']//div[@class='_dpmg2--month _dpmg2--o-5 _dpmg2--month-active']//span[@class='_dpmg2--date-number'][contains(text(),'"
						+ fecha[0] + "')]")).click();
	}
	
	public void elegirPrecioMasAlto() {
		objPagePreciosVuelos.seleccionarPrecioMayor();
	}

	public void elegirFechaVuelta(String fechaVuelta) {

	}

	// DE AQUÍ HASTA EL FINAL SOLO SON GETTERS AND SETTERS
	public WebElementFacade getBtnLinkVuelos() {
		return btnLinkVuelos;
	}

	public WebElementFacade getBtnSoloIda() {
		return btnSoloIda;
	}

	public void setBtnSoloIda(WebElementFacade btnSoloIda) {
		this.btnSoloIda = btnSoloIda;
	}

	public WebElementFacade getBtnBuscar() {
		return btnBuscar;
	}

	public WebElementFacade getBtnHabitacionesPersonas() {
		return btnHabitacionesPersonas;
	}

	public WebElementFacade getBtnAplicar() {
		return btnAplicar;
	}

}
