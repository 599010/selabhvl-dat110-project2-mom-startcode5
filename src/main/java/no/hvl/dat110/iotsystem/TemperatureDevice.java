package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
//import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		System.out.println("Temperature device starting ...");

		TemperatureSensor sn = new TemperatureSensor();

		Client client = new Client("sensor", Common.BROKERHOST, Common.BROKERPORT);

		if (client.connect()) {
			for (int i = 0; i < COUNT; i++) {
				int temp = sn.read();
				client.publish(Common.TEMPTOPIC, String.valueOf(temp));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			client.disconnect();
		}

		System.out.println("Temperature device stopping ... ");
	}
}
