import javax.swing.JOptionPane;

/**
 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o 
 * rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes 
 * maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) 
 * deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa 
 * que leia a variável “peso” (peso de peixes) e verifique se há excesso. Se houver, gravar na 
 * variável “excesso” (Excesso) e na variável “multa” o valor da multa que João deverá pagar. 
 * Caso contrário mostrar tais variáveis com o conteúdo ZERO.
 * 
 * */
public class ExercicioDois {
	
	
	public static void main(String[] args) {
	
	float pesoEstabelecido = 50;
		
	float pesoDoPeixe = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do peixe"));
	
	float quiloExcedente = 0;
	float multa = 0;
	
	if(pesoDoPeixe > pesoEstabelecido){
		
		quiloExcedente = pesoDoPeixe - pesoEstabelecido;
		multa = quiloExcedente * 4;
		
		JOptionPane.showMessageDialog(null, "João pescou um peixe de : " + pesoDoPeixe + 
											"\nE excedeu o peso em : "+  quiloExcedente + 
											"\nPagará uma multa de : " + multa);
		
		
	}else
	{
		JOptionPane.showMessageDialog(null, "Não pagará multa, pois não houve excesso de peso");
	}
	
	
	
		
	}
	

}
