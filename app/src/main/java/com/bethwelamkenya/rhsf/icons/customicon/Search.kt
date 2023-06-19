package com.bethwelamkenya.rhsf.icons.customicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.bethwelamkenya.rhsf.icons.CustomIcon

public val CustomIcon.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 480.0.dp, defaultHeight = 480.0.dp,
                viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFF616161)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(291.809f, 319.898f)
                lineTo(320.09f, 291.613f)
                lineTo(440.297f, 411.82f)
                lineTo(412.016f, 440.105f)
                close()
            }
            path(fill = SolidColor(Color(0xFF616161)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(360.0f, 200.0f)
                curveTo(360.0f, 288.367f, 288.367f, 360.0f, 200.0f, 360.0f)
                curveTo(111.633f, 360.0f, 40.0f, 288.367f, 40.0f, 200.0f)
                curveTo(40.0f, 111.633f, 111.633f, 40.0f, 200.0f, 40.0f)
                curveTo(288.367f, 40.0f, 360.0f, 111.633f, 360.0f, 200.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF37474F)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(324.559f, 353.402f)
                lineTo(352.84f, 325.117f)
                lineTo(439.816f, 412.09f)
                lineTo(411.531f, 440.375f)
                close()
            }
            path(fill = SolidColor(Color(0xFF64B5F6)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(330.0f, 200.0f)
                curveTo(330.0f, 271.797f, 271.797f, 330.0f, 200.0f, 330.0f)
                curveTo(128.203f, 330.0f, 70.0f, 271.797f, 70.0f, 200.0f)
                curveTo(70.0f, 128.203f, 128.203f, 70.0f, 200.0f, 70.0f)
                curveTo(271.797f, 70.0f, 330.0f, 128.203f, 330.0f, 200.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBBDEFB)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(269.0f, 142.0f)
                curveTo(252.0f, 122.0f, 227.0f, 110.0f, 200.0f, 110.0f)
                curveTo(173.0f, 110.0f, 148.0f, 122.0f, 131.0f, 142.0f)
                curveTo(127.0f, 146.0f, 128.0f, 153.0f, 132.0f, 156.0f)
                curveTo(136.0f, 160.0f, 143.0f, 159.0f, 146.0f, 155.0f)
                curveTo(160.0f, 139.0f, 179.0f, 130.0f, 200.0f, 130.0f)
                curveTo(221.0f, 130.0f, 240.0f, 139.0f, 254.0f, 155.0f)
                curveTo(256.0f, 157.0f, 259.0f, 159.0f, 262.0f, 159.0f)
                curveTo(264.0f, 159.0f, 267.0f, 158.0f, 268.0f, 157.0f)
                curveTo(272.0f, 153.0f, 272.0f, 146.0f, 269.0f, 142.0f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
