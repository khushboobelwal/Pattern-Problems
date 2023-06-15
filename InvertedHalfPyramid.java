class Solutions {
static   void printInvertedHalfPyramid(int n) {
	        for(int line=n;line>=1;line--){
	            for(int star=1;star<=line;star++){
	                
	                    System.out.print("*");
	                
	            }
	            System.out.println();
	        }
	        // code here
	    }
	  public static void main(String args[]) {
		  int n=5;
		  printInvertedHalfPyramid(n);
	  }
	}
