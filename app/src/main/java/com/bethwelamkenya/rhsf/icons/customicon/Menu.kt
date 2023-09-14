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

public val CustomIcon.Menu: ImageVector
    get() {
        if (_menu != null) {
            return _menu!!
        }
        _menu = Builder(name = "Menu", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 9.0f)
                arcTo(1.5001f, 1.5001f, 0.0f, true, false, 5.5f, 12.0f)
                lineTo(42.5f, 12.0f)
                arcTo(1.5001f, 1.5001f, 0.0f, true, false, 42.5f, 9.0f)
                lineTo(5.5f, 9.0f)
                close()
                moveTo(5.5f, 22.5f)
                arcTo(1.5001f, 1.5001f, 0.0f, true, false, 5.5f, 25.5f)
                lineTo(42.5f, 25.5f)
                arcTo(1.5001f, 1.5001f, 0.0f, true, false, 42.5f, 22.5f)
                lineTo(5.5f, 22.5f)
                close()
                moveTo(5.5f, 36.0f)
                arcTo(1.5001f, 1.5001f, 0.0f, true, false, 5.5f, 39.0f)
                lineTo(42.5f, 39.0f)
                arcTo(1.5001f, 1.5001f, 0.0f, true, false, 42.5f, 36.0f)
                lineTo(5.5f, 36.0f)
                close()
            }
        }
        .build()
        return _menu!!
    }

private var _menu: ImageVector? = null
