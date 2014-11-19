package estudosscjp;

public class exemple {

	   int i[] = {0};

	   public static void main(String args[]) {

	      int i[] = {1};

	      change_i(i);

	      System.out.println(i[0]);
	      
	      String str1 = "abc"; 

	      String str2 = "abc"; 

	      System.out.println("eh igual: " + str1 == str2);

	   }

	   public static void change_i(int i[]) {

	      i[0] = 2;

	      i[0] *= 2;

	   }

	}