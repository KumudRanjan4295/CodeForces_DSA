// A. 1 to N
// time limit per test1 second
// memory limit per test256 megabytes
// Given a number N. Print numbers from 1 to N in separate lines.

// Input
// Only one line containing a number N (1 ≤ N ≤ 103).

// Output
// Print N lines according to the required above.

// Example
// InputCopy
// 5
// OutputCopy
// 1
// 2
// 3
// 4
// 5

// Solution

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 1 ; i<=n ; i++){
		    System.out.println(i);
		}
		
	}
}


// /time and space complexity
// Time Complexity: O(N) - We are iterating from 1 to N.
// Space Complexity: O(1) - We are using a constant amount of space.