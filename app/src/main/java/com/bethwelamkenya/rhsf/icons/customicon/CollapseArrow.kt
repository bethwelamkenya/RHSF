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

public val CustomIcon.CollapseArrow: ImageVector
    get() {
        if (_collapseArrow != null) {
            return _collapseArrow!!
        }
        _collapseArrow = Builder(name = "CollapseArrow", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.7891f, 8.8828f)
                curveTo(14.5273f, 8.8867f, 14.2852f, 8.9883f, 14.1055f, 9.1719f)
                lineTo(4.2383f, 19.0391f)
                curveTo(3.9766f, 19.2852f, 3.875f, 19.6563f, 3.9648f, 20.0f)
                curveTo(4.0547f, 20.3477f, 4.3242f, 20.6172f, 4.6719f, 20.7031f)
                curveTo(5.0156f, 20.7969f, 5.3867f, 20.6914f, 5.6328f, 20.4336f)
                lineTo(14.8008f, 11.2656f)
                lineTo(23.9727f, 20.4336f)
                curveTo(24.2188f, 20.6914f, 24.5898f, 20.7969f, 24.9336f, 20.7031f)
                curveTo(25.2813f, 20.6172f, 25.5508f, 20.3477f, 25.6367f, 20.0f)
                curveTo(25.7305f, 19.6563f, 25.6289f, 19.2852f, 25.3672f, 19.0391f)
                lineTo(15.5f, 9.1719f)
                curveTo(15.3125f, 8.9805f, 15.0547f, 8.8789f, 14.7891f, 8.8828f)
                close()
            }
        }
        .build()
        return _collapseArrow!!
    }

private var _collapseArrow: ImageVector? = null
