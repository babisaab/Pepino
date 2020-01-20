package com.babi.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.junit.Assert;

import com.babi.model.Filme;
import com.babi.model.NotaAluguel;
import com.babi.model.TipoAluguel;
import com.babi.service.AluguelService;
import com.babi.utils.DateUtil;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TesteUnitarioSteps {

	
	private Filme filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	private String erro;
	private TipoAluguel tipoAluguel;
	
	@Dado("^um filme com estoque de (\\d+) unidades$")
	public void umFilmeComEstoqueDeUnidades(int arg1) throws Throwable {
	   filme = new Filme();
	   filme.setEstoque(arg1);
	}

	@Dado("^que o preço do aluguel seja R\\$ (\\d+)$")
	public void queOPre�oDoAluguelSejaR$(int arg1) throws Throwable {
         filme.setAluguel(arg1);
	}
    
	@Dado("^um filme$")
	public void umFilme(DataTable table) throws Throwable {
          Map<String, String> map = table.asMap(String.class, String.class);
          filme = new Filme();
          filme.setEstoque(Integer.parseInt(map.get("estoque")));
          filme.setAluguel(Integer.parseInt(map.get("preço")));
          String tipo = map.get("tipo");
          tipoAluguel = tipo.equals("semanal")? TipoAluguel.SEMANAL: tipo.equals("extendido")? TipoAluguel.EXTENDIDO: TipoAluguel.COMUM;

          
	}
	
	
	@Quando("^alugar$")
	public void alugar() throws Throwable {
        try {
    		nota = aluguel.alugar(filme, tipoAluguel);      
        }
        catch (RuntimeException e) {
        	erro = e.getMessage();
        }
	}

	@Entao("^o preço do aluguel será R\\$ (\\d+)$")
	public void oPre�oDoAluguelSer�R$(int arg1) throws Throwable {
             Assert.assertEquals(arg1, nota.getPreco());
	}



	@Entao("^o estoque do filme será (\\d+) unidade$")
	public void oEstoqueDoFilmeSer�Unidade(int arg1) throws Throwable {
          Assert.assertEquals(arg1, filme.getEstoque());
	}

	@Entao("^não será possível por falta de estoque$")
	public void nãoSer�PossívelPorFaltaDeEstoque() throws Throwable {
           Assert.assertEquals("filme sem estoque", erro);
	}

	@Dado("^que o tipo de aluguel seja (.*)$")
	public void queOTipoDeAluguelSejaExtendido(String tipo) throws Throwable {
           tipoAluguel = tipo.equals("semanal")? TipoAluguel.SEMANAL: tipo.equals("extendido")? TipoAluguel.EXTENDIDO: TipoAluguel.COMUM;
	}
	@Entao("^a data de entrega será em (\\d+) dias?$")
	public void aDataDeEntregaSer�EmDias(int arg1) throws Throwable {
               Date dataEsperada  = DateUtil.obterDataDiferencaDias(arg1);
               Date dataReal = nota.getDataEntrega();
               
               DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
               
               Assert.assertEquals(format.format(dataEsperada), format.format(dataReal));
	}

	@Entao("^a pontuação recebida será de (\\d+) pontos$")
	public void aPontua�ãoRecebidaSer�DePontos(int arg1) throws Throwable {
            Assert.assertEquals(arg1,  nota.getPontuacao());
	}

	@Dado("^que o tipo do aluguel seja comum$")
	public void queOTipoDoAluguelSejaComum() throws Throwable {
            
	}
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
