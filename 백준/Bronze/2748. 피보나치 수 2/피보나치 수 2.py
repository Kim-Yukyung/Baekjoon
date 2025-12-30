import sys
input = sys.stdin.readline

n = int(input())
x, y = 0, 1

for _ in range(n-1):
    x, y = y, x+y

print(y)
