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

public val CustomIcon.ExpandArrow: ImageVector
    get() {
        if (_expandArrow != null) {
            return _expandArrow!!
        }
        _expandArrow = Builder(name = "ExpandArrow", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.6602f, 8.8672f)
                curveTo(24.4023f, 8.875f, 24.1563f, 8.9805f, 23.9727f, 9.1719f)
                lineTo(14.8008f, 18.3398f)
                lineTo(5.6328f, 9.1719f)
                curveTo(5.4453f, 8.9766f, 5.1914f, 8.875f, 4.9258f, 8.875f)
                curveTo(4.5234f, 8.875f, 4.1641f, 9.1172f, 4.0078f, 9.4883f)
                curveTo(3.8594f, 9.8594f, 3.9492f, 10.2852f, 4.2383f, 10.5664f)
                lineTo(14.1055f, 20.4336f)
                curveTo(14.4922f, 20.8203f, 15.1133f, 20.8203f, 15.5f, 20.4336f)
                lineTo(25.3672f, 10.5664f)
                curveTo(25.6602f, 10.2852f, 25.75f, 9.8477f, 25.5977f, 9.4766f)
                curveTo(25.4375f, 9.1016f, 25.0664f, 8.8594f, 24.6602f, 8.8672f)
                close()
            }
        }
        .build()
        return _expandArrow!!
    }

private var _expandArrow: ImageVector? = null
