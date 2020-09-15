
import sys
from PyQt5.QtWidgets import QWidget, QPushButton, QApplication, QHBoxLayout

class Example(QWidget):

    def __init__(self):
        super().__init__()
        self.setGeometry(0, 0, 400, 300) 
        self.setStyleSheet("background-color: #AFEEEE;") 
        self.initUI()


    def initUI(self):

        hbox = QHBoxLayout()

        qbtn = QPushButton('Quit', self)
        qbtn.setStyleSheet("background-color: #0000CD; color:white; padding-top:15px; padding-bottom:15px; padding-left:30px; padding-right:30px;")
        qbtn.clicked.connect(QApplication.instance().quit)

        hbox.addWidget(qbtn)
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
