package pt.c40task.l05wumpus;
import java.util.Scanner;

public class AppWumpus {

   public static void main(String[] args) {
      AppWumpus.executaJogo(
            (args.length > 0) ? args[0] : null,
            (args.length > 1) ? args[1] : null,
            (args.length > 2) ? args[2] : null);
   }
   
   public static void executaJogo(String arquivoCaverna, String arquivoSaida,
                                  String arquivoMovimentos) {
	   
      Toolkit tk = Toolkit.start(arquivoCaverna, arquivoSaida, arquivoMovimentos);
      
      Scanner in = new Scanner(System.in);
      
      String cave[][] = tk.retrieveCave();
      
      System.out.println("=== Caverna");
      for (int l = 0; l < cave.length; l++) {
         for (int c = 0; c < cave[l].length; c++)
            System.out.print(cave[l][c] + ((c < cave[l].length-1) ? ", " : ""));
         System.out.println();
      }
      
      ControleDoJogo controle = new ControleDoJogo();
      MontadorCaverna montador = new MontadorCaverna(cave);
      Caverna caverna = new Caverna();
      Heroi h = new Heroi(0,0);
      
      
      if (montador.CavernaVerifica�ao(cave) == true) {
	      String movements = "";
	      if (movements == "") {
	    	  System.out.print("Nome do player: ");
	    	  h.setNome(in.nextLine());
	    	  caverna.imprimeCaverna(caverna.retornaSaida());
    		  tk.writeBoard(caverna.retornaSaida(), h).getScore(), status);
    		  a��o = in.nextLine().charAt(0);
    		  while(a��o != 'q') {
    			  if (a��o != 'q' && controle.comandoValido(comando)) {
    				  
    			  }
    			  

	   
	      int score = -120;
	      char status = 'x'; // 'w' para venceu; 'n' para perdeu; 'x'  intermedi�rias
	      tk.writeBoard(partialCave, score, status);
	
	      System.out.println("=== �ltima Caverna");
	      char finalCave[][] = {	
	         {'#', '#', 'b', '-'},
	         {'#', 'b', '#', 'f'},
	         {'b', '-', '-', 'w'},
	         {'#', '-', '-', '-'}
	      };
	      score = -1210;
	      status = 'n'; // 'w' para venceu; 'n' para perdeu; 'x'  intermedi�rias
	      tk.writeBoard(finalCave, score, status);
      }
      
      tk.stop();
   }

}
