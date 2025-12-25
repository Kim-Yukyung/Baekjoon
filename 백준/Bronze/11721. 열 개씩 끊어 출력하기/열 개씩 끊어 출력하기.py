import sys

input = sys.stdin.readline

string = input()
print("\n".join(string[i:i+10] for i in range(0, len(string), 10)))
