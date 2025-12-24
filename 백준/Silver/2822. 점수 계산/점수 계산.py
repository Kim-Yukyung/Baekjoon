scores = [int(input()) for _ in range(8)]

top = sorted(enumerate(scores, start=1), 
             key=lambda x:x[1],
             reverse=True)[:5]

total = sum(score for _, score in top)
index = sorted(idx for idx, _ in top)

print(total)
print(*index)
