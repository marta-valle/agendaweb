package br.com.cotiinformatica.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.cotiinformatica.entities.Usuario;
import br.com.cotiinformatica.repositories.UsuarioRepository;

@Controller
public class PasswordRecoverController {
	@RequestMapping(value = "/nova_senha")
	public ModelAndView novasenha() {
		ModelAndView modelAndView = new ModelAndView("password_recover");

		return modelAndView;
	}

	@RequestMapping(value = "cadastroNovaSenha", method = RequestMethod.POST)
	public ModelAndView cadastroNovaSenha(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView("password_recover");

		try {
			String email =request.getParameter("email");
			String login =request.getParameter("login");

			UsuarioRepository usuarioRepository = new UsuarioRepository();
			Usuario usuario = usuarioRepository.findByEmailLogin(email, login);

			
			if (usuario != null) {
				// TODO APRENDI DIA 02/05 - INSTALAR BIBLIOTECA ; DEPOIS CRIAR PAGINA DE ATUALIZAÇÃO DE CADASTRO.
				modelAndView.addObject("mensagem_sucesso", "Foi enviado um email, para o cadastro da nova senha");
			} else {
				modelAndView.addObject("mensagem_erro", "Usuario Não encontrado");
			}

		} catch (Exception e) {
			modelAndView.addObject("mensagem_erro", "Erro ao resetar senha" + e.getLocalizedMessage());
		}

		return modelAndView;
	}

}
