import javafx.application.Platform
import qupath.lib.common.ColorTools
import qupath.lib.objects.classes.PathClassFactory
import qupath.lib.gui.scripting.QPEx

Platform.runLater {
    def pathClasses = QPEx.getQuPath().getAvailablePathClasses()
    def UnagP = PathClassFactory.getPathClass('UnagP')
    def UnagN = PathClassFactory.getPathClass('UnagN')
    def Ki67P = PathClassFactory.getPathClass('Ki67P')
    def Ki67N = PathClassFactory.getPathClass('Ki67N')
    def PIMOP = PathClassFactory.getPathClass('PIMOP')
    def PIMON = PathClassFactory.getPathClass('PIMON')
    def EdUP = PathClassFactory.getPathClass('EdUP')
    def EdUN = PathClassFactory.getPathClass('EdUN')
    UnagP.setColor(ColorTools.packRGB(255,255,0))
    def newclasses = [UnagP, UnagN, Ki67P, Ki67N, PIMOP, PIMON, EdUP, EdUN]
    pathClasses.setAll(newclasses)
}
// reopen project after running
