import sys
input = sys.stdin.readline

n = int(input())
cnt= num = 0

while cnt != n:
    num += 1
    if str(num).count('666') != 0:
        cnt += 1

print(num)
