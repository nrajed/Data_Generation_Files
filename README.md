# Dynamically_Priced_Parking_System

A dynamic pricing model built for students at Rutgers University for a system to reserve parking spaces currently free on campus. Built in PHP based on data generated in Java and stored in a Joomla SQL database. 
Check it out here: http://pursuingcolor.com/request-permit/dynamic-pricing

<b>Motivation</b>

At Rutgers University (where I study) there is an issue of not enough parking spots for those who have cars on campus or commute. Another issue is the lack of efficiency in the allocation of these spots. Many times a student will want to park in a relatively empty lot but will not have a permit to do so. The solution is to allow students to reserve these empty spots in free lots and park there for a small fee.

But why make the fee uniform? Let's base the fee based on various factors about students including their GPA, campus, the car he/her drives, and their historical tendency to park for longer than their temporary spot is reserved for.

Data Generation

I generated 2,000 tuples in Java, varying the factors of GPA, campus, car model, and tendency the break the system's rules. I planted trends (i.e. BMW owners with GPAs over 3 but below 3.5 break the system's rules more) and stored this in a .csv file which was imported to an SQL database on Joomla.

Querying Data
Worked with @afend to query data.
