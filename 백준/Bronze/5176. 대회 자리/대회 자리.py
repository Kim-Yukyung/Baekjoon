n = int(input())

for _ in range(n):
    p, m = map(int, input().split())
    seat = set(int(input()) for _ in range(p))
    print(p - len(seat))
