num = [int(input()) for _ in range(9)]
total = sum(num)

a = b = 0
for i in range(9):
    for j in range(i+1, 9):
        if total - num[i] - num[j] == 100:
            a, b = num[i], num[j]
            break
    if a != 0:
        break

num.remove(a)
num.remove(b)

for v in sorted(num):
    print(v)
