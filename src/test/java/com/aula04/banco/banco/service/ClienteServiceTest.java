package com.aula04.banco.banco.service;

import com.aula04.banco.banco.dto.RequestCliente;
import com.aula04.banco.banco.model.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.fail;

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
    public void atualizaCliente() throws Exception {
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
                3
        );

        Cliente clienteAtualizado = clienteService.atualizaCliente(cliente.getId(), requestClienteAtualiza);

        Assertions.assertEquals(resquestCliente.getNome(), clienteAtualizado.getNome());
    }

    @Test
    public void buscaClienteNaoExistente(){
        UUID uuid = UUID.randomUUID();
        Assertions.assertThrows(Exception.class, () -> clienteService.detalhesCliente(uuid));
    }

    @Test
    public void buscaClienteNaoExistente2(){
        UUID uuid = UUID.randomUUID();

        try{
            clienteService.detalhesCliente(uuid);
            fail("Não lançou a exceção");
        } catch(Exception e){};
    }
}
