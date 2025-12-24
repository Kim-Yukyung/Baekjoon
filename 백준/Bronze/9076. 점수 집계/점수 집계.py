n = int(input())

for _ in range(n):
    scores = sorted(map(int, input().split()))
    scores = scores[1:4]
    
    if max(scores) - min(scores) >= 4:
        print("KIN")
    else:
        print(sum(scores))
