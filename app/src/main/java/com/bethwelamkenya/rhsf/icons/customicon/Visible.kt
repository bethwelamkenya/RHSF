package com.bethwelamkenya.rhsf.icons.customicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.bethwelamkenya.rhsf.icons.CustomIcon

public val CustomIcon.Visible: ImageVector
    get() {
        if (_visible != null) {
            return _visible!!
        }
        _visible = Builder(name = "Visible", defaultWidth = 480.0.dp, defaultHeight = 480.0.dp,
                viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(59.301f, 250.41f)
                curveTo(59.301f, 250.41f, 139.898f, 140.0f, 239.34f, 140.0f)
                curveTo(338.781f, 140.0f, 419.301f, 250.41f, 419.301f, 250.41f)
                curveTo(419.301f, 250.41f, 338.789f, 360.0f, 239.34f, 360.0f)
                curveTo(139.891f, 360.0f, 59.301f, 250.41f, 59.301f, 250.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFFCFD8DC)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(239.34f, 140.0f)
                curveTo(338.789f, 140.0f, 419.301f, 250.41f, 419.301f, 250.41f)
                curveTo(419.301f, 250.41f, 338.789f, 360.0f, 239.34f, 360.0f)
                curveTo(139.891f, 360.0f, 59.301f, 250.41f, 59.301f, 250.41f)
                curveTo(59.301f, 250.41f, 139.891f, 140.0f, 239.34f, 140.0f)
                moveTo(239.34f, 120.0f)
                curveTo(130.98f, 120.0f, 46.68f, 233.77f, 43.141f, 238.621f)
                lineTo(34.5f, 250.461f)
                lineTo(43.18f, 262.262f)
                curveTo(46.719f, 267.07f, 131.02f, 380.0f, 239.34f, 380.0f)
                curveTo(347.672f, 380.0f, 431.879f, 267.059f, 435.41f, 262.262f)
                lineTo(444.078f, 250.461f)
                lineTo(435.461f, 238.629f)
                curveTo(431.922f, 233.781f, 347.711f, 120.0f, 239.34f, 120.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF00ACC1)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(149.352f, 249.941f)
                curveTo(149.352f, 200.23f, 189.691f, 160.0f, 239.352f, 160.0f)
                curveTo(289.031f, 160.0f, 329.352f, 200.23f, 329.352f, 249.941f)
                curveTo(329.352f, 299.711f, 289.031f, 340.0f, 239.352f, 340.0f)
                curveTo(189.68f, 340.0f, 149.352f, 299.711f, 149.352f, 249.941f)
                close()
            }
            path(fill = SolidColor(Color(0xFF006064)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(199.352f, 249.988f)
                curveTo(199.352f, 227.859f, 217.211f, 210.0f, 239.352f, 210.0f)
                curveTo(261.391f, 210.0f, 279.352f, 227.859f, 279.352f, 249.988f)
                curveTo(279.352f, 272.191f, 261.391f, 290.0f, 239.352f, 290.0f)
                curveTo(217.211f, 290.0f, 199.352f, 272.191f, 199.352f, 249.988f)
                close()
            }
            path(fill = SolidColor(Color(0xFF90A4AE)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(59.59f, 250.0f)
                curveTo(64.828f, 243.0f, 143.281f, 140.398f, 239.34f, 140.398f)
                curveTo(335.391f, 140.398f, 413.762f, 242.988f, 419.0f, 249.988f)
                lineTo(468.57f, 250.0f)
                lineTo(451.578f, 226.781f)
                curveTo(447.789f, 221.609f, 357.711f, 100.398f, 239.34f, 100.398f)
                curveTo(120.969f, 100.398f, 30.809f, 221.602f, 27.031f, 226.762f)
                lineTo(10.0f, 250.0f)
                close()
            }
        }
        .build()
        return _visible!!
    }

private var _visible: ImageVector? = null
