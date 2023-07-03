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

public val CustomIcon.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8008f, 1.9727f)
                curveTo(8.8086f, 1.9727f, 3.9492f, 6.8359f, 3.9492f, 12.8281f)
                curveTo(3.9492f, 19.9688f, 11.0039f, 23.3828f, 11.8867f, 24.1797f)
                curveTo(12.793f, 24.9922f, 13.5391f, 26.8125f, 13.8398f, 27.8477f)
                curveTo(13.9844f, 28.3477f, 14.3984f, 28.5977f, 14.8008f, 28.6094f)
                curveTo(15.2109f, 28.5977f, 15.6211f, 28.3438f, 15.7656f, 27.8477f)
                curveTo(16.0664f, 26.8125f, 16.8125f, 24.9961f, 17.7188f, 24.1797f)
                curveTo(18.6016f, 23.3828f, 25.6563f, 19.9688f, 25.6563f, 12.8281f)
                curveTo(25.6563f, 6.8359f, 20.7969f, 1.9727f, 14.8008f, 1.9727f)
                close()
                moveTo(14.8008f, 15.7891f)
                curveTo(13.168f, 15.7891f, 11.8438f, 14.4648f, 11.8438f, 12.8281f)
                curveTo(11.8438f, 11.1953f, 13.168f, 9.8672f, 14.8008f, 9.8672f)
                curveTo(16.4375f, 9.8672f, 17.7617f, 11.1953f, 17.7617f, 12.8281f)
                curveTo(17.7617f, 14.4648f, 16.4375f, 15.7891f, 14.8008f, 15.7891f)
                close()
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
