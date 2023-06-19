package com.bethwelamkenya.rhsf.icons.customicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.bethwelamkenya.rhsf.icons.CustomIcon

public val CustomIcon.Left4: ImageVector
    get() {
        if (_left4 != null) {
            return _left4!!
        }
        _left4 = Builder(name = "Left4", defaultWidth = 480.0.dp, defaultHeight = 480.0.dp,
                viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFF2196F3)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(309.0f, 430.0f)
                lineTo(340.0f, 399.0f)
                lineTo(181.0f, 240.0f)
                lineTo(340.0f, 81.0f)
                lineTo(309.0f, 50.0f)
                lineTo(120.0f, 240.0f)
                close()
            }
        }
        .build()
        return _left4!!
    }

private var _left4: ImageVector? = null
