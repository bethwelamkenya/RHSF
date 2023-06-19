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

public val CustomIcon.LogoutRoundedLeft: ImageVector
    get() {
        if (_logoutRoundedLeft != null) {
            return _logoutRoundedLeft!!
        }
        _logoutRoundedLeft = Builder(name = "LogoutRoundedLeft", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8008f, 2.9609f)
                curveTo(12.2813f, 2.9609f, 9.9492f, 3.7695f, 8.043f, 5.1133f)
                curveTo(7.5938f, 5.4258f, 7.4844f, 6.043f, 7.7969f, 6.4883f)
                curveTo(8.1133f, 6.9336f, 8.7266f, 7.043f, 9.1758f, 6.7305f)
                curveTo(10.7734f, 5.6016f, 12.7031f, 4.9336f, 14.8008f, 4.9336f)
                curveTo(20.2656f, 4.9336f, 24.6719f, 9.3398f, 24.6719f, 14.8008f)
                curveTo(24.6719f, 20.2656f, 20.2656f, 24.6719f, 14.8008f, 24.6719f)
                curveTo(12.7031f, 24.6719f, 10.7734f, 24.0039f, 9.1758f, 22.8789f)
                curveTo(8.7266f, 22.5625f, 8.1133f, 22.6719f, 7.7969f, 23.1172f)
                curveTo(7.4844f, 23.5625f, 7.5938f, 24.1758f, 8.043f, 24.4883f)
                curveTo(9.9492f, 25.8359f, 12.2813f, 26.6445f, 14.8008f, 26.6445f)
                curveTo(21.332f, 26.6445f, 26.6445f, 21.332f, 26.6445f, 14.8008f)
                curveTo(26.6445f, 8.2734f, 21.332f, 2.9609f, 14.8008f, 2.9609f)
                close()
                moveTo(6.8867f, 9.8594f)
                curveTo(6.6289f, 9.8633f, 6.3867f, 9.9727f, 6.2109f, 10.1563f)
                lineTo(2.3516f, 14.0156f)
                curveTo(2.1055f, 14.207f, 1.9609f, 14.4961f, 1.9609f, 14.8008f)
                curveTo(1.9609f, 15.1094f, 2.1055f, 15.4023f, 2.3516f, 15.5898f)
                lineTo(6.2109f, 19.4492f)
                curveTo(6.457f, 19.707f, 6.8281f, 19.8086f, 7.1719f, 19.7188f)
                curveTo(7.5156f, 19.6289f, 7.7852f, 19.3594f, 7.875f, 19.0117f)
                curveTo(7.9688f, 18.668f, 7.8633f, 18.3008f, 7.6055f, 18.0508f)
                lineTo(5.3438f, 15.7891f)
                lineTo(15.7891f, 15.7891f)
                curveTo(16.1445f, 15.793f, 16.4766f, 15.6094f, 16.6563f, 15.3008f)
                curveTo(16.8359f, 14.9922f, 16.8359f, 14.6133f, 16.6563f, 14.3047f)
                curveTo(16.4766f, 13.9961f, 16.1445f, 13.8125f, 15.7891f, 13.8164f)
                lineTo(5.3438f, 13.8164f)
                lineTo(7.6055f, 11.5547f)
                curveTo(7.8984f, 11.2695f, 7.9844f, 10.8359f, 7.8242f, 10.4609f)
                curveTo(7.668f, 10.0859f, 7.2969f, 9.8438f, 6.8867f, 9.8594f)
                close()
            }
        }
        .build()
        return _logoutRoundedLeft!!
    }

private var _logoutRoundedLeft: ImageVector? = null
