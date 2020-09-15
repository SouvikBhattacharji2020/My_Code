# 5 5 5 5 5 
# 5 5 5 5 
# 5 5 5 
# 5 5 
# 5

a=int(input("Enter a number : "))
for i in range (5,0,-1):
	for j in range (0,i):
		print("5",end=" ")
	print()