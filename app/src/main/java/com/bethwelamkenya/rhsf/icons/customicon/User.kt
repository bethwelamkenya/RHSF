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
                curveTo(18.4949f, 4.0f, 14.0f, 8.4949f, 14.0f, 14.0f)
                curveTo(14.0f, 19.5051f, 18.4949f, 24.0f, 24.0f, 24.0f)
                curveTo(29.5051f, 24.0f, 34.0f, 19.5051f, 34.0f, 14.0f)
                curveTo(34.0f, 8.4949f, 29.5051f, 4.0f, 24.0f, 4.0f)
                close()
                moveTo(24.0f, 7.0f)
                curveTo(27.8838f, 7.0f, 31.0f, 10.1162f, 31.0f, 14.0f)
                curveTo(31.0f, 17.8838f, 27.8838f, 21.0f, 24.0f, 21.0f)
                curveTo(20.1162f, 21.0f, 17.0f, 17.8838f, 17.0f, 14.0f)
                curveTo(17.0f, 10.1162f, 20.1162f, 7.0f, 24.0f, 7.0f)
                close()
                moveTo(11.9785f, 28.0f)
                curveTo(9.7987f, 28.0f, 8.0f, 29.7987f, 8.0f, 31.9785f)
                lineTo(8.0f, 33.5f)
                curveTo(8.0f, 37.1042f, 10.2793f, 39.8922f, 13.3066f, 41.5625f)
                curveTo(16.334f, 43.2328f, 20.1681f, 44.0f, 24.0f, 44.0f)
                curveTo(27.8319f, 44.0f, 31.666f, 43.2328f, 34.6934f, 41.5625f)
                curveTo(37.2746f, 40.1383f, 39.2173f, 37.8626f, 39.7617f, 35.0f)
                lineTo(40.002f, 35.0f)
                lineTo(40.002f, 31.9785f)
                curveTo(40.002f, 29.7987f, 38.2013f, 28.0f, 36.0215f, 28.0f)
                lineTo(11.9785f, 28.0f)
                close()
                moveTo(11.9785f, 31.0f)
                lineTo(36.0215f, 31.0f)
                curveTo(36.5797f, 31.0f, 37.002f, 31.4203f, 37.002f, 31.9785f)
                lineTo(37.002f, 32.0f)
                lineTo(37.0f, 32.0f)
                lineTo(37.0f, 33.5f)
                curveTo(37.0f, 35.8958f, 35.6543f, 37.6078f, 33.2441f, 38.9375f)
                curveTo(30.834f, 40.2672f, 27.4181f, 41.0f, 24.0f, 41.0f)
                curveTo(20.5819f, 41.0f, 17.166f, 40.2672f, 14.7559f, 38.9375f)
                curveTo(12.3457f, 37.6078f, 11.0f, 35.8958f, 11.0f, 33.5f)
                lineTo(11.0f, 31.9785f)
                curveTo(11.0f, 31.4203f, 11.4203f, 31.0f, 11.9785f, 31.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
