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

public val CustomIcon.Exit: ImageVector
    get() {
        if (_exit != null) {
            return _exit!!
        }
        _exit = Builder(name = "Exit", defaultWidth = 480.0.dp, defaultHeight = 480.0.dp,
                viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFFBBDEFB)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(370.0f, 410.0f)
                curveTo(370.0f, 432.09f, 352.09f, 450.0f, 330.0f, 450.0f)
                lineTo(100.0f, 450.0f)
                curveTo(77.91f, 450.0f, 60.0f, 432.09f, 60.0f, 410.0f)
                lineTo(60.0f, 70.0f)
                curveTo(60.0f, 47.91f, 77.91f, 30.0f, 100.0f, 30.0f)
                lineTo(330.0f, 30.0f)
                curveTo(352.09f, 30.0f, 370.0f, 47.91f, 370.0f, 70.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3F51B5)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(410.0f, 240.0f)
                lineTo(290.0f, 340.0f)
                lineTo(290.0f, 140.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3F51B5)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(140.0f, 210.0f)
                lineTo(310.0f, 210.0f)
                lineTo(310.0f, 270.0f)
                lineTo(140.0f, 270.0f)
                close()
            }
        }
        .build()
        return _exit!!
    }

private var _exit: ImageVector? = null
