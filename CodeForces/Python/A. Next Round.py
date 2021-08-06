n, k = [int(j) for j in input().split()]
array = [int(j) for j in input().split()]
c = 0

for i in range(n):
    if array[i] >= array[k-1] and array[i] > 0:
        c += 1

print(c)