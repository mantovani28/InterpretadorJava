import java.util.Scanner;
import java.io.File;


class LinguagemJL{
	public static void main(String[] args){
		// Início do projeto do interpretador de linguagem em java
		
		
		// está parte foi copiada e modificado nomes de variaveis do exemplo disponibilizado pelo professor Fernando		
		
		// criando o arquivo
		File arquivo;		
		// criando o leitor
		Scanner leitor;
		
        // criando o interpretador
        //Interpretador interpretador;
        String linhas[] = new String[2000]; // arquivo pode ter, no máximo, 2000 linhas.
        
        try {
            // Referencia o arquivo. args[0] conterá os dados passados pela linha de comando (arquivo com codigo a ser interpretado).
            arquivo = new File(args[0]);
            System.out.println("arquivo criado com sucesso");
            
            // Mandamos o Scanner ler a partir do arquivo.
            leitor = new Scanner(arquivo);
            System.out.println("Arquivo lido com sucesso");
            // Instanciamos o interpretador.
			//interpretador = new Interpretador();
            
            // Lemos todas as linhas do arquivo para dentro do
            // vetor "linhas".
            int i = 0;
            while(leitor.hasNext()) {
                linhas[i] = leitor.nextLine();
                i++;
            }
            
            // Inicializamos o interpretador com o vetor de linhas. A partir
            // desse ponto, o objeto "b" irá interpretar o código lido do arquivo.
            //b.interpreta(linhas);
			
        } catch (Exception e) {
            System.out.println("Nao consegui ler o arquivo: " + (args.length > 0 ? args[0] : "(desconhecido)"));
            System.out.println("Uso:");
            System.out.println("    java LinguagemJL Main.JL");
        }
		
		
		
		
		
		
		
	}
}
