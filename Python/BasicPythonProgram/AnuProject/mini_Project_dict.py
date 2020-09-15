##   MINI PROJECT ON MOBILE PHONE RECHARGE
a={1:"Airtel",2:"Vodaphone",3:"Idea"}
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
print(a[b]," plans are : " )
if a[b]=="Airtel":
    print(Airtel)
    b1=int(input("Enter your Choose Number : "))
    if b1==1:
        print(Airtel_49)
    elif b1==2:
        print(Airtel_149)
    elif b1==3:
        print(Airtel_399)
    else:
        print("You enter a wrong choice.")
    
elif a[b]=="Vodaphone":
    print(Vodaphone)
    b1=int(input("Enter your Choose Number : "))
    if b1==1:
        print(Vodaphone_49)
    elif b1==2:
        print(Vodaphone_159)
    elif b1==3:
        print(Vodaphone_399)
    else:
        print("You enter a wrong choice.")
    
elif a[b]=="Idea":
    print(Idea)
    b1=int(input("Enter your Choose Number : "))
    if b1==1:
        print(Idea_49)
    elif b1==2:
        print(Idea_139)
    elif b1==3:
        print(Idea_399)
    else:
        print("You enter a wrong choice.")
    
else:
    print("You enter wrong choose number.")