package com.aula04.banco.banco.service;

import com.aula04.banco.banco.dto.RequestCliente;
import com.aula04.banco.banco.model.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ClienteServiceTest {

    ClienteService clienteService = new ClienteService();

    @Test
    public void deveRetornarListaClientesVazia(){
        ClienteService clienteService = new ClienteService();
        List<Cliente> clientes = clienteService.buscaTodosClientes();
        Assertions.assertTrue(clientes.isEmpty());
    }

    @Test
    public void cadastraCliente(){
        RequestCliente requestCliente = new RequestCliente(
                "teste",
                "teste@teste.com",
                "12345678900",
                "1234432432",
                3
                );

        Cliente cliente = clienteService.cadastraCliente(requestCliente);

        Assertions.assertEquals(requestCliente.getNome(), cliente.getNome());
        Assertions.assertNotNull(cliente.getId());
    }

    @Test
    public void atualizaCliente(){
        RequestCliente resquestCliente = new RequestCliente(
                "teste",
                "teste@teste.com",
                "12345678900",
                "32312312312",
                3
        );

        Cliente cliente = clienteService.cadastraCliente(resquestCliente);

        RequestCliente requestClienteAtualiza = new RequestCliente(
                "teste",
                "teste@teste.com",
                "12345678900",
                "1212121212121",

        )
    }
}
