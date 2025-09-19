class Solution {
  public int minimumObstacles(int[][] grid) {

    int n = grid.length, m = grid[0].length;
    int[][] dist = new int[n][m];
    for (int[] row : dist)
      Arrays.fill(row, Integer.MAX_VALUE);

    Deque<int[]> q = new ArrayDeque<>();
    q.add(new int[] { 0, 0 });
    dist[0][0] = grid[0][0];

    int[] dx = { 1, -1, 0, 0 }, dy = { 0, 0, 1, -1 };
    while (!q.isEmpty()) {
      int[] cur = q.pollFirst();
      int x = cur[0], y = cur[1];
      for (int k = 0; k < 4; k++) {
        int nx = x + dx[k], ny = y + dy[k];
        if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
          int cost = dist[x][y] + grid[nx][ny];
          if (cost < dist[nx][ny]) {
            dist[nx][ny] = cost;
            if (grid[nx][ny] == 1)
              q.addLast(new int[] { nx, ny });
            else
              q.addFirst(new int[] { nx, ny });
          }
        }
      }
    }
    return dist[n - 1][m - 1];

  }
}