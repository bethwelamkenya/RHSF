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

public val CustomIcon.Shutdown: ImageVector
    get() {
        if (_shutdown != null) {
            return _shutdown!!
        }
        _shutdown = Builder(name = "Shutdown", defaultWidth = 480.0.dp, defaultHeight = 480.0.dp,
                viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFFF44336)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(440.0f, 240.0f)
                curveTo(440.0f, 350.457f, 350.457f, 440.0f, 240.0f, 440.0f)
                curveTo(129.543f, 440.0f, 40.0f, 350.457f, 40.0f, 240.0f)
                curveTo(40.0f, 129.543f, 129.543f, 40.0f, 240.0f, 40.0f)
                curveTo(350.457f, 40.0f, 440.0f, 129.543f, 440.0f, 240.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFCDD2)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(330.398f, 146.691f)
                lineTo(304.051f, 176.809f)
                curveTo(320.078f, 193.059f, 330.0f, 215.371f, 330.0f, 240.0f)
                curveTo(330.0f, 289.711f, 289.711f, 330.0f, 240.0f, 330.0f)
                curveTo(190.289f, 330.0f, 150.0f, 289.711f, 150.0f, 240.0f)
                curveTo(150.0f, 215.359f, 159.922f, 193.051f, 175.961f, 176.801f)
                lineTo(149.609f, 146.68f)
                curveTo(125.219f, 170.32f, 110.0f, 203.359f, 110.0f, 240.0f)
                curveTo(110.0f, 311.801f, 168.199f, 370.0f, 240.0f, 370.0f)
                curveTo(311.801f, 370.0f, 370.0f, 311.801f, 370.0f, 240.0f)
                curveTo(370.0f, 203.359f, 354.789f, 170.32f, 330.398f, 146.691f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFCDD2)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(220.0f, 110.0f)
                lineTo(260.0f, 110.0f)
                lineTo(260.0f, 230.0f)
                lineTo(220.0f, 230.0f)
                close()
            }
        }
        .build()
        return _shutdown!!
    }

private var _shutdown: ImageVector? = null
