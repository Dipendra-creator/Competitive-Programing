num = input()
numlist = list(num)
num = 0

for i in range(len(numlist)):
    if numlist[i] == '4' or numlist[i] == '7':
        num += 1

numlist = list(str(num))

lucky = True
for i in range(len(numlist)):
    if numlist[i] != '4' and numlist[i] != '7':
        lucky = False

if lucky:
    print("YES")
else:
    print("NO")
