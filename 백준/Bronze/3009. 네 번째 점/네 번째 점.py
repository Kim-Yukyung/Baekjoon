ax = ay = 0

for i in range(3):
    x, y = map(int, input().split())
    ax ^= x
    ay ^= y

print(ax, ay)
