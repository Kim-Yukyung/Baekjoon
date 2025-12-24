import sys

input = sys.stdin.readline

t = int(input())

for i in range(t):
    data = list(map(int, input().split()))
    n = data[0]
    scores = sorted(data[1:])

    gap = 0
    for j in range(1,n):
        gap = max(scores[j] - scores[j-1], gap)

    print(f"Class {i+1}")
    print(f"Max {max(scores)}, Min {min(scores)}, Largest gap {gap}")
