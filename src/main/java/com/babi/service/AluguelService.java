package com.babi.service;



import com.babi.model.Filme;
import com.babi.model.NotaAluguel;
import com.babi.model.TipoAluguel;
import com.babi.utils.DateUtil;

public class AluguelService {

	public NotaAluguel alugar(Filme filme, TipoAluguel tipoAluguel) {
		if (filme.getEstoque() == 0)
			throw new RuntimeException("filme sem estoque");
		
		NotaAluguel nota = new NotaAluguel();
		switch (tipoAluguel) {
		case COMUM: 
			nota.setPreco(filme.getAluguel());
			nota.setDataEntrega(DateUtil.obterDataDiferencaDias(1));
			nota.setPontuacao(1);
			break;
		case EXTENDIDO:
			nota.setPreco(filme.getAluguel() * 2);
			nota.setDataEntrega(DateUtil.obterDataDiferencaDias(3));
			nota.setPontuacao(2);
			break;
		case SEMANAL: 
			nota.setPreco(filme.getAluguel() * 3);
			nota.setDataEntrega(DateUtil.obterDataDiferencaDias(7));
			nota.setPontuacao(3);	
			break;
		}
		
		filme.setEstoque(filme.getEstoque() - 1);
		return nota;
	}

}

