str = input()
n = ''
ans = ''
for i in str:
    if i.isdigit():
        n += i
    else:
       if n == '':
            n = 1
       ans += i * int(n)
       n = ''
while ans != '':
    print (ans[:40])
    ans = ans[40:]
