str = input()
l = len(str)
sqr = [x**2 for x in range(6)]
for x in sqr:
    if (l < x):
        str = str + str[-1] * (x-l)
        l = x
        break
    elif (l == x):
        break
import math
l = int(math.sqrt(l))
print(''.join([str[j*l+i] for i in range(l) for j in range(l)]))
