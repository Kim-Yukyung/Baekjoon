import sys
input = sys.stdin.readline

a, b, c = map(int, input().split(":"))
t1 = a*3600 + b*60 +c

a, b, c = map(int, input().split(":"))
t2 = a*3600 + b*60 +c

diff = (t2 - t1) % (24 * 60 * 60) # 24시간

h, m = divmod(diff, 3600)
m, s = divmod(m, 60)

print(f"{h:02d}:{m:02d}:{s:02d}")
