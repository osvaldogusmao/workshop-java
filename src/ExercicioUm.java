
import javax.swing.JOptionPane;

/**
 * Crie um programa que solicite um valor com casas decimais ao usuário, se esse valor for igual a 10, 
 * imprima: “Você adivinhou o número secreto”, caso contrário, imprima: “O número está incorreto”.
 * 
 * */

public class ExercicioUm {

	public static void main(String args[]){
		
		
		float numeroDigitado = Float.parseFloat(JOptionPane.showInputDialog("Digite sua senha"));
		
		if(numeroDigitado == 10){
			JOptionPane .showMessageDialog(null, "Você adivinhou o número secreto");
		}else{
			JOptionPane .showMessageDialog(null, "Você não adivinhou o número secreto");
		}
		
		
	}
	
}
