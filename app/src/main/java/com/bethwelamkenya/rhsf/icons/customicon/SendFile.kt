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

public val CustomIcon.SendFile: ImageVector
    get() {
        if (_sendFile != null) {
            return _sendFile!!
        }
        _sendFile = Builder(name = "SendFile", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.3828f, 8.6758f)
                lineTo(17.9688f, 2.2617f)
                curveTo(17.7813f, 2.0781f, 17.5313f, 1.9727f, 17.2695f, 1.9727f)
                lineTo(6.9063f, 1.9727f)
                curveTo(5.8164f, 1.9727f, 4.9336f, 2.8555f, 4.9336f, 3.9492f)
                lineTo(4.9336f, 25.6563f)
                curveTo(4.9336f, 26.75f, 5.8164f, 27.6328f, 6.9063f, 27.6328f)
                lineTo(22.6992f, 27.6328f)
                curveTo(23.7891f, 27.6328f, 24.6719f, 26.75f, 24.6719f, 25.6563f)
                lineTo(24.6719f, 9.375f)
                curveTo(24.6719f, 9.1133f, 24.5664f, 8.8633f, 24.3828f, 8.6758f)
                close()
                moveTo(20.6484f, 18.1406f)
                curveTo(20.5977f, 18.2617f, 20.5234f, 18.3711f, 20.4336f, 18.4609f)
                lineTo(16.4883f, 22.4102f)
                curveTo(16.293f, 22.6016f, 16.043f, 22.6992f, 15.7891f, 22.6992f)
                curveTo(15.5352f, 22.6992f, 15.2852f, 22.6016f, 15.0898f, 22.4102f)
                curveTo(14.707f, 22.0234f, 14.707f, 21.3984f, 15.0898f, 21.0117f)
                lineTo(17.3555f, 18.75f)
                lineTo(9.8672f, 18.75f)
                curveTo(9.3203f, 18.75f, 8.8828f, 18.3125f, 8.8828f, 17.7617f)
                curveTo(8.8828f, 17.2148f, 9.3203f, 16.7773f, 9.8672f, 16.7773f)
                lineTo(17.3555f, 16.7773f)
                lineTo(15.0898f, 14.5117f)
                curveTo(14.707f, 14.1289f, 14.707f, 13.5039f, 15.0898f, 13.1172f)
                curveTo(15.4766f, 12.7344f, 16.1016f, 12.7344f, 16.4883f, 13.1172f)
                lineTo(20.4336f, 17.0664f)
                curveTo(20.5273f, 17.1523f, 20.5977f, 17.2656f, 20.6484f, 17.3867f)
                curveTo(20.7461f, 17.6289f, 20.7461f, 17.8984f, 20.6484f, 18.1406f)
                close()
                moveTo(17.7617f, 9.8672f)
                curveTo(17.2188f, 9.8672f, 16.7773f, 9.4258f, 16.7773f, 8.8828f)
                lineTo(16.7773f, 3.8516f)
                lineTo(22.793f, 9.8672f)
                close()
            }
        }
        .build()
        return _sendFile!!
    }

private var _sendFile: ImageVector? = null
