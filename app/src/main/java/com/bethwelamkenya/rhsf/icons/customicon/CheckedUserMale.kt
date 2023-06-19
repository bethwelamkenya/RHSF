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

public val CustomIcon.CheckedUserMale: ImageVector
    get() {
        if (_checkedUserMale != null) {
            return _checkedUserMale!!
        }
        _checkedUserMale = Builder(name = "CheckedUserMale", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8008f, 2.9609f)
                curveTo(10.6172f, 2.9609f, 8.8828f, 5.6484f, 8.8828f, 8.8828f)
                curveTo(8.8828f, 9.9727f, 9.4023f, 11.0664f, 9.4023f, 11.0664f)
                curveTo(9.1953f, 11.1875f, 8.8477f, 11.5703f, 8.9375f, 12.2461f)
                curveTo(9.0977f, 13.5156f, 9.6445f, 13.8398f, 9.9961f, 13.8633f)
                curveTo(10.1289f, 15.0469f, 11.3984f, 16.5547f, 11.8438f, 16.7773f)
                lineTo(11.8438f, 18.75f)
                curveTo(10.8555f, 21.7109f, 2.9609f, 19.7383f, 2.9609f, 26.6445f)
                lineTo(14.7539f, 26.6445f)
                curveTo(14.1602f, 25.4531f, 13.8164f, 24.1172f, 13.8164f, 22.6992f)
                curveTo(13.8164f, 18.9336f, 16.1602f, 15.7227f, 19.4688f, 14.4336f)
                curveTo(19.5352f, 14.2344f, 19.5898f, 14.0469f, 19.6094f, 13.8633f)
                curveTo(19.9609f, 13.8398f, 20.5078f, 13.5156f, 20.668f, 12.2461f)
                curveTo(20.7578f, 11.5703f, 20.4102f, 11.1875f, 20.2031f, 11.0664f)
                curveTo(20.2031f, 11.0664f, 20.7227f, 10.082f, 20.7227f, 8.8828f)
                curveTo(20.7227f, 6.4883f, 19.7813f, 4.4414f, 17.7617f, 4.4414f)
                curveTo(17.7617f, 4.4414f, 17.0625f, 2.9609f, 14.8008f, 2.9609f)
                close()
                moveTo(22.6992f, 15.7891f)
                curveTo(18.8828f, 15.7891f, 15.7891f, 18.8828f, 15.7891f, 22.6992f)
                curveTo(15.7891f, 26.5156f, 18.8828f, 29.6055f, 22.6992f, 29.6055f)
                curveTo(26.5156f, 29.6055f, 29.6055f, 26.5156f, 29.6055f, 22.6992f)
                curveTo(29.6055f, 18.8828f, 26.5156f, 15.7891f, 22.6992f, 15.7891f)
                close()
                moveTo(25.6563f, 19.7383f)
                curveTo(25.9102f, 19.7383f, 26.1641f, 19.832f, 26.3555f, 20.0273f)
                curveTo(26.7422f, 20.4102f, 26.7422f, 21.0352f, 26.3555f, 21.4219f)
                lineTo(22.4102f, 25.3672f)
                curveTo(22.2148f, 25.5625f, 21.9648f, 25.6563f, 21.7109f, 25.6563f)
                curveTo(21.457f, 25.6563f, 21.207f, 25.5625f, 21.0117f, 25.3672f)
                lineTo(19.0391f, 23.3945f)
                curveTo(18.6523f, 23.0078f, 18.6523f, 22.3867f, 19.0391f, 22.0f)
                curveTo(19.4258f, 21.6133f, 20.0508f, 21.6133f, 20.4336f, 22.0f)
                lineTo(21.7109f, 23.2773f)
                lineTo(24.9609f, 20.0273f)
                curveTo(25.1523f, 19.832f, 25.4063f, 19.7383f, 25.6563f, 19.7383f)
                close()
            }
        }
        .build()
        return _checkedUserMale!!
    }

private var _checkedUserMale: ImageVector? = null
