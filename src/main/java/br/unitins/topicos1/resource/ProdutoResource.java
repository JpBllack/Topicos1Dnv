package br.unitins.topicos1.resource;

import java.util.List;

import br.unitins.topicos1.model.Produto;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/produtos")
public class ProdutoResource {
    
    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public List<Produto> todosProdutos(){
        return Produto.listAll();
    }
}
