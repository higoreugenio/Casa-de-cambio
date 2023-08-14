package aplication;

//Desenvolvedor: Higor Eugenio
//Github: https://github.com/higoreugenio/Casa-de-cambio


public class ConversorDeMoeda {
	
	
	private  double dolar = 4.91;
	private double euro = 5.38;
	private  double chineseYuan = 0.68;
	public double valor = 0.00;
	public double valorPago = 0.00;
	public int opcao;
	
	public double calcularValor() {
	
	if (opcao == 1) {
		valorPago = valor * dolar;
		
	}else if (opcao == 2) {
		valorPago = valor * euro;
		
	}else if (opcao == 3) {
		valorPago = valor * chineseYuan;
			
		}
	
		return valorPago;
	}
	
}


	