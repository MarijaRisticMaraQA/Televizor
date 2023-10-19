public class MainTV {

	public static void main(String[] args) {

		Television tv = new Television();

		System.out.println(tv.getTvStatus());

		for (int i = 0; i < 10; i++) {
			tv.increaseVolume();
		}

		for (int i = 0; i < 5 ; i++) {
			tv.decreaseVolume();
		}

		System.out.println(tv.getVolume());

		Television tv2 = new Television(6, true);

		System.out.println(tv2.getTvStatus());

		System.out.println(tv2.isTurnedOn());

		tv2.turnOff();

		System.out.println(tv2.isTurnedOn());
	}
}