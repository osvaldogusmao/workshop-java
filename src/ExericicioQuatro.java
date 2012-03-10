import javax.swing.JOptionPane;


public class ExericicioQuatro {

	public static void main(String[] args) {
		
		
		/**
		 *if(condicao == true)
		 * 		faça o if
		 * else if(condicao2 == true)
		 * 		faca o else if
		 *else if(condicao3 == true)
		 * 		faca o else if
		 *else if(condicao4 == true)
		 * 		faca o else if 
		 *else
		 *	faça o else 
		 * */
		
		/**
		 * switch(codicao)
		 * 		case 1:
		 * 				faca o case1 e para
		 * 		case 2:
		 * 				faca o case2 e para
		 *		case 3:
		 * 				faca o case1 e para
		 * 		default:
		 * 				faca o default e para
		 * 
		 * */
		
		int minhaIdade = 57;
		
		switch (minhaIdade) {
				case 14:
					JOptionPane.showMessageDialog(null,"Você tem apenas 14 anos. Não pode entrar....");
					break;
				case 16:
					JOptionPane.showMessageDialog(null,"Você tem apenas 16 anos.So pode entrar com seus pais...");
					break;
				case 18:
					JOptionPane.showMessageDialog(null,"Você tem 18 anos.Já pode entrar na festa...");
					break;
				default:
					JOptionPane.showMessageDialog(null,"Idade não permitida para a festa");
					break;
		
		}
		
		
	}
	
}
