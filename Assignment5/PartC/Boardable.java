package Assignment5.PartC;

public interface Boardable {
	
	void setBoardStart(int month, int day, int year);
	void setBoardEnd(int month, int day, int year);
	boolean boarding(int month, int day, int year);

}
