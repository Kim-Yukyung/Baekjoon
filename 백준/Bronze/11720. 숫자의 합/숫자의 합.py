import sys

input = sys.stdin.readline

n = int(input())
num = input()
print(sum(int(num[i]) for i in range(len(num)-1)))
