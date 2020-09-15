# 0,1,1,2,3,5,... nth term.

n=int(input("Enter the n th term of fibonacci series : "))
a=0
b=1
print(a,end=",")

for i in range(a,n):
    print(b,end=",")
    c=a+b
    a=b
    b=c
