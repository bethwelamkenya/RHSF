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

public val CustomIcon.Instagram: ImageVector
    get() {
        if (_instagram != null) {
            return _instagram!!
        }
        _instagram = Builder(name = "Instagram", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.8672f, 2.9609f)
                curveTo(6.0586f, 2.9609f, 2.9609f, 6.0586f, 2.9609f, 9.8672f)
                lineTo(2.9609f, 19.7383f)
                curveTo(2.9609f, 23.5469f, 6.0586f, 26.6445f, 9.8672f, 26.6445f)
                lineTo(19.7383f, 26.6445f)
                curveTo(23.5469f, 26.6445f, 26.6445f, 23.5469f, 26.6445f, 19.7383f)
                lineTo(26.6445f, 9.8672f)
                curveTo(26.6445f, 6.0586f, 23.5469f, 2.9609f, 19.7383f, 2.9609f)
                close()
                moveTo(21.7109f, 6.9063f)
                curveTo(22.2539f, 6.9063f, 22.6992f, 7.3516f, 22.6992f, 7.8945f)
                curveTo(22.6992f, 8.4375f, 22.2539f, 8.8828f, 21.7109f, 8.8828f)
                curveTo(21.168f, 8.8828f, 20.7227f, 8.4375f, 20.7227f, 7.8945f)
                curveTo(20.7227f, 7.3516f, 21.168f, 6.9063f, 21.7109f, 6.9063f)
                close()
                moveTo(14.8008f, 8.8828f)
                curveTo(18.0664f, 8.8828f, 20.7227f, 11.5391f, 20.7227f, 14.8008f)
                curveTo(20.7227f, 18.0664f, 18.0664f, 20.7227f, 14.8008f, 20.7227f)
                curveTo(11.5391f, 20.7227f, 8.8828f, 18.0664f, 8.8828f, 14.8008f)
                curveTo(8.8828f, 11.5391f, 11.5391f, 8.8828f, 14.8008f, 8.8828f)
                close()
                moveTo(14.8008f, 10.8555f)
                curveTo(12.6211f, 10.8555f, 10.8555f, 12.6211f, 10.8555f, 14.8008f)
                curveTo(10.8555f, 16.9844f, 12.6211f, 18.75f, 14.8008f, 18.75f)
                curveTo(16.9844f, 18.75f, 18.75f, 16.9844f, 18.75f, 14.8008f)
                curveTo(18.75f, 12.6211f, 16.9844f, 10.8555f, 14.8008f, 10.8555f)
                close()
            }
        }
        .build()
        return _instagram!!
    }

private var _instagram: ImageVector? = null
