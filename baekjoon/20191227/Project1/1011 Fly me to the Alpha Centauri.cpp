// ���������� ����ϴ� X�� �������� ����ϴ� Y 11 22 33 44 ���ذ��� ���� ���� ���� ã��.
#include<cstdio>
typedef long long ll;
ll T, x, y;
int main() {
	scanf("%lld", &T);
	while (T--) {
		scanf("%lld%lld", &x, &y);
		ll dis = y - x;
		ll cnt = 0; //�� �̵��Ÿ�
		ll ans = 1;
		while (cnt < dis) {
			ans++;
			cnt += (ans / 2);
		}
		printf("%lld\n", ans - 1);
	}
}