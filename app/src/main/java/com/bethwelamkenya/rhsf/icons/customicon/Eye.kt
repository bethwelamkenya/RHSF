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

public val CustomIcon.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth
                = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9863f, 9.0f)
                curveTo(12.6667f, 9.0f, 2.6929f, 16.8459f, 0.0469f, 27.127f)
                arcTo(1.5002f, 1.5002f, 0.0f, false, false, 2.9531f, 27.873f)
                curveTo(5.2331f, 19.0141f, 14.066f, 12.0f, 23.9863f, 12.0f)
                curveTo(33.9067f, 12.0f, 42.7675f, 19.0166f, 45.0469f, 27.873f)
                arcTo(1.5002f, 1.5002f, 0.0f, false, false, 47.9531f, 27.127f)
                curveTo(45.3065f, 16.8435f, 35.306f, 9.0f, 23.9863f, 9.0f)
                close()
                moveTo(24.002f, 17.0f)
                curveTo(18.6819f, 17.0f, 14.3379f, 21.344f, 14.3379f, 26.6641f)
                curveTo(14.3379f, 31.9841f, 18.6819f, 36.3301f, 24.002f, 36.3301f)
                curveTo(29.322f, 36.3301f, 33.668f, 31.9841f, 33.668f, 26.6641f)
                curveTo(33.668f, 21.344f, 29.322f, 17.0f, 24.002f, 17.0f)
                close()
                moveTo(24.002f, 20.0f)
                curveTo(27.7007f, 20.0f, 30.668f, 22.9653f, 30.668f, 26.6641f)
                curveTo(30.668f, 30.3628f, 27.7007f, 33.3301f, 24.002f, 33.3301f)
                curveTo(20.3032f, 33.3301f, 17.3379f, 30.3628f, 17.3379f, 26.6641f)
                curveTo(17.3379f, 22.9653f, 20.3032f, 20.0f, 24.002f, 20.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
