class Solutions {
	 public static void main(String args[]) {
		  int n=5;
		  int Ts=0;
		  for(int line=n;line>=1;line--) {
			  for(int space=1;space<=Ts;space++) {
				  System.out.print(" ");
				  }
			  for(int star=1;star<=line;star++) {
				  System.out.print("*");
			  }
			  Ts++;
			  System.out.println();
		  }
		  
	}
}
