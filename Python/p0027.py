def shift(s):
    return s[1:] + s[0]

m = int(input())
s = bin(m)[2:]
for i in range(len(s) - 1):
    s = shift(s)
    m = max(m, int(s, 2))
print (m)
