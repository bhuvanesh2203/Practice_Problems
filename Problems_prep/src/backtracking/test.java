package backtracking;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           char c[][]= {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
	
	      int a[][]=new int[c.length][c.length];
	      a=converttoInt(c);
	      display(a);
	}
	 static int[][] converttoInt(char[][] a){
	        int intarr[][]=new int[a.length][a[0].length];
	        for(int i=0;i<a.length;i++){
	            for(int j=0;j<a.length;j++){
	                if(a[i][j]=='.'){
	                	System.out.println("came inside");
	                    //intarr[i][j]=0;
	                	continue;
	                }
	                intarr[i][j]=a[i][j]-'0';
	            }
	        }
	        return intarr;
	    }
	 
		static void display(int a[][]) {
			for(int k[]:a) {
				for (int i = 0; i < k.length; i++) {
					System.out.print(k[i]+" ");
				}
				System.out.println();
			}
		}
}
