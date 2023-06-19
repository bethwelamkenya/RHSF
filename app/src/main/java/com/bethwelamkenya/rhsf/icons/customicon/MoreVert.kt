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

public val CustomIcon.MoreVert: ImageVector
    get() {
        if (_moreVert != null) {
            return _moreVert!!
        }
        _moreVert = Builder(name = "MoreVert", defaultWidth = 480.0.dp, defaultHeight = 480.0.dp,
                viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFF607D8B)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(290.0f, 70.0f)
                curveTo(290.0f, 98.0f, 268.0f, 120.0f, 240.0f, 120.0f)
                curveTo(212.0f, 120.0f, 190.0f, 98.0f, 190.0f, 70.0f)
                curveTo(190.0f, 42.0f, 212.0f, 20.0f, 240.0f, 20.0f)
                curveTo(268.0f, 20.0f, 290.0f, 42.0f, 290.0f, 70.0f)
                close()
                moveTo(240.0f, 190.0f)
                curveTo(212.0f, 190.0f, 190.0f, 212.0f, 190.0f, 240.0f)
                curveTo(190.0f, 268.0f, 212.0f, 290.0f, 240.0f, 290.0f)
                curveTo(268.0f, 290.0f, 290.0f, 268.0f, 290.0f, 240.0f)
                curveTo(290.0f, 212.0f, 268.0f, 190.0f, 240.0f, 190.0f)
                close()
                moveTo(240.0f, 360.0f)
                curveTo(212.0f, 360.0f, 190.0f, 382.0f, 190.0f, 410.0f)
                curveTo(190.0f, 438.0f, 212.0f, 460.0f, 240.0f, 460.0f)
                curveTo(268.0f, 460.0f, 290.0f, 438.0f, 290.0f, 410.0f)
                curveTo(290.0f, 382.0f, 268.0f, 360.0f, 240.0f, 360.0f)
                close()
            }
        }
        .build()
        return _moreVert!!
    }

private var _moreVert: ImageVector? = null
