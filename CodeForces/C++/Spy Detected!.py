# 4
def spy_detector(num_l):
    elements = list(set(num_l))
    l = [i for i in num_l if i != elements[0]]
    if len(l) == 1:
        return elements[1]
    else:
        return elements[0]

testcases = int(input())

for i in range(testcases):
    # 4 / 5 / 10 / 3
    num_numbers =  int(input())
    # 11 13 11 11 / 1 4 4 4 4 / 3 3 3 3 10 3 3 3 3 3 / 20 20 10
    num_list = list(int(num) for num in input().strip().split())[:num_numbers]
    
    error = spy_detector(num_list)
    # final sol
    print(num_list.index(error) + 1)