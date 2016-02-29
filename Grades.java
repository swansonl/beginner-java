//Lindsay Swanson
//2/15/16

/*
2. 
a)studentAve simplifies the code by creating one section that can be used repeatedly without having to
be written out for every student. This piece of code can be used to examine the grades for every student,
and allows you to incoporate the averages of student grades into the bigger problem in main
b)the value that is returned is stored and then goes to the call site when the method is called
c)printing has no effect on the execution of your code, it just writes something on the screen
return, meanwhile, changes how your code executes because it tells the computer what to execute and what 
values to use
*/
public class Grades
{
	public static double studentAve()
	{
		double grades;
		double accum;
		double average;
		double user;
		
		accum = 5;
		average = 0;
		grades = 1;
		
		while (accum > 0)
		{
			grades = IO.readDouble("Enter a grade ");
			average = average + grades;
			accum = accum - 1;
		}
			
		user = average / 5;
		return user;
	}
	public static void main(String[] args)
	{
	//read a double asking if there are more students
	//if number is negative, main should output the averages
		double student, grade, average, max, min, total, counter;
		
		student = 0;
		min = 0;
		max = 0;
		average = 0;
		total = 0;
		counter = 0;
		
		while (student >= 0)
		{
			student = IO.readDouble("Is there another student? ");
			if (student < 0)
			{
				break;
			}
			average = studentAve();
			if (average > max)
			{
				max = average;
			}
			if (average < min && average > 0)
			{
				min = average;
			}
			if (student >= 0)
			{
				counter = counter + 1;
				if (counter == 1)
				{
					min = average;
				}
			}

			total = total + average;
			//student = student - 1;
		}
		if (counter > 0)
		{
			total = total / counter;
		}
		else
		{
			total = 0.0;
		}
		System.out.println("Low Average: " + min + ";" + " High Average: " + max + ";" + " Overall Average: " + total);
	}
}