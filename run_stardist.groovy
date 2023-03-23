import qupath.lib.scripting.QP
import qupath.ext.stardist.StarDist2D
import qupath.opencv.ops.ImageOps

def STARDIST_DAPI_LOCATION = 'D:/QuPath/StarDist/dsb2018_heavy_augment.pb'
def imageData = QP.getCurrentImageData()
def selectedObject = QP.getSelectedObject()
def server = imageData.getServer()
def originalPixelSize = server.getPixelCalibration().getAveragedPixelSizeMicrons()
def model
model = StarDist2D.builder(STARDIST_DAPI_LOCATION)
    .threshold(0.55)                 // Prediction threshold
    .channels('DAPI')
    .preprocess(ImageOps.Filters.median(2))
    .normalizePercentiles(1, 99)    // Percentile normalization
    .pixelSize(0.5)   // Resolution for detection
    .measureIntensity()             // To get the positive cells out
    .build()

model.detectObjects(imageData, [selectedObject])
