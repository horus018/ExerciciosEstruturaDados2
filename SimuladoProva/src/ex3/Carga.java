package ex3;

import java.math.BigDecimal;

public class Carga implements Comparable<Carga>{
	private String id;
	private String proprietario;
	private BigDecimal peso;

	public Carga(String id, String proprietario, BigDecimal peso) {
		super();
		this.id = id;
		this.proprietario = proprietario;
		this.peso = peso;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "ID:" + id + " Proprietario:" + proprietario + " Peso:" + peso + " Kg";
	}

	@Override
	public int compareTo(Carga c) {
		return this.getPeso().compareTo(c.getPeso());
	}

}
