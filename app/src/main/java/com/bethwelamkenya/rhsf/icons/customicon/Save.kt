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

public val CustomIcon.Save: ImageVector
    get() {
        if (_save != null) {
            return _save!!
        }
        _save = Builder(name = "Save", defaultWidth = 480.0.dp, defaultHeight = 480.0.dp,
                viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFF3498DB)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(420.0f, 420.0f)
                lineTo(60.0f, 420.0f)
                lineTo(60.0f, 60.0f)
                lineTo(370.0f, 60.0f)
                lineTo(420.0f, 110.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(390.0f, 390.0f)
                curveTo(390.0f, 395.531f, 385.531f, 400.0f, 380.0f, 400.0f)
                lineTo(100.0f, 400.0f)
                curveTo(94.469f, 400.0f, 90.0f, 395.531f, 90.0f, 390.0f)
                lineTo(90.0f, 250.0f)
                curveTo(90.0f, 244.469f, 94.469f, 240.0f, 100.0f, 240.0f)
                lineTo(380.0f, 240.0f)
                curveTo(385.531f, 240.0f, 390.0f, 244.469f, 390.0f, 250.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFCFD8DC)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(130.0f, 310.0f)
                lineTo(350.0f, 310.0f)
                lineTo(350.0f, 330.0f)
                lineTo(130.0f, 330.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFCFD8DC)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(130.0f, 270.0f)
                lineTo(350.0f, 270.0f)
                lineTo(350.0f, 290.0f)
                lineTo(130.0f, 290.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFCFD8DC)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(130.0f, 350.0f)
                lineTo(350.0f, 350.0f)
                lineTo(350.0f, 370.0f)
                lineTo(130.0f, 370.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2980B9)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(90.0f, 60.0f)
                lineTo(90.0f, 160.0f)
                curveTo(90.0f, 171.039f, 98.961f, 180.0f, 110.0f, 180.0f)
                lineTo(260.0f, 180.0f)
                curveTo(271.039f, 180.0f, 280.0f, 171.039f, 280.0f, 160.0f)
                lineTo(280.0f, 60.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB0BEC5)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(150.0f, 60.0f)
                lineTo(150.0f, 160.0f)
                curveTo(150.0f, 171.039f, 158.961f, 180.0f, 170.0f, 180.0f)
                lineTo(320.0f, 180.0f)
                curveTo(331.039f, 180.0f, 340.0f, 171.039f, 340.0f, 160.0f)
                lineTo(340.0f, 60.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF263238)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(260.0f, 80.0f)
                lineTo(300.0f, 80.0f)
                lineTo(300.0f, 160.0f)
                lineTo(260.0f, 160.0f)
                close()
            }
        }
        .build()
        return _save!!
    }

private var _save: ImageVector? = null
