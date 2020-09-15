x=int(input("Enter number of x : "))
y=int(input("Enter number of y : "))

#x3+y3=(x+y)(x2-xy+y2)
#x3-y3=(x-y)(x2+xy+y2)

a=int(input("Enter '1' for 'x3+y3' or '2' for 'x3-y3', Enter your choice"))

if a==1:
      x1=(x+y)*((x**2)-(x*y)+(y**2))
      print("x3+y3=(x+y)(x2-xy+y2)= ",x1)
elif a==2:
    x1=(x+y)*((x**2)+(x*y)+(y**2))
    print("x3+y3=(x+y)(x2+xy+y2)= ",x1)
else:
    print("Not valid")
