# SCS2204 - Functional Programming 
<h3>Assignment 1</h3>

1.	Consider the following variables required.
	
       i,j,m,n,k;
       f,g;
       c;

2. then declare the variables in Scala and assign with the initial values as follows:

        k = i = j = 2;
        m = n = 5;
        f = 12.0f;
        g = 4.0f;
        c = ‘X’;
	
3. and evaluate the following expressions:

       a) k + 12 * m	
       b) m / j
       c) n % j
       d) m / j * j
       e) f + 10*5 +g
       f) ++i * n

Compare the Java and Scala programming languages.

•	Use the following declaration and initialization to convert them to acceptable Scala statements. 

     int a = 2, b = 3, c = 4, d = 5;
     float k = 4.3f;

and evaluate the following expressions

     a) println( - -b * a + c *d - -);
     b) println(a++);
     c) println (–2 * ( g – k ) +c);
     d) println (c=c++);
     e) println (c=++c*a++);

4.Write Scala functions to solve the following problems. 

a. Company XYZ & Co. pays all its employees Rs.250 per normal working hour and Rs. 85 per OT hour. A typical employee works 40 (normal) and 30(OT) hours per week has to pay 12% tax. Develop a functional program that determines the take home salary of an employee from the number of working hours and OT hours given.

b. Imagine the owner of a movie theater who has complete freedom in setting ticket prices. The more he charges, the fewer the people who can afford tickets. In a recent experiment the owner determined a precise relationship between the price of a ticket and average attendance.  At a price of Rs 15.00 per ticket, 120 people attend a performance. Decreasing the price by  5 Rupees increases attendance by 20 and increasing the price by  5 Rupees decreases attendance by 20. Unfortunately, the increased attendance also comes at an increased cost. Every performance costs the owner Rs.500. Each attendee costs another 3 Rupees. The owner would like to know the exact relationship between profit and ticket price so that he can determine the price at which he can make the highest profit. Implement a functional program to find out the best ticket price.


<h3>Assignment 2</h3>

1. Area of a disk with radius r is Pi r*r. What is the area of a disk with radius 5?
2. The temperature is 35C; convert this temperature into Fahrenheit.
ºF =ºC * 1.8000 + 32.00
3. The volume of a sphere with radius r is 4/3 Pi r3. What is the volume of a sphere
with radius 5?
4. Suppose the cover price of a book is Rs. 24.95, but bookstores get a 40%
discount. Shipping costs Rs. 3 for the first 50 copies and 75 cents for each
additional copy. What is the total wholesale cost for 60 copies?
5. I run 2 km at an easy pace (8 min per km), then 3 km at Tempo (7 min per km)
and 2 km at easy pace again to reach home. What is the total running time?


<h3>Assignment 3</h3>

1. Develop the function of interest. It consumes a deposit amount and produces the actual
amount of interest that the money earns in a year. The bank pays a flat 2% for deposits of up to
Rs. 20 000, a flat 4% per year for deposits of up to Rs. 200000, a flat 3.5% per year for deposits
of up to Rs. 2000000, and a flat 6.5% for deposits of more than Rs. 200000.

2. Write a program in PatternMatching, takes the integer input from the command line. Based
on the input, write a code using match to print Negative/Zero is input when input is less than or
equal to 0.Print Even number is given when input is even, and print Odd number is given when
input is odd.

3. Write a Scala program which defines a method named "toUpper" and it accepts a String as
input parameter that is then formatted to upper case as output. Define another method named
"toLower'' which accepts a String as input parameter and formats the input to lower case as
output. Define another method named "formatNames" which also has an input String called
"name". This method however has a parameter group which accepts a function with an input of
type String and also outputs a String. This particular function will be used to apply the given
format to the "name" input. You can use the test inputs for, say, "Benny", "Niroshan", "Saman"
“Kumara”, and make sure that the output is as shown below.
Output:
BENNY
NIroshan
saman
KumarA
