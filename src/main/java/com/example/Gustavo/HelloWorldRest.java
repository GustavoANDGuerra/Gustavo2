package com.example.Gustavo;


import com.fasterxml.jackson.databind.util.JSONPObject;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class  HelloWorldRest {

    @Autowired
    private ClienteServiceimpl clienteService;
        @GetMapping("/helloBuscar")
    public String buscar(@RequestParam(name = "fname") String nome)
        {
            List<Cliente> clienteEncontrado = clienteService.getAllClienteBynome(nome);
            JSONObject clienteJson = null;
            if(!clienteEncontrado.isEmpty()){
                clienteJson = new JSONObject(clienteEncontrado.get(0));
                }




            return !clienteEncontrado.isEmpty() ? clienteJson.toString() : "null";
        }
}
