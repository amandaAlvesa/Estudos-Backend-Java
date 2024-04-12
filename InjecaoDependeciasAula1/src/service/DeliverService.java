package service;

public class DeliverService {

	public Double deliver(String state) {
		if(state.equalsIgnoreCase("SP")) {
			return 10.0;
		}
		
		return 20.0;
	}
}
