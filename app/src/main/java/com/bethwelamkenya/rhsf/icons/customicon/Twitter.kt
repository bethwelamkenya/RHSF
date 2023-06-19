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

public val CustomIcon.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(27.6328f, 6.8477f)
                curveTo(26.6875f, 7.2656f, 25.6719f, 7.5469f, 24.6094f, 7.6758f)
                curveTo(25.6953f, 7.0234f, 26.5273f, 5.9922f, 26.9219f, 4.7617f)
                curveTo(25.9063f, 5.3672f, 24.7773f, 5.8047f, 23.582f, 6.0391f)
                curveTo(22.6211f, 5.0195f, 21.25f, 4.3789f, 19.7383f, 4.3789f)
                curveTo(16.832f, 4.3789f, 14.4727f, 6.7344f, 14.4727f, 9.6406f)
                curveTo(14.4727f, 10.0547f, 14.5195f, 10.457f, 14.6094f, 10.8398f)
                curveTo(10.2344f, 10.6211f, 6.3555f, 8.5273f, 3.7578f, 5.3398f)
                curveTo(3.3086f, 6.1172f, 3.0508f, 7.0195f, 3.0508f, 7.9883f)
                curveTo(3.0508f, 9.8164f, 3.9727f, 11.4258f, 5.3906f, 12.3672f)
                curveTo(4.5273f, 12.3398f, 3.7109f, 12.1055f, 3.0039f, 11.7109f)
                curveTo(3.0039f, 11.7344f, 3.0039f, 11.7539f, 3.0039f, 11.7773f)
                curveTo(3.0039f, 14.3281f, 4.8203f, 16.457f, 7.2266f, 16.9375f)
                curveTo(6.7852f, 17.0586f, 6.3164f, 17.125f, 5.8398f, 17.125f)
                curveTo(5.5f, 17.125f, 5.168f, 17.0898f, 4.8477f, 17.0273f)
                curveTo(5.5195f, 19.1211f, 7.4648f, 20.6445f, 9.7695f, 20.6836f)
                curveTo(7.9648f, 22.0977f, 5.6992f, 22.9375f, 3.2305f, 22.9375f)
                curveTo(2.8047f, 22.9375f, 2.3867f, 22.9141f, 1.9727f, 22.8633f)
                curveTo(4.3008f, 24.3594f, 7.0703f, 25.2305f, 10.043f, 25.2305f)
                curveTo(19.7266f, 25.2305f, 25.0195f, 17.207f, 25.0195f, 10.25f)
                curveTo(25.0195f, 10.0234f, 25.0156f, 9.7969f, 25.0039f, 9.5703f)
                curveTo(26.0313f, 8.8281f, 26.9258f, 7.9023f, 27.6328f, 6.8477f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
