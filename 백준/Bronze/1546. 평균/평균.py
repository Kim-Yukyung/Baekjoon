import sys
input = sys.stdin.readline

n = int(input())
scores = list(map(int, input().split()))

max_score = max(scores)
scores = [scores[i]/max_score*100 for i in range(n)]

print(sum(scores)/n)
