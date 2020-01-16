package com.babi.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import com.babi.converters.DateConverter;

import cucumber.api.Transform;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;


public class ApCucumberSteps {
   
	
	@Dado("^que criei o arquivo corretamente$")
	public void que_criei_o_arquivo_corretamente() throws Throwable {

	}

	@Quando("^executá-lo$")
	public void executá_lo() throws Throwable {

	}

	@Então("^a especificação deve finalizar com sucesso$")
	public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable {
	}
	
	private int contador = 0;
	@Dado("^que o valor do contator é (\\d+)$")
	public void queOValorDoContatorÉ(int arg1) throws Throwable {
          contador = arg1;	
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
         contador = contador + arg1;
	}

	@Então("^o valor do contador será (\\d+)$")
	public void oValorDoContadorSerá(int arg1) throws Throwable {
		System.out.println(arg1);
		System.out.println(contador);
       //Assert.assertTrue(arg1 == contador);
		Assert.assertEquals(arg1, contador);     
	
}
	
	Date entrega = new Date();
	
	@Dado("^que a entrega é no dia (.*)$")
	public void queOPrazoDeEntregaÉDia(@Transform(DateConverter.class)Date data) throws Throwable {
        entrega = data;
       
	}

	@Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarEmDoisMeses(int arg1, String atraso) throws Throwable {
        Calendar cal = Calendar.getInstance();
        cal.setTime(entrega);
        
        if(atraso.equals("dias")) {
        cal.add(Calendar.DAY_OF_MONTH, arg1);      
        } 
        if(atraso.equals("meses")) {
        cal.add(Calendar.MONTH, arg1);  
        }
        entrega = cal.getTime();
	}

	@Então("^a entrega será efetuada dia (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeráEfetuadaEm(String data) throws Throwable {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = format.format(entrega);
        Assert.assertEquals(data, dataFormatada);
	}
	
	
	@Dado("^que o ticket( especial)? é A.(\\d{3})$")
	public void queOTicketÉAF(String tipo, String arg1) throws Throwable {

	}

	@Dado("^que o valor da passagem é R\\$ (.*)$")
	public void queOValorDaPassagemÉR$(Double numero) throws Throwable {

	}

	@Dado("^que o nome do passageiro é \"(.{5,20})\"$")
	public void queONomeDoPassageiroÉ(String arg1) throws Throwable {

	}

	@Dado("^que o telefone do passageiro é (9\\d{3} - \\d{4})$")
	public void queOTelefoneDoPassageiroÉ(String telefone) throws Throwable {

	}

	@Quando("^criar os steps$")
	public void criarOsSteps() throws Throwable {

	}

	@Então("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {

	}	
}
