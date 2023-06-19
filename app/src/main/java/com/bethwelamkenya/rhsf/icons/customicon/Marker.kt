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

public val CustomIcon.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 480.0.dp, defaultHeight = 480.0.dp,
                viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFFFF3D00)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 10.0f)
                curveTo(152.0f, 10.0f, 60.148f, 79.879f, 60.0f, 180.0f)
                curveTo(59.82f, 299.809f, 240.0f, 480.0f, 240.0f, 480.0f)
                curveTo(240.0f, 480.0f, 420.191f, 300.059f, 420.0f, 180.0f)
                curveTo(419.84f, 80.031f, 328.0f, 10.0f, 240.0f, 10.0f)
                close()
                moveTo(240.0f, 260.0f)
                curveTo(195.82f, 260.0f, 160.0f, 224.18f, 160.0f, 180.0f)
                curveTo(160.0f, 135.82f, 195.82f, 100.0f, 240.0f, 100.0f)
                curveTo(284.18f, 100.0f, 320.0f, 135.82f, 320.0f, 180.0f)
                curveTo(320.0f, 224.18f, 284.18f, 260.0f, 240.0f, 260.0f)
                close()
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
