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

public val CustomIcon.DataProtection: ImageVector
    get() {
        if (_dataProtection != null) {
            return _dataProtection!!
        }
        _dataProtection = Builder(name = "DataProtection", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.9219f, 3.9492f)
                curveTo(4.832f, 3.9492f, 3.9492f, 4.832f, 3.9492f, 5.9219f)
                lineTo(3.9492f, 8.8828f)
                curveTo(3.9492f, 9.4258f, 4.3906f, 9.8672f, 4.9336f, 9.8672f)
                lineTo(24.6719f, 9.8672f)
                curveTo(25.2148f, 9.8672f, 25.6563f, 9.4258f, 25.6563f, 8.8828f)
                lineTo(25.6563f, 5.9219f)
                curveTo(25.6563f, 4.832f, 24.7734f, 3.9492f, 23.6836f, 3.9492f)
                close()
                moveTo(4.9336f, 11.8438f)
                curveTo(4.3906f, 11.8438f, 3.9492f, 12.2852f, 3.9492f, 12.8281f)
                lineTo(3.9492f, 16.7773f)
                curveTo(3.9492f, 17.3203f, 4.3906f, 17.7617f, 4.9336f, 17.7617f)
                lineTo(13.8555f, 17.7617f)
                curveTo(14.0391f, 16.4688f, 14.9453f, 15.3789f, 16.207f, 14.9766f)
                curveTo(16.3516f, 14.9297f, 19.7656f, 13.8164f, 22.6992f, 13.8164f)
                curveTo(23.6758f, 13.8164f, 24.7109f, 13.9375f, 25.6563f, 14.1094f)
                lineTo(25.6563f, 12.8281f)
                curveTo(25.6563f, 12.2852f, 25.2148f, 11.8438f, 24.6719f, 11.8438f)
                close()
                moveTo(22.6992f, 15.7891f)
                curveTo(20.0508f, 15.7891f, 16.8242f, 16.8516f, 16.8242f, 16.8516f)
                curveTo(16.2266f, 17.043f, 15.7891f, 17.5938f, 15.7891f, 18.2578f)
                lineTo(15.7891f, 20.9688f)
                curveTo(15.7891f, 26.8906f, 22.1367f, 29.4922f, 22.1367f, 29.4922f)
                curveTo(22.3125f, 29.5625f, 22.4961f, 29.6055f, 22.6992f, 29.6055f)
                curveTo(22.8984f, 29.6055f, 23.082f, 29.5625f, 23.2578f, 29.4922f)
                curveTo(23.2578f, 29.4922f, 29.6055f, 26.8906f, 29.6055f, 20.9688f)
                lineTo(29.6055f, 18.2578f)
                curveTo(29.6055f, 17.5938f, 29.168f, 17.043f, 28.5703f, 16.8516f)
                curveTo(28.5703f, 16.8516f, 25.3438f, 15.7891f, 22.6992f, 15.7891f)
                close()
                moveTo(4.9336f, 19.7383f)
                curveTo(4.3906f, 19.7383f, 3.9492f, 20.1797f, 3.9492f, 20.7227f)
                lineTo(3.9492f, 23.6836f)
                curveTo(3.9492f, 24.7734f, 4.832f, 25.6563f, 5.9219f, 25.6563f)
                lineTo(14.9961f, 25.6563f)
                curveTo(14.2891f, 24.3477f, 13.8164f, 22.793f, 13.8164f, 20.9688f)
                lineTo(13.8164f, 19.7383f)
                close()
            }
        }
        .build()
        return _dataProtection!!
    }

private var _dataProtection: ImageVector? = null
