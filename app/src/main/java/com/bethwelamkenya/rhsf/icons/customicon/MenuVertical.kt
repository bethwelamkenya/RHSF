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

public val CustomIcon.MenuVertical: ImageVector
    get() {
        if (_menuVertical != null) {
            return _menuVertical!!
        }
        _menuVertical = Builder(name = "MenuVertical", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 33.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 24.0f, 39.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 24.0f, 33.0f)
                close()
                moveTo(24.0f, 21.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 24.0f, 27.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 24.0f, 21.0f)
                close()
                moveTo(24.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 24.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 24.0f, 9.0f)
                close()
            }
        }
        .build()
        return _menuVertical!!
    }

private var _menuVertical: ImageVector? = null
