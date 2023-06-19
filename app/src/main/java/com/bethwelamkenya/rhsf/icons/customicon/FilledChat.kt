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

public val CustomIcon.FilledChat: ImageVector
    get() {
        if (_filledChat != null) {
            return _filledChat!!
        }
        _filledChat = Builder(name = "FilledChat", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.8945f, 2.9609f)
                curveTo(6.8047f, 2.9609f, 5.9219f, 3.8438f, 5.9219f, 4.9336f)
                lineTo(22.6992f, 4.9336f)
                curveTo(24.332f, 4.9336f, 25.6563f, 6.2617f, 25.6563f, 7.8945f)
                lineTo(25.6563f, 20.7227f)
                curveTo(26.75f, 20.7227f, 27.6328f, 19.8398f, 27.6328f, 18.75f)
                lineTo(27.6328f, 4.9336f)
                curveTo(27.6328f, 3.8438f, 26.75f, 2.9609f, 25.6563f, 2.9609f)
                close()
                moveTo(3.9492f, 6.9063f)
                curveTo(2.8555f, 6.9063f, 1.9727f, 7.7891f, 1.9727f, 8.8828f)
                lineTo(1.9727f, 22.6992f)
                curveTo(1.9727f, 23.7891f, 2.8555f, 24.6719f, 3.9492f, 24.6719f)
                lineTo(6.9063f, 24.6719f)
                lineTo(6.9063f, 27.6328f)
                curveTo(6.9063f, 28.1758f, 7.3516f, 28.6172f, 7.8945f, 28.6172f)
                curveTo(8.2305f, 28.6172f, 8.5391f, 28.4492f, 8.7188f, 28.168f)
                lineTo(11.3477f, 24.6719f)
                lineTo(21.7109f, 24.6719f)
                curveTo(22.8008f, 24.6719f, 23.6836f, 23.7891f, 23.6836f, 22.6992f)
                lineTo(23.6836f, 8.8828f)
                curveTo(23.6836f, 7.7891f, 22.8008f, 6.9063f, 21.7109f, 6.9063f)
                close()
            }
        }
        .build()
        return _filledChat!!
    }

private var _filledChat: ImageVector? = null
