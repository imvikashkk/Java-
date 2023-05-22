/* Java provides two interfaces to sort objects using data members of the class: 
   01. Comparable
   02. Comparator */


   /*
   ************************** Using Comparable Interface ******************************

A comparable object is capable of comparing itself with another object. The class itself 
must implements the java.lang.Comparable interface to compare its instances. Consider a 
Movie class that has members like, rating, name, year. Suppose we wish to sort a list of 
Movies based on year of release. We can implement the Comparable interface with the Movie 
class, and we override the method compareTo() of Comparable interface. */



import java.util.*;

class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(Movie m)
	{
		return this.year -  m.year ;
	}

	// Constructor
	public Movie(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear()	 { return year; }
}

 class _comparable{
    public void comparable(){
        ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		for (Movie movie: list)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());
		}
    }
}


/* 
Now, suppose we want to sort movies by their rating and names as well. When we make a 
collection element comparable(by having it implement Comparable), we get only one chance 
to implement the compareTo() method. The solution is using Comparator. 
*/





/* 
  ***************************** Using Comparator ******************************

Unlike Comparable, Comparator is external to the element type we are comparing. It’s a 
separate class. We create multiple separate classes (that implement Comparator) to compare 
by different members. Collections class has a second sort() method and it takes Comparator. The sort() method 
invokes the compare() to sort objects.
To compare movies by Rating, we need to do 3 things:

   00. Create a class that implements Comparator (and thus the compare() method that 
       does the work previously done by compareTo()).
   00. Make an instance of the Comparator class.
   00. Call the overloaded sort() method, giving it both the list and the instance of the 
       class that implements Comparator.
 */



// // A class 'Movie' that implements Comparable
// class Movie implements Comparable<Movie> {
// 	private double rating;
// 	private String name;
// 	private int year;


// 	public int compareTo(Movie m)
// 	{
// 		return this.year - m.year;
// 	}

// 	public Movie(String nm, double rt, int yr)
// 	{
// 		this.name = nm;
// 		this.rating = rt;
// 		this.year = yr;
// 	}

// 	public double getRating() { return rating; }
// 	public String getName() { return name; }
// 	public int getYear() { return year; }
// }


// Class to compare Movies by ratings
class RatingCompare implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2)
	{
		if (m1.getRating() < m2.getRating())
			return -1;
		if (m1.getRating() > m2.getRating())
			return 1;
		else
			return 0;
	}
}



// Class to compare Movies by name
class NameCompare implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}



// Driver class
class _comparator{
	public void comparator()
	{
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));


		System.out.println("Sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list, ratingCompare);
        
		for (Movie movie : list)
			System.out.println(movie.getRating() + " "
							+ movie.getName() + " "
							+ movie.getYear());

		
		System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (Movie movie : list)
			System.out.println(movie.getName() + " "
							+ movie.getRating() + " "
							+ movie.getYear());

	

		System.out.println("\nSorted by year");
		Collections.sort(list);
		for (Movie movie : list)
			System.out.println(movie.getYear() + " "
							+ movie.getRating() + " "
							+ movie.getName() + " ");
	}
}









/***************************************************************************************/

class _01_ComparableComparator
{
	public static void main(String[] args)
	{
		System.out.println("************COMPARABLE*************\n\n");
        _comparable A = new _comparable();
        A.comparable();

        System.out.println("\n\n\n\n************COMPARATOR*************\n\n");
        _comparator B = new _comparator();
        B.comparator();
	}
}