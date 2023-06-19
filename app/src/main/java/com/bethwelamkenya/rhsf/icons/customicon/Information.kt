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

public val CustomIcon.Information: ImageVector
    get() {
        if (_information != null) {
            return _information!!
        }
        _information = Builder(name = "Information", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8008f, 2.9609f)
                curveTo(13.168f, 2.9609f, 11.8438f, 4.2852f, 11.8438f, 5.9219f)
                curveTo(11.8438f, 7.5547f, 13.168f, 8.8828f, 14.8008f, 8.8828f)
                curveTo(16.4375f, 8.8828f, 17.7617f, 7.5547f, 17.7617f, 5.9219f)
                curveTo(17.7617f, 4.2852f, 16.4375f, 2.9609f, 14.8008f, 2.9609f)
                close()
                moveTo(11.8438f, 11.8438f)
                curveTo(11.2969f, 11.8438f, 10.8555f, 12.2852f, 10.8555f, 12.8281f)
                curveTo(10.8555f, 13.3711f, 11.2969f, 13.8164f, 11.8438f, 13.8164f)
                lineTo(12.8281f, 13.8164f)
                lineTo(12.8281f, 24.6719f)
                lineTo(11.8438f, 24.6719f)
                curveTo(11.2969f, 24.6719f, 10.8555f, 25.1133f, 10.8555f, 25.6563f)
                curveTo(10.8555f, 26.2031f, 11.2969f, 26.6445f, 11.8438f, 26.6445f)
                lineTo(17.7617f, 26.6445f)
                curveTo(18.3086f, 26.6445f, 18.75f, 26.2031f, 18.75f, 25.6563f)
                curveTo(18.75f, 25.1133f, 18.3086f, 24.6719f, 17.7617f, 24.6719f)
                lineTo(16.7773f, 24.6719f)
                lineTo(16.7773f, 12.8281f)
                curveTo(16.7773f, 12.2852f, 16.332f, 11.8438f, 15.7891f, 11.8438f)
                close()
            }
        }
        .build()
        return _information!!
    }

private var _information: ImageVector? = null
