package image

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main(args: Array<String>) {
    var image = BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB)
    image.setRGB(0,0,0xFF0000)
    var w = 0 .. image.width-1
    var h = 0 .. image.height -1
    image.apply {
        for(i in w){
            for(j in h){
                setRGB(i,j,0xFF0000)
            }
        }
    }
    ImageIO.write(image,"bmp",File("1.bmp"))
}