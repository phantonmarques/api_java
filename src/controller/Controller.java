package controller;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import entidade.Pessoa;
import persistencia.PessoaDAO;

public class Controller {
	private static List<Pessoa> listaPessoas = new ArrayList<>();
	
	public static void AddPessoa(Pessoa pessoa) {
		listaPessoas.add(pessoa);
	}

	public static List<Pessoa> getListaAluno() {
		return listaPessoas;
	}
	
	public static boolean autenticacaoUsuario (String usuario, String senha) {
		Pessoa p = new Pessoa();
		p.setUsuarioLogin(usuario);
		p.setSenhaLogin(senha);
		
		PessoaDAO aut = new PessoaDAO();
		Pessoa validaExistencia = aut.autenticarUsuario(p);
		if (validaExistencia != null ) {
			return true;
		}
		return false;
		
	}
	
	public static void validaAutenticacao(String autentica[]) {
		
	}

}
