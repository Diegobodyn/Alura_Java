import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
	
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("2020 (MMXX, na numera��o romana) � um ano bissexto do s�culo XXI que come�ou numa quarta-feira, segundo o calend�rio gregoriano.");
		bw.newLine();
        bw.newLine();
        bw.write("2020 Segundo o hor�scopo chin�s, � o ano do Rato, come�ando a 25 de janeiro.");
       
        bw.close();
	}

}
