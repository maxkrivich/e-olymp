import sys
sys.stdin = open('input.txt','r')
sys.stdout = open('output.txt','w')

def move(h,f,t,w):
    if h>=1: 
        move(h-1,f,w,t)
        print(f, t)
        move(h-1,w,t,f)

h = int(input())
move(h,'1','2','3')        


sys.stdin.close()
sys.stdout.close()
