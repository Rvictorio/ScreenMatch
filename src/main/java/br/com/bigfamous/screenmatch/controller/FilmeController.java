package br.com.bigfamous.screenmatch.controller;

import br.com.bigfamous.screenmatch.domain.filme.DadosCadastroFilme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @GetMapping
    public String carregaPaginaFormulario(){
        return "filmes/formulario";
    }

    @PostMapping
    public String cadastrarFilme(DadosCadastroFilme dados){
        System.out.println(dados);

        return "filmes/formulario";
    }
}
