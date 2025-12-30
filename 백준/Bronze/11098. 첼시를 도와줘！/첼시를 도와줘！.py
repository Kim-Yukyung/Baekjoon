import sys
input = sys.stdin.readline

n = int(input())

for _ in range(n):
    m = int(input())
    dict = {}

    for _ in range(m):
        a, b = input().split()
        dict[b] = int(a)
    
    print(max(dict, key=dict.get))
