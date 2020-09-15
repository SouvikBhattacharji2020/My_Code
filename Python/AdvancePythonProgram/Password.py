a=input("Enter your more than  6 charactors password  : ")
print("which have 1 capital, 1 small, 1 number  and a special charactor")
a2=len(a)
x1="c"
x2="c"
x3="c"
x4="c"
x5="c"
if a2>6:
    for i in range (0,a2):
        ch=a[0]
        int test1=ord(ch)
        print(ch)
        print(test1)

#         ch1=int(ch)
#         if ch1>=0 and ch1<=9:
#             x1='s'
#         if ch>='A' and ch<='Z':
#             x2='t'
#     test=x1+x2
#     print(test)
# else:
#     print("Enter more than  6 charactors")
