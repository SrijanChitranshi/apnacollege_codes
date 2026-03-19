// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class subArrsum {
   public subArrsum() {
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{2, 4, 6, 8, 10};
      sub_Arr_Sum(var1);
   }

   public static void sub_Arr_Sum(int[] var0) {
      int var1 = 0;
      int var2 = Integer.MIN_VALUE;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         int var4 = var3;

         for(int var5 = var3; var5 < var0.length; ++var5) {
            int var6 = var5;
            var1 = 0;

            for(int var7 = var4; var7 <= var6; ++var7) {
               var1 += var0[var7];
            }

            if (var2 < var1) {
               var2 = var1;
            }
         }
      }

      System.out.println(" Max Sum is : " + var2);
   }
}
