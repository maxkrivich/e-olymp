import sys

s = int(input()) 

k = 0
tk = 1

if s == 0:
     print ('0')
     sys.exit
else:
    while tk<s:
        k+=1
        tk+=k + 1
    if s<=tk:
        k+=1
    print(str(k))
