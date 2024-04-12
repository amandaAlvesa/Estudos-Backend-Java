package service;

public class DeliverService {

	public double deliver(String state) {
		if(state.equalsIgnoreCase("SP")) {
			return 10.0;
		}
		
		return 20.0;
	}
}
