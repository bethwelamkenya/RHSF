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

public val CustomIcon.FilledFilter: ImageVector
    get() {
        if (_filledFilter != null) {
            return _filledFilter!!
        }
        _filledFilter = Builder(name = "FilledFilter", defaultWidth = 480.0.dp, defaultHeight =
                480.0.dp, viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFFF57C00)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(290.0f, 230.0f)
                lineTo(190.0f, 230.0f)
                lineTo(70.0f, 90.0f)
                lineTo(410.0f, 90.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF9800)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(290.0f, 380.0f)
                lineTo(190.0f, 440.0f)
                lineTo(190.0f, 230.0f)
                lineTo(290.0f, 230.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF9800)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(415.0f, 90.0f)
                lineTo(65.0f, 90.0f)
                curveTo(57.0f, 90.0f, 50.0f, 83.0f, 50.0f, 75.0f)
                curveTo(50.0f, 67.0f, 57.0f, 60.0f, 65.0f, 60.0f)
                lineTo(415.0f, 60.0f)
                curveTo(423.0f, 60.0f, 430.0f, 67.0f, 430.0f, 75.0f)
                curveTo(430.0f, 83.0f, 423.0f, 90.0f, 415.0f, 90.0f)
                close()
            }
        }
        .build()
        return _filledFilter!!
    }

private var _filledFilter: ImageVector? = null
