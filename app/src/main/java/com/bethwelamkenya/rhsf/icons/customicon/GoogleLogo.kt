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

public val CustomIcon.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) {
            return _googleLogo!!
        }
        _googleLogo = Builder(name = "GoogleLogo", defaultWidth = 480.0.dp, defaultHeight =
                480.0.dp, viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFFFFC107)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(436.109f, 200.828f)
                lineTo(420.0f, 200.828f)
                lineTo(420.0f, 200.0f)
                lineTo(240.0f, 200.0f)
                lineTo(240.0f, 280.0f)
                lineTo(353.031f, 280.0f)
                curveTo(336.539f, 326.57f, 292.23f, 360.0f, 240.0f, 360.0f)
                curveTo(173.73f, 360.0f, 120.0f, 306.27f, 120.0f, 240.0f)
                curveTo(120.0f, 173.73f, 173.73f, 120.0f, 240.0f, 120.0f)
                curveTo(270.59f, 120.0f, 298.422f, 131.539f, 319.609f, 150.391f)
                lineTo(376.18f, 93.82f)
                curveTo(340.461f, 60.531f, 292.68f, 40.0f, 240.0f, 40.0f)
                curveTo(129.551f, 40.0f, 40.0f, 129.551f, 40.0f, 240.0f)
                curveTo(40.0f, 350.449f, 129.551f, 440.0f, 240.0f, 440.0f)
                curveTo(350.449f, 440.0f, 440.0f, 350.449f, 440.0f, 240.0f)
                curveTo(440.0f, 226.59f, 438.621f, 213.5f, 436.109f, 200.828f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF3D00)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(63.059f, 146.91f)
                lineTo(128.77f, 195.102f)
                curveTo(146.551f, 151.078f, 189.609f, 120.0f, 240.0f, 120.0f)
                curveTo(270.59f, 120.0f, 298.422f, 131.539f, 319.609f, 150.391f)
                lineTo(376.18f, 93.82f)
                curveTo(340.461f, 60.531f, 292.68f, 40.0f, 240.0f, 40.0f)
                curveTo(163.18f, 40.0f, 96.559f, 83.371f, 63.059f, 146.91f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4CAF50)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 440.0f)
                curveTo(291.66f, 440.0f, 338.602f, 420.23f, 374.09f, 388.078f)
                lineTo(312.191f, 335.699f)
                curveTo(292.109f, 350.91f, 267.148f, 360.0f, 240.0f, 360.0f)
                curveTo(187.98f, 360.0f, 143.809f, 326.828f, 127.172f, 280.539f)
                lineTo(61.949f, 330.789f)
                curveTo(95.051f, 395.559f, 162.27f, 440.0f, 240.0f, 440.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1976D2)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(436.109f, 200.828f)
                lineTo(420.0f, 200.828f)
                lineTo(420.0f, 200.0f)
                lineTo(240.0f, 200.0f)
                lineTo(240.0f, 280.0f)
                lineTo(353.031f, 280.0f)
                curveTo(345.109f, 302.371f, 330.719f, 321.66f, 312.16f, 335.711f)
                curveTo(312.172f, 335.699f, 312.18f, 335.699f, 312.191f, 335.691f)
                lineTo(374.09f, 388.07f)
                curveTo(369.711f, 392.051f, 440.0f, 340.0f, 440.0f, 240.0f)
                curveTo(440.0f, 226.59f, 438.621f, 213.5f, 436.109f, 200.828f)
                close()
            }
        }
        .build()
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
