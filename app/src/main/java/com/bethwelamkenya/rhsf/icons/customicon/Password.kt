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

public val CustomIcon.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveTo(19.5994f, 4.0f, 16.0f, 7.5994f, 16.0f, 12.0f)
                lineTo(16.0f, 16.0f)
                lineTo(12.5f, 16.0f)
                curveTo(10.0325f, 16.0f, 8.0f, 18.0325f, 8.0f, 20.5f)
                lineTo(8.0f, 39.5f)
                curveTo(8.0f, 41.9675f, 10.0325f, 44.0f, 12.5f, 44.0f)
                lineTo(35.5f, 44.0f)
                curveTo(37.9675f, 44.0f, 40.0f, 41.9675f, 40.0f, 39.5f)
                lineTo(40.0f, 20.5f)
                curveTo(40.0f, 18.0325f, 37.9675f, 16.0f, 35.5f, 16.0f)
                lineTo(32.0f, 16.0f)
                lineTo(32.0f, 12.0f)
                curveTo(32.0f, 7.5994f, 28.4006f, 4.0f, 24.0f, 4.0f)
                close()
                moveTo(24.0f, 7.0f)
                curveTo(26.7794f, 7.0f, 29.0f, 9.2206f, 29.0f, 12.0f)
                lineTo(29.0f, 16.0f)
                lineTo(19.0f, 16.0f)
                lineTo(19.0f, 12.0f)
                curveTo(19.0f, 9.2206f, 21.2206f, 7.0f, 24.0f, 7.0f)
                close()
                moveTo(12.5f, 19.0f)
                lineTo(35.5f, 19.0f)
                curveTo(36.3465f, 19.0f, 37.0f, 19.6535f, 37.0f, 20.5f)
                lineTo(37.0f, 39.5f)
                curveTo(37.0f, 40.3465f, 36.3465f, 41.0f, 35.5f, 41.0f)
                lineTo(12.5f, 41.0f)
                curveTo(11.6535f, 41.0f, 11.0f, 40.3465f, 11.0f, 39.5f)
                lineTo(11.0f, 20.5f)
                curveTo(11.0f, 19.6535f, 11.6535f, 19.0f, 12.5f, 19.0f)
                close()
                moveTo(17.0f, 28.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 32.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 28.0f)
                close()
                moveTo(24.0f, 28.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 24.0f, 32.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 24.0f, 28.0f)
                close()
                moveTo(31.0f, 28.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 31.0f, 32.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 31.0f, 28.0f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
