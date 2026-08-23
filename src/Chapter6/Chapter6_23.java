package Chapter6;
/*
 * Chapter 6.23
 * (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are
closed on the first day of school. As the students enter, the first student, denoted
S1, opens every locker. Then the second student, S2, begins with the second
locker, denoted L2, and closes every other locker. Student S3 begins with the third
locker and changes every third locker (closes it if it was open, and opens it if it was
closed). Student S4 begins with locker L4 and changes every fourth locker. Stu-
dent S5 starts with L5 and changes every fifth locker, and so on, until student S100
changes L100.
After all the students have passed through the building and changed the lockers,
which lockers are open? Write a program to find your answer.
(Hint: Use an array of 100 Boolean elements, each of which indicates whether a
locker is open (true) or closed (false). Initially, all lockers are closed.)
 */
public class Chapter6_23 {
	public static void main(String args[]) {
		boolean[] locker = new boolean[101];
		
		changeLocker(locker, 1);
		printArray(locker);
	}
	
	static void changeLocker(boolean[] locker, int N) {
		if(N > 100) {
			return;
		}
		
		for (int i = 1; (i * N) < locker.length; i++) {
			if (locker[i * N] == true) 
				locker[i * N] = false;
			else
				locker[i * N] = true;
		}
		
		changeLocker(locker, N + 1);
		
	}
	
	static void printArray(boolean[] locker) {
		for (int i = 1; i < locker.length; i++) {
			if (locker[i] == true) {
				System.out.println("Locker " + i + " is open");
			}
		}
	}

}
