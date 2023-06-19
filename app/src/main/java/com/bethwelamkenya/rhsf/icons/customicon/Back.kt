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

public val CustomIcon.Back: ImageVector
    get() {
        if (_back != null) {
            return _back!!
        }
        _back = Builder(name = "Back", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.7188f, 3.9414f)
                curveTo(19.4609f, 3.9453f, 19.2148f, 4.0508f, 19.0391f, 4.2383f)
                lineTo(9.1719f, 14.1055f)
                curveTo(8.7852f, 14.4922f, 8.7852f, 15.1133f, 9.1719f, 15.5f)
                lineTo(19.0391f, 25.3672f)
                curveTo(19.2852f, 25.6289f, 19.6563f, 25.7305f, 20.0f, 25.6367f)
                curveTo(20.3477f, 25.5508f, 20.6172f, 25.2813f, 20.7031f, 24.9336f)
                curveTo(20.7969f, 24.5898f, 20.6914f, 24.2188f, 20.4336f, 23.9727f)
                lineTo(11.2656f, 14.8008f)
                lineTo(20.4336f, 5.6328f)
                curveTo(20.7266f, 5.3477f, 20.8125f, 4.9141f, 20.6563f, 4.543f)
                curveTo(20.4961f, 4.1641f, 20.125f, 3.9258f, 19.7188f, 3.9414f)
                close()
            }
        }
        .build()
        return _back!!
    }

private var _back: ImageVector? = null
