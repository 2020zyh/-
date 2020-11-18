public class for02{
	public static void main(String [] agrs){
		int k = 0;
		for(int i = 2;i<=1000;i++){
			//System.out.print(i);
        boolean zhishu = true; 
        for(int j = 2; j<i ;j++){
			if(i%j ==0){
				zhishu = false;
					break;
			}
        }
		    if(zhishu){
				k++;
				System.out.print(" "+i);
				if(k==8){
					System.out.println("");
					k=0;
				}
		    }
          }
		    }
			}