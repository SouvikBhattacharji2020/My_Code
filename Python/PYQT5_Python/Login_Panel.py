
import sys
from PyQt5.QtWidgets import QWidget, QPushButton, QApplication, QHBoxLayout

class Example(QWidget):

    def __init__(self):
        super().__init__()
        self.setGeometry(0, 0, 400, 300) 
        self.setStyleSheet("background-color: #AFEEEE;") 
        self.initUI()


    def changelabeltext(self):
        print("Souvik")

    def initUI(self):

        hbox = QHBoxLayout()

        qbtn1 = QPushButton(' Press Ok ', self)
        qbtn1.setStyleSheet("background-color: #0000CD; color:white; padding-top:15px; padding-bottom:15px; padding-left:30px; padding-right:30px;")
        qbtn1.clicked.connect(self.changelabeltext)

        qbtn2 = QPushButton('Quit', self)
        qbtn2.setStyleSheet("background-color: #0000CD; color:white; padding-top:15px; padding-bottom:15px; padding-left:30px; padding-right:30px;")
        qbtn2.clicked.connect(QApplication.instance().quit)

        
        hbox.addWidget(qbtn1)
        hbox.addStretch(1)

        hbox.addWidget(qbtn2)
        hbox.addStretch(1)

        self.setLayout(hbox)

        self.move(300, 300)
        self.setWindowTitle('Quit button')
        self.show()


def main():

    app = QApplication(sys.argv)
    ex = Example()
    sys.exit(app.exec_())


if __name__ == '__main__':
    main()
