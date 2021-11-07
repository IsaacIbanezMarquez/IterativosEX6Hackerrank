
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//  ENUNCIADO:

    // Suma N nombres divisibles de 11

/*  Igual que suma N nombres però en aquest cas només sumarem aquells que es puguin dividir entre 11 (Pista: %).

Input Format

Introdueix primer un nombre N: nombre de números a introduir. Introdueix aquests n nombres dins un bucle.

Constraints

No n'hi ha.

Output Format

Imprimeix la suma de tots els nombres introduïts.

Sample Input 0

4
11 22 5 67
Sample Output 0

33
Sample Input 1

1
65
Sample Output 1

0

 */










public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int answer = 0;

        while (count > 0)
        {
            int var = sc.nextInt();

            if (var%11==0)
            {
                answer =  answer + var;

            }
            count--;

        }

        System.out.println(answer);
    }

}
