"""
         A. Team

         3
         1 1 0
         1 1 1
         1 0 0

"""

a = []
n = int(input())
pass_count = 0


def check_if_pass(arr):
    no_of_zeros = 0
    for ele in arr:
        if ele == 0:
            no_of_zeros += 1
    if no_of_zeros < 2:
        return 1
    else:
        return 0


for i in range(n):
    a.append([int(j) for j in input().split()])
    pass_count += check_if_pass(a[i])

print(pass_count)
