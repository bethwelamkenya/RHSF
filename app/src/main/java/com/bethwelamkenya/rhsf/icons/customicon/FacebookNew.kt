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

public val CustomIcon.FacebookNew: ImageVector
    get() {
        if (_facebookNew != null) {
            return _facebookNew!!
        }
        _facebookNew = Builder(name = "FacebookNew", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8008f, 2.9609f)
                curveTo(8.2617f, 2.9609f, 2.9609f, 8.2617f, 2.9609f, 14.8008f)
                curveTo(2.9609f, 20.7383f, 7.3359f, 25.6406f, 13.0352f, 26.5f)
                lineTo(13.0352f, 17.9414f)
                lineTo(10.1055f, 17.9414f)
                lineTo(10.1055f, 14.8281f)
                lineTo(13.0352f, 14.8281f)
                lineTo(13.0352f, 12.7539f)
                curveTo(13.0352f, 9.3281f, 14.7031f, 7.8203f, 17.5508f, 7.8203f)
                curveTo(18.918f, 7.8203f, 19.6406f, 7.9258f, 19.9805f, 7.9688f)
                lineTo(19.9805f, 10.6875f)
                lineTo(18.0352f, 10.6875f)
                curveTo(16.8281f, 10.6875f, 16.4063f, 11.8359f, 16.4063f, 13.125f)
                lineTo(16.4063f, 14.8281f)
                lineTo(19.9531f, 14.8281f)
                lineTo(19.4727f, 17.9414f)
                lineTo(16.4063f, 17.9414f)
                lineTo(16.4063f, 26.5234f)
                curveTo(22.1836f, 25.7383f, 26.6445f, 20.7969f, 26.6445f, 14.8008f)
                curveTo(26.6445f, 8.2617f, 21.3438f, 2.9609f, 14.8008f, 2.9609f)
                close()
            }
        }
        .build()
        return _facebookNew!!
    }

private var _facebookNew: ImageVector? = null
