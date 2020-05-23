package org.libertas.model;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
	public void gravarLog(String model) {
		try {
			
			String diretorio = Paths.get(".").toAbsolutePath().toString();
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			String data = sdf.format(new Date());
			System.out.print(diretorio);
			FileWriter arq = new FileWriter(diretorio + "/log.txt", false);
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.println(data + " - " + model);
			gravarArq.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
