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

public val CustomIcon.Collapse: ImageVector
    get() {
        if (_collapse != null) {
            return _collapse!!
        }
        _collapse = Builder(name = "Collapse", defaultWidth = 480.0.dp, defaultHeight = 480.0.dp,
                viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFF2196F3)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(50.0f, 309.0f)
                lineTo(81.0f, 340.0f)
                lineTo(240.0f, 181.0f)
                lineTo(399.0f, 340.0f)
                lineTo(430.0f, 309.0f)
                lineTo(240.0f, 120.0f)
                close()
            }
        }
        .build()
        return _collapse!!
    }

private var _collapse: ImageVector? = null
