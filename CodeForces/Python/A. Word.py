s = input()

cl, cu, len_str = 0, 0, len(s)

for i in range(len_str):
    if s[i].islower():
        cl += 1
    else:
        cu += 1

if cu > len_str/2:
    s = s.upper()
else:
    s = s.lower()

print(s)