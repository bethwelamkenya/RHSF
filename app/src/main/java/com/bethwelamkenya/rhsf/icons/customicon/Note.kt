package com.bethwelamkenya.rhsf.icons.customicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.bethwelamkenya.rhsf.icons.CustomIcon

public val CustomIcon.Note: ImageVector
    get() {
        if (_note != null) {
            return _note!!
        }
        _note = Builder(name = "Note", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.9063f, 3.9492f)
                curveTo(5.2852f, 3.9492f, 3.9492f, 5.2852f, 3.9492f, 6.9063f)
                lineTo(3.9492f, 22.6992f)
                curveTo(3.9492f, 24.3203f, 5.2852f, 25.6563f, 6.9063f, 25.6563f)
                lineTo(19.2422f, 25.6563f)
                curveTo(19.5039f, 25.6563f, 19.7578f, 25.5547f, 19.9414f, 25.3672f)
                lineTo(25.3672f, 19.9414f)
                curveTo(25.5547f, 19.7578f, 25.6563f, 19.5039f, 25.6563f, 19.2422f)
                lineTo(25.6563f, 6.9063f)
                curveTo(25.6563f, 5.2852f, 24.3203f, 3.9492f, 22.6992f, 3.9492f)
                close()
                moveTo(6.9063f, 5.9219f)
                lineTo(22.6992f, 5.9219f)
                curveTo(23.2578f, 5.9219f, 23.6836f, 6.3477f, 23.6836f, 6.9063f)
                lineTo(23.6836f, 18.75f)
                lineTo(20.7227f, 18.75f)
                curveTo(19.6328f, 18.75f, 18.75f, 19.6328f, 18.75f, 20.7227f)
                lineTo(18.75f, 23.6836f)
                lineTo(6.9063f, 23.6836f)
                curveTo(6.3477f, 23.6836f, 5.9219f, 23.2578f, 5.9219f, 22.6992f)
                lineTo(5.9219f, 6.9063f)
                curveTo(5.9219f, 6.3477f, 6.3477f, 5.9219f, 6.9063f, 5.9219f)
                close()
                moveTo(9.8672f, 10.8555f)
                curveTo(9.5156f, 10.8516f, 9.1836f, 11.0352f, 9.0f, 11.3438f)
                curveTo(8.8242f, 11.6523f, 8.8242f, 12.0313f, 9.0f, 12.3398f)
                curveTo(9.1836f, 12.6484f, 9.5156f, 12.832f, 9.8672f, 12.8281f)
                lineTo(13.8164f, 12.8281f)
                curveTo(14.1719f, 12.832f, 14.5039f, 12.6484f, 14.6836f, 12.3398f)
                curveTo(14.8594f, 12.0313f, 14.8594f, 11.6523f, 14.6836f, 11.3438f)
                curveTo(14.5039f, 11.0352f, 14.1719f, 10.8516f, 13.8164f, 10.8555f)
                close()
                moveTo(17.7617f, 10.8555f)
                curveTo(17.4102f, 10.8516f, 17.0781f, 11.0352f, 16.8945f, 11.3438f)
                curveTo(16.7188f, 11.6523f, 16.7188f, 12.0313f, 16.8945f, 12.3398f)
                curveTo(17.0781f, 12.6484f, 17.4102f, 12.832f, 17.7617f, 12.8281f)
                lineTo(19.7383f, 12.8281f)
                curveTo(20.0898f, 12.832f, 20.4219f, 12.6484f, 20.6055f, 12.3398f)
                curveTo(20.7813f, 12.0313f, 20.7813f, 11.6523f, 20.6055f, 11.3438f)
                curveTo(20.4219f, 11.0352f, 20.0898f, 10.8516f, 19.7383f, 10.8555f)
                close()
                moveTo(9.8672f, 14.8008f)
                curveTo(9.5156f, 14.7969f, 9.1836f, 14.9844f, 9.0f, 15.293f)
                curveTo(8.8242f, 15.6016f, 8.8242f, 15.9766f, 9.0f, 16.2852f)
                curveTo(9.1836f, 16.5938f, 9.5156f, 16.7813f, 9.8672f, 16.7773f)
                lineTo(17.7617f, 16.7773f)
                curveTo(18.1172f, 16.7813f, 18.4492f, 16.5938f, 18.6289f, 16.2852f)
                curveTo(18.8086f, 15.9766f, 18.8086f, 15.6016f, 18.6289f, 15.293f)
                curveTo(18.4492f, 14.9844f, 18.1172f, 14.7969f, 17.7617f, 14.8008f)
                close()
            }
        }
        .build()
        return _note!!
    }

private var _note: ImageVector? = null
