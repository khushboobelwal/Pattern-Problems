class Solutions {

    static void printSquare(int n) {
        for(int line =1;line<=n;line++){
            for(int star=1;star<=n;star++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
        // code here
    }

public static void main (String args[]){
  int n=5;
  printSquare(n);
}
}

