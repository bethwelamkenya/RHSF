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

public val CustomIcon.Themes: ImageVector
    get() {
        if (_themes != null) {
            return _themes!!
        }
        _themes = Builder(name = "Themes", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.8672f, 2.9688f)
                curveTo(8.2344f, 2.9727f, 7.6172f, 3.2852f, 7.2383f, 3.8516f)
                lineTo(5.8047f, 6.0078f)
                curveTo(6.0703f, 5.9531f, 6.3438f, 5.9102f, 6.6211f, 5.9102f)
                curveTo(6.9922f, 5.9102f, 7.3633f, 5.9648f, 7.7227f, 6.0664f)
                lineTo(17.7031f, 8.957f)
                lineTo(19.1523f, 9.3789f)
                lineTo(9.9766f, 3.2969f)
                curveTo(9.6328f, 3.0703f, 9.2461f, 2.9648f, 8.8672f, 2.9688f)
                close()
                moveTo(6.7773f, 7.8906f)
                curveTo(5.8633f, 7.8164f, 4.9922f, 8.3906f, 4.7266f, 9.3086f)
                lineTo(4.1523f, 11.2891f)
                curveTo(4.6875f, 11.0195f, 5.2813f, 10.8555f, 5.9219f, 10.8555f)
                lineTo(17.1523f, 10.8555f)
                lineTo(7.1719f, 7.9648f)
                curveTo(7.043f, 7.9258f, 6.9063f, 7.9023f, 6.7773f, 7.8906f)
                close()
                moveTo(5.9219f, 12.8281f)
                curveTo(4.8398f, 12.8281f, 3.9492f, 13.7227f, 3.9492f, 14.8008f)
                lineTo(3.9492f, 24.6719f)
                curveTo(3.9492f, 25.75f, 4.8398f, 26.6445f, 5.9219f, 26.6445f)
                lineTo(23.6836f, 26.6445f)
                curveTo(24.7617f, 26.6445f, 25.6563f, 25.75f, 25.6563f, 24.6719f)
                lineTo(25.6563f, 14.8008f)
                curveTo(25.6563f, 13.7227f, 24.7617f, 12.8281f, 23.6836f, 12.8281f)
                close()
                moveTo(20.7227f, 14.8008f)
                lineTo(23.6836f, 14.8008f)
                lineTo(23.6836f, 24.6719f)
                lineTo(20.7227f, 24.6719f)
                close()
            }
        }
        .build()
        return _themes!!
    }

private var _themes: ImageVector? = null
