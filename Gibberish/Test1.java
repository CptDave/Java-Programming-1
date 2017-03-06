import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Random random = new Random();
		
		int x = 0;
		while (x < 50) {
			System.out.printf("%d ", random.nextInt(8) + 1);
			x += 1;
		}
	}
}