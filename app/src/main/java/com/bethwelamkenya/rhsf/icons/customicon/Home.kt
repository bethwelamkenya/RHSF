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

public val CustomIcon.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9512f, 4.0f)
                arcTo(1.5001f, 1.5001f, 0.0f, false, false, 23.0723f, 4.3223f)
                lineTo(8.8594f, 15.5195f)
                curveTo(7.0555f, 16.9412f, 6.0f, 19.1135f, 6.0f, 21.4102f)
                lineTo(6.0f, 40.5f)
                curveTo(6.0f, 41.8636f, 7.1364f, 43.0f, 8.5f, 43.0f)
                lineTo(18.5f, 43.0f)
                curveTo(19.8636f, 43.0f, 21.0f, 41.8636f, 21.0f, 40.5f)
                lineTo(21.0f, 30.5f)
                curveTo(21.0f, 30.205f, 21.205f, 30.0f, 21.5f, 30.0f)
                lineTo(26.5f, 30.0f)
                curveTo(26.795f, 30.0f, 27.0f, 30.205f, 27.0f, 30.5f)
                lineTo(27.0f, 40.5f)
                curveTo(27.0f, 41.8636f, 28.1364f, 43.0f, 29.5f, 43.0f)
                lineTo(39.5f, 43.0f)
                curveTo(40.8636f, 43.0f, 42.0f, 41.8636f, 42.0f, 40.5f)
                lineTo(42.0f, 21.4102f)
                curveTo(42.0f, 19.1135f, 40.9445f, 16.9412f, 39.1406f, 15.5195f)
                lineTo(24.9277f, 4.3223f)
                arcTo(1.5001f, 1.5001f, 0.0f, false, false, 23.9512f, 4.0f)
                close()
                moveTo(24.0f, 7.4102f)
                lineTo(37.2852f, 17.877f)
                curveTo(38.3693f, 18.7313f, 39.0f, 20.0308f, 39.0f, 21.4102f)
                lineTo(39.0f, 40.0f)
                lineTo(30.0f, 40.0f)
                lineTo(30.0f, 30.5f)
                curveTo(30.0f, 28.585f, 28.415f, 27.0f, 26.5f, 27.0f)
                lineTo(21.5f, 27.0f)
                curveTo(19.585f, 27.0f, 18.0f, 28.585f, 18.0f, 30.5f)
                lineTo(18.0f, 40.0f)
                lineTo(9.0f, 40.0f)
                lineTo(9.0f, 21.4102f)
                curveTo(9.0f, 20.0308f, 9.6307f, 18.7313f, 10.7148f, 17.877f)
                lineTo(24.0f, 7.4102f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
