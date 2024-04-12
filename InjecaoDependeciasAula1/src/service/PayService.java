package service;

public class PayService {

	private DeliverService deliverService;
	private TaxService taxService;

	public PayService(DeliverService deliver, TaxService tax) {
		this.deliverService = deliver;
		this.taxService = tax;
	}
	
	public double finalPrice(double cost, String state) {
		return cost + deliverService.deliver(state) + taxService.tax(cost);
	}
	
}
