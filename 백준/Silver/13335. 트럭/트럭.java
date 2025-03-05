import java.util.*;
import java.io.*;

//4 2 10
//7 4 5 6
//-> 8
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 트럭의 수
		int W = Integer.parseInt(st.nextToken()); // 다리의 길이
		int L = Integer.parseInt(st.nextToken()); // 다리의 최대 하중

		st = new StringTokenizer(br.readLine());
		Queue<Integer> trucks = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			trucks.add(Integer.parseInt(st.nextToken()));
		}

		Queue<Integer> bridge = new LinkedList<>();
		for (int i = 0; i < W; i++) {
			bridge.add(0);
		}

		int time = 0;
		int weightOnBridge = 0;
		while (!bridge.isEmpty()) {
			time++;
			weightOnBridge -= bridge.poll();
			
			//트럭이 비어있으면 건너뜀
			if(trucks.isEmpty()) {
				continue;
			}
			
			// 만약 다리 위를 트럭이 지나갈 수 있으면
			if (trucks.peek() + weightOnBridge <= L) {
				//트럭큐에서 트럭 한개를 꺼내서 다리큐에 놓고, 현재 다리에 있는 트럭 무게 갱신
				int cur = trucks.poll();
				weightOnBridge += cur;
				bridge.add(cur);
			}else {
				//지나갈 수 없으면 0 삽입
				bridge.add(0);
			}
		}

		System.out.println(time);

	}
}