////////////////////////////////////////////////////////////////////
// Gabriele Di Pietro 2010000
// Elio Greggio 2012831
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
      return printAsciiArt(IntegerToRoman.convert(num));
    }
    
    public static String printAsciiArt(String romanNumber){
      StringBuilder result = new StringBuilder();
      int length = romanNumber.length();
      for (int i = 0; i < length; i++) {
        char c = romanNumber.charAt(i);
        switch(c) {
          case 'I':
              result.append("***\n");
              result.append(" * \n");
              result.append(" * \n");
              result.append(" * \n");
              result.append("***\n");
              result.append("\n");
            break;
          case 'V':
            result.append("*        *\n");
            result.append(" *      * \n");
            result.append("  *    *  \n");
            result.append("   *  *   \n");
            result.append("     *    \n");
            result.append(" \n");
          break;
          default:
            throw new IllegalArgumentException("Invalid Roman numeral: " + c);
        }
      }
      return result.toString();
    }
}
