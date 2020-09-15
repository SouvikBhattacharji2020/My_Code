#
# homework 4/8/2020
#
# 1
# 2 3
# 4 5 6
# 7 8 9 10
#
a=int(input("Enter number of row : "))
b=1
print("#")
for i in range(1,a+1):
    print("#",end=" ")
    for j in range(1,i+1):
        print(b,end=" ")
        b+=1
    print()
    
print("#")