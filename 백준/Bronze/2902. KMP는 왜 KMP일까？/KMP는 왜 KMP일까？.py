import sys, re

input = sys.stdin.readline

string = input()
index = [i for i, ch in enumerate(string) if ch == '-']

print(string[0] + "".join(string[i+1] for i in index))
