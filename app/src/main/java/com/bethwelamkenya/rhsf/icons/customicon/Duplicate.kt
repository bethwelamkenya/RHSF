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

public val CustomIcon.Duplicate: ImageVector
    get() {
        if (_duplicate != null) {
            return _duplicate!!
        }
        _duplicate = Builder(name = "Duplicate", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.8945f, 3.9492f)
                curveTo(6.8047f, 3.9492f, 5.9219f, 4.832f, 5.9219f, 5.9219f)
                lineTo(5.9219f, 6.9063f)
                lineTo(23.6836f, 6.9063f)
                curveTo(24.7734f, 6.9063f, 25.6563f, 7.7891f, 25.6563f, 8.8828f)
                lineTo(25.6563f, 21.7109f)
                lineTo(26.6445f, 21.7109f)
                curveTo(27.7344f, 21.7109f, 28.6172f, 20.8281f, 28.6172f, 19.7383f)
                lineTo(28.6172f, 5.9219f)
                curveTo(28.6172f, 4.832f, 27.7344f, 3.9492f, 26.6445f, 3.9492f)
                close()
                moveTo(2.9609f, 8.8828f)
                curveTo(1.8711f, 8.8828f, 0.9883f, 9.7656f, 0.9883f, 10.8555f)
                lineTo(0.9883f, 23.6836f)
                curveTo(0.9883f, 24.7734f, 1.8711f, 25.6563f, 2.9609f, 25.6563f)
                lineTo(21.7109f, 25.6563f)
                curveTo(22.8008f, 25.6563f, 23.6836f, 24.7734f, 23.6836f, 23.6836f)
                lineTo(23.6836f, 10.8555f)
                curveTo(23.6836f, 9.7656f, 22.8008f, 8.8828f, 21.7109f, 8.8828f)
                close()
                moveTo(11.8438f, 12.8281f)
                curveTo(12.3867f, 12.8281f, 12.8281f, 13.2734f, 12.8281f, 13.8164f)
                lineTo(12.8281f, 16.7773f)
                lineTo(15.7891f, 16.7773f)
                curveTo(16.332f, 16.7773f, 16.7773f, 17.2188f, 16.7773f, 17.7617f)
                curveTo(16.7773f, 18.3086f, 16.332f, 18.75f, 15.7891f, 18.75f)
                lineTo(12.8281f, 18.75f)
                lineTo(12.8281f, 21.7109f)
                curveTo(12.8281f, 22.2539f, 12.3867f, 22.6992f, 11.8438f, 22.6992f)
                curveTo(11.2969f, 22.6992f, 10.8555f, 22.2539f, 10.8555f, 21.7109f)
                lineTo(10.8555f, 18.75f)
                lineTo(7.8945f, 18.75f)
                curveTo(7.3516f, 18.75f, 6.9063f, 18.3086f, 6.9063f, 17.7617f)
                curveTo(6.9063f, 17.2188f, 7.3516f, 16.7773f, 7.8945f, 16.7773f)
                lineTo(10.8555f, 16.7773f)
                lineTo(10.8555f, 13.8164f)
                curveTo(10.8555f, 13.2734f, 11.2969f, 12.8281f, 11.8438f, 12.8281f)
                close()
            }
        }
        .build()
        return _duplicate!!
    }

private var _duplicate: ImageVector? = null
