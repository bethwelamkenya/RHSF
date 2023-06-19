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

public val CustomIcon.VerifiedAccount: ImageVector
    get() {
        if (_verifiedAccount != null) {
            return _verifiedAccount!!
        }
        _verifiedAccount = Builder(name = "VerifiedAccount", defaultWidth = 480.0.dp, defaultHeight
                = 480.0.dp, viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFF4CAF50)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(440.0f, 240.0f)
                curveTo(440.0f, 210.91f, 423.469f, 185.52f, 399.34f, 172.699f)
                curveTo(405.93f, 147.59f, 399.512f, 119.672f, 379.91f, 100.078f)
                curveTo(365.281f, 85.441f, 346.0f, 78.16f, 326.699f, 78.16f)
                curveTo(320.172f, 78.16f, 313.641f, 78.988f, 307.289f, 80.66f)
                curveTo(294.48f, 56.531f, 269.09f, 40.0f, 240.0f, 40.0f)
                curveTo(210.91f, 40.0f, 185.52f, 56.531f, 172.699f, 80.66f)
                curveTo(166.34f, 78.988f, 159.82f, 78.16f, 153.289f, 78.16f)
                curveTo(133.988f, 78.16f, 114.719f, 85.449f, 100.078f, 100.078f)
                curveTo(80.488f, 119.672f, 74.059f, 147.578f, 80.648f, 172.699f)
                curveTo(56.531f, 185.52f, 40.0f, 210.91f, 40.0f, 240.0f)
                curveTo(40.0f, 269.09f, 56.531f, 294.48f, 80.66f, 307.301f)
                curveTo(74.07f, 332.41f, 80.488f, 360.328f, 100.09f, 379.922f)
                curveTo(114.719f, 394.551f, 134.0f, 401.84f, 153.301f, 401.84f)
                curveTo(159.828f, 401.84f, 166.359f, 401.012f, 172.711f, 399.34f)
                curveTo(185.52f, 423.469f, 210.91f, 440.0f, 240.0f, 440.0f)
                curveTo(269.09f, 440.0f, 294.48f, 423.469f, 307.301f, 399.34f)
                curveTo(313.66f, 401.012f, 320.18f, 401.84f, 326.711f, 401.84f)
                curveTo(346.012f, 401.84f, 365.281f, 394.551f, 379.922f, 379.922f)
                curveTo(399.512f, 360.328f, 405.941f, 332.422f, 399.352f, 307.301f)
                curveTo(423.469f, 294.48f, 440.0f, 269.09f, 440.0f, 240.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(220.0f, 328.289f)
                lineTo(145.859f, 254.141f)
                lineTo(174.141f, 225.859f)
                lineTo(220.0f, 271.711f)
                lineTo(315.859f, 175.859f)
                lineTo(344.141f, 204.141f)
                close()
            }
        }
        .build()
        return _verifiedAccount!!
    }

private var _verifiedAccount: ImageVector? = null
