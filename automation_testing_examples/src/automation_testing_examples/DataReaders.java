package automation_testing_examples;

import java.util.*;

public class DataReaders {

	public static void main(String[] args) {
		readCSV();
	}
	public static void readCSV() {
		String filename = "/home/codering/Downloads/UserAccounts.csv";
		List<String[]> records = utilities.CSV.get(filename);
	}

}
