package com.example.Gustavo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class  HelloWorldRest {
        @GetMapping("/helloBuscar")
    public String buscar(@RequestParam(name = "fname") String nome)
        {



            //################################################
            //Mock do Dados do banco

            List<Cliente> clientes = new ArrayList<>(); //Busquei os dadods do banco
            clientes.add(new Cliente( "Jose"));
            clientes.add(new Cliente( "Rodolfo"));
            clientes.add(new Cliente( "Luiz"));

            //################################################

            //for
            //While
            //Lambda
            //Foreach



           Cliente clienteEncontrado = clientes.stream().filter(cliente -> cliente.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
           return clienteEncontrado != null ? "Cliente encontrado" : "Cliente não encontrado";

        }
}
