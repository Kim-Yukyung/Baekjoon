import sys
input = sys.stdin.readline

a, b = map(int, input().split())
n1, n2 = max(a, b), min(a, b)

while n2 != 0:
    n1, n2 = n2, n1%n2

print(n1)
print(a*b//n1)
