a, b = [int(j) for j in input().split()]


def year_inc(Limak, Bob):
    return Limak*3, Bob*2


c = 0
while a <= b:
    c += 1
    a, b = year_inc(a, b)

print(c)