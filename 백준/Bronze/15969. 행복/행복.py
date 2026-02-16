import sys
input = sys.stdin.readline

n = int(input())
scores = list(map(int, input().split()))
print(abs(max(scores) - min(scores)))
