n, max_n = 0, 0

for _ in range(10):
    a, b = map(int, input().split())
    n = n - a + b
    max_n = max(n, max_n)

print(max_n)
