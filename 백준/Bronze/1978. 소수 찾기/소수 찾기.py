import sys, math
input = sys.stdin.readline

n = int(input())
num = map(int, input().split())
res = 0

for v in num:
    if v < 2:
        continue

    flag = True
    for i in range(2, int(math.sqrt(v))+1):
        if v % i == 0:
            flag = False
            break
    if flag :
        res += 1

print(res)
