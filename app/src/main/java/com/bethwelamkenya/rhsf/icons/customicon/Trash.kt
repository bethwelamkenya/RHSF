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

public val CustomIcon.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.8281f, 2.9609f)
                curveTo(12.5664f, 2.957f, 12.3086f, 3.0625f, 12.125f, 3.2461f)
                curveTo(11.9336f, 3.4297f, 11.832f, 3.6797f, 11.8281f, 3.9492f)
                lineTo(5.9219f, 3.9492f)
                curveTo(5.5664f, 3.9453f, 5.2344f, 4.1289f, 5.0547f, 4.4375f)
                curveTo(4.875f, 4.7461f, 4.875f, 5.125f, 5.0547f, 5.4297f)
                curveTo(5.2344f, 5.7383f, 5.5664f, 5.9258f, 5.9219f, 5.9219f)
                lineTo(23.6836f, 5.9219f)
                curveTo(24.0391f, 5.9258f, 24.3711f, 5.7383f, 24.5508f, 5.4297f)
                curveTo(24.7305f, 5.125f, 24.7305f, 4.7461f, 24.5508f, 4.4375f)
                curveTo(24.3711f, 4.1289f, 24.0391f, 3.9453f, 23.6836f, 3.9492f)
                lineTo(17.7773f, 3.9492f)
                curveTo(17.7734f, 3.6797f, 17.6719f, 3.4297f, 17.4805f, 3.2461f)
                curveTo(17.2969f, 3.0625f, 17.0391f, 2.957f, 16.7773f, 2.9609f)
                close()
                moveTo(5.9219f, 7.8945f)
                lineTo(5.9219f, 23.6836f)
                curveTo(5.9219f, 24.7734f, 6.8047f, 25.6563f, 7.8945f, 25.6563f)
                lineTo(21.7109f, 25.6563f)
                curveTo(22.8008f, 25.6563f, 23.6836f, 24.7734f, 23.6836f, 23.6836f)
                lineTo(23.6836f, 7.8945f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
