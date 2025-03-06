package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By cpf = By.id("field-cpf");

	public By getCpf() {
		return cpf;
	}

	private By btncontinuar= By.id("test");

	public By getBtncontinuar() {
		return btncontinuar;
	}
	private By nome = By.name("name");
	private By celular = By.name("phone");
	private By email = By.name("email");
	private By confiremail= By.name("emailConfirmation");

	public By getNome() {
		return nome;
	}
	public By getCelular() {
		return celular;
	}
	public By getEmail() {
		return email;
	}
	public By getConfiremail() {
		return confiremail;
	}
	private By  checkbox = By.cssSelector("#label-accepted > span.sc-bYWUiG.gaLLqc");
	private By btnenviar = By.cssSelector("#complete-form-drawer > div > div > div.sc-kxtUkE.jKEmYc > form > div > div.sc-dsKijY.dTZaxR > div > button");

	public By getCheckbox() {
		return checkbox;
	}
	public By getBtnenviar() {
		return btnenviar;
	}
	public By getValidaçao() {
		return validaçao;
	}

	private By validaçao = By.cssSelector("#complete-form-drawer > div > div > div.sc-kxtUkE.jKEmYc > form > div > h4");
}
