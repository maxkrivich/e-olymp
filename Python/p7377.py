n = int(input())*2
seq = ''.join([str(1 << x) for x in range(1, 128)])
print(seq[n-2:n])
