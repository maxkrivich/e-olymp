#50% of solution
class Int(object):
	def __init__(self,x):
		self.__x = x
	def __add__(self,x):
		if not isinstance(x,self.__class__):
			return Int(self.__x + x)
		else:
			return Int(self.__x + x.getx())
	def __sub__(self,x):
		if not isinstance(x,self.__class__):
			return Int(self.__x - x)
		else:
			return Int(self.__x - x.getx())
	def __mul__(self,x):
		if not isinstance(x,self.__class__):
			return Int(self.__x * x)
		else:
			return Int(self.__x * x.getx())
	def __str__(self):
		return '{}'.format(self.__x)
	def getx(self):
		return self.__x
	def __del__(self):
		del self.__x

#main
if __name__ == '__main__':
	f1 = open('input.txt','r')
	f2 = open('output.txt','w')
	s = [int(i) for i in f1.readline().split(' ')]
	a = Int(s[0])
	b = Int(s[1])
	c = Int(s[-1])
	f2.write('{}\n'.format((a * 7 + b - 2) * (a - c + 5)))
	f1.close()
	f2.close()
