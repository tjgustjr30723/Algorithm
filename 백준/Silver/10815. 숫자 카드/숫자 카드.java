import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);
        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
            bw.write(isBinarySearch(arr2[i], N, arr1) + " ");
        }

        bw.flush();
        bw.close();
    }

    private static int isBinarySearch(int num, int N, int[] arr1) {
        int left = 0; //인덱스 : 배열의 요소는 0부터 시작
        int right = N-1; //인덱스 : 배열의 요소는 0부터 시작하므로 N-1을 해준다.

        while(left <= right){ //left가 rigth보다 큰 경우는 이진 탐색 규칙에 어긋나므로 반복문 돌리지 X
            int middle = (left + right)/2; //중간 인덱스는 왼쪽 오른쪽의 더한 값에 나누기 2
            int middleValue = arr1[middle]; //중간 인덱스에 해당되는 값 => 이 값으로 비교한다.

            if(num > middleValue){ //만약 num이 중간값보다 크면
                left = middle +1;
            }else if(num < middleValue){ //만약 num이 중간값보다 작으면
                right = middle -1;
            }else return 1; //찾았을 경우 (middleValue == num)일 경우
        }
        return 0;
    }
}