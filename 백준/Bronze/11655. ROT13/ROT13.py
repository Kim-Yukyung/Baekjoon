import sys

input = sys.stdin.readline

string = input().rstrip()
rot13 = []

for ch in string:
    o = ord(ch)
    if 65 <= o <= 90: # A to Z
        rot13.append(chr((o-65+13)%26+65))
    elif 97 <= o <= 122: # a to z
        rot13.append(chr((o-97+13)%26+97))
    else:
        rot13.append(ch)

print("".join(rot13))
