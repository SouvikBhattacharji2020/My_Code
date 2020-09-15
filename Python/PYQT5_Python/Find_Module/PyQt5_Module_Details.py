import os
import sys
from PyQt5.QtWidgets import QWidget, QPushButton, QApplication, QHBoxLayout


#_______________________________________________________________________________________________________


## Code :-

# print(dir(sys))
# print("\n")
# #print(help(sys))
# print(help(sys.getsizeof))

print(dir(QWidget))
print("\n")
print(help(QWidget.windowIcon))
print("\n")
print(help(QWidget.windowTitle))


print(dir(QApplication))
print("\n")
print(help(QApplication.quit))

print(dir(str))



# #________________________________________________________________________________________________________

# ## Module sys in python


# E:\Programming_SourceCodes\Python\PYQT5_Python\Find_Module>python Pyqt5_module_details.py
# ['DrawChildren', 'DrawWindowBackground', 'IgnoreMask', 'PaintDeviceMetric', 'PdmDepth', 'PdmDevicePixelRatio',
# 'PdmDevicePixelRatioScaled', 'PdmDpiX', 'PdmDpiY', 'PdmHeight', 'PdmHeightMM', 'PdmNumColors', 'PdmPhysicalDpiX',
#  'PdmPhysicalDpiY', 'PdmWidth', 'PdmWidthMM', 'RenderFlag', 'RenderFlags', '__class__', '__delattr__', '__dict__', 
#  '__dir__', '__doc__', '__eq__', '__format__', '__ge__', '__getattr__', '__getattribute__', '__gt__', '__hash__', 
#  '__init__', '__init_subclass__', '__le__', '__lt__', '__module__', '__ne__', '__new__', '__reduce__', 
#  '__reduce_ex__', '__repr__', '__setattr__', '__sizeof__', '__str__', '__subclasshook__', '__weakref__', 'acceptDrops', 
#  'accessibleDescription', 'accessibleName', 'actionEvent', 'actions', 'activateWindow', 'addAction', 'addActions', 
#  'adjustSize', 'autoFillBackground', 'backgroundRole', 'baseSize', 'blockSignals', 'changeEvent', 'childAt', 'childEvent', 
#  'children', 'childrenRect', 'childrenRegion', 'clearFocus', 'clearMask', 'close', 'closeEvent', 'colorCount', 'connectNotify', 
#  'contentsMargins', 'contentsRect', 'contextMenuEvent', 'contextMenuPolicy', 'create', 'createWindowContainer', 'cursor', 
#  'customContextMenuRequested', 'customEvent', 'deleteLater', 'depth', 'destroy', 'destroyed', 'devType', 'devicePixelRatio', 
#  'devicePixelRatioF', 'devicePixelRatioFScale', 'disconnect', 'disconnectNotify', 'dragEnterEvent', 'dragLeaveEvent', 
#  'dragMoveEvent', 'dropEvent', 'dumpObjectInfo', 'dumpObjectTree', 'dynamicPropertyNames', 'effectiveWinId', 'ensurePolished', 
#  'enterEvent', 'event', 'eventFilter', 'find', 'findChild', 'findChildren', 'focusInEvent', 'focusNextChild', 'focusNextPrevChild', 
#  'focusOutEvent', 'focusPolicy', 'focusPreviousChild', 'focusProxy', 'focusWidget', 'font', 'fontInfo', 'fontMetrics', 'foregroundRole', 
#  'frameGeometry', 'frameSize', 'geometry', 'getContentsMargins', 'grab', 'grabGesture', 'grabKeyboard', 'grabMouse', 'grabShortcut', 
#  'graphicsEffect', 'graphicsProxyWidget', 'hasFocus', 'hasHeightForWidth', 'hasMouseTracking', 'hasTabletTracking', 'height', 
#  'heightForWidth', 'heightMM', 'hide', 'hideEvent', 'inherits', 'initPainter', 'inputMethodEvent', 'inputMethodHints', 'inputMethodQuery', 
#  'insertAction', 'insertActions', 'installEventFilter', 'isActiveWindow', 'isAncestorOf', 'isEnabled', 'isEnabledTo', 'isFullScreen', 
#  'isHidden', 'isLeftToRight', 'isMaximized', 'isMinimized', 'isModal', 'isRightToLeft', 'isSignalConnected', 'isVisible', 'isVisibleTo', 
#  'isWidgetType', 'isWindow', 'isWindowModified', 'isWindowType', 'keyPressEvent', 'keyReleaseEvent', 'keyboardGrabber', 'killTimer', 
#  'layout', 'layoutDirection', 'leaveEvent', 'locale', 'logicalDpiX', 'logicalDpiY', 'lower', 'mapFrom', 'mapFromGlobal', 'mapFromParent', 
#  'mapTo', 'mapToGlobal', 'mapToParent', 'mask', 'maximumHeight', 'maximumSize', 'maximumWidth', 'metaObject', 'metric', 'minimumHeight', 
#  'minimumSize', 'minimumSizeHint', 'minimumWidth', 'mouseDoubleClickEvent', 'mouseGrabber', 'mouseMoveEvent', 'mousePressEvent', 
#  'mouseReleaseEvent', 'move', 'moveEvent', 'moveToThread', 'nativeEvent', 'nativeParentWidget', 'nextInFocusChain', 'normalGeometry', 
#  'objectName', 'objectNameChanged', 'overrideWindowFlags', 'overrideWindowState', 'paintEngine', 'paintEvent', 'paintingActive', 
#  'palette', 'parent', 'parentWidget', 'physicalDpiX', 'physicalDpiY', 'pos', 'previousInFocusChain', 'property', 'pyqtConfigure', 
#  'raise_', 'receivers', 'rect', 'releaseKeyboard', 'releaseMouse', 'releaseShortcut', 'removeAction', 'removeEventFilter', 'render', 
#  'repaint', 'resize', 'resizeEvent', 'restoreGeometry', 'saveGeometry', 'screen', 'scroll', 'sender', 'senderSignalIndex', 'setAcceptDrops', 
#  'setAccessibleDescription', 'setAccessibleName', 'setAttribute', 'setAutoFillBackground', 'setBackgroundRole', 'setBaseSize', 'setContentsMargins', 
#  'setContextMenuPolicy', 'setCursor', 'setDisabled', 'setEnabled', 'setFixedHeight', 'setFixedSize', 'setFixedWidth', 'setFocus', 'setFocusPolicy', 
#  'setFocusProxy', 'setFont', 'setForegroundRole', 'setGeometry', 'setGraphicsEffect', 'setHidden', 'setInputMethodHints', 'setLayout', 
#  'setLayoutDirection', 'setLocale', 'setMask', 'setMaximumHeight', 'setMaximumSize', 'setMaximumWidth', 'setMinimumHeight', 'setMinimumSize', 
#  'setMinimumWidth', 'setMouseTracking', 'setObjectName', 'setPalette', 'setParent', 'setProperty', 'setShortcutAutoRepeat', 'setShortcutEnabled', 
#  'setSizeIncrement', 'setSizePolicy', 'setStatusTip', 'setStyle', 'setStyleSheet', 'setTabOrder', 'setTabletTracking', 'setToolTip', 
#  'setToolTipDuration', 'setUpdatesEnabled', 'setVisible', 'setWhatsThis', 'setWindowFilePath', 'setWindowFlag', 'setWindowFlags', 'setWindowIcon', 
#  'setWindowIconText', 'setWindowModality', 'setWindowModified', 'setWindowOpacity', 'setWindowRole', 'setWindowState', 'setWindowTitle', 'sharedPainter', 
#  'show', 'showEvent', 'showFullScreen', 'showMaximized', 'showMinimized', 'showNormal', 'signalsBlocked', 'size', 'sizeHint', 'sizeIncrement', 
#  'sizePolicy', 'stackUnder', 'startTimer', 'staticMetaObject', 'statusTip', 'style', 'styleSheet', 'tabletEvent', 'testAttribute', 'thread', 
#  'timerEvent', 'toolTip', 'toolTipDuration', 'tr', 'underMouse', 'ungrabGesture', 'unsetCursor', 'unsetLayoutDirection', 'unsetLocale', 'update', 
#  'updateGeometry', 'updateMicroFocus', 'updatesEnabled', 'visibleRegion', 'whatsThis', 'wheelEvent', 'width', 'widthMM', 'winId', 'window', 
#  'windowFilePath', 'windowFlags', 'windowHandle', 'windowIcon', 'windowIconChanged', 'windowIconText', 'windowIconTextChanged', 'windowModality', 
#  'windowOpacity', 'windowRole', 'windowState', 'windowTitle', 'windowTitleChanged', 'windowType', 'x', 'y']

# #________________________________________________________________________________________________________________________________________________________________
