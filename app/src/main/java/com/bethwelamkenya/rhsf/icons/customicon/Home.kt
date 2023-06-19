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

public val CustomIcon.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 480.0.dp, defaultHeight = 480.0.dp,
                viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFFE8EAF6)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(420.0f, 390.0f)
                lineTo(60.0f, 390.0f)
                lineTo(60.0f, 230.0f)
                lineTo(240.0f, 60.0f)
                lineTo(420.0f, 230.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC5CAE9)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(390.0f, 210.0f)
                lineTo(340.0f, 160.0f)
                lineTo(340.0f, 90.0f)
                lineTo(390.0f, 90.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC5CAE9)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(60.0f, 390.0f)
                lineTo(420.0f, 390.0f)
                lineTo(420.0f, 440.0f)
                lineTo(60.0f, 440.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB71C1C)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 43.0f)
                lineTo(40.0f, 229.0f)
                lineTo(60.0f, 251.0f)
                lineTo(240.0f, 84.0f)
                lineTo(420.0f, 251.0f)
                lineTo(440.0f, 229.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD84315)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(180.0f, 280.0f)
                lineTo(300.0f, 280.0f)
                lineTo(300.0f, 440.0f)
                lineTo(180.0f, 440.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF01579B)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(210.0f, 170.0f)
                lineTo(270.0f, 170.0f)
                lineTo(270.0f, 230.0f)
                lineTo(210.0f, 230.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF8A65)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(275.0f, 355.0f)
                curveTo(272.0f, 355.0f, 270.0f, 357.0f, 270.0f, 360.0f)
                lineTo(270.0f, 380.0f)
                curveTo(270.0f, 383.0f, 272.0f, 385.0f, 275.0f, 385.0f)
                curveTo(278.0f, 385.0f, 280.0f, 383.0f, 280.0f, 380.0f)
                lineTo(280.0f, 360.0f)
                curveTo(280.0f, 357.0f, 278.0f, 355.0f, 275.0f, 355.0f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
