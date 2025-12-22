n = int(input())
max_N = 0

for _ in range(n):
    dice = sorted(map(int, input().split()))

    if dice[0] == dice[2]:
        max_N = max((10000 + dice[0] * 1000), max_N)
    elif dice[0] == dice[1] or dice[1] == dice[2]:
        max_N = max(int(1000 + dice[1] * 100), max_N)
    else:
        max_N = max(dice[2]*100, max_N)

print(max_N)
