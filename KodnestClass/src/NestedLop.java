
public class NestedLop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i<=3) {
			int j = 1;
			while (j <= 4) {
				System.out.println("i :" + i + "j :" + j);
				j++;
				}
			i++;
		}
       do {
    	  int j=1;
    	   do {
    		   System.out.println("i :" + i + " j :" + j);
    		   j++;
    		   
    	   } while (j <= 4);
    	   i++;
    	   
       } while (i <=3);
       
       for(int j =1; j <= 3 ;j++) {
    	   for(int m = 1; m<=4;m++ ) {
    		   System.out.println("i :" + j + " j :" + m);
    	   }
       }
       
	}
	

}
