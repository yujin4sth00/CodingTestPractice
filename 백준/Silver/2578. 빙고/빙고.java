import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] x = new int[5][5];
        int[] y = new int[25];
        
        // 빙고 보드 입력 받기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        
        // 부른 숫자 입력 받기
        for (int i = 0; i < 25; i++) {
            y[i] = sc.nextInt();
        }
        
        int bingoCount = 0;
        int result = 0;
        
        // 부른 숫자를 하나씩 처리
        for (int i = 0; i < 25; i++) {
            int number = y[i];
            markNumber(x, number);
            
            bingoCount = checkBingo(x);
            
            if (bingoCount >= 3) {
                result = i + 1;  // 몇 번째 숫자에서 빙고가 되는지
                break;
            }
        }
        
        sc.close();
        System.out.print(result);
    }
    
    // 부른 숫자를 빙고 보드에서 0으로 마크
    public static void markNumber(int[][] board, int number) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == number) {
                    board[i][j] = 0;
                }
            }
        }
    }

    // 빙고 라인을 세는 함수
    public static int checkBingo(int[][] board) {
        int count = 0;

        // 가로 체크
        for (int i = 0; i < 5; i++) {
            boolean bingo = true;
            for (int j = 0; j < 5; j++) {
                if (board[i][j] != 0) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) count++;
        }

        // 세로 체크
        for (int i = 0; i < 5; i++) {
            boolean bingo = true;
            for (int j = 0; j < 5; j++) {
                if (board[j][i] != 0) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) count++;
        }

        // 대각선 체크 (좌상단 -> 우하단)
        boolean diagonalBingo = true;
        for (int i = 0; i < 5; i++) {
            if (board[i][i] != 0) {
                diagonalBingo = false;
                break;
            }
        }
        if (diagonalBingo) count++;

        // 대각선 체크 (우상단 -> 좌하단)
        diagonalBingo = true;
        for (int i = 0; i < 5; i++) {
            if (board[i][4 - i] != 0) {
                diagonalBingo = false;
                break;
            }
        }
        if (diagonalBingo) count++;

        return count;
    }
}