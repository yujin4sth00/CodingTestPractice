class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int [][]maps = new int[n][m];
        maps[0][0] = 1;
        
        for(int []p : puddles)
        {
            maps[p[1]-1][p[0]-1] = -1;
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(maps[i][j] == 0)
                {
                    //왼쪽
                    if(i != 0 && maps[i-1][j] != -1)
                    {
                        maps[i][j] += maps[i-1][j] ;
                    }
                    //위쪽
                    if(j != 0 && maps[i][j-1] != -1)
                    {
                        maps[i][j] += maps[i][j-1] ;
                    }
                    maps[i][j] %= 1_000_000_007;
                }

            }
        }
        return maps[n-1][m-1];
    }
}