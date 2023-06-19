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

public val CustomIcon.HomeFilled: ImageVector
    get() {
        if (_homeFilled != null) {
            return _homeFilled!!
        }
        _homeFilled = Builder(name = "HomeFilled", defaultWidth = 50.0.dp, defaultHeight = 50.0.dp,
                viewportWidth = 50.0f, viewportHeight = 50.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.8008f, 1.043f)
                curveTo(24.5859f, 1.043f, 24.3711f, 1.1133f, 24.1836f, 1.2461f)
                lineTo(1.3711f, 19.0586f)
                curveTo(0.9414f, 19.3945f, 0.8633f, 20.0195f, 1.2031f, 20.457f)
                curveTo(1.5391f, 20.8828f, 2.1641f, 20.9609f, 2.5977f, 20.625f)
                lineTo(3.9688f, 19.5547f)
                lineTo(3.9688f, 45.6367f)
                curveTo(3.9688f, 46.1797f, 4.4141f, 46.6289f, 4.9609f, 46.6289f)
                lineTo(18.8477f, 46.6289f)
                lineTo(18.8477f, 28.7695f)
                lineTo(30.7539f, 28.7695f)
                lineTo(30.7539f, 46.6289f)
                lineTo(44.6445f, 46.6289f)
                curveTo(45.1875f, 46.6289f, 45.6367f, 46.1797f, 45.6367f, 45.6367f)
                lineTo(45.6367f, 19.5547f)
                lineTo(47.0039f, 20.625f)
                curveTo(47.1914f, 20.7617f, 47.4023f, 20.832f, 47.6172f, 20.832f)
                curveTo(47.918f, 20.832f, 48.2031f, 20.707f, 48.4023f, 20.457f)
                curveTo(48.7383f, 20.0195f, 48.6602f, 19.3945f, 48.2344f, 19.0586f)
                lineTo(25.418f, 1.2461f)
                curveTo(25.2305f, 1.1133f, 25.0195f, 1.043f, 24.8008f, 1.043f)
                close()
                moveTo(34.7227f, 4.9609f)
                lineTo(34.7227f, 6.0039f)
                lineTo(40.6758f, 10.6445f)
                lineTo(40.6758f, 4.9609f)
                close()
            }
        }
        .build()
        return _homeFilled!!
    }

private var _homeFilled: ImageVector? = null
