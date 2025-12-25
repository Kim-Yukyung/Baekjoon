import sys

input = sys.stdin.readline

string = input().rstrip().upper()
cnt = {}

for ch in string:
    cnt[ch] = cnt.get(ch, 0) + 1

max_ch = max(cnt, key=cnt.get)
max_value = max(cnt.values())
max_cnt = set(ch for ch in string if cnt.get(ch) == max_value)

print(max_ch if len(max_cnt) == 1 else "?")
