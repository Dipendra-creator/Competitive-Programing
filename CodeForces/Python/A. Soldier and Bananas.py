k, n, w = [int(j) for j in input().split()]
sum = 0

for i in range(w):
    sum += k * (i+1)

if sum > n:
    print(abs(n-sum))
else:
    print('0')
