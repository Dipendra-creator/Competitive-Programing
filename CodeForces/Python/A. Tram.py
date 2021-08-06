n, max_capacity, c = int(input()), 0, 0

for i in range(n):
    a, b = [int(j) for j in input().split()]
    c += (b-a)
    if c > max_capacity:
        max_capacity = c

print(max_capacity)
