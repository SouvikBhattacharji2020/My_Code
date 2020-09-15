# Python program to check validation of password
# Module of regular expression is used with search()
import re
password = input("Enter a Password :(must have 1 small char, 1 capital char, 1 number and 1 spacial char but does not have space in it.) :")
flag = 0
while True:
    if (len(password)<8):
        flag = -1
        break
    elif not re.search("[a-z]", password):
        flag = -1
        break
    elif not re.search("[A-Z]", password):
        flag = -1
        break
    elif not re.search("[0-9]", password):
        flag = -1
        break
    elif not re.search("[_@$]", password):
        flag = -1
        break
    elif re.search("\s", password):
        flag = -1
        break
    else:
        flag = 0
        print("Valid Password")
        break

if flag ==-1:
    print("Not a Valid Password")
