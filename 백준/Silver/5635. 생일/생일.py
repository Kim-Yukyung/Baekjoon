import sys
input = sys.stdin.readline

n = int(input())
dict = {}

for _ in range(n):
    name, d, m, y = input().split()
    dict[name] = int(y)*365 + int(m)*30 + int(d)

print(max(dict, key=dict.get))
print(min(dict, key=dict.get))
