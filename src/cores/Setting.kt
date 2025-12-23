package com.gowork.a_watermark_camera.cores

import androidx.compose.ui.text.font.Font
import java.time.format.DateTimeFormatter

data class WMSetting(
    // 水印设置

    // 开关设置
    var isTotalShown: Boolean,
    var isClockShown: Boolean,
    var isDateShown: Boolean,
    var isPositionShown: Boolean,
    var isTextShown: Boolean,
    var isImageShown: Boolean,

    // 中心时钟设置
    var clockStyle: String,
    var clockFormatter: DateTimeFormatter,
    var clockSize: Float,
    var clockColor: String,
    var clockMargin: FloatArray,

    // 日期设置
    var dateFont: Font,
    var dateFormatter: DateTimeFormatter,
    var dateSize: Float,
    var dateColor: String,
    var dateMargin: FloatArray,

    // 位置设置
    var positionFont: Font,
    var positionContent: String,
    var positionSize: Float,
    var positionColor: String,
    var positionMargin: FloatArray,

    // 文字内容设置
    var textFont: Font,
    var textContent: String,
    var textSize: Float,
    var textColor: String,
    var textMargin: FloatArray,

    // 图像设置
    var imageStyle: String,
    var imageFormatter: DateTimeFormatter,
    var imageSize: Float,
    var imageColor: String,
    var imageMargin: FloatArray,
)