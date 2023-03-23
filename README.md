# Groovy scripts for QuPath
A few groovy scripts to analyse microscopy data in [QuPath](https://qupath.github.io/).

## Few helpfull links:
* https://c4science.ch/w/warpy/ (general manual)
* https://c4science.ch/w/warpy/imagecombinerwarpy/ (only affine)​
* https://c4science.ch/w/warpy/warpy-extension/ (elastix via fiji)​

## Plugins to install:
* https://github.com/BIOP/qupath-extension-warpy
* https://github.com/iwbh15/ImageCombinerWarpy_qp_v0.3

## Manual
* Open one of the two images
* Choose the Interactive image combiner warpy
* Click the image in “image & overlays”
* Hold shift to drag with the mouse
* Be aware: scale increment needs to be 1.01 for example (not 1.00)
* Optional: Click "Estimate transform" to find transform
* Click “create” to create a new image with the overlay
* Rename channels!!
* Run Stardist
* Measure the detections
* Add the proper path-classes
* Create classifiers to assign path-classes
* Create composite classifier
* Optional: set colors with script or by hand
