
import java.math.BigDecimal;

/**
 * Model de Cargo
 * 
 * @author ander
 *
 */
public class Cargo {

	private String descricao;
	private BigDecimal salario;

	/**
	 * 
	 * @return Descrição do Cargo
	 */
	public String getDescricao() {
		return this.descricao;
	}

	/**
	 * 
	 * @param descricao Descrição a ser inserida no Cargo
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getSalario() {
		return this.salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

}