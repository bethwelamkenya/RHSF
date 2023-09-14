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

public val CustomIcon.Group: ImageVector
    get() {
        if (_group != null) {
            return _group!!
        }
        _group = Builder(name = "Group", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(12.1518f, 5.0f, 9.0f, 8.1518f, 9.0f, 12.0f)
                curveTo(9.0f, 15.8482f, 12.1518f, 19.0f, 16.0f, 19.0f)
                curveTo(19.8482f, 19.0f, 23.0f, 15.8482f, 23.0f, 12.0f)
                curveTo(23.0f, 8.1518f, 19.8482f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(32.0f, 5.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 32.0f, 19.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 32.0f, 5.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(18.2269f, 8.0f, 20.0f, 9.7731f, 20.0f, 12.0f)
                curveTo(20.0f, 14.2269f, 18.2269f, 16.0f, 16.0f, 16.0f)
                curveTo(13.7731f, 16.0f, 12.0f, 14.2269f, 12.0f, 12.0f)
                curveTo(12.0f, 9.7731f, 13.7731f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(9.5f, 21.0f)
                curveTo(7.57f, 21.0f, 6.0f, 22.57f, 6.0f, 24.5f)
                lineTo(6.0f, 32.0f)
                curveTo(6.0f, 37.514f, 10.486f, 42.0f, 16.0f, 42.0f)
                curveTo(18.133f, 42.0f, 20.1074f, 41.3227f, 21.7324f, 40.1797f)
                curveTo(21.2044f, 39.3057f, 20.7813f, 38.3633f, 20.4883f, 37.3633f)
                curveTo(19.2713f, 38.3833f, 17.707f, 39.0f, 16.0f, 39.0f)
                curveTo(12.141f, 39.0f, 9.0f, 35.859f, 9.0f, 32.0f)
                lineTo(9.0f, 24.5f)
                curveTo(9.0f, 24.225f, 9.225f, 24.0f, 9.5f, 24.0f)
                lineTo(20.0254f, 24.0f)
                curveTo(20.1284f, 22.867f, 20.5737f, 21.831f, 21.2617f, 21.0f)
                lineTo(9.5f, 21.0f)
                close()
                moveTo(25.5f, 21.0f)
                curveTo(23.57f, 21.0f, 22.0f, 22.57f, 22.0f, 24.5f)
                lineTo(22.0f, 34.0f)
                curveTo(22.0f, 39.514f, 26.486f, 44.0f, 32.0f, 44.0f)
                curveTo(37.514f, 44.0f, 42.0f, 39.514f, 42.0f, 34.0f)
                lineTo(42.0f, 24.5f)
                curveTo(42.0f, 22.57f, 40.43f, 21.0f, 38.5f, 21.0f)
                lineTo(25.5f, 21.0f)
                close()
            }
        }
        .build()
        return _group!!
    }

private var _group: ImageVector? = null
