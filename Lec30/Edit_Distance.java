package Lec30;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "horse", word2 = "ros";
		System.out.println(MiniOpres(word1, word2, 0, 0));
	}
	public static int MiniOpres(String word1,String word2,int i,int j) {
		if(i==word1.length()) {
			return word2.length()-j;
		}
		if(j==word2.length()) {
			return word1.length()-i;
		}
		int ans=0;
		if(word1.charAt(i)==word2.charAt(j)) {
			ans=MiniOpres(word1, word2, i+1, j+1);
		}
		else {
			int I =MiniOpres(word1, word2, i, j+1);
			int R =MiniOpres(word1, word2, i+1, j+1);
			int D =MiniOpres(word1, word2, i+1, j);
			ans =1+Math.min(R, Math.min(D, I));
		}
		return ans;
	}

}

