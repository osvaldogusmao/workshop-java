import javax.swing.JOptionPane;


public class ExericicioQuatro {

	public static void main(String[] args) {
		
		
		/**
		 *if(condicao == true)
		 * 		fa�a o if
		 * else if(condicao2 == true)
		 * 		faca o else if
		 *else if(condicao3 == true)
		 * 		faca o else if
		 *else if(condicao4 == true)
		 * 		faca o else if 
		 *else
		 *	fa�a o else 
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
					JOptionPane.showMessageDialog(null,"Voc� tem apenas 14 anos. N�o pode entrar....");
					break;
				case 16:
					JOptionPane.showMessageDialog(null,"Voc� tem apenas 16 anos.So pode entrar com seus pais...");
					break;
				case 18:
					JOptionPane.showMessageDialog(null,"Voc� tem 18 anos.J� pode entrar na festa...");
					break;
				default:
					JOptionPane.showMessageDialog(null,"Idade n�o permitida para a festa");
					break;
		
		}
		
		
	}
	
}
