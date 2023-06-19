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

public val CustomIcon.LoginRoundedRight: ImageVector
    get() {
        if (_loginRoundedRight != null) {
            return _loginRoundedRight!!
        }
        _loginRoundedRight = Builder(name = "LoginRoundedRight", defaultWidth = 480.0.dp,
                defaultHeight = 480.0.dp, viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFFBBDEFB)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 50.0f)
                curveTo(344.77f, 50.0f, 430.0f, 135.23f, 430.0f, 240.0f)
                curveTo(430.0f, 344.77f, 344.77f, 430.0f, 240.0f, 430.0f)
                curveTo(135.23f, 430.0f, 50.0f, 344.77f, 50.0f, 240.0f)
                curveTo(50.0f, 135.23f, 135.23f, 50.0f, 240.0f, 50.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3F51B5)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 240.0f)
                lineTo(200.0f, 140.0f)
                lineTo(200.0f, 340.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3F51B5)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(50.0f, 210.0f)
                lineTo(220.0f, 210.0f)
                lineTo(220.0f, 270.0f)
                lineTo(50.0f, 270.0f)
                close()
            }
        }
        .build()
        return _loginRoundedRight!!
    }

private var _loginRoundedRight: ImageVector? = null
