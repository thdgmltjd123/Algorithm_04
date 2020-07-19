#include<iostream>
#include<queue>

using namespace std;

int map[10][10] = { 0 };
int visit[10] = { 0 };
queue<int> q;
int num;

void bfs(int v) {
	q.push(v);
	visit[v] = 1;
	while (!q.empty()) {
		int node = q.front();
		q.pop();
		cout << node << " ";
		for (int i = 1; i <= num; i++) {
			if (map[node][i] == 1 && visit[i] == 0) {
				q.push(i);
				visit[i] = 1;
			}
		}
	}
}

int main() {
	cin >> num;
	while (1) {
		int v1, v2;
		cin >> v1 >> v2;
		if (v1 == -1 && v2 == -1)
			break;
		map[v1][v2] = map[v2][v1] = 1;
	}
	bfs(1);
	return 0;
}