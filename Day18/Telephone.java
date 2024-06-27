package Day18; /** apr 1 2024 */

public class Telephone
{
   public final static int FORMATTED_LENGTH = 13;
   public final static int UNFORMATTED_LENGTH = 10;
   /**
    * The isFormatted method accepts a string argument and determines whether it is properly formatted as a US telephone number in the following manner:
    * (XXX)XXX-XXXX
    * If the argument is properly formatted, the method returns true, otherwise false.
    */
   public static boolean isFormatted(String str)
   {
      boolean valid;   //Flag to indicate valid format
      // Determine whether str is properly formatted.
      if (str.length( )== FORMATTED_LENGTH &&
              str.charAt(0) == '(' &&
              str.charAt(4) == ')'&&
              str.charAt(8) =='-')
         valid = true;
      else
         valid = false;

      return valid;
   }

   /**
    * The unformat method accepts a string containing a telephone number formatted as:
    * (XXX)XX-XXK.
    * If the argument is formatted in this way, the method returns an unformatted string where the parentheses and hyphen have been removed.
    * Otherwise, it returns the original argument.
    */

   public static String unformat(String str)
   {
      // Create a StringBuilder initialized with str.
      StringBuilder strb = new StringBuilder(str);

      // If the argument is properly formatted, then unfacmat it.
      if (isFormatted(str))
      {
         // First, delete the left paren at position 0.
         strb.deleteCharAt(0);

         // Next, delete the right paren. Because of the previous deletion it is now located at position 3.
         strb.deleteCharAt(3);

         // Next, delete the hyphen. Because of the previous deletions it is now located at position 6.
         strb.deleteCharAt(6);
      }
      // Return the unformatted string.
      return strb.toString();
   }
   /**
    * The format method formats a string as:
    * (XXX)XX-XXK.
    * If the length of the argument is UNFORMATTED_LENGTH the method returns the formatted string.
    * Otherwise,it returns the orginal argument.
    */
   /**public static String format(String str)
   {
      // Create a StringBuilder initialized with str.
      StringBuilder strb = new StringBuilder(str);
      return;
   }
*/
}