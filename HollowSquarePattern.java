class Solutions {
	  static   void printSquare(int n) {
	        for(int line=1;line<=n;line++){
	            for(int star=1;star<=n;star++){
	                if(line==1||line==n||star==1||star==n){
	                    System.out.print("*");
	                }
	                else{
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        // code here
	    }
	  public static void main(String args[]) {
		  int n=4;
		  printSquare(n);
	  }
	}
