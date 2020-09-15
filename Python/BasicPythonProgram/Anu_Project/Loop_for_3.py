# 1 1 1 1 1 
# 2 2 2 2 
# 3 3 3 
# 4 4 
# 5

a=int(input("Enter a number : "))
b=1
for i in range (a,0,-1):
	for j in range (1,i+1):
		print(b, end=" ")
	print()
	b=b+1
