package test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class NewAccountDDT {
	@Test
	public void newAccountTest() {
		
	}
	
	@Parameters
	public static List<String[]> getData(){
		return utilities.CSV.get("/home/codering/Downloads/UserAccounts.csv");
	}
	
	public NewAccountDDT(){
		
	}
	
	

}
