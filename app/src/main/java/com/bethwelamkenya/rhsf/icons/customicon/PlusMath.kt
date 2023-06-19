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

public val CustomIcon.PlusMath: ImageVector
    get() {
        if (_plusMath != null) {
            return _plusMath!!
        }
        _plusMath = Builder(name = "PlusMath", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.7734f, 2.9336f)
                curveTo(13.6836f, 2.9492f, 12.8125f, 3.8438f, 12.8281f, 4.9336f)
                lineTo(12.8281f, 12.8281f)
                lineTo(4.9336f, 12.8281f)
                curveTo(4.2227f, 12.8164f, 3.5625f, 13.1914f, 3.2031f, 13.8086f)
                curveTo(2.8398f, 14.4219f, 2.8398f, 15.1836f, 3.2031f, 15.7969f)
                curveTo(3.5625f, 16.4141f, 4.2227f, 16.7891f, 4.9336f, 16.7773f)
                lineTo(12.8281f, 16.7773f)
                lineTo(12.8281f, 24.6719f)
                curveTo(12.8164f, 25.3828f, 13.1914f, 26.043f, 13.8086f, 26.4023f)
                curveTo(14.4219f, 26.7656f, 15.1836f, 26.7656f, 15.7969f, 26.4023f)
                curveTo(16.4141f, 26.043f, 16.7891f, 25.3828f, 16.7773f, 24.6719f)
                lineTo(16.7773f, 16.7773f)
                lineTo(24.6719f, 16.7773f)
                curveTo(25.3828f, 16.7891f, 26.043f, 16.4141f, 26.4023f, 15.7969f)
                curveTo(26.7656f, 15.1836f, 26.7656f, 14.4219f, 26.4023f, 13.8086f)
                curveTo(26.043f, 13.1914f, 25.3828f, 12.8164f, 24.6719f, 12.8281f)
                lineTo(16.7773f, 12.8281f)
                lineTo(16.7773f, 4.9336f)
                curveTo(16.7852f, 4.4023f, 16.5742f, 3.8906f, 16.1992f, 3.5117f)
                curveTo(15.8203f, 3.1328f, 15.3086f, 2.9258f, 14.7734f, 2.9336f)
                close()
            }
        }
        .build()
        return _plusMath!!
    }

private var _plusMath: ImageVector? = null
