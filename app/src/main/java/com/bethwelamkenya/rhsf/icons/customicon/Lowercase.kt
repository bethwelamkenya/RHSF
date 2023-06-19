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

public val CustomIcon.Lowercase: ImageVector
    get() {
        if (_lowercase != null) {
            return _lowercase!!
        }
        _lowercase = Builder(name = "Lowercase", defaultWidth = 480.0.dp, defaultHeight = 480.0.dp,
                viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFF9C27B0)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(280.0f, 120.0f)
                lineTo(180.0f, 120.0f)
                lineTo(180.0f, 420.0f)
                lineTo(110.0f, 420.0f)
                lineTo(110.0f, 120.0f)
                lineTo(10.0f, 120.0f)
                lineTo(10.0f, 60.0f)
                lineTo(280.0f, 60.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF9C27B0)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(470.0f, 240.0f)
                lineTo(400.0f, 240.0f)
                lineTo(400.0f, 420.0f)
                lineTo(350.0f, 420.0f)
                lineTo(350.0f, 240.0f)
                lineTo(280.0f, 240.0f)
                lineTo(280.0f, 190.0f)
                lineTo(470.0f, 190.0f)
                close()
            }
        }
        .build()
        return _lowercase!!
    }

private var _lowercase: ImageVector? = null
