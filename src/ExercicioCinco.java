import javax.swing.JOptionPane;

/**
 * Faça um programa que apresenta as seguintes opções de menu: 
 * (1 – Cadastrar produto, 2 – Mostrar produto cadastrado, 3 – Apagar produto – 4 Sair):
 * 
 * Caso o usuário informe 1, o sistema verifica se já não existe um 
 * produto cadastrado, caso exista, informa o usuário “Já existe o produto x cadastrado, deseja subscrever?”, 
 * se o usuário informar sim, exibe a mensagem “Produto subscrito” e altera o nome do produto cadastrado, 
 * se informar não, exibe “Cadastro cancelado’;
 * 
 * Caso o usuário informa 2, o sistema exibe a mensagem: “O produto que está cadastrado no momento é: X”. 
 * Caso não tenha produto cadastrado, o sistema informa: “Você não tem produtos nesse momento”;
 * 
 * Caso o usuário informe 3, o sistema verifica se o usuário deseja realmente excluir o produto, 
 * caso informe sim, remove a descrição do produto e informa exclusão realizada com sucesso, 
 * caso contrário, informa “Exclusão cancelada”;
 * 
 * Caso o usuário informe 4, informa uma mensagem: “Bye” e para a execução do programa.
 * 
 * */

public class ExercicioCinco {

	public static void main(String[] args) {
		
		int opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("#### MENU #####\n" +
																	"1 – Cadastrar produto\n" +
																	"2 – Mostrar produto cadastrado\n" +
																	"3 – Apagar produto\n"+
																	"4 - Sair"));
		String produtoCadastrado = "notebook";
		
		
		switch(opcaoMenu){
					case 1:
						
						if(!produtoCadastrado.isEmpty()){
							/**
							 * Retorno JOptionPane.showConfirmDialog();
							 * (int) 0 = YES
							 * (int) 1 = NO
							 * 
							 * */
							int escolha = JOptionPane.showConfirmDialog(null, "Produto Existente! : " + produtoCadastrado + " cadastrado.\n" +
																				"Deseja subscrever?", "Atenção", JOptionPane.YES_NO_OPTION);
							
							if(escolha == 0){
								
								String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto");
								
								produtoCadastrado = nomeProduto;
								
								JOptionPane.showMessageDialog(null, "Produto subscrito");
								
							}else{
								
								JOptionPane.showMessageDialog(null, "Cadastro cancelado");
								
							}
						}else{
							String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto");
							produtoCadastrado = nomeProduto;
							JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
						}
						
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "O produto cadastrado no momento é : " + produtoCadastrado);
						break;
					case 3:
						int escolha = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o produto: " + produtoCadastrado + "?",
																	"Atenção", JOptionPane.YES_NO_OPTION);
						
						if(escolha == 0){
							produtoCadastrado = "";
							JOptionPane.showMessageDialog(null, "Produto excluido com sucesso.");
						}else{
							JOptionPane.showMessageDialog(null, "Exclusão cancelada");
						}
						
						break;
					case 4:
						JOptionPane.showMessageDialog(null, "Obrigado por utilizar nossos softwares");
						System.exit(0);
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida");
		}
		
	}
	
}
