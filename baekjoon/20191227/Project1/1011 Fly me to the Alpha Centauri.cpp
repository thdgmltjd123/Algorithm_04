// 시작점에서 출발하는 X와 끝점에서 출발하는 Y 11 22 33 44 더해가서 만날 때의 값을 찾기.
#include<cstdio>
typedef long long ll;
ll T, x, y;
int main() {
	scanf("%lld", &T);
	while (T--) {
		scanf("%lld%lld", &x, &y);
		ll dis = y - x;
		ll cnt = 0; //총 이동거리
		ll ans = 1;
		while (cnt < dis) {
			ans++;
			cnt += (ans / 2);
		}
		printf("%lld\n", ans - 1);
	}
}