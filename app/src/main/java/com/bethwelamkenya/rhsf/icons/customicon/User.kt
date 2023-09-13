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

public val CustomIcon.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 24.0f, 4.0f)
                close()
                moveTo(36.021f, 28.0f)
                horizontalLineTo(11.979f)
                curveTo(9.785f, 28.0f, 8.0f, 29.785f, 8.0f, 31.979f)
                verticalLineTo(33.5f)
                curveToRelative(0.0f, 3.312f, 1.885f, 6.176f, 5.307f, 8.063f)
                curveTo(16.154f, 43.135f, 19.952f, 44.0f, 24.0f, 44.0f)
                curveToRelative(7.706f, 0.0f, 16.0f, -3.286f, 16.0f, -10.5f)
                verticalLineToRelative(-1.521f)
                curveTo(40.0f, 29.785f, 38.215f, 28.0f, 36.021f, 28.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
