package naodemo;

import rise.core.utils.tecs.Behaviour;
import rise.core.utils.tecs.TECSClient;

public class Main {
	public static void main(String[] args) {

		TECSClient tc = new TECSClient("192.168.1.147", "TECSClient", 1234);
		tc.startListening();
//		tc.send(new Behaviour(102, "SmallBow", "Goedemiddag allemaal"));
//		tc.send(new Behaviour(102, "StandHead", ""));
//		tc.send(new Behaviour(102, "ShowBiceps", "Ik ben sterk!"));
//		tc.send(new Behaviour(102, "StandHead", ""));
//		tc.send(new Behaviour(102, "NoShakeHead", "Nee!"));
//		tc.send(new Behaviour(102, "StandHead", ""));
		tc.send(new Behaviour(102, "StandHead", ""));
		tc.send(new Behaviour(102, "Think", "Even denken!"));
		tc.send(new Behaviour(102, "StandHead", ""));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}
