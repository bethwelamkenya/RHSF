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

public val CustomIcon.Checkmark: ImageVector
    get() {
        if (_checkmark != null) {
            return _checkmark!!
        }
        _checkmark = Builder(name = "Checkmark", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveTo(12.972f, 4.0f, 4.0f, 12.972f, 4.0f, 24.0f)
                curveTo(4.0f, 35.028f, 12.972f, 44.0f, 24.0f, 44.0f)
                curveTo(35.028f, 44.0f, 44.0f, 35.028f, 44.0f, 24.0f)
                curveTo(44.0f, 20.791f, 43.222f, 17.7672f, 41.873f, 15.0762f)
                lineTo(39.6289f, 17.3203f)
                curveTo(40.5089f, 19.3713f, 41.0f, 21.629f, 41.0f, 24.0f)
                curveTo(41.0f, 33.374f, 33.374f, 41.0f, 24.0f, 41.0f)
                curveTo(14.626f, 41.0f, 7.0f, 33.374f, 7.0f, 24.0f)
                curveTo(7.0f, 14.626f, 14.626f, 7.0f, 24.0f, 7.0f)
                curveTo(28.446f, 7.0f, 32.4856f, 8.7292f, 35.5176f, 11.5332f)
                lineTo(37.6387f, 9.4121f)
                curveTo(34.0617f, 6.0651f, 29.273f, 4.0f, 24.0f, 4.0f)
                close()
                moveTo(39.4707f, 10.9863f)
                arcTo(1.5001f, 1.5001f, 0.0f, false, false, 38.4395f, 11.4395f)
                lineTo(21.5f, 28.3789f)
                lineTo(17.5605f, 24.4395f)
                arcTo(1.5001f, 1.5001f, 0.0f, true, false, 15.4395f, 26.5605f)
                lineTo(20.4395f, 31.5605f)
                arcTo(1.5001f, 1.5001f, 0.0f, false, false, 22.5605f, 31.5605f)
                lineTo(40.5605f, 13.5605f)
                arcTo(1.5001f, 1.5001f, 0.0f, false, false, 39.4707f, 10.9863f)
                close()
            }
        }
        .build()
        return _checkmark!!
    }

private var _checkmark: ImageVector? = null
