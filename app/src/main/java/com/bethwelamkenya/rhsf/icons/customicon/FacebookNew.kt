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

public val CustomIcon.FacebookNew: ImageVector
    get() {
        if (_facebookNew != null) {
            return _facebookNew!!
        }
        _facebookNew = Builder(name = "FacebookNew", defaultWidth = 480.0.dp, defaultHeight =
                480.0.dp, viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFF039BE5)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(430.0f, 240.0f)
                curveTo(430.0f, 344.934f, 344.934f, 430.0f, 240.0f, 430.0f)
                curveTo(135.066f, 430.0f, 50.0f, 344.934f, 50.0f, 240.0f)
                curveTo(50.0f, 135.066f, 135.066f, 50.0f, 240.0f, 50.0f)
                curveTo(344.934f, 50.0f, 430.0f, 135.066f, 430.0f, 240.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(265.719f, 290.359f)
                lineTo(314.891f, 290.359f)
                lineTo(322.609f, 240.41f)
                lineTo(265.711f, 240.41f)
                lineTo(265.711f, 213.109f)
                curveTo(265.711f, 192.359f, 272.488f, 173.961f, 291.898f, 173.961f)
                lineTo(323.09f, 173.961f)
                lineTo(323.09f, 130.371f)
                curveTo(317.609f, 129.629f, 306.02f, 128.012f, 284.121f, 128.012f)
                curveTo(238.391f, 128.012f, 211.578f, 152.16f, 211.578f, 207.18f)
                lineTo(211.578f, 240.41f)
                lineTo(164.57f, 240.41f)
                lineTo(164.57f, 290.359f)
                lineTo(211.578f, 290.359f)
                lineTo(211.578f, 427.648f)
                curveTo(220.891f, 429.051f, 230.32f, 430.0f, 240.0f, 430.0f)
                curveTo(248.75f, 430.0f, 257.289f, 429.199f, 265.719f, 428.059f)
                close()
            }
        }
        .build()
        return _facebookNew!!
    }

private var _facebookNew: ImageVector? = null
