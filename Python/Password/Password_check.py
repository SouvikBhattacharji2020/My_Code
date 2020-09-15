print("(Passwor must have atlest 6 digit, atlest 1 number, 1 Uppercase character, 1 Lowercase Character, 1 Symbol and without Space between the password is not allowed.)")
a=input("Enter your password : ")

p=len(a)
#p2=a.isdigit()
#p3=a.isspace()
#p4=a.isuper()
#p5=a.islower()

p1='x'
p2='x'
p3='x'
p4='x'
p5='t'

if p >= 6:
    for i in a:
        #print(i)
        if i.isdigit()  == True:
            p1='s'
        if i.isupper() == True:
            p2='t'
        if i.islower() == True:
            p3='a'
        if i == '!' or i == '#' or i == '@' or i == '$' or i == '%' or i == '&' or i == '\\' or i == '+' or i == '-' :
            p4='r'
        if i.isspace() == True:
            p5='x'
        check=p1+p2+p3+p4+p5
        print(check)
        
    
    if check=="start":
        print("Welcome to the class.")
    else:
        print("Sorry you are not allowed.")
else:
    print("Sorry you are not allowed.")    
    
    
    
    
    
    