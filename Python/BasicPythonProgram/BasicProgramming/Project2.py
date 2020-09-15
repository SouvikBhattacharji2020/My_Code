x=[]
s=1000000
a=int(input("Enter a n th no : "))
for i in range(0,a):
    b=int(input("Enter number : "))
    x.append(b)
for j in range(0,len(x)):
    # print(x[j],end=",")
for k in range(0,a-1):
    m=x[k]
    n=x[k+1]
    s1=n-m
    # print(s1)
    if s>abs(s1):
        m1=m
        n1=n
        s=s1
print("The neerest number between ",m1," and ",n1)
