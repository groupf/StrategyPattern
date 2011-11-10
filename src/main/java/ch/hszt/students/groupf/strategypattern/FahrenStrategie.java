package ch.hszt.students.groupf.strategypattern;

public class FahrenStrategie implements FortbewegungsStrategie {

	@Override
	public void bewegen() {
		System.out.println("ich fahre");

	}

}
