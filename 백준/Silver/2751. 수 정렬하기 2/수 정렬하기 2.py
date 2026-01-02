import sys
input = sys.stdin.readline

n = int(input())
nums = set(int(input()) for _ in range(n))

for v in sorted(nums):
    print(v)
