package com.soulcode.produtosapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class HelloController {
//    @RequestMapping(value = "/elastech", method = RequestMethod.GET)
//    @ResponseBody
//    public String paginaelastech(@RequestParam String nome , @RequestParam int idade) {
//        if (idade >= 18) {
//            return "Ola " + nome + " sua idade é " + idade + " e voce esta na pagina ElasTech";
//        }else {
//            return "Olá " + nome + " sua idade é " + idade + " e você não é maior de idade.";
//        }
//    }

@RequestMapping(value = "/elastech", method = RequestMethod.POST)
public String paginaelastech(@RequestParam String nome , @RequestParam int idade , Model model){
    if(idade >= 18){
        model.addAttribute("nome", nome);
        model.addAttribute("idade", idade);
        return "maior-idade";
    }else {
        int faltaAnos = 18 - idade;
        model.addAttribute("nome", nome);
        model.addAttribute("idade", idade);
        model.addAttribute("faltaidade", faltaAnos);
        return "menor-idade";
    }
}


    @GetMapping("/soulcode")
    @ResponseBody
    public String paginasoulcode(){
        return "Soul Code pagina teste";
    }

    @GetMapping("/cadastro-produto")
    public String cadastroproduto(){
        return "cadastro";
    }

    @GetMapping("/cadastro-usuario")
    public String cadastrousuario(){
        return "cadastro-usuario";
    }


}
