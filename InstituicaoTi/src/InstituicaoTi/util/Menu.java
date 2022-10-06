package InstituicaoTi.util;

import java.util.Scanner;

public class Menu {
	
	public void MontaMenu() {
		int opcao=0;
		
		while (opcao==0) {
			System.out.println("\"------------------------------------------------------------\\r\\n\"\r\n"
					+ "		+ \"Institui��o TI\\r\\n\"\r\n"
					+ "		+ \"------------------------------------------------------------\\r\\n\"\r\n"
					+ "		+ \"Escolha uma das op��es a seguir:\\r\\n\"\r\n"
					+ "		+ \"1) Listar todas as turmas\\r\\n\"\r\n"
					+ "		+ \"2) Informar dados de uma turma\\r\\n\"\r\n"
					+ "		+ \"3) Consultar os dados de uma turma\\r\\n\"\r\n"
					+ "		+ \"4) Consultar estat�sticas gerais\\r\\n\"\r\n"
					+ "		+ \"5) Sair do sistema\\r\\n\"\r\n"
					+ "		+ \"------------------------------------------------------------\"");
			
			Scanner in=new Scanner(System.in);
			
			switch (opcao) {
			case 1:
				ListaTurmas();
				
			case 2: 
				InformarDadosTurma();
				
			case 3:
				ConsultarDadosTurma();
				
			case 4:
				ConsultarEstatisticasGerais();
				
			case 5:
				System.out.println("Saindo do sistema...");
			}
		}
	}
}
