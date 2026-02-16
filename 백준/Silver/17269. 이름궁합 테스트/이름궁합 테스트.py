import sys
input = sys.stdin.readline

n, m = map(int, input().split())
a, b = input().split()

score_map = [3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1]

name = []
name_num = []

for i in range(min(len(a), len(b))):
    name_num.append(score_map[ord((a[i]))-ord('A')])
    name_num.append(score_map[ord((b[i]))-ord('A')])

# 남은 글자 점수 추가
for c in a[len(b):]:
    name_num.append(score_map[ord(c) - ord('A')])
for c in b[len(a):]:
    name_num.append(score_map[ord(c) - ord('A')])

while len(name_num) > 2:
    for i in range(len(name_num)-1):
        name_num[i] = (name_num[i] + name_num[i + 1]) % 10
    name_num.pop()

print(f"{int(str(name_num[0]) + str(name_num[1]))}%")
