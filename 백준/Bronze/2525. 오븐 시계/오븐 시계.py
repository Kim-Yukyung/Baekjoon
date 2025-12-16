a, b = map(int, input().split())
c = int(input())

sum = a * 60 + b + c

a = (sum // 60) % 24
b = (sum % 60) % 60

print(a, b)
