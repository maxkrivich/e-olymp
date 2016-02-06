input = open('input.txt','r')
output = open('output.txt','w')
def next():
	global l
	i,s = l-1,r[l]
	while i>1 and r[i-1]<=r[i]:
		s+=r[i]
		i-=1
	r[i]+=1
	l=i+s-1
	j=i+1
	while j<l+1:
		r[j]=1
		j+=1
def printR():
	global l
	for i in range(1,l+1):
		output.write('{} '.format(r[i]))
	output.write('\n')
	return None
#main
n=int(input.readline())
l=n
r=[1]*n
r.insert(0,None)
printR()
while l!=1:
	next()
	printR()
input.close()
output.close()
