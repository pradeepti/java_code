package java_code;

public class TowerOfHanoi {
	public static void moveDisks(int disknumber, String start, String dest, String temp) {
		if (disknumber == 0) {
			System.out.println("No disks to move");
			return;
		} else {
			if (disknumber == 1) {
				System.out.println("moving disk 1 from " + start + " to " + dest);
				return;
			} else {
				moveDisks(disknumber - 1, start, temp, dest);
				System.out.println("Move disk " + disknumber + " from " + start + " to " + dest);
				moveDisks(disknumber - 1, temp, dest, start);
			}
		}
	}

	public static void main(String[] args) {
		moveDisks(3, "start", "dest", "temp");
	}
}
