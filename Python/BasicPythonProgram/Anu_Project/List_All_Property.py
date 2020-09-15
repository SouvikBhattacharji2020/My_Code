numbers=[3, 40, 40, 80, 50, 82, 75, 34, 40, 21, 40, 80, 100, 40, 25, 100  ]
name=["ram", "shyam", "rohan", "sima", "gita", "puja", "priya", "ankita", "sanjna", "aditi"]
#to see the methods we need to use dir(list)

print(dir(list))

#print(help(numbers))

#to sortout from small to large in case of number / if sort from a to z
numbers.sort()
print(numbers)
# name.sort()
# print(name)

# # to reverse from large to small in case of number / if name than reverse the list
numbers.reverse()
print(numbers)
# # name.reverse()
# # print(name)

# #to remove any specific name or number
numbers.remove(40)
print(numbers)
# # name.remove("sima")
# # print(name)

# # to remove the last number or name from the list
numbers.pop()
print(numbers)
# # name.pop()
# # print(name)

# # to change any values of the list we need to type : numbers.insert(index number,changed value)
numbers.insert(0,8)
print(numbers)
# # name.insert(0,"anu")
# # print(name)

# # to use know index number of name and number using any 3rd party variable
a=numbers.index(21)
#print(numbers)
print(a)

# # b=name.index("puja")
# # print(b)

# #to use per charecters of name into the list it can't able to accept number value
name.extend("puja")
print(name)

# # to count how many numbers/name in the ist
c=numbers.count(40)
print(c)
# d=name.count("ankita")
# print(d)

#to copy all the list
print(numbers)
m=numbers.copy()
print(m)

# #to clear all in the list
numbers.clear()
print(numbers)
# name.clear()
# print(name)