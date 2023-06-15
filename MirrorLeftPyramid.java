class Solutions {
	

static   void printMirrorLeftPyramid(int n) {
	        int totalspace=n-1;
	        for(int line=1;line<=n;line++) {
	        	for(int space=1;space<=totalspace;space++) {
	        		System.out.print(" ");
	        	}
	        	for(int star=1;star<=n;star++) {
	        		System.out.print("*");
	        	}
	        	totalspace--;
	        	System.out.println();
	        }
	        }
	        
	  public static void main(String args[]) {
		  int n=5;
		  printMirrorLeftPyramid(n);
	  }
	}
