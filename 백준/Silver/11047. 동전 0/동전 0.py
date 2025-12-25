import sys

input = sys.stdin.readline

n, k = map(int, input().split())
coins = [int(input()) for _ in range(n)]

cnt = 0
for coin in reversed(coins):
    if k == 0:
        break
    cnt += (k // coin)
    k %= coin

print(cnt)
