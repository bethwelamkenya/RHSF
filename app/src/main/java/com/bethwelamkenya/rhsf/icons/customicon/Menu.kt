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

public val CustomIcon.Menu: ImageVector
    get() {
        if (_menu != null) {
            return _menu!!
        }
        _menu = Builder(name = "Menu", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.9609f, 6.9063f)
                curveTo(2.6055f, 6.9023f, 2.2734f, 7.0898f, 2.0938f, 7.3984f)
                curveTo(1.9141f, 7.707f, 1.9141f, 8.082f, 2.0938f, 8.3906f)
                curveTo(2.2734f, 8.6992f, 2.6055f, 8.8867f, 2.9609f, 8.8828f)
                lineTo(26.6445f, 8.8828f)
                curveTo(27.0f, 8.8867f, 27.332f, 8.6992f, 27.5117f, 8.3906f)
                curveTo(27.6875f, 8.082f, 27.6875f, 7.707f, 27.5117f, 7.3984f)
                curveTo(27.332f, 7.0898f, 27.0f, 6.9023f, 26.6445f, 6.9063f)
                close()
                moveTo(2.9609f, 13.8164f)
                curveTo(2.6055f, 13.8125f, 2.2734f, 13.9961f, 2.0938f, 14.3047f)
                curveTo(1.9141f, 14.6133f, 1.9141f, 14.9922f, 2.0938f, 15.3008f)
                curveTo(2.2734f, 15.6094f, 2.6055f, 15.793f, 2.9609f, 15.7891f)
                lineTo(26.6445f, 15.7891f)
                curveTo(27.0f, 15.793f, 27.332f, 15.6094f, 27.5117f, 15.3008f)
                curveTo(27.6875f, 14.9922f, 27.6875f, 14.6133f, 27.5117f, 14.3047f)
                curveTo(27.332f, 13.9961f, 27.0f, 13.8125f, 26.6445f, 13.8164f)
                close()
                moveTo(2.9609f, 20.7227f)
                curveTo(2.6055f, 20.7188f, 2.2734f, 20.9063f, 2.0938f, 21.2148f)
                curveTo(1.9141f, 21.5234f, 1.9141f, 21.8984f, 2.0938f, 22.207f)
                curveTo(2.2734f, 22.5156f, 2.6055f, 22.7031f, 2.9609f, 22.6992f)
                lineTo(26.6445f, 22.6992f)
                curveTo(27.0f, 22.7031f, 27.332f, 22.5156f, 27.5117f, 22.207f)
                curveTo(27.6875f, 21.8984f, 27.6875f, 21.5234f, 27.5117f, 21.2148f)
                curveTo(27.332f, 20.9063f, 27.0f, 20.7188f, 26.6445f, 20.7227f)
                close()
            }
        }
        .build()
        return _menu!!
    }

private var _menu: ImageVector? = null
