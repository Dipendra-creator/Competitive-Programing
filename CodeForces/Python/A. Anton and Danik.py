n = int(input())
s = input()


def anton_danik_counter(games):
    A, D = 0, 0
    for game in games:
        if game == 'A':
            A += 1
        else:
            D += 1

    return A, D


anton, danik = anton_danik_counter(s)

if anton > danik:
    print('Anton')
elif anton < danik:
    print('Danik')
else:
    print('Friendship')
