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

public val CustomIcon.YoutubePlay: ImageVector
    get() {
        if (_youtubePlay != null) {
            return _youtubePlay!!
        }
        _youtubePlay = Builder(name = "YoutubePlay", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8008f, 3.9492f)
                curveTo(10.6719f, 3.9492f, 5.3125f, 4.9805f, 5.3125f, 4.9805f)
                lineTo(5.2969f, 4.9961f)
                curveTo(3.4141f, 5.3008f, 1.9727f, 6.9141f, 1.9727f, 8.8828f)
                lineTo(1.9727f, 20.7227f)
                curveTo(1.9766f, 22.668f, 3.3867f, 24.3164f, 5.3047f, 24.6172f)
                lineTo(5.3125f, 24.625f)
                curveTo(5.3125f, 24.625f, 10.6719f, 25.6563f, 14.8008f, 25.6563f)
                curveTo(18.9336f, 25.6563f, 24.2969f, 24.625f, 24.2969f, 24.625f)
                lineTo(24.2969f, 24.6211f)
                curveTo(26.2188f, 24.3203f, 27.6289f, 22.668f, 27.6328f, 20.7227f)
                lineTo(27.6328f, 8.8828f)
                curveTo(27.6289f, 6.9414f, 26.2188f, 5.2891f, 24.3008f, 4.9883f)
                lineTo(24.2969f, 4.9805f)
                curveTo(24.2969f, 4.9805f, 18.9336f, 3.9492f, 14.8008f, 3.9492f)
                close()
                moveTo(11.8438f, 10.2617f)
                lineTo(19.7383f, 14.8008f)
                lineTo(11.8438f, 19.3438f)
                close()
            }
        }
        .build()
        return _youtubePlay!!
    }

private var _youtubePlay: ImageVector? = null
