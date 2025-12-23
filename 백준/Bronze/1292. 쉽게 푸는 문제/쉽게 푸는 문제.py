n, m = map(int, input().split())
idx, flag, arr = 0, 1, [0]*m

while idx < m:
    for _ in range(flag):
        arr[idx] = (arr[idx-1] if idx>0 else 0) + flag
        idx += 1
        if idx >= m:
            break
    flag += 1

print(arr[m-1] - (arr[n-2] if n>1 else 0))
