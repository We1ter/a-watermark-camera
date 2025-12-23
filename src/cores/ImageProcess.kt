package com.gowork.a_watermark_camera.cores

import android.media.Image

interface ImageProcess
{
    // 选择，读取，处理，保存

    fun selectImage(image: Image)
    fun readImage()
    fun processImage()
    fun saveImage()
}

// WMC: WaterMarkCamera
class WMCImageProcess : ImageProcess
{
    init
    {
        TODO("传入图片，处理设置等参数")
    }

    override fun processImage()
    {
        TODO("Not yet implemented")
    }

    override fun readImage()
    {
        TODO("Not yet implemented")
    }

    override fun selectImage(image: Image)
    {
        TODO("Not yet implemented")
    }

    override fun saveImage()
    {
        TODO("Not yet implemented")
    }
}