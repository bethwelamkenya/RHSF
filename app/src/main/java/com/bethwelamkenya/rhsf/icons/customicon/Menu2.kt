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

public val CustomIcon.Menu2: ImageVector
    get() {
        if (_menu2 != null) {
            return _menu2!!
        }
        _menu2 = Builder(name = "Menu2", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8008f, 3.9492f)
                curveTo(13.168f, 3.9492f, 11.8438f, 5.2734f, 11.8438f, 6.9063f)
                curveTo(11.8438f, 8.543f, 13.168f, 9.8672f, 14.8008f, 9.8672f)
                curveTo(16.4375f, 9.8672f, 17.7617f, 8.543f, 17.7617f, 6.9063f)
                curveTo(17.7617f, 5.2734f, 16.4375f, 3.9492f, 14.8008f, 3.9492f)
                close()
                moveTo(14.8008f, 11.8438f)
                curveTo(13.168f, 11.8438f, 11.8438f, 13.168f, 11.8438f, 14.8008f)
                curveTo(11.8438f, 16.4375f, 13.168f, 17.7617f, 14.8008f, 17.7617f)
                curveTo(16.4375f, 17.7617f, 17.7617f, 16.4375f, 17.7617f, 14.8008f)
                curveTo(17.7617f, 13.168f, 16.4375f, 11.8438f, 14.8008f, 11.8438f)
                close()
                moveTo(14.8008f, 19.7383f)
                curveTo(13.168f, 19.7383f, 11.8438f, 21.0625f, 11.8438f, 22.6992f)
                curveTo(11.8438f, 24.332f, 13.168f, 25.6563f, 14.8008f, 25.6563f)
                curveTo(16.4375f, 25.6563f, 17.7617f, 24.332f, 17.7617f, 22.6992f)
                curveTo(17.7617f, 21.0625f, 16.4375f, 19.7383f, 14.8008f, 19.7383f)
                close()
            }
        }
        .build()
        return _menu2!!
    }

private var _menu2: ImageVector? = null
