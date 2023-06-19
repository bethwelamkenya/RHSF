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

public val CustomIcon.Help: ImageVector
    get() {
        if (_help != null) {
            return _help!!
        }
        _help = Builder(name = "Help", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8008f, 2.9609f)
                curveTo(8.2617f, 2.9609f, 2.9609f, 8.2617f, 2.9609f, 14.8008f)
                curveTo(2.9609f, 21.3438f, 8.2617f, 26.6445f, 14.8008f, 26.6445f)
                curveTo(21.3438f, 26.6445f, 26.6445f, 21.3438f, 26.6445f, 14.8008f)
                curveTo(26.6445f, 8.2617f, 21.3438f, 2.9609f, 14.8008f, 2.9609f)
                close()
                moveTo(14.8008f, 22.2031f)
                curveTo(13.9844f, 22.2031f, 13.3242f, 21.5391f, 13.3242f, 20.7227f)
                curveTo(13.3242f, 19.9063f, 13.9844f, 19.2422f, 14.8008f, 19.2422f)
                curveTo(15.6211f, 19.2422f, 16.2813f, 19.9063f, 16.2813f, 20.7227f)
                curveTo(16.2813f, 21.5391f, 15.6211f, 22.2031f, 14.8008f, 22.2031f)
                close()
                moveTo(16.8438f, 15.2969f)
                curveTo(16.1914f, 15.8984f, 15.7891f, 16.293f, 15.7891f, 16.7773f)
                lineTo(13.8164f, 16.7773f)
                curveTo(13.8164f, 15.4023f, 14.7539f, 14.5391f, 15.5039f, 13.8477f)
                curveTo(16.293f, 13.1172f, 16.7773f, 12.6328f, 16.7773f, 11.8438f)
                curveTo(16.7773f, 10.7539f, 15.8906f, 9.8672f, 14.8008f, 9.8672f)
                curveTo(13.7148f, 9.8672f, 12.8281f, 10.7539f, 12.8281f, 11.8438f)
                lineTo(10.8555f, 11.8438f)
                curveTo(10.8555f, 9.6641f, 12.625f, 7.8945f, 14.8008f, 7.8945f)
                curveTo(16.9805f, 7.8945f, 18.75f, 9.6641f, 18.75f, 11.8438f)
                curveTo(18.75f, 13.5352f, 17.6953f, 14.5078f, 16.8438f, 15.2969f)
                close()
            }
        }
        .build()
        return _help!!
    }

private var _help: ImageVector? = null
