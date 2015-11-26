n = int(input())
str2 = bin(n)[2:]
str2 = ''.join(sorted(str2))
str1 = str2[::-1]
print (int(str1, 2) - int(str2, 2))
