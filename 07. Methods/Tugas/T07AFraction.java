public class T07AFraction { //nama file
  public static void main(String[] args) { //ini angka yang akan digunakan di method sumfractoin dan productfraction
      sumFraction(1, 2, 2, 3);
      sumFraction(1, 3, 3, 4);
      productFraction(1, 2, 2, 3);
      productFraction(1, 4, 2 ,3);
  }

  static int tengah(int x, int y){ //ini untuk mencari nilai fpb
      int nilai;
      while(y != 0) {
          nilai = y;
          y = x % y;
          x = nilai;
      }
      return x;
  }

  static void sumFraction(int e1, int e2, int d1, int d2) { //ini method sumfraction
      int[] hasil = new int[2];
      int es, ds, bagi;
      es = e1 * d2 + e2 * d1;
      ds = d1 * d2;
      bagi = tengah(es, ds);
      hasil[0] = es / bagi;
      hasil[1] = ds / bagi;
      System.out.println(hasil[0] + " / " + hasil[1]);
  }

  static void productFraction(int e1, int e2, int d1, int d2) { //ini method productfraction
      int[] hasil = new int[2];
      int ep, dp, bagi;
      ep = e1 * e2;
      dp = d1 * d2;
      bagi = tengah(ep, dp);
      hasil[0] = ep / bagi;
      hasil[1] = dp / bagi;
      System.out.println(hasil[0] + " / " + hasil[1]);
  }
}
