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

public val CustomIcon.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9336f, 1.9727f)
                lineTo(4.9336f, 22.6992f)
                lineTo(24.6719f, 22.6992f)
                lineTo(24.6719f, 1.9727f)
                lineTo(22.6992f, 2.9609f)
                lineTo(20.7227f, 1.9727f)
                lineTo(18.75f, 2.9609f)
                lineTo(16.7773f, 1.9727f)
                lineTo(14.8008f, 2.9609f)
                lineTo(12.8281f, 1.9727f)
                lineTo(10.8555f, 2.9609f)
                lineTo(8.8828f, 1.9727f)
                lineTo(6.9063f, 2.9609f)
                close()
                moveTo(24.6719f, 22.6992f)
                lineTo(24.6719f, 24.6719f)
                lineTo(4.9336f, 24.6719f)
                lineTo(4.9336f, 22.6992f)
                curveTo(3.8438f, 22.6992f, 2.9609f, 23.582f, 2.9609f, 24.6719f)
                curveTo(2.9609f, 25.7617f, 3.8438f, 26.6445f, 4.9336f, 26.6445f)
                lineTo(24.6719f, 26.6445f)
                curveTo(25.7617f, 26.6445f, 26.6445f, 25.7617f, 26.6445f, 24.6719f)
                curveTo(26.6445f, 23.582f, 25.7617f, 22.6992f, 24.6719f, 22.6992f)
                close()
                moveTo(9.8672f, 6.9063f)
                lineTo(19.7383f, 6.9063f)
                curveTo(20.2813f, 6.9063f, 20.7227f, 7.3516f, 20.7227f, 7.8945f)
                curveTo(20.7227f, 8.4375f, 20.2813f, 8.8828f, 19.7383f, 8.8828f)
                lineTo(9.8672f, 8.8828f)
                curveTo(9.3242f, 8.8828f, 8.8828f, 8.4375f, 8.8828f, 7.8945f)
                curveTo(8.8828f, 7.3516f, 9.3242f, 6.9063f, 9.8672f, 6.9063f)
                close()
                moveTo(9.8672f, 12.8281f)
                lineTo(15.7891f, 12.8281f)
                curveTo(16.332f, 12.8281f, 16.7773f, 13.2734f, 16.7773f, 13.8164f)
                curveTo(16.7773f, 14.3594f, 16.332f, 14.8008f, 15.7891f, 14.8008f)
                lineTo(9.8672f, 14.8008f)
                curveTo(9.3242f, 14.8008f, 8.8828f, 14.3594f, 8.8828f, 13.8164f)
                curveTo(8.8828f, 13.2734f, 9.3242f, 12.8281f, 9.8672f, 12.8281f)
                close()
                moveTo(19.7383f, 12.8281f)
                curveTo(20.2813f, 12.8281f, 20.7227f, 13.2734f, 20.7227f, 13.8164f)
                curveTo(20.7227f, 14.3594f, 20.2813f, 14.8008f, 19.7383f, 14.8008f)
                curveTo(19.1914f, 14.8008f, 18.75f, 14.3594f, 18.75f, 13.8164f)
                curveTo(18.75f, 13.2734f, 19.1914f, 12.8281f, 19.7383f, 12.8281f)
                close()
                moveTo(9.8672f, 16.7773f)
                lineTo(13.8164f, 16.7773f)
                curveTo(14.3594f, 16.7773f, 14.8008f, 17.2188f, 14.8008f, 17.7617f)
                curveTo(14.8008f, 18.3086f, 14.3594f, 18.75f, 13.8164f, 18.75f)
                lineTo(9.8672f, 18.75f)
                curveTo(9.3242f, 18.75f, 8.8828f, 18.3086f, 8.8828f, 17.7617f)
                curveTo(8.8828f, 17.2188f, 9.3242f, 16.7773f, 9.8672f, 16.7773f)
                close()
                moveTo(19.7383f, 16.7773f)
                curveTo(20.2813f, 16.7773f, 20.7227f, 17.2188f, 20.7227f, 17.7617f)
                curveTo(20.7227f, 18.3086f, 20.2813f, 18.75f, 19.7383f, 18.75f)
                curveTo(19.1914f, 18.75f, 18.75f, 18.3086f, 18.75f, 17.7617f)
                curveTo(18.75f, 17.2188f, 19.1914f, 16.7773f, 19.7383f, 16.7773f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
