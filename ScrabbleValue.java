import java.lang.reflect.Array;
import java.util.*;

public class ScrabbleValue {

	protected static int letterValue(char letter) {
		String[][] values = {{"a","1"},{"b","3"},{"c","3"},{"d","2"},{"e","1"},{"f","4"},{"g","2"},
		{"h","4"},{"i","1"},{"j","8"},{"k","5"},{"l","1"},{"m","3"},{"n","1"},{"o","1"},{"p","3"},
		{"q","10"},{"r","1"},{"s","1"},{"t","1"},{"u","1"},{"v","4"},{"w","4"},{"x","8"},{"y","4"},
		{"z","10"}};
		for (int i = 0; i<values.length; i++) {
			if (letter == values[i][0].charAt(0)) {
				int numberValue = Integer.parseInt(values[i][1]);
				return numberValue;
			}
		}
		return 0; 
	}
	
	public static void main(String args[]) {
		String h = "aSteroid";
		String lowerH = h.toLowerCase();
		int totalValue = 0;
		for (int i = 0; i<h.length(); i++) {
			totalValue+=letterValue(lowerH.charAt(i));
		}
		System.out.print(totalValue);
	}
}
