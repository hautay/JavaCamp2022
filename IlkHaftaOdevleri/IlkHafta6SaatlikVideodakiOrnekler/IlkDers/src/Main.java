import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<CreditManager> credits = new ArrayList<CreditManager>();
		credits.add(new MortgageManager());
		credits.add(new VehicleManager());
		
		for(CreditManager credit : credits) {
			credit.calculate();
		}
	}
	//SOLID prensipleri
}
