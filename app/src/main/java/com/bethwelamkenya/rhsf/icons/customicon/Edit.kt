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

public val CustomIcon.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.5273f, 2.9609f)
                curveTo(22.0234f, 2.9609f, 21.5195f, 3.1523f, 21.1328f, 3.5391f)
                lineTo(18.75f, 5.9219f)
                lineTo(23.6836f, 10.8555f)
                lineTo(26.0664f, 8.4727f)
                curveTo(26.8359f, 7.7031f, 26.8359f, 6.4531f, 26.0664f, 5.6836f)
                lineTo(23.9219f, 3.5391f)
                curveTo(23.5391f, 3.1523f, 23.0313f, 2.9609f, 22.5273f, 2.9609f)
                close()
                moveTo(16.7773f, 7.8945f)
                lineTo(5.1875f, 19.4805f)
                curveTo(5.1875f, 19.4805f, 6.0938f, 19.3984f, 6.4336f, 19.7383f)
                curveTo(6.7734f, 20.0742f, 6.4922f, 22.2813f, 6.9063f, 22.6992f)
                curveTo(7.3242f, 23.1133f, 9.5195f, 22.8203f, 9.8281f, 23.1328f)
                curveTo(10.1445f, 23.4492f, 10.125f, 24.4141f, 10.125f, 24.4141f)
                lineTo(21.7109f, 12.8281f)
                close()
                moveTo(3.9492f, 22.6992f)
                lineTo(3.0156f, 25.3359f)
                curveTo(2.9805f, 25.4375f, 2.9609f, 25.5469f, 2.9609f, 25.6563f)
                curveTo(2.9609f, 26.2031f, 3.4023f, 26.6445f, 3.9492f, 26.6445f)
                curveTo(4.0586f, 26.6445f, 4.168f, 26.625f, 4.2695f, 26.5859f)
                curveTo(4.2734f, 26.5859f, 4.2773f, 26.5859f, 4.2773f, 26.582f)
                lineTo(4.3047f, 26.5781f)
                curveTo(4.3086f, 26.5742f, 4.3086f, 26.5742f, 4.3086f, 26.5703f)
                lineTo(6.9063f, 25.6563f)
                close()
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
