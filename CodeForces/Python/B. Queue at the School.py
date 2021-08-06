n, t = [int(j) for j in input().split()]
s = input()


def listToString(s):
    str1 = ""
    for ele in s:
        str1 += ele
    return str1


def position_change(num, queue):
    array = queue.copy()
    for i in range(num-1):
        if queue[i] == 'B':
            if queue[i + 1] == 'G':
                array[i], array[i + 1] = 'G', 'B'
            else:
                array[i + 1] = 'B'
    return listToString(array)


for j in range(t):
    s = position_change(n, list(s))

print(s)
