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

public val CustomIcon.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.9063f, 1.9727f)
                curveTo(5.8164f, 1.9727f, 4.9336f, 2.8555f, 4.9336f, 3.9492f)
                lineTo(4.9336f, 25.6563f)
                curveTo(4.9336f, 26.75f, 5.8164f, 27.6328f, 6.9063f, 27.6328f)
                lineTo(22.6992f, 27.6328f)
                curveTo(23.7891f, 27.6328f, 24.6719f, 26.75f, 24.6719f, 25.6563f)
                lineTo(24.6719f, 3.9492f)
                curveTo(24.6719f, 2.8555f, 23.7891f, 1.9727f, 22.6992f, 1.9727f)
                lineTo(16.7773f, 1.9727f)
                lineTo(16.7773f, 3.9492f)
                lineTo(14.8008f, 3.9492f)
                lineTo(14.8008f, 5.9219f)
                lineTo(16.7773f, 5.9219f)
                lineTo(16.7773f, 7.8945f)
                lineTo(14.8008f, 7.8945f)
                lineTo(14.8008f, 9.8672f)
                lineTo(16.7773f, 9.8672f)
                lineTo(16.7773f, 11.8438f)
                lineTo(14.8008f, 11.8438f)
                lineTo(14.8008f, 13.8164f)
                lineTo(16.7773f, 13.8164f)
                curveTo(16.7773f, 13.8164f, 17.7031f, 17.0f, 17.7578f, 19.4883f)
                curveTo(17.793f, 21.0195f, 16.7813f, 22.4297f, 15.2695f, 22.6641f)
                curveTo(13.4297f, 22.9453f, 11.8438f, 21.5234f, 11.8438f, 19.7383f)
                curveTo(11.8438f, 17.2109f, 12.8281f, 13.8164f, 12.8281f, 13.8164f)
                lineTo(12.8281f, 11.8438f)
                lineTo(14.8008f, 11.8438f)
                lineTo(14.8008f, 9.8672f)
                lineTo(12.8281f, 9.8672f)
                lineTo(12.8281f, 7.8945f)
                lineTo(14.8008f, 7.8945f)
                lineTo(14.8008f, 5.9219f)
                lineTo(12.8281f, 5.9219f)
                lineTo(12.8281f, 3.9492f)
                lineTo(14.8008f, 3.9492f)
                lineTo(14.8008f, 1.9727f)
                close()
                moveTo(14.8008f, 18.5039f)
                curveTo(14.1211f, 18.5039f, 13.5703f, 19.0547f, 13.5703f, 19.7383f)
                curveTo(13.5703f, 20.418f, 14.1211f, 20.9688f, 14.8008f, 20.9688f)
                curveTo(15.4844f, 20.9688f, 16.0352f, 20.418f, 16.0352f, 19.7383f)
                curveTo(16.0352f, 19.0547f, 15.4844f, 18.5039f, 14.8008f, 18.5039f)
                close()
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
