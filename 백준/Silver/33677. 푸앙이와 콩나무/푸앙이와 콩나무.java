import java.io.*;
import java.util.*;

public class Main {

    static final int INF = (int) 1e9;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            bw.write("0 0\n");
            bw.flush();
            return;
        }

        int[] days = new int[N + 1];
        int[] water = new int[N + 1];
        Arrays.fill(days, INF);
        Arrays.fill(water, INF);
        days[0] = 0;
        water[0] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            int nextDay = days[cur] + 1;

            // case 1: +1
            if (cur + 1 <= N) {
                int newWater = water[cur] + 1;
                if (days[cur + 1] > nextDay) {
                    days[cur + 1] = nextDay;
                    water[cur + 1] = newWater;
                    queue.add(cur + 1);
                } else if (days[cur + 1] == nextDay && water[cur + 1] > newWater) {
                    water[cur + 1] = newWater;
                    queue.add(cur + 1);
                }
            }

            // case 2: *3
            if (cur > 0 && cur * 3 <= N) {
                int newVal = cur * 3;
                int newWater = water[cur] + 3;
                if (days[newVal] > nextDay) {
                    days[newVal] = nextDay;
                    water[newVal] = newWater;
                    queue.add(newVal);
                } else if (days[newVal] == nextDay && water[newVal] > newWater) {
                    water[newVal] = newWater;
                    queue.add(newVal);
                }
            }

            // case 3: ^2
            if (cur > 1 && (long) cur * cur <= N) {
                int newVal = cur * cur;
                int newWater = water[cur] + 5;
                if (days[newVal] > nextDay) {
                    days[newVal] = nextDay;
                    water[newVal] = newWater;
                    queue.add(newVal);
                } else if (days[newVal] == nextDay && water[newVal] > newWater) {
                    water[newVal] = newWater;
                    queue.add(newVal);
                }
            }
        }

        bw.write(days[N] + " " + water[N] + "\n");
        bw.flush();
    }
}
