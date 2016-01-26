n = int(input())
seq = ''.join([str(1 << x) for x in range(1, 200)])
print(seq[n*2-2:n*2])
