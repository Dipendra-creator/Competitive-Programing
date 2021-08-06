n, k = [int(j) for j in input().split()]


def subtraction(number):
    if len(str(number)) >= 2:
        if str(number)[-1] == '0':
            return number // 10
        else:
            return number - 1
    else:
        return number - 1


for i in range(k):
    n = subtraction(n)

print(n)
