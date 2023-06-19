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

public val CustomIcon.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 480.0.dp, defaultHeight = 480.0.dp,
                viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFF424242)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 40.0f)
                curveTo(184.859f, 40.0f, 140.0f, 84.859f, 140.0f, 140.0f)
                lineTo(140.0f, 180.0f)
                lineTo(180.0f, 180.0f)
                lineTo(180.0f, 140.0f)
                curveTo(180.0f, 106.91f, 206.91f, 80.0f, 240.0f, 80.0f)
                curveTo(273.09f, 80.0f, 300.0f, 106.91f, 300.0f, 140.0f)
                lineTo(300.0f, 180.0f)
                lineTo(340.0f, 180.0f)
                lineTo(340.0f, 140.0f)
                curveTo(340.0f, 84.859f, 295.141f, 40.0f, 240.0f, 40.0f)
            }
            path(fill = SolidColor(Color(0xFF8BC34A)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(370.0f, 440.0f)
                lineTo(110.0f, 440.0f)
                curveTo(87.91f, 440.0f, 70.0f, 422.09f, 70.0f, 400.0f)
                lineTo(70.0f, 220.0f)
                curveTo(70.0f, 197.91f, 87.91f, 180.0f, 110.0f, 180.0f)
                lineTo(370.0f, 180.0f)
                curveTo(392.09f, 180.0f, 410.0f, 197.91f, 410.0f, 220.0f)
                lineTo(410.0f, 400.0f)
                curveTo(410.0f, 422.09f, 392.09f, 440.0f, 370.0f, 440.0f)
            }
            path(fill = SolidColor(Color(0xFFF1F8E9)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(170.0f, 310.0f)
                curveTo(170.0f, 326.57f, 156.57f, 340.0f, 140.0f, 340.0f)
                curveTo(123.43f, 340.0f, 110.0f, 326.57f, 110.0f, 310.0f)
                curveTo(110.0f, 293.43f, 123.43f, 280.0f, 140.0f, 280.0f)
                curveTo(156.57f, 280.0f, 170.0f, 293.43f, 170.0f, 310.0f)
            }
            path(fill = SolidColor(Color(0xFFF1F8E9)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(370.0f, 310.0f)
                curveTo(370.0f, 326.57f, 356.57f, 340.0f, 340.0f, 340.0f)
                curveTo(323.43f, 340.0f, 310.0f, 326.57f, 310.0f, 310.0f)
                curveTo(310.0f, 293.43f, 323.43f, 280.0f, 340.0f, 280.0f)
                curveTo(356.57f, 280.0f, 370.0f, 293.43f, 370.0f, 310.0f)
            }
            path(fill = SolidColor(Color(0xFFF1F8E9)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(270.0f, 310.0f)
                curveTo(270.0f, 326.57f, 256.57f, 340.0f, 240.0f, 340.0f)
                curveTo(223.43f, 340.0f, 210.0f, 326.57f, 210.0f, 310.0f)
                curveTo(210.0f, 293.43f, 223.43f, 280.0f, 240.0f, 280.0f)
                curveTo(256.57f, 280.0f, 270.0f, 293.43f, 270.0f, 310.0f)
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
