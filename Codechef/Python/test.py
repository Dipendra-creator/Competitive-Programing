T = int(input())
for i in range(T):
    l = set(list(map(int, input().split())))
    if len(l) == 4:
        print(2)
    elif len(l) == 3:
        print(2)
    elif len(l) == 2:
        l.sort()
        b = l[0]
        if l.count(b) == 2:
            print(2)
        else:
            print(1)
    else:
        print(0)