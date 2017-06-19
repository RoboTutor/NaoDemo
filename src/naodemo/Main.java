package naodemo;

import rise.core.utils.tecs.Behaviour;
import rise.core.utils.tecs.TECSClient;

public class Main {

	/**
	 * Not working: Nod
	 */
	private static Behaviour[] behaviours_1 = {
			// Introduction
			new Behaviour(1, "SmallBow", "Goedemiddag allemaal."),
			new Behaviour(1, "StandHead", "Leuk dat jullie er zijn!"),
			// Nao
			new Behaviour(1, "Me", "Ik ben Rowan."),
			new Behaviour(1, "LookAround", "Ik kom uit de T U Delft."),
			new Behaviour(1, "FromAToB",
					"Ik ga wel eens langs bij scholen en dagverblijven om iets te vertellen over robots."),
			new Behaviour(1, "Propose", "Ik word ook gebruikt voor onderzoek."),
			new Behaviour(1, "State", "Bijvoorbeeld om zieke kinderen te vergezellen, maar ook voor muziektherapie bij ouderen!"),
			// Dance
			new Behaviour(1, "StandHead", "Maar wisten jullie dat ik ook een goede danser ben?"),
			new Behaviour(1, "Propose", "Kijk maar!"),
			new Behaviour(1, "StandHead", "") };
	private static Behaviour[] behaviours_2 = {
			// Experiment
			new Behaviour(1, "StandHead", "Ik zal even vertellen wat we hierna gaan doen."),
			new Behaviour(1, "Propose", "Jullie krijgen straks een lijst vragen, waaruit jullie een aantal kunnen kiezen."),
			new Behaviour(1, "State", "Deze gaan zowel over robots, computers, maar ook over mij."),
			new Behaviour(1, "Propose", "Daarna zal ik jullie een voor een uitnodigen om die vragen aan mij te stellen!."),
			// Conclusion
			new Behaviour(1, "XWaving", "Tot straks!"),
			new Behaviour(1, "StandHead", "")};

	public static void main(String[] args) {

		TECSClient tc = new TECSClient("192.168.1.147", "TECSClient", 1234);
		tc.startListening();

		// for (int i = 0; i < behaviours.length; i++) {
		// tc.send(behaviours[i]);
		// }

		tc.send(new Behaviour(1, "StandHead", ""));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}
