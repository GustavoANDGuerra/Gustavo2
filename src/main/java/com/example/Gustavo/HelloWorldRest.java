package com.example.Gustavo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  HelloWorldRest {
        @GetMapping("/helloBuscar")
    public String buscar(@RequestParam(name = "fname") String nome)
        {
            //carregamos tabela de clientes
            //Quem Quiser criar o objeto cliente pode criar
            String [] bancoClientes = {"Jose", "Rodolfo", "Luiz"};
            boolean retorno = false;

            //busca incorreta
            if(bancoClientes[0].equalsIgnoreCase(nome))
            {
                retorno = true;
            }

           return retorno ? "ok" : "nao";

        }
}
