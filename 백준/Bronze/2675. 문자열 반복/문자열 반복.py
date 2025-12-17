n = int(input())

for x in range(n):
    test = input().split()
    for y in range(len(test[1])):
        print(test[1][y]*int(test[0]), end = "")
    print()
