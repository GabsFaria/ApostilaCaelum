package tiposPrimitivos;

public class BalancoTrimestral {
	
	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarço= 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarço;
		double mediaMensal = gastosTrimestre/3;
		
		System.out.println("O valor gasto no trimestre é de "+gastosTrimestre+" R$");
		System.out.println("Valor da média mensal = "+mediaMensal);
		
	}

}
