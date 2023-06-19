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

public val CustomIcon.Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(name = "Facebook", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.6836f, 3.9492f)
                lineTo(5.9219f, 3.9492f)
                curveTo(4.832f, 3.9492f, 3.9492f, 4.832f, 3.9492f, 5.9219f)
                lineTo(3.9492f, 23.6836f)
                curveTo(3.9492f, 24.7734f, 4.832f, 25.6563f, 5.9219f, 25.6563f)
                lineTo(15.7891f, 25.6563f)
                lineTo(15.7891f, 16.7773f)
                lineTo(12.8281f, 16.7773f)
                lineTo(12.8281f, 13.8164f)
                lineTo(15.7891f, 13.8164f)
                lineTo(15.7891f, 12.2266f)
                curveTo(15.7891f, 9.2188f, 17.2539f, 7.8945f, 19.7578f, 7.8945f)
                curveTo(20.9531f, 7.8945f, 21.5898f, 7.9844f, 21.8867f, 8.0273f)
                lineTo(21.8867f, 10.8555f)
                lineTo(20.1836f, 10.8555f)
                curveTo(19.1211f, 10.8555f, 18.75f, 11.4141f, 18.75f, 12.5508f)
                lineTo(18.75f, 13.8164f)
                lineTo(21.8594f, 13.8164f)
                lineTo(21.4414f, 16.7773f)
                lineTo(18.75f, 16.7773f)
                lineTo(18.75f, 25.6563f)
                lineTo(23.6836f, 25.6563f)
                curveTo(24.7734f, 25.6563f, 25.6563f, 24.7734f, 25.6563f, 23.6836f)
                lineTo(25.6563f, 5.9219f)
                curveTo(25.6563f, 4.832f, 24.7734f, 3.9492f, 23.6836f, 3.9492f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
