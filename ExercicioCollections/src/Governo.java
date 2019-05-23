
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe Governo utilizada para processar informações sobre os Politicos e
 * Cargos.
 * 
 * @author ander
 *
 */
public class Governo {

	// armazena uma lista de políticos por estado da federação
	private Map<String, List<Politico>> partidosPoliticos;

	public Governo() {
		this.partidosPoliticos = new HashMap<>();
	}

	/**
	 * Esta classe adiciona um Politico em um Partido, para operações futuras
	 * 
	 * @param partidoPolitico Partido politico utilizado para executar os
	 *                        processamentos.
	 * @param politico        Politico utilizado para executar os processamentos
	 * @return void
	 */
	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		// recupera a lista de políticos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);

		// se não existir uma lista de políticos para o partido informado,
		// devemos instanciar uma nova lista (pois é a primeira inclusão neste partido)
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}

		// adiciona o político recebido como parâmetro à lista de políticos
		politicos.add(politico);

		// adiciona a lista de políticos ao mapa de partidos usando
		// como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}

	/**
	 * Este método Calcula todos os gastos com salário de um determinado Partido
	 * Politico.
	 * 
	 * @param partidoPolitico Partido Politico para ser cálculado
	 * @return Valor total dos gastos com os salários do partido informado no
	 *         parâmetro em formato BigDecimal
	 */
	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		// implementar busca de políticos para o partido informado
		// e cálculo dos salários

		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);

		BigDecimal gastosComSalario = new BigDecimal(0);
		for (Politico p : politicos) {
			gastosComSalario = gastosComSalario.add(p.getCargo().getSalario());
		}
		return gastosComSalario;

	}

	/**
	 * Método que calcula os gastos com salário de um Partido baseando-se no Cargo
	 * informado
	 * 
	 * @param cargo           Cargo a ser utilizado para o cálculo
	 * @param partidoPolitico Partido Politico para verificar os gastos
	 * @return Valor total dos gastos do Partido no cargo informado
	 */
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		// implementar busca dos políticos para o partido e cargo informados
		// e cálculo dos salários
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