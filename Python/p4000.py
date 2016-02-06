f1 = open('input.txt','r')
f2 = open('output.txt','w')
ss = [int(i) for i in f1.readline().split(' ')]
n,s,cnt,m,stack  = ss[0],ss[1]-1,1,[],[]
m = [[int(j) for j in f1.readline().split(' ')] for i in range(n)]
stack = [i for i in range(n) if m[s][i] == 1]
m[s][s] = 1
while len(stack):
        a = stack.pop()
        if m[a][a] != 1:
                for i in range(n):
                        if m[a][i] == 1:
                                stack.append(i)
                cnt += 1
                m[a][a] = 1
f2.write('{}\n'.format(cnt))
f2.close()
f1.close()
