package com.example.Gustavo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteServiceimpl implements ClienteService{

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> getAllCliente(){
        return  clienteRepositorio.findAll();
    }
    @Override
    public List<Cliente> getAllClienteBynome(String nome){
        return  clienteRepositorio.findByNome(nome);
    }



}
