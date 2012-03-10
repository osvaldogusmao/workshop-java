import javax.swing.JOptionPane;

/**
 * 2. Um escola tem uma média 7 para média no semestre e uma tolerância de faltas de 25%. 
 * Faça um programa que solicite a nota de um determinado aluno no primeiro semestre e a
 * quantidade de faltas, e imprima se o aluno foi aprovado ou não. OK
 * 
 * 3. Com base no exercício anterior, solicite também a nota e faltas do aluno do 
 * segundo semestre e verifique se ele foi aprovado nesse semestre ou não e 
 * informe também se o aluno passou de ano ou não. Lembrando que ele pode 
 * recuperar a nota no segundo semestre, e a tolerância de faltas é de 25% do ano todo pra que ele passe de ano. - OK
 * 
 * 4. Se o aluno do exercício anterior não passou de ano, solicite do usuário que ele informa a 
 * nota do exame que o aluno fez e verifique se esse aluno foi aprovado. OK
 * 
 * 5. Se o aluno do exercício anterior não atingiu a média realizando a prova de exame, 
 * solicite a nota de segunda época e informe se ele foi aprovado ou não.
 * 
 * */

public class ExercicioTres {

	public static void main(String[] args) {
		
		int numeroAulas = 40;
		
		String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno");
		
		// Primeiro Semestre
		
		float notaPrimeiroSemestre = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do aluno " + nomeAluno));
		int faltaPrimeiroSemestre = Integer.parseInt(JOptionPane.showInputDialog("Digite as faltas do aluno " + nomeAluno));
		
		float frequenciaPrimeiroSemestre = (faltaPrimeiroSemestre * 100) / numeroAulas;
		
		if((frequenciaPrimeiroSemestre) <= 25 && (notaPrimeiroSemestre >= 7)){
			
			JOptionPane.showMessageDialog(null, "O Aluno"  + nomeAluno + " foi aprovado no 1ª semestre");
			
		}else{
			
			JOptionPane.showMessageDialog(null, "Aluno "  + nomeAluno + " foi reprovado no 1ª semestre");
			
		}
		
		// Segundo Semestre
		
		float notaSegundoSemestre = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do aluno " + nomeAluno));
		int faltaSegundoSemestre = Integer.parseInt(JOptionPane.showInputDialog("Digite as faltas do aluno " + nomeAluno));
		
		float frequenciaSegundoSemestre = (faltaSegundoSemestre * 100) / numeroAulas;
		
		float notaFinalSemestre = (notaPrimeiroSemestre+notaSegundoSemestre)/2;
		
		if((frequenciaSegundoSemestre) <= 25 && (notaFinalSemestre >= 7)){
			
			JOptionPane.showMessageDialog(null, "O Aluno "  + nomeAluno + " foi aprovado");
			
		}else{
			
			JOptionPane.showMessageDialog(null, "Aluno "  + nomeAluno + " foi reprovado, terá que fazer exame");
			
			float notaExame = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do exame"));
			
			if((notaExame + notaFinalSemestre) >= 10){
				
				JOptionPane.showMessageDialog(null, "O Aluno "  + nomeAluno + " foi aprovado");
				
			}else{
				
				
				/** Retorno de mensagem para JOptionPane.showConfirmDialog();
				 * 	int 0 = YES
				 *  int 1 = NO
				 */
				
				int escolha = JOptionPane.showConfirmDialog(null, "Você deseja fazer a prova de segunda época?", "Atenção", JOptionPane.YES_NO_OPTION);
				
				if(escolha == 0){
					
					float notaSegundaEpoca = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da segunda época"));
					
					if((notaSegundaEpoca + notaFinalSemestre) >= 10){
						JOptionPane.showMessageDialog(null, "O Aluno "  + nomeAluno + " foi aprovado");
					}else{
						JOptionPane.showMessageDialog(null, "Aluno "  + nomeAluno + " foi reprovado no ano");
					}
					
				}else{
					JOptionPane.showMessageDialog(null, "Aluno "  + nomeAluno + " foi reprovado no ano");
				}
				
			}
				
			
		}
		
		
			
		
	}
	
}
