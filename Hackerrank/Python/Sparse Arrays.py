a, strings, queries, count = [], [], [], 0

for i in range(int(input())):
    strings.append(input())

for i in range(int(input())):
    queries.append(input())

for q in queries:
    for s in strings:
        if q == s:
            count += 1
    a.append(count)
    count = 0

for i in a:
    print(i)