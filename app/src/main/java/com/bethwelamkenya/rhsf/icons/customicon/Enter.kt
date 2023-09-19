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

public val CustomIcon.Enter: ImageVector
    get() {
        if (_enter != null) {
            return _enter!!
        }
        _enter = Builder(name = "Enter", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 6.0f)
                curveTo(15.4802f, 6.0f, 13.0f, 8.4802f, 13.0f, 11.5f)
                lineTo(13.0f, 17.5f)
                arcTo(1.5001f, 1.5001f, 0.0f, true, false, 16.0f, 17.5f)
                lineTo(16.0f, 11.5f)
                curveTo(16.0f, 10.1018f, 17.1018f, 9.0f, 18.5f, 9.0f)
                lineTo(36.5f, 9.0f)
                curveTo(37.8982f, 9.0f, 39.0f, 10.1018f, 39.0f, 11.5f)
                lineTo(39.0f, 36.5f)
                curveTo(39.0f, 37.8982f, 37.8982f, 39.0f, 36.5f, 39.0f)
                lineTo(18.5f, 39.0f)
                curveTo(17.1018f, 39.0f, 16.0f, 37.8982f, 16.0f, 36.5f)
                lineTo(16.0f, 30.5195f)
                arcTo(1.5001f, 1.5001f, 0.0f, true, false, 13.0f, 30.5195f)
                lineTo(13.0f, 36.5f)
                curveTo(13.0f, 39.5198f, 15.4802f, 42.0f, 18.5f, 42.0f)
                lineTo(36.5f, 42.0f)
                curveTo(39.5198f, 42.0f, 42.0f, 39.5198f, 42.0f, 36.5f)
                lineTo(42.0f, 11.5f)
                curveTo(42.0f, 8.4802f, 39.5198f, 6.0f, 36.5f, 6.0f)
                lineTo(18.5f, 6.0f)
                close()
                moveTo(24.4844f, 16.5039f)
                arcTo(1.5001f, 1.5001f, 0.0f, false, false, 23.4395f, 19.0801f)
                lineTo(26.877f, 22.5176f)
                lineTo(7.502f, 22.5f)
                arcTo(1.5001f, 1.5001f, 0.0f, true, false, 7.498f, 25.5f)
                lineTo(26.8809f, 25.5176f)
                lineTo(23.4395f, 28.959f)
                arcTo(1.5001f, 1.5001f, 0.0f, true, false, 25.5605f, 31.0801f)
                lineTo(31.5605f, 25.0801f)
                arcTo(1.5001f, 1.5001f, 0.0f, false, false, 31.5605f, 22.959f)
                lineTo(25.5605f, 16.959f)
                arcTo(1.5001f, 1.5001f, 0.0f, false, false, 24.4844f, 16.5039f)
                close()
            }
        }
        .build()
        return _enter!!
    }

private var _enter: ImageVector? = null
