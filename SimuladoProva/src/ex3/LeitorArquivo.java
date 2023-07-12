package ex3;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

@SuppressWarnings("deprecation")
public class LeitorArquivo {
	public List<Carga> lerArquivo() {
		ArrayList<Carga> listaCargas = new ArrayList<>();

		try {
			Reader leitorArquivo = new FileReader("bagagens.csv");
			CSVFormat configCSV = CSVFormat.Builder.create()
					.setHeader("id", "proprietario", "peso").setSkipHeaderRecord(true)
					.build().withTrim();
			
			CSVParser interpretadorCSV = configCSV.parse(leitorArquivo);
			List<CSVRecord> records = interpretadorCSV.getRecords();

			for (CSVRecord record : records) {
				Carga carga = new Carga(record.get(0), record.get(1), new BigDecimal(record.get(2)));
				listaCargas.add(carga);
			}

		} catch (IOException e) {
			System.out.println("Erro ao abrir arquivo CSV");
		}

		return listaCargas;
	}
}
