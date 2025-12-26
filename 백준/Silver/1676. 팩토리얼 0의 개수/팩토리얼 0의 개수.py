import sys
input = sys.stdin.readline

n = int(input())
cnt = 0

while n > 0:
    n //= 5
    cnt += n

print(cnt)
