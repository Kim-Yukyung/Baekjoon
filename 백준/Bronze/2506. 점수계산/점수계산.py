import sys
input = sys.stdin.readline

n = int(input())
answers = map(int, input().split())
flag = score = 0

for v in answers:
    flag = flag * v + v
    score += flag

print(score)
