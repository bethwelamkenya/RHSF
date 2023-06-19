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

public val CustomIcon.Insert: ImageVector
    get() {
        if (_insert != null) {
            return _insert!!
        }
        _insert = Builder(name = "Insert", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.7891f, 2.9453f)
                curveTo(14.2422f, 2.957f, 13.8086f, 3.4023f, 13.8164f, 3.9492f)
                lineTo(13.8164f, 13.8164f)
                lineTo(10.8555f, 13.8164f)
                curveTo(10.3125f, 13.8164f, 9.8672f, 14.2578f, 9.8672f, 14.8008f)
                curveTo(9.8672f, 15.0781f, 9.9844f, 15.3398f, 10.1797f, 15.5234f)
                lineTo(14.0156f, 19.3633f)
                curveTo(14.207f, 19.6055f, 14.4961f, 19.75f, 14.8008f, 19.75f)
                curveTo(15.1094f, 19.75f, 15.4023f, 19.6055f, 15.5898f, 19.3594f)
                lineTo(19.4258f, 15.5234f)
                curveTo(19.625f, 15.3359f, 19.7383f, 15.0781f, 19.7383f, 14.8008f)
                curveTo(19.7383f, 14.2578f, 19.293f, 13.8164f, 18.75f, 13.8164f)
                lineTo(15.7891f, 13.8164f)
                lineTo(15.7891f, 3.9492f)
                curveTo(15.793f, 3.6797f, 15.6875f, 3.4219f, 15.5f, 3.2344f)
                curveTo(15.3125f, 3.0469f, 15.0547f, 2.9414f, 14.7891f, 2.9453f)
                close()
                moveTo(4.918f, 12.8125f)
                curveTo(4.375f, 12.8242f, 3.9414f, 13.2734f, 3.9492f, 13.8164f)
                lineTo(3.9492f, 23.6836f)
                curveTo(3.9492f, 24.7617f, 4.8398f, 25.6563f, 5.9219f, 25.6563f)
                lineTo(23.6836f, 25.6563f)
                curveTo(24.7617f, 25.6563f, 25.6563f, 24.7617f, 25.6563f, 23.6836f)
                lineTo(25.6563f, 13.8164f)
                curveTo(25.6602f, 13.4609f, 25.4766f, 13.1289f, 25.168f, 12.9492f)
                curveTo(24.8594f, 12.7695f, 24.4805f, 12.7695f, 24.1719f, 12.9492f)
                curveTo(23.8672f, 13.1289f, 23.6797f, 13.4609f, 23.6836f, 13.8164f)
                lineTo(23.6836f, 23.6836f)
                lineTo(5.9219f, 23.6836f)
                lineTo(5.9219f, 13.8164f)
                curveTo(5.9258f, 13.5508f, 5.8203f, 13.293f, 5.6328f, 13.1016f)
                curveTo(5.4414f, 12.9141f, 5.1836f, 12.8086f, 4.918f, 12.8125f)
                close()
            }
        }
        .build()
        return _insert!!
    }

private var _insert: ImageVector? = null
