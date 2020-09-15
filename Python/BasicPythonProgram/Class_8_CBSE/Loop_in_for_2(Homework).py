#
# homework 4/8/2020
#
# 1
# 1 2
# 1 2 3 
# 1 2 3 4
#
a=int(input("Enter number of row : "))
print("#")
for i in range(1,a+1):
    print("#",end=" ")
    for j in range(1,i+1):
        print(j,end=" ")
    print()
print("#")
    