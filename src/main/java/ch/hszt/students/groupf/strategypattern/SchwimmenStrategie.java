package ch.hszt.students.groupf.strategypattern;

public class SchwimmenStrategie implements FortbewegungsStrategie {

	@Override
	public void bewegen() {
		System.out.println("ich schwimme");

	}

}
