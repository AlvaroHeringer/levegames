package br.com.levegames.controller;

import br.com.levegames.dao.ClienteDAO;
import br.com.levegames.dao.UsuarioDAO;
import br.com.levegames.model.Cliente;
import br.com.levegames.model.Usuario;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {

  @GetMapping("/Logout")
  public ModelAndView exibirHome(HttpServletRequest request) {
    ModelAndView mv = new ModelAndView("redirect:/Home");
    HttpSession sessao = request.getSession();
    sessao.removeAttribute("cliente");
    return mv;
  }
  
  @GetMapping("/Logoff")
  public ModelAndView deslogarCliente(HttpServletRequest request) {
    ModelAndView mv = new ModelAndView("redirect:/Home");
    HttpSession sessao = request.getSession();
    sessao.removeAttribute("cliente");
    return mv;
  }
<<<<<<< HEAD


=======
>>>>>>> e6571506fb48c2bf504a6b4ca974ebdf68276ef2
}