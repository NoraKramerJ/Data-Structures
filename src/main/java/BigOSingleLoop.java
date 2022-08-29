
import java.util.ArrayList;
public class BigOSingleLoop {


        public static void main(String[] args) {
            long numberOfOperations=0;
            int n=100;// size of  Data
            int m=500;
            long startTime;
            long endTime;
            System.out.println("Input size n is = "+ n);

            // Task 1 Single Loop................... O(n)
            startTime=System.currentTimeMillis();
            for (int i = 0; i < n ; i++) {
                numberOfOperations+=1;
            }
            endTime=System.currentTimeMillis();

            System.out.println( "Single Loop Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");

            numberOfOperations=0;
            // Task 2 Nested Loops...................
            startTime=System.currentTimeMillis();
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n ; i++) {
                    numberOfOperations+=1;
                }
            }
            endTime=System.currentTimeMillis();

            System.out.println( "Nested Loop Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");
            // Task 2 End...................
// ......................................................................................................
            // Task 3 Three Nested Loops...................
            numberOfOperations=0;
            // Task 3 Triple Nested Loops...................
            startTime=System.currentTimeMillis();
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n ; i++) {
                    for (int k = 0; k < n; k++) {
                        numberOfOperations+=1;
                    }
                }
            }
            endTime=System.currentTimeMillis();

            System.out.println( "Triple Nested Loop Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");
            // Task 3 End...................
// ......................................................................................................
            // Task 4 N and M Nested Loops  O(n*m)...................
            numberOfOperations=0;

            startTime=System.currentTimeMillis();
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m ; i++) {
                    numberOfOperations+=1;
                }
            }
            endTime=System.currentTimeMillis();

            System.out.println( "Nested Loop (n* m) Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");
            // Task 4 End...................

            // Task 4.5 N and M Consecutive Loops O(n+m)...................
            numberOfOperations=0;

            startTime=System.currentTimeMillis();
            for (int j = 0; j < n; j++) {
                numberOfOperations+=1;
            }
            for (int i = 0; i < m ; i++) {
                numberOfOperations+=1;
            }
            endTime=System.currentTimeMillis();

            System.out.println( "Consecutive Loops O(n+m) Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");
            // Task 4.5 End...................

            // Task 5 Logarithmic Complexity...................
            numberOfOperations=0;
            startTime=System.currentTimeMillis();
            for (int i = 1; i < n ; i*=2) {
                numberOfOperations+=1;
            }
            endTime=System.currentTimeMillis();
            System.out.println( "Logarithmic Number of operations  : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");
            // Task 5 End...................*/
        }
    }

/*
● Data structure is a particular way of storing and organizing data in a
computer so that it can be used efficiently.
● General data structure types include arrays, files, linked lists, stacks, queues,
trees, graphs and so on.
● Depending on the organization of the elements, data structures are
classified into two types:
1) Linear data structures: Elements are accessed in a sequential order but it
is not compulsory to store all elements sequentially (say, Linked Lists).
Examples: Linked Lists, Stacks and Queues.
2) Non – linear data structures: Elements of this data structure are
stored/accessed in a non-linear order. Examples: Trees and graphs.
 */
/*● An algorithm is the step-by-step instructions to solve a given problem.
How do we compare algorithms?
-Ideal solution : Expressing running time of an algorithm as a function of input size.
f(n) where the input size is n.
-This type of comparison is independent of machine time, programming style, etc.
• Always assume that we have a very large size data (n) when talking about the performance of algorithms.
 */
/*
Asymptotic Behavior

● In mathematical analysis, asymptotic analysis is a method of
describing limiting behavior.
● If f(n) = n2 + 3n, then as n becomes very large, the term 3n becomes insignificant
compared to n2. The function f(n) is said to be "asymptotically equivalent to n2
as n → ∞".
● If my input size is large, I can use asymptotic analysis.
 */
/*
What is Big O notation

● Big O notation, also called Landau's symbol, is a symbolism used in complexity theory,
computer science, and mathematics to describe the asymptotic behavior of functions.
● Basically, it tells you how fast a function grows or declines.
In other words:Rate of Growth.

● The ’Big-O’ is the language and metric we use to describe the efficiency of algorithms.

● Big-O is a Big Picture approach.

What is Big O notation

● The ’Big-O’ notation allows us to ignore constant factors and lower-order terms
and focus on the main components of a function that affect its growth.

Rule 1: Always worst Case

Rule 2: Remove Constants
 */