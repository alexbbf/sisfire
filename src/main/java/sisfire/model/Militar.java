package sisfire.model;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Militar extends AbstractEntity<Long> {

	private String nomeGuerra;

	private String nome;

	private String cpf;

	private String telCel1;

	private String telCel2;

	private String senha;

	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelCel1() {
		return telCel1;
	}

	public void setTelCel1(String telCel1) {
		this.telCel1 = telCel1;
	}

	public String getTelCel2() {
		return telCel2;
	}

	public void setTelCel2(String telCel2) {
		this.telCel2 = telCel2;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeGuerra() {
		return nomeGuerra;
	}

	public void setNomeGuerra(String nomeGuerra) {
		this.nomeGuerra = nomeGuerra;
	}

}
