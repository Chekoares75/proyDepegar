package tcs.semillero.diego.proyDespegar.pageObjects;

import org.openqa.selenium.By;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PagePrecios extends PageObject {

	@FindBy(xpath = "//div[contains(@class,'eva-3-nav-slider -white -sm -eva-3-shadow-line-hover airline-matrix-right')]")
	WebElementFacade btnSiguienteListadoAereolineas;

	int precioMayorNumero = 0;
	int precioMenorNumero = 99999999;
	public void seleccionarPrecioMayor() {
		String nombreAereolineaMayor = "";
		String nombreActual = "";
		String precioActual = "";
		int precioActualNumero = 0;
		int preciosPorAereolinea = 3;
		while (btnSiguienteListadoAereolineas.isVisible()) {
			for (int contador = 0; contador < preciosPorAereolinea; contador++) {
				WebElementFacade objListaAereolinea = find(
						By.xpath("//airlines-matrix-airline[1]//li[" + (contador + 1) + "]"));
				if (contador == 0)
					nombreActual = objListaAereolinea.getText();
				else {
					precioActual = objListaAereolinea.getText();
					if (precioActual.equalsIgnoreCase(""))
						precioActualNumero = 0;
					else {
						precioActual = precioActual.substring(1, precioActual.length());
						char[] letras = precioActual.toCharArray();
						char punto = '.';
						precioActual = "";
						for (int index = 0; index < letras.length; index++) {
							if (letras[index] != punto)
								precioActual += letras[index];
						}
						precioActualNumero = Integer.parseInt(precioActual);
						if (precioActualNumero > precioMayorNumero) {
							precioMayorNumero = precioActualNumero;
							nombreAereolineaMayor = nombreActual;
						}
					}
				}
			}
			btnSiguienteListadoAereolineas.click();
		}
		if (!btnSiguienteListadoAereolineas.isVisible()) {
			for (int superContador = 0; superContador < 4; superContador++) {
				for (int contador = 0; contador < preciosPorAereolinea; contador++) {
					WebElementFacade objListaAereolinea = find(By.xpath(
							"//airlines-matrix-airline[" + (superContador + 1) + "]//li[" + (contador + 1) + "]"));
					if (contador == 0)
						nombreActual = objListaAereolinea.getText();
					else {
						precioActual = objListaAereolinea.getText();
						if (precioActual.equalsIgnoreCase(""))
							precioActualNumero = 0;
						else {
							precioActual = precioActual.substring(1, precioActual.length());
							char[] letras = precioActual.toCharArray();
							char punto = '.';
							precioActual = "";
							for (int index = 0; index < letras.length; index++) {
								if (letras[index] != punto)
									precioActual += letras[index];
							}
							precioActualNumero = Integer.parseInt(precioActual);
							if (precioActualNumero > precioMayorNumero) {
								precioMayorNumero = precioActualNumero;
								nombreAereolineaMayor = nombreActual;
							}
						}
					}
				}

			}
		}
		System.out.println("NOMBRE AEREOLÍNEA: " + nombreAereolineaMayor);
		System.out.println("VALOR PASAJE MÁS CARO: " + precioMayorNumero);
	}

	public void seleccionarPrecioMenor() {

		String nombreAereolineaMenor = "";
		String nombreActual = "";
		String precioActual = "";
		int precioActualNumero = 0;
		int preciosPorAereolinea = 3;
		while (btnSiguienteListadoAereolineas.isVisible()) {
			for (int contador = 0; contador < preciosPorAereolinea; contador++) {
				WebElementFacade objListaAereolinea = find(
						By.xpath("//airlines-matrix-airline[1]//li[" + (contador + 1) + "]"));
				if (contador == 0)
					nombreActual = objListaAereolinea.getText();
				else {
					precioActual = objListaAereolinea.getText();
					if (precioActual.equalsIgnoreCase(""))
						precioActualNumero = 0;
					else {
						precioActual = precioActual.substring(1, precioActual.length());
						char[] letras = precioActual.toCharArray();
						char punto = '.';
						precioActual = "";
						for (int index = 0; index < letras.length; index++) {
							if (letras[index] != punto)
								precioActual += letras[index];
						}
						precioActualNumero = Integer.parseInt(precioActual);
						if (precioActualNumero < precioMenorNumero) {
							precioMenorNumero = precioActualNumero;
							nombreAereolineaMenor = nombreActual;
						}
					}
				}
			}
			btnSiguienteListadoAereolineas.click();
		}
		if (!btnSiguienteListadoAereolineas.isVisible()) {
			for (int superContador = 0; superContador < 4; superContador++) {
				for (int contador = 0; contador < preciosPorAereolinea; contador++) {
					WebElementFacade objListaAereolinea = find(By.xpath(
							"//airlines-matrix-airline[" + (superContador + 1) + "]//li[" + (contador + 1) + "]"));
					if (contador == 0)
						nombreActual = objListaAereolinea.getText();
					else {
						precioActual = objListaAereolinea.getText();
						if (precioActual.equalsIgnoreCase(""))
							precioActualNumero = 0;
						else {
							precioActual = precioActual.substring(1, precioActual.length());
							char[] letras = precioActual.toCharArray();
							char punto = '.';
							precioActual = "";
							for (int index = 0; index < letras.length; index++) {
								if (letras[index] != punto)
									precioActual += letras[index];
							}
							precioActualNumero = Integer.parseInt(precioActual);
							if (precioActualNumero < precioMenorNumero) {
								precioMenorNumero = precioActualNumero;
								nombreAereolineaMenor = nombreActual;
							}
						}
					}
				}

			}
		}
		System.out.println("NOMBRE AEREOLÍNEA: " + nombreAereolineaMenor);
		System.out.println("VALOR PASAJE MÁS CARO: " + precioMayorNumero);
	}

	public int getPrecioMayorNumero() {
		return precioMayorNumero;
	}
	public int getPrecioMenorNumero() {
		return precioMenorNumero;
	}
}
