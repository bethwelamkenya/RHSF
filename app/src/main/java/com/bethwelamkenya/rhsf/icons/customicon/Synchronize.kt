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

public val CustomIcon.Synchronize: ImageVector
    get() {
        if (_synchronize != null) {
            return _synchronize!!
        }
        _synchronize = Builder(name = "Synchronize", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8008f, 2.9609f)
                curveTo(8.7969f, 2.9609f, 3.8281f, 7.457f, 3.0742f, 13.2617f)
                curveTo(3.0156f, 13.6211f, 3.1523f, 13.9766f, 3.4375f, 14.2031f)
                curveTo(3.7227f, 14.4219f, 4.1055f, 14.4727f, 4.4375f, 14.3281f)
                curveTo(4.7695f, 14.1875f, 4.9961f, 13.8789f, 5.0273f, 13.5195f)
                curveTo(5.6602f, 8.6719f, 9.7813f, 4.9336f, 14.8008f, 4.9336f)
                curveTo(17.5313f, 4.9336f, 19.9844f, 6.0469f, 21.7695f, 7.8359f)
                lineTo(19.7383f, 9.8672f)
                lineTo(25.6563f, 10.8555f)
                lineTo(24.6719f, 4.9336f)
                lineTo(23.1602f, 6.4453f)
                curveTo(21.0195f, 4.3008f, 18.0664f, 2.9609f, 14.8008f, 2.9609f)
                close()
                moveTo(25.5703f, 15.2148f)
                curveTo(25.0625f, 15.207f, 24.6367f, 15.5859f, 24.5781f, 16.0859f)
                curveTo(23.9453f, 20.9336f, 19.8242f, 24.6719f, 14.8008f, 24.6719f)
                curveTo(11.8203f, 24.6719f, 9.1758f, 23.3359f, 7.3672f, 21.25f)
                lineTo(8.8828f, 19.7383f)
                lineTo(2.9609f, 18.75f)
                lineTo(3.9492f, 24.6719f)
                lineTo(5.9688f, 22.6523f)
                curveTo(8.1367f, 25.0859f, 11.2852f, 26.6445f, 14.8008f, 26.6445f)
                curveTo(20.8086f, 26.6445f, 25.7773f, 22.1484f, 26.5313f, 16.3438f)
                curveTo(26.5703f, 16.0625f, 26.4922f, 15.7773f, 26.3047f, 15.5625f)
                curveTo(26.125f, 15.3477f, 25.8555f, 15.2188f, 25.5703f, 15.2148f)
                close()
            }
        }
        .build()
        return _synchronize!!
    }

private var _synchronize: ImageVector? = null
