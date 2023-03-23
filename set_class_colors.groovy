import qupath.lib.common.ColorTools
import qupath.lib.scripting.QP

def project = QP.getProject()
def classes = project.getPathClasses()
classes.forEach({print(it)})
classes[0].setColor(ColorTools.packRGB(0,0,0))
classes[1].setColor(ColorTools.packRGB(127,127,127))
classes[2].setColor(ColorTools.packRGB(255,0,0))
classes[3].setColor(ColorTools.packRGB(0,255,0))
classes[4].setColor(ColorTools.packRGB(255,255,0))
def newclasses = []
newclasses.addAll(classes)
project.setPathClasses(newclasses)
project.syncChanges()
// reopen project after running
