package com.example.Gustavo;


import java.util.List;

public interface ClienteService {
    public List<Cliente> getAllCliente();
    public List<Cliente> getAllClienteBynome(String nome);
}
