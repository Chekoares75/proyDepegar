package tcs.semillero.diego.proyDespegar.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PageConfigurarVuelo extends PageObject {
	@FindBy(xpath = "//div[@class='sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-origin-container places-inline']//input[@placeholder='Ingresa una ciudad']")
	WebElementFacade listCiudadOrigen;
	@FindBy(xpath = "//div[@class='ac-container']//div[1]//ul[1]//li[1]")
	WebElementFacade listSeleccionOrigen;
	
	@FindBy(xpath = "//div[@class='sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-destination-container']//input[@placeholder='Ingresa una ciudad']")
	WebElementFacade listSeleccionDestino;
	@FindBy(xpath = "//div[@class='ac-container']//div[1]//ul[1]//li[1]")
	WebElementFacade listCiudadDestino;
	
	@FindBy(xpath = "//input[@placeholder='Ida']")
	WebElementFacade listFechaInicial;
	@FindBy(xpath = "//input[@placeholder='Vuelta']")
	WebElementFacade listFechaFinal;
	@FindBy(xpath = "//input[@class='checkbox-tag sbox-month-check']")
	WebElementFacade chckFechas;
	
	
	@FindBy(xpath = "//div[@class='sbox-3-input -md sbox-distri-input sbox-3-validation -top-right sbox-guests-container']//div[@class='input-container']")
	WebElementFacade btnHabitacionesPersonas;
	
	@FindBy(xpath = "//div[@class='_pnlpk-itemBlock']//div[@class='_pnlpk-itemBlock__itemRows']//div[@class='_pnlpk-itemRow__item _pnlpk-stepper-adults -medium-down-to-lg']//a[@class='steppers-icon-right sbox-3-icon-plus']")
	WebElementFacade btnMasAdultos;
	@FindBy(xpath = "//div[@class='_pnlpk-itemBlock']//div[@class='_pnlpk-itemRow__item _pnlpk-stepper-adults -medium-down-to-lg']//a[@class='steppers-icon-left sbox-3-icon-minus']")
	WebElementFacade btnMenosAdultos;
	@FindBy(xpath = "//div[@class='_pnlpk-itemBlock']//div[@class='_pnlpk-itemBlock__itemRows']//div[@class='_pnlpk-itemRow__item _pnlpk-stepper-minors -medium-down-to-lg']//a[@class='steppers-icon-right sbox-3-icon-plus']")
	WebElementFacade btnMasInfantes;
	@FindBy(xpath = "//div[@class='_pnlpk-itemRow__item _pnlpk-stepper-minors -medium-down-to-lg']//a[@class='steppers-icon-left sbox-3-icon-minus']")
	WebElementFacade btnMenosInfantes;
	@FindBy(xpath = "//div[@class='_pnlpk-main _pnlpk-panel _pnlpk-panel--popup _pnlpk-panel--mobile _pnlpk-panel--show']//a[@class='_pnlpk-apply-button sbox-3-btn-ghost _pnlpk-panel__button--link-right -md'][contains(text(),'Aplicar')]")
	WebElementFacade btnConfirmarCantidadPersonas;
	
	
	@FindBy(xpath = "//a[@class='sbox-3-btn -primary -md sbox-search']")
	WebElementFacade btnBuscar;
	
}
