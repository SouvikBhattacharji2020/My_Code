a="0417"

b=int(a)

for i in range (0,9999):
    if i==b:
        print("Number is creaked....")
        a1=str(i)
        if i<1000 and i>99:
            print("your actual password :  0"+a1)
        elif i<100 and i>9:
            print("your actual password :  00"+a1)
        elif i<10 and i>=-1:
            print("your actual password :  000"+a1)
        elif i==0:
            print("your actual password :  0000")
        else:
            print("your actual password :  "+a1)
            
    
