main_list=["Souvik","Soumik","Jhuma","Dhiman","Anu","Ayush","Rupam","Anjali","Anita","Jaki","Yesh","Raman","Rohan","Raj","Ansh"]
#print(len(main_list))
print(main_list)
a=input("Enter a letter : ")
m=len(a)
for i in main_list:
    if a.lower()==i[:m].lower():
        print(a.lower())        
        print(i[:m].lower())
        print(i)

