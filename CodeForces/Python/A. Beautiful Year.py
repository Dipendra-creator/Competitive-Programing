import sys

INT_MAX = sys.maxsize
y = int(input())


def next_distinct_digit(year):
    while year < INT_MAX:
        if len(set(str(year+1))) == len(str(year+1)):
            return year+1
        else:
            year += 1


print(next_distinct_digit(y))
