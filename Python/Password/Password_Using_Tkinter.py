import tkinter

window = tkinter.Tk()
window.geometry("500x250")
# to rename the title of the window
window.title("AsansaSolution 2020")
# pack is used to show the object in the window
label1 = tkinter.Label(window, text = "Enter your user id :").place(x = 30,y = 50)  

# Entry is used to show the object in the window
username= tkinter.Entry(window,width=45).place(x = 150,y = 50)  
# pack is used to show the object in the window
label2 = tkinter.Label(window, text = "Enter your password :").place(x = 30,y = 90)    
# Entry is used to show the object in the window
password= tkinter.Entry(window,width=45, show="*").place(x = 150,y = 90)



window.mainloop()


 
