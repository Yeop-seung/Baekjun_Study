import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		try {
			int n = Integer.parseInt(br.readLine());

			int[][] arr = new int[n][2];
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 2; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			for (int i = 0; i < n; i++) {
				int count = 1;
				for (int j = 0; j < n; j++) {
					if (arr[i][0] < arr[j][0]) {
						if (arr[i][1] < arr[j][1]) {
							count++;
						}
					}
				}
				sb.append(count).append(" ");
			}

			br.close();
			System.out.println(sb);
		} catch (Exception e) { //
			System.out.println(e.toString());
		}
	}
}