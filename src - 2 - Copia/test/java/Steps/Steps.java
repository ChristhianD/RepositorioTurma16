package Steps;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps {

	Elementos e = new Elementos();
	Metodos m = new Metodos();

	@Given("que o usuário  acesse a url {string}")
	public void que_o_usuário_acesse_a_url(String url) {
		m.abrirnavegador(url);
	}

	@Given("preencha o campo cpf")
	public void preencha_o_campo_cpf() {
		m.preencher(e.getCpf(), "361.866.227-03");
	}

	@Given("clique no botão continuar")
	public void clique_no_botão_continuar() {
		m.clicar(e.getBtncontinuar());
	}

	@Given("preencha todo o formulario")
	public void preencha_todo_o_formulario() throws IOException {
		m.preencher(e.getNome(), "Alexandre Francisco Fernandes");
		m.preencher(e.getCelular(), "(94) 99634-8301");
		m.preencher(e.getEmail(), "alexandre_fernandes@brf-br.com");
		m.preencher(e.getConfiremail(), "alexandre_fernandes@brf-br.com");

	}

	@Given("aceite os termos de politica e privacidade")
	public void aceite_os_termos_de_politica_e_privacidade() throws IOException {
		m.clicar(e.getCheckbox());
		String formulario = "formulario";
		m.print("./Evidencias/" + formulario + ".png");
	}

	@Given("clique no botão enviar")
	public void clique_no_botão_enviar() throws InterruptedException {
		m.clicar(e.getBtnenviar());

		// m.pausa(54000);
	}

	@Then("o formulário será enviado com sucesso")
	public void o_formulário_será_enviado_com_sucesso() {
		// m.validartexto(e.getValidaçao(), "Informações enviadas");
		//m.quit();
	}

	@Given("preencha o campo cpf {string}")
	public void preencha_o_campo_cpf(String cpf) {

		m.preencher(e.getCpf(), cpf);
	}
	

}
