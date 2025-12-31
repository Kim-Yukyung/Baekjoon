import sys
input = sys.stdin.readline

n, m = map(int, input().split())
nums = sorted(list(map(int, input().split())), reverse=True)
max_sum = 0

for x in range(n):
    for y in range(x+1, n):
        for z in range(y+1, n):
            n_sum = nums[x]+nums[y]+nums[z]
            max_sum = max(max_sum, n_sum if n_sum <= m else 0)

print(max_sum)
