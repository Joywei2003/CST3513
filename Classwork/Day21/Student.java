package Day21;  /** apr 15 2024 */

public abstract class Student
{
    private String name;
    private String idNumber;
     private int yearAmitted;

     public Student (String n, String id, int year)
     {
         name = n;
         idNumber = id;
         yearAmitted = year;
     }

     public String toString()
     {
         String str;
         str = "Name: " + name + "\nID Number: " + "\nYear Admitted: " + yearAmitted;
         return str;
     }
     public abstract int getRemainingHours();













}
