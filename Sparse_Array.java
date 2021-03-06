//Questions in Bottom of the Code
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sparse_Array {

    // Complete the matchingStrings function below.
    //My Code Starts here
    static int[] matchingStrings(String[] strings, String[] queries) {
        int n1=strings.length;
        int n2=queries.length;
        int i,j;
        int[] a=new int[n2];
        for(i=0;i<n2;i++)
        {
            a[i]=0;
            for(j=0;j<n1;j++)
            {
                if(queries[i].equals(strings[j]))
                {
                    a[i]++;
                }
            }
        }
        return a;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
/*
Question:
There is a collection of input strings and a collection of query strings.
For each query string, determine how many times it occurs in the list of input strings.

For example, given input strings=['ab','ab','abc'] and queries=['ab,'abc','bc'],
we find 2 instances of 'ab',1 of 'bc' and 0 of 'bc'.
For each query, we add an element to our return array,results=[2,1,0] .

Function Description:
The function must return an array of integers representing the frequency of occurrence 
of each query string in strings.

matchingStrings has the following parameters:
  1.strings - an array of strings to search
  2.queries - an array of query strings

Input Format:
The first line contains and integer n, the size of strings. 
Each of the next n lines contains a string strings[i]. 
The next line contains q, the size of queries. 
Each of the next q lines contains a string q[i].

Constraints
  1.1<=n<=1000
  2.1<=q<=1000
  3.1<=|strings[i]|,|queries[i]|<=20.

Output Format:
Return an integer array of the results of all queries in order.

Sample Input:
4   //Array:strings
aba  
baba
aba
xzxb
3    //Array:queries
aba
xzxb
ab

Sample Output:
2
1
0

Explanation:
Here, "aba" occurs twice, in the first and third string.
The string "xzxb" occurs once in the fourth string, and "ab" does not occur at all.
*/
