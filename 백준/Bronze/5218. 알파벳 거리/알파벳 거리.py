import sys

input = sys.stdin.readline

n = int(input())

for _ in range(n):
    a, b = input().split()
    value = []

    for i in range(len(a)):
        num_a, num_b = ord(a[i]), ord(b[i])
        if num_a <= num_b:
            value.append(num_b - num_a)
        else:
            value.append(num_b + 26 - num_a)
    print("Distances:", *value)
