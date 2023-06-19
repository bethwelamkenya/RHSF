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

public val CustomIcon.MediumIcons: ImageVector
    get() {
        if (_mediumIcons != null) {
            return _mediumIcons!!
        }
        _mediumIcons = Builder(name = "MediumIcons", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.8984f, 3.0f, 3.0f, 3.8984f, 3.0f, 5.0f)
                lineTo(3.0f, 9.0f)
                curveTo(3.0f, 10.1016f, 3.8984f, 11.0f, 5.0f, 11.0f)
                lineTo(9.0f, 11.0f)
                curveTo(10.1016f, 11.0f, 11.0f, 10.1016f, 11.0f, 9.0f)
                lineTo(11.0f, 5.0f)
                curveTo(11.0f, 3.8984f, 10.1016f, 3.0f, 9.0f, 3.0f)
                close()
                moveTo(15.0f, 3.0f)
                curveTo(13.8984f, 3.0f, 13.0f, 3.8984f, 13.0f, 5.0f)
                lineTo(13.0f, 9.0f)
                curveTo(13.0f, 10.1016f, 13.8984f, 11.0f, 15.0f, 11.0f)
                lineTo(19.0f, 11.0f)
                curveTo(20.1016f, 11.0f, 21.0f, 10.1016f, 21.0f, 9.0f)
                lineTo(21.0f, 5.0f)
                curveTo(21.0f, 3.8984f, 20.1016f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(6.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                close()
                moveTo(17.0f, 6.0f)
                curveTo(17.5508f, 6.0f, 18.0f, 6.4492f, 18.0f, 7.0f)
                curveTo(18.0f, 7.5508f, 17.5508f, 8.0f, 17.0f, 8.0f)
                curveTo(16.4492f, 8.0f, 16.0f, 7.5508f, 16.0f, 7.0f)
                curveTo(16.0f, 6.4492f, 16.4492f, 6.0f, 17.0f, 6.0f)
                close()
                moveTo(5.0f, 13.0f)
                curveTo(3.8984f, 13.0f, 3.0f, 13.8984f, 3.0f, 15.0f)
                lineTo(3.0f, 19.0f)
                curveTo(3.0f, 20.1016f, 3.8984f, 21.0f, 5.0f, 21.0f)
                lineTo(9.0f, 21.0f)
                curveTo(10.1016f, 21.0f, 11.0f, 20.1016f, 11.0f, 19.0f)
                lineTo(11.0f, 15.0f)
                curveTo(11.0f, 13.8984f, 10.1016f, 13.0f, 9.0f, 13.0f)
                close()
                moveTo(15.0f, 13.0f)
                curveTo(13.8984f, 13.0f, 13.0f, 13.8984f, 13.0f, 15.0f)
                lineTo(13.0f, 19.0f)
                curveTo(13.0f, 20.1016f, 13.8984f, 21.0f, 15.0f, 21.0f)
                lineTo(19.0f, 21.0f)
                curveTo(20.1016f, 21.0f, 21.0f, 20.1016f, 21.0f, 19.0f)
                lineTo(21.0f, 15.0f)
                curveTo(21.0f, 13.8984f, 20.1016f, 13.0f, 19.0f, 13.0f)
                close()
                moveTo(7.0f, 16.0f)
                curveTo(7.5508f, 16.0f, 8.0f, 16.4492f, 8.0f, 17.0f)
                curveTo(8.0f, 17.5508f, 7.5508f, 18.0f, 7.0f, 18.0f)
                curveTo(6.4492f, 18.0f, 6.0f, 17.5508f, 6.0f, 17.0f)
                curveTo(6.0f, 16.4492f, 6.4492f, 16.0f, 7.0f, 16.0f)
                close()
                moveTo(16.0f, 16.0f)
                lineTo(18.0f, 16.0f)
                lineTo(18.0f, 18.0f)
                lineTo(16.0f, 18.0f)
                close()
            }
        }
        .build()
        return _mediumIcons!!
    }

private var _mediumIcons: ImageVector? = null
