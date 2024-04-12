package aplication;

import service.DeliverService;
import service.PayService;
import service.TaxService;

public class Program {

	public static void main(String[] args) {
		
		TaxService taxService = new TaxService();
		DeliverService deliverService = new DeliverService();
		
		PayService payService = new PayService(deliverService, taxService);
		
		System.out.println("Resultado: " + payService.finalPrice(300.0, "sp"));
	}
}
