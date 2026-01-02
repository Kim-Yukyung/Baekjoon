import sys
input = sys.stdin.readline

n = int(input())
nums = set(int(input()) for _ in range(n))

sys.stdout.write("\n".join(map(str, sorted(nums))))
