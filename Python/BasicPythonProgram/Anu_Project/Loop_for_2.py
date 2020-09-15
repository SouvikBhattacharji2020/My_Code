# 1
# 13
# 135
# 1357
# 13579


a=int(input("Enter a number : "))
for i in range (1,a+1,2):
	for j in range (1,i+1,2):
		print(j,end=" ")
	print()