package service;

public class PayService {

	private DeliverService deliverService;
	private TaxService taxService;
	
	public double finalPrice(double cost, String state) {
		return cost + deliverService.deliver(state) + taxService.tax(cost);
	}
	
}
