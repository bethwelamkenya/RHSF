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

public val CustomIcon.Gmail: ImageVector
    get() {
        if (_gmail != null) {
            return _gmail!!
        }
        _gmail = Builder(name = "Gmail", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.9492f, 4.9336f)
                curveTo(2.8672f, 4.9336f, 1.9727f, 5.8281f, 1.9727f, 6.9063f)
                lineTo(1.9727f, 22.6992f)
                curveTo(1.9727f, 23.7773f, 2.8672f, 24.6719f, 3.9492f, 24.6719f)
                lineTo(25.6563f, 24.6719f)
                curveTo(26.7383f, 24.6719f, 27.6328f, 23.7773f, 27.6328f, 22.6992f)
                lineTo(27.6328f, 6.9063f)
                curveTo(27.6328f, 5.8281f, 26.7383f, 4.9336f, 25.6563f, 4.9336f)
                close()
                moveTo(6.6094f, 6.9063f)
                lineTo(22.9961f, 6.9063f)
                lineTo(14.8008f, 12.9648f)
                close()
                moveTo(4.9336f, 9.3516f)
                lineTo(14.8008f, 16.6406f)
                lineTo(24.6719f, 9.3516f)
                lineTo(24.6719f, 22.6992f)
                lineTo(4.9336f, 22.6992f)
                close()
            }
        }
        .build()
        return _gmail!!
    }

private var _gmail: ImageVector? = null
