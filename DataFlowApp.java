//main class
public class DataFlowApp {

	public static void main(String[] args) {
		System.out.println(DataTransformer.integerToShort(DataTransformer.doubleToInteger(1.5)));
	}

}

//secondary class
class DataTransformer {
	static byte integerToByte(int value) {

		if (value > 127 || value < -128) {
			System.err.println("WARNING! the value \"" + value + "\" overflows \"byte\" range. DATA will was lost!");
		}
		return (byte) value;
	}

	static int byteToInteger(byte value) {
		if (value > 2147483647 || value < -2147483648) {
			System.err.println("WARNING! the value \"" + value + "\" overflows \"byte\" range. DATA will was lost!");
		}
		return (int) value;
	}

	static int doubleToInteger(double value) {

		if ((int)value!=value||value > 2147483647 || value < -2147483648) {
			System.err.println("WARNING! the value \"" + value + "\" overflows \"byte\" range. DATA will was lost!");
		}
		return (int) value;

	}
	static double integerToDouble(int value) {

//		if (value<4.9E-45f||value>1.7E-32f) {
//			System.err.println("WARNING! the value \"" + value + "\" overflows \"byte\" range. DATA will was lost!");
//		}
		return (double) value;

	}
	static int shortToInteger(short value) {
		if (value > 2147483647 || value < -2147483648) {
			System.err.println("WARNING! the value \"" + value + "\" overflows \"byte\" range. DATA will was lost!");
		}
		return (int) value;
	}
	static short integerToShort(int value) {

		if (value > 32767 || value < -32768) {
			System.err.println("WARNING! the value \"" + value + "\" overflows \"byte\" range. DATA will was lost!");
		}
		return (short) value;
	}
	

}
