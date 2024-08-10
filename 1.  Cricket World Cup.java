/*The cricket World Cup has started in Chefland.
There are many teams participating in the group stage matches.
Any team that scores 12 or more points in the group stage matches qualifies for the next stage.
You know the score that a particular team has scored in the group stage matches. 
Determine if the team has qualified for the next stage or not.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
        int x = m.nextInt();
        if(x>=12) System.out.println("Yes");
        else System.out.println("No");

	}
}
