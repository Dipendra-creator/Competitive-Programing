count = 0
for i in range(int(input())):
    word = input()
    if '+' in word:
        count += 1
    if '-' in word:
        count -= 1

print(count)