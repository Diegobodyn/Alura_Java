import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {
	
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		
		ps.println("2020 (MMXX, na numeração romana) é um ano bissexto do século XXI que começou numa quarta-feira, segundo o calendário gregoriano.");
		ps.println();
		ps.println();
		ps.println("2020 Segundo o horóscopo chinês, é o ano do Rato, começando a 25 de janeiro.");
       
        ps.close();
        
        System.out.println();
	}

}
