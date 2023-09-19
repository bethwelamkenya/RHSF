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

public val CustomIcon.Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(name = "Facebook", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF039be5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.0f)
                arcTo(19.0f, 19.0f, 0.0f, true, false, 24.0f, 43.0f)
                arcTo(19.0f, 19.0f, 0.0f, true, false, 24.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.572f, 29.036f)
                horizontalLineToRelative(4.917f)
                lineToRelative(0.772f, -4.995f)
                horizontalLineToRelative(-5.69f)
                verticalLineToRelative(-2.73f)
                curveToRelative(0.0f, -2.075f, 0.678f, -3.915f, 2.619f, -3.915f)
                horizontalLineToRelative(3.119f)
                verticalLineToRelative(-4.359f)
                curveToRelative(-0.548f, -0.074f, -1.707f, -0.236f, -3.897f, -0.236f)
                curveToRelative(-4.573f, 0.0f, -7.254f, 2.415f, -7.254f, 7.917f)
                verticalLineToRelative(3.323f)
                horizontalLineToRelative(-4.701f)
                verticalLineToRelative(4.995f)
                horizontalLineToRelative(4.701f)
                verticalLineToRelative(13.729f)
                curveTo(22.089f, 42.905f, 23.032f, 43.0f, 24.0f, 43.0f)
                curveToRelative(0.875f, 0.0f, 1.729f, -0.08f, 2.572f, -0.194f)
                verticalLineTo(29.036f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
