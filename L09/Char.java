public class Char
{
   public static void main(String[] args)
   {

      // Original variables
      char dash = '-';
      char a = 'a';
      char letter = a;

      // Prefix increments on letter
      char b = ++letter;
      char c = ++letter;

      // Compound operator on letter
      letter += 2;

      // e is also letter
      char e = letter;

      // Symbols
      char copyrightSign = '\u00A9';
      int copyrightNum = (int) copyrightSign;
      char yen = '¥';
      int yenNum = (int) yen;

      // Print characters
      System.out.printf("Dash: %c%n", dash); // Dash: -
      System.out.printf("Letter: %c \t a: %c \t b: %c \t c: %c \t e: %c%n", letter, a, b, c, e); // Letter: e   a: a   b: b   c: c   e: e
      System.out.printf("Copyright sign: %c \t %d \t %04x%n", copyrightSign, copyrightNum, copyrightNum); // Copyright sign: ©   169   a9
      System.out.printf("Yen: %c \t %d \t %04x", yen, yenNum, yenNum); // Yen: ¥   165   00a5

   }
}