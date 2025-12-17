n = int(input())

for x in range(n):
    operation = input().split()
    result = float(operation[0])

    for y in operation[1:]:
        if y == "@":
            result *= 3
        elif y == "%":
            result += 5
        elif y == "#":
            result -= 7

    print(f"{result:.2f}")
