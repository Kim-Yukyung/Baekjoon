string = input()
h = 10

for x in range(1, len(string)):
    if string[x] == string[x-1]:
        h += 5
    else:
        h += 10

print(h)
