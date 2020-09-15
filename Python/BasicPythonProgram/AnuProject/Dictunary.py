# dir(dict)
# print(dir(dict))

##   HOW TO SHOW THE VALUE IN THE FORM OF PERSENT 
# a={1:"anu", 2:"souvik", 3:"sonam", 4:"Ayan", 5:"Aryan", 6:"puja", 7:"priya"}
# print(a)
# print("my friend is %s" %a[7])  

# b={"a1":1,"a2":2,"a3":3,"a4":4, "a5":5, "a6":6, "a7":7}
# print(b)
# print("my choosen number is %d" %b["a5"])

##  HOW TO USE AN STRING METHOD IN THE DICTIONARY
# u=input("Enter your group : ")
# u1=u.upper()
# c={"A":30000, "B":22000, "C":15000, "D":10000}

# print("the salary of group ",u, " salary is ",c[u1])


##  HOW TO SHOW THE VALUES OF THE DISC.
# a={1:"anu", 2:"souvik", 3:"sonam", 4:"Ayan", 5:"Aryan", 6:"puja", 7:"priya"}
# print(a)
# m=a.values()
# print(m)

##  HOW TO UPDATE THE VALUE OF THE DISC 
# a={1:"anu", 2:"souvik", 3:"sonam", 4:"Ayan", 5:"Aryan", 6:"puja", 7:"priya"}
# print(a)
# a.update({4:"Ishita",7:"Sanjana"})
# print(a)


##  HOW TO USE THE UPDATE METHOD IN THE DISC. IN A MINI PROJECT FROM USER 
# a={1:"anu", 2:"souvik", 3:"sonam", 4:"Ayan", 5:"Aryan", 6:"puja", 7:"priya"}
# print(a)
# m=int(input ("Enter the index no. : "))
# m1=input("Enter your update name : ")
# a.update({m:m1})
# print(a)


##  HOW TO USE POPITEM IN DISC TO REMOVE THE LAST PAIR
# a={1:"anu", 2:"souvik", 3:"sonam", 4:"Ayan", 5:"Aryan", 6:"puja", 7:"priya"}
# print(a)
# a.popitem()
# print(a)


##  HOW TO USE POP IN DISC TO REMOVE THE FIRST PAIR
# a={1:"anu", 2:"souvik", 3:"sonam", 4:"Ayan", 5:"Aryan", 6:"puja", 7:"priya"}
# print(a)
# a.pop(5)
# print(a)


##  HOW TO USE KEY VALUES AND SHOW THE KEY AND VALUE SEPERETLY
# a={1:"anu", 2:"souvik", 3:"sonam", 4:"Ayan", 5:"Aryan", 6:"puja", 7:"priya"}
# print(a)
# a.keys()
# print(a.keys())
# print(a.values())

##  HOW TO USE ITEMS FOR SHOWING SEPRETALY IN PAIRS
# a={1:"anu", 2:"souvik", 3:"sonam", 4:"Ayan", 5:"Aryan", 6:"puja", 7:"priya"}
# b=a.items()
# print(b)

##  HOW TO USE GET FOR USING SHOW THE KEYS VALUE
# a={1:"anu", 2:"souvik", 3:"sonam", 4:"Ayan", 5:"Aryan", 6:"puja", 7:"priya"}
# b=a.get(2)
# print(b)


##   MINI PROJECT ON MOBILE PHONE RECHARGE
a={1:"Airtel",2:"Vodaphone",3:"Idea",4:"BSNL",5:"Jio"}
Airtel={1:"Aitel_49",2:"Airtel_149",3:"Airtel_399"}
Airtel_49={"talktime ": "Rs.38"}
Airtel_149={"talktime ": "1 month unlimited airtel to airtel talktime","data pack ": "1GB data/day"}
Airtel_399={"talktime ": "3 month unlimited airtel to airtel talktime","data pack ": "1GB data/day", "Other talktime ":"500 minute aitel to other talktime"}


Vodaphone={1:"Vodaphone_49",2:"Vodaphone_159",3:"Vodaphone_399"}
Vodaphone_49={"talktime ": "Rs.34", "data ": "100MB"}
Vodaphone_159={"talktime ": "1 month unlimited Vodaphone to Vodaphone talktime","data pack ": "1.2GB data/day"}
Vodaphone_399={"talktime ": "3 month unlimited Vodaphone to Vodaphone talktime","data pack ": "1.5GB data/day", "Other talktime ":"2000 minute aitel to other talktime"}


Idea={1:"Vodaphone_49",2:"Vodaphone_139",3:"Vodaphone_399"}
Idea_49={"talktime ": "Rs.35", "data ": "150MB"}
Idea_139={"talktime ": "1 month unlimited Idea to Idea talktime","data pack ": "800MB data/day"}
Idea_399={"talktime ": "3 month unlimited Idea to Idea talktime","data pack ": "1.8GB data/day", "Other talktime ":"1500 minute aitel to other talktime"}


print("Welcome to mobile phone recharge service : ")
print(a)
b=int(input("Enter your Choose Number : "))
print(a[b],"your plans are : " )