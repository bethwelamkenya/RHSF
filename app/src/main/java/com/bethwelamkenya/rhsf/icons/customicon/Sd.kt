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

public val CustomIcon.Sd: ImageVector
    get() {
        if (_sd != null) {
            return _sd!!
        }
        _sd = Builder(name = "Sd", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp, viewportWidth =
                30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.6992f, 2.9609f)
                lineTo(11.6719f, 2.9609f)
                curveTo(11.1484f, 2.9609f, 10.6484f, 3.168f, 10.2773f, 3.5391f)
                lineTo(5.5117f, 8.3047f)
                curveTo(5.1406f, 8.6719f, 4.9336f, 9.1758f, 4.9336f, 9.6992f)
                lineTo(4.9336f, 24.6719f)
                curveTo(4.9336f, 25.7617f, 5.8164f, 26.6445f, 6.9063f, 26.6445f)
                lineTo(22.6992f, 26.6445f)
                curveTo(23.7891f, 26.6445f, 24.6719f, 25.7617f, 24.6719f, 24.6719f)
                lineTo(24.6719f, 4.9336f)
                curveTo(24.6719f, 3.8438f, 23.7891f, 2.9609f, 22.6992f, 2.9609f)
                close()
                moveTo(9.8672f, 11.8438f)
                lineTo(7.8945f, 11.8438f)
                lineTo(7.8945f, 9.0781f)
                lineTo(9.8672f, 7.1055f)
                close()
                moveTo(12.8281f, 9.8672f)
                lineTo(10.8555f, 9.8672f)
                lineTo(10.8555f, 5.9219f)
                lineTo(12.8281f, 5.9219f)
                close()
                moveTo(15.7891f, 9.8672f)
                lineTo(13.8164f, 9.8672f)
                lineTo(13.8164f, 5.9219f)
                lineTo(15.7891f, 5.9219f)
                close()
                moveTo(18.75f, 9.8672f)
                lineTo(16.7773f, 9.8672f)
                lineTo(16.7773f, 5.9219f)
                lineTo(18.75f, 5.9219f)
                close()
                moveTo(21.7109f, 9.8672f)
                lineTo(19.7383f, 9.8672f)
                lineTo(19.7383f, 5.9219f)
                lineTo(21.7109f, 5.9219f)
                close()
            }
        }
        .build()
        return _sd!!
    }

private var _sd: ImageVector? = null
