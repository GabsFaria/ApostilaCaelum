package banco;

public class Data extends Conta {
	private int dia;
	private int mes;
	private int ano;

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getDia() {
		return dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getMes() {
		return mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return "Data = " + this.dia + "/" + this.mes + "/" + this.ano;
	}

}
