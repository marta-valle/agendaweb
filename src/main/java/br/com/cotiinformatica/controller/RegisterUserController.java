package br.com.cotiinformatica.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.cotiinformatica.entities.Usuario;
import br.com.cotiinformatica.repositories.UsuarioRepository;

@Controller
public class RegisterUserController {

	@RequestMapping(value = "/register_user")
	public ModelAndView Register() {
		ModelAndView modelAndView = new ModelAndView("register");

		return modelAndView;
	}
	@RequestMapping(value = "cadastroUsuario", method = RequestMethod.POST)
	public ModelAndView cadastro(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView("register");
		
		try {
			Usuario usuario = new Usuario();
			
			usuario.setNome(request.getParameter("nome"));
			usuario.setTelefone(request.getParameter("telefone"));
			usuario.setEmail(request.getParameter("email"));
			usuario.setLogin(request.getParameter("login"));
			usuario.setSenha(request.getParameter("senha"));
			
			UsuarioRepository usuarioRepository = new UsuarioRepository();
			usuarioRepository.create(usuario);
			
			modelAndView.addObject("mensagem_sucesso", "Cadastro realizado com sucesso");
			
		} catch (Exception e) {
			modelAndView.addObject("mensagem_erro", "Cadastro não realizado: "+ e.getLocalizedMessage());
		}
		return modelAndView;
	}

}
