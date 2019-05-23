
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe Governo utilizada para processar informa��es sobre os Politicos e
 * Cargos.
 * 
 * @author ander
 *
 */
public class Governo {

	// armazena uma lista de pol�ticos por estado da federa��o
	private Map<String, List<Politico>> partidosPoliticos;

	public Governo() {
		this.partidosPoliticos = new HashMap<>();
	}

	/**
	 * Esta classe adiciona um Politico em um Partido, para opera��es futuras
	 * 
	 * @param partidoPolitico Partido politico utilizado para executar os
	 *                        processamentos.
	 * @param politico        Politico utilizado para executar os processamentos
	 * @return void
	 */
	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		// recupera a lista de pol�ticos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);

		// se n�o existir uma lista de pol�ticos para o partido informado,
		// devemos instanciar uma nova lista (pois � a primeira inclus�o neste partido)
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}

		// adiciona o pol�tico recebido como par�metro � lista de pol�ticos
		politicos.add(politico);

		// adiciona a lista de pol�ticos ao mapa de partidos usando
		// como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}

	/**
	 * Este m�todo Calcula todos os gastos com sal�rio de um determinado Partido
	 * Politico.
	 * 
	 * @param partidoPolitico Partido Politico para ser c�lculado
	 * @return Valor total dos gastos com os sal�rios do partido informado no
	 *         par�metro em formato BigDecimal
	 */
	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		// implementar busca de pol�ticos para o partido informado
		// e c�lculo dos sal�rios

		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);

		BigDecimal gastosComSalario = new BigDecimal(0);
		for (Politico p : politicos) {
			gastosComSalario = gastosComSalario.add(p.getCargo().getSalario());
		}
		return gastosComSalario;

	}

	/**
	 * M�todo que calcula os gastos com sal�rio de um Partido baseando-se no Cargo
	 * informado
	 * 
	 * @param cargo           Cargo a ser utilizado para o c�lculo
	 * @param partidoPolitico Partido Politico para verificar os gastos
	 * @return Valor total dos gastos do Partido no cargo informado
	 */
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		// implementar busca dos pol�ticos para o partido e cargo informados
		// e c�lculo dos sal�rios
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		BigDecimal gastosComSalarioParaCargo = new BigDecimal(0);
		for (Politico p : politicos) {
			if (p.getCargo().equals(cargo)) {
				gastosComSalarioParaCargo = gastosComSalarioParaCargo.add(p.getCargo().getSalario());
			}
		}

		return gastosComSalarioParaCargo;
	}

}