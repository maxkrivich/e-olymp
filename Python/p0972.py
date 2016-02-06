with open('input.txt','r') as input:
        n = int(input.readline())
        t = [[int(i) for i in input.readline().split(' ')] for i in range(n)]
        r = []
        for i in range(n):
                r.append(t[i][0]*3600+t[i][1]*60+t[i][-1])
        for i in range(n):
                j = i+1
                while j<n:
                        if r[i]>r[j]:
                                t[i],t[j] = t[j],t[i]
                                r[i],r[j]=r[j],r[i]
                        j+=1
with open('output.txt','w') as output:
        for i in range(n):
                output.write('{} {} {}\n'.format(t[i][0],t[i][1],t[i][-1]))
