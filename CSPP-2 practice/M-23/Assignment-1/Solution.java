import java.util.*;
import java.io.File;
public final class Solution {
	private Solution() {

	}

	public static void main(String[] args) {
		Plagiarism p = new Plagiarism();
		Scanner sc = new Scanner(System.in);
		try {
			String line = sc.next();
			File file = new File(line);
			File[] listFiles = file.listFiles();
			int l = listFiles.length;
			int[][] matrix = new int[l][l];
			for(int i = 0;i < l; i++) {
				for (int j = 0; j < l; j++) {
					if (i < j) {
						matrix[i][j] = p.bagOfWords(p.toString(listFiles[i]), p.toString(listFiles[j]));
					} else {
						matrix[i][j] = matrix[j][i];
					}
				}
			}
			p.print(matrix, listFiles);
		} catch (Exception e) {
			System.out.println("empty directory");
		}
	}
}
