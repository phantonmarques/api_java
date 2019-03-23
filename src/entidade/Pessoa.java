package entidade;

public class Pessoa {
	private String nomeCompleto;
	private String usuarioLogin;
	private String senhaLogin;
	private String email;
	private String cidade;
	private String estado;
	private String dataNascimento;
	private int telefone;
	
	public Pessoa(String nomeCompleto, String usuarioLogin, String senhaLogin, String email, String cidade,
			String estado, String dataNascimento, int telefone) {
		this.nomeCompleto = nomeCompleto;
		this.usuarioLogin = usuarioLogin;
		this.senhaLogin = senhaLogin;
		this.email = email;
		this.cidade = cidade;
		this.estado = estado;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getUsuarioLogin() {
		return usuarioLogin;
	}

	public void setUsuarioLogin(String usuarioLogin) {
		this.usuarioLogin = usuarioLogin;
	}

	public String getSenhaLogin() {
		return senhaLogin;
	}

	public void setSenhaLogin(String senhaLogin) {
		this.senhaLogin = senhaLogin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
}
