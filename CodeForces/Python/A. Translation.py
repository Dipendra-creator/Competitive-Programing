def translate(string):
    ans = ''
    for a in reversed(list(string)):
        ans += a
    return ans


s = input()
t = input()

if t == translate(s):
    print('YES')
else:
    print('NO')
