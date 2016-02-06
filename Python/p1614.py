import sys
sys.stdin = open('input.txt','r')
sys.stdout = open('output.txt','w')
from math import acos, sqrt, pi


def lenght(a,b):
    return sqrt((a[0]-b[0])**2 + (a[1]-b[1])**2)    
    

s,angle = [], .0
for i in range(3):
    s.append([int(i) for i in input().split(' ')])
a,b,c = lenght(s[0],s[1]), lenght(s[0],s[2]), lenght(s[1],s[2])
if a == max(a,b,c): angle = acos((b*b + c*c - a*a)/(2*b*c))
elif b == max(a,b,c): angle = acos((a*a + c*c - b*b)/(2*a*c))
else: angle = acos((a*a + b*b - c*c)/(2*a*b))
angle *= 180/pi;
print('{:.6f}'.format(angle))

sys.stdin.close()
sys.stdout.close()
