# Groovy scripts for QuPath
A few groovy scripts to overlay and measure microscopy data in [QuPath](https://qupath.github.io/).

## Software
Tested on:
* [QuPath v0.4.3](https://github.com/qupath/qupath/releases/tag/v0.4.3)
* [qupath-extension-warpy 0.2.4](https://github.com/BIOP/qupath-extension-warpy/releases/tag/0.2.4)

## Setup
* Install QuPath, this should be self explainatory
* Download the warpy extension (see link above). Extract the .zip file, and drag-n-drop the .jar files on the open QuPath window
* Restart QuPath

## Manual
* Create new a project in an empty folder
* Add the required images by drag-n-drop and save the project
* Open one of the two images
* Go to Analyze > Interactive image combiner warpy
* Click "Choose images from project" and choose the other image
* Click the other image in “image & overlays” it should be visible in the top left corner. Drag the Opacity slider for good visibility of both images.
* Hold shift to drag with the mouse, use the four buttons to rotate and scale.
* Be aware: scale increment needs to be 1.01 for example (not 1.00)
* Optional: Click "Estimate transform" to find transform. We used rigid transform.
* Click “create” to create a new image with the overlay
* Rename channels!! Otherwise the information that comes out will make no sense
* Run Stardist to segment the nuclei and measure intensity in all channels
* Add the proper path-classes
* Create classifiers to assign path-classes
* Create composite classifier
* Optional: set colors with script or by hand


## Beyond rigid and affine transformation:
* https://imagej.net/plugins/bdv/warpy/warpy
