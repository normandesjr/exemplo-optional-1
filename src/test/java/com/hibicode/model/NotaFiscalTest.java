package com.hibicode.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class NotaFiscalTest {

    private NotaFiscal notaFiscal;

    @Before
    public void inicializar() {
        notaFiscal = new NotaFiscal();
    }

    @Test
    public void deve_recuperar_todos_ids_dos_produtos_da_nota_fiscal() throws Exception {
        notaFiscal.adicionarProduto(new Produto(1L, "Sabonete")).adicionarProduto(new Produto(2L, "Pasta Dental"))
                .adicionarProduto(new Produto(3L, "Desodorante"));

        final List<Long> idsProdutos = notaFiscal.getIdsProdutos();

        assertThat(idsProdutos, hasItems(1L, 2L, 3L));
    }

}
