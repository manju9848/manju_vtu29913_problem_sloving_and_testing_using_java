// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
   public task1() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      ArrayList var3 = new ArrayList();

      for(int var4 = 0; var4 < var2; ++var4) {
         var3.add(var1.nextInt());
      }

      var3.stream().map((var0x) -> var0x + var0x / 10).forEach((var0x) -> System.out.print(var0x + " "));
      var1.close();
   }
}