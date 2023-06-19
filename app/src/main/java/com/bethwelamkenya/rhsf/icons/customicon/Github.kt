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

public val CustomIcon.Github: ImageVector
    get() {
        if (_github != null) {
            return _github!!
        }
        _github = Builder(name = "Github", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8008f, 2.9609f)
                curveTo(8.2617f, 2.9609f, 2.9609f, 8.2617f, 2.9609f, 14.8008f)
                curveTo(2.9609f, 20.3516f, 6.7813f, 24.9961f, 11.9336f, 26.2773f)
                curveTo(11.875f, 26.1211f, 11.8438f, 25.9336f, 11.8438f, 25.7031f)
                lineTo(11.8438f, 23.6797f)
                curveTo(11.3594f, 23.6797f, 10.5547f, 23.6797f, 10.3555f, 23.6797f)
                curveTo(9.543f, 23.6797f, 8.8242f, 23.332f, 8.4727f, 22.6875f)
                curveTo(8.0859f, 21.9648f, 8.0195f, 20.8672f, 7.0586f, 20.1914f)
                curveTo(6.7734f, 19.9688f, 6.9883f, 19.7148f, 7.3164f, 19.75f)
                curveTo(7.9258f, 19.918f, 8.4258f, 20.3359f, 8.9023f, 20.9492f)
                curveTo(9.375f, 21.5703f, 9.5938f, 21.7109f, 10.4766f, 21.7109f)
                curveTo(10.9063f, 21.7109f, 11.5469f, 21.6875f, 12.1484f, 21.5898f)
                curveTo(12.4688f, 20.7695f, 13.0313f, 20.0156f, 13.7109f, 19.6563f)
                curveTo(9.7695f, 19.25f, 7.8867f, 17.2891f, 7.8867f, 14.625f)
                curveTo(7.8867f, 13.4766f, 8.375f, 12.3711f, 9.207f, 11.4336f)
                curveTo(8.9375f, 10.5078f, 8.5938f, 8.6172f, 9.3086f, 7.8945f)
                curveTo(11.0859f, 7.8945f, 12.1602f, 9.043f, 12.418f, 9.3555f)
                curveTo(13.3008f, 9.0547f, 14.2695f, 8.8828f, 15.293f, 8.8828f)
                curveTo(16.3125f, 8.8828f, 17.2891f, 9.0547f, 18.1758f, 9.3594f)
                curveTo(18.4297f, 9.0508f, 19.5f, 7.8945f, 21.2813f, 7.8945f)
                curveTo(22.0039f, 8.6172f, 21.6563f, 10.5156f, 21.3828f, 11.4414f)
                curveTo(22.207f, 12.375f, 22.6953f, 13.4805f, 22.6953f, 14.625f)
                curveTo(22.6953f, 17.2852f, 20.8125f, 19.2461f, 16.875f, 19.6563f)
                curveTo(17.9609f, 20.2188f, 18.75f, 21.8125f, 18.75f, 23.0039f)
                lineTo(18.75f, 25.7031f)
                curveTo(18.75f, 25.8086f, 18.7266f, 25.8828f, 18.7148f, 25.9688f)
                curveTo(23.3281f, 24.3516f, 26.6445f, 19.9688f, 26.6445f, 14.8008f)
                curveTo(26.6445f, 8.2617f, 21.3438f, 2.9609f, 14.8008f, 2.9609f)
                close()
            }
        }
        .build()
        return _github!!
    }

private var _github: ImageVector? = null
