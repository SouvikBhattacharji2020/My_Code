# Prime determination method
number = 10
for iter in range(1,number):
	for i in range(2,iter):
		if (iter%i==0):
			break
		else:
			print(iter)