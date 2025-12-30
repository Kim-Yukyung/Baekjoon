import sys, math
input = sys.stdin.readline

n = int(input())
m = int(input())
result = [i*i for i in range(math.ceil(math.sqrt(n)), math.floor(math.sqrt(m))+1)]

if len(result) == 0:
    print(-1)
else:
    print(sum(result))
    print(min(result))
