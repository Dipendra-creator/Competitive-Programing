x = int(input())


def minimum_steps(distance):
    if distance > 5:
        n = distance // 5
        return n + minimum_steps(distance - (n * 5))
    elif distance == 0:
        return 0
    else:
        return 1


steps_taken = minimum_steps(x)

print(steps_taken)