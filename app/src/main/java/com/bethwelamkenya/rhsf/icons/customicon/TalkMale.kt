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

public val CustomIcon.TalkMale: ImageVector
    get() {
        if (_talkMale != null) {
            return _talkMale!!
        }
        _talkMale = Builder(name = "TalkMale", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.8281f, 3.9492f)
                curveTo(9.6758f, 3.9492f, 7.8516f, 6.4063f, 7.8516f, 9.375f)
                curveTo(7.8516f, 10.375f, 8.332f, 11.3789f, 8.332f, 11.3789f)
                curveTo(8.1367f, 11.4883f, 7.8242f, 11.8438f, 7.9023f, 12.4609f)
                curveTo(8.0508f, 13.625f, 8.5547f, 13.918f, 8.875f, 13.9375f)
                curveTo(8.9961f, 15.0273f, 10.4453f, 16.5742f, 10.8555f, 16.7773f)
                lineTo(10.8555f, 18.4219f)
                curveTo(9.9492f, 21.1367f, 3.9492f, 19.7383f, 3.9492f, 25.6563f)
                lineTo(21.7109f, 25.6563f)
                curveTo(21.7109f, 19.7383f, 15.707f, 21.1367f, 14.8008f, 18.4219f)
                lineTo(14.8008f, 16.7773f)
                curveTo(15.2109f, 16.5742f, 16.6602f, 15.0273f, 16.7852f, 13.9375f)
                curveTo(17.1055f, 13.918f, 17.6055f, 13.625f, 17.7539f, 12.4609f)
                curveTo(17.8359f, 11.8398f, 17.5195f, 11.4883f, 17.3281f, 11.3789f)
                curveTo(17.3281f, 11.3789f, 17.8047f, 10.4688f, 17.8047f, 9.375f)
                curveTo(17.8047f, 7.1797f, 16.9414f, 5.3047f, 15.0898f, 5.3047f)
                curveTo(15.0898f, 5.3047f, 14.7539f, 3.9492f, 12.8281f, 3.9492f)
                close()
                moveTo(19.0391f, 5.9219f)
                curveTo(19.5078f, 6.875f, 19.7773f, 8.0391f, 19.7773f, 9.375f)
                curveTo(19.7773f, 10.0352f, 19.668f, 10.6328f, 19.5313f, 11.1172f)
                curveTo(19.7109f, 11.5703f, 19.7891f, 12.1055f, 19.7148f, 12.7148f)
                curveTo(19.5508f, 13.9844f, 19.0469f, 14.8164f, 18.4258f, 15.3164f)
                curveTo(18.3555f, 15.4766f, 18.2695f, 15.6367f, 18.1836f, 15.7891f)
                lineTo(18.75f, 15.7891f)
                lineTo(18.75f, 18.75f)
                lineTo(22.6953f, 15.7891f)
                lineTo(26.6445f, 15.7891f)
                curveTo(28.2773f, 15.7891f, 29.6055f, 14.4688f, 29.6055f, 12.8281f)
                lineTo(29.6055f, 8.8828f)
                curveTo(29.6055f, 7.2461f, 28.2773f, 5.9219f, 26.6445f, 5.9219f)
                close()
            }
        }
        .build()
        return _talkMale!!
    }

private var _talkMale: ImageVector? = null
