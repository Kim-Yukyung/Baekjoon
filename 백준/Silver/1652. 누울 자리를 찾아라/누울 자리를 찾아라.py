import sys
input = sys.stdin.readline

n = int(input())
rooms = [[c == '.' for c in input().rstrip()] for _ in range(n)]

row = column = 0

for i in range(n):
    r_cnt = c_cnt = 0

    for j in range(n):
        # 가로
        if rooms[i][j] == True:
            r_cnt += 1
        else:
            if r_cnt >= 2:
                row += 1
            r_cnt = 0
        
        # 세로
        if rooms[j][i] == True:
            c_cnt += 1
        else:
            if c_cnt >= 2:
                column += 1
            c_cnt = 0

    if r_cnt >= 2: row += 1
    if c_cnt >= 2: column += 1

print(row, column)
