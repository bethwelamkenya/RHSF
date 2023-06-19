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

public val CustomIcon.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) {
            return _questionMark!!
        }
        _questionMark = Builder(name = "QuestionMark", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8906f, 2.9609f)
                curveTo(10.0f, 2.9609f, 7.2227f, 5.7031f, 7.1484f, 9.668f)
                lineTo(7.1484f, 9.8672f)
                lineTo(11.4648f, 9.8672f)
                lineTo(11.4648f, 9.668f)
                curveTo(11.5625f, 7.918f, 12.7695f, 6.7852f, 14.6016f, 6.7852f)
                curveTo(16.4219f, 6.7852f, 17.6328f, 7.8359f, 17.6328f, 9.3203f)
                curveTo(17.6328f, 10.8008f, 17.0117f, 11.5703f, 14.957f, 12.793f)
                curveTo(12.7539f, 14.0859f, 11.875f, 15.5195f, 12.0859f, 18.0703f)
                lineTo(12.1094f, 18.75f)
                lineTo(16.3398f, 18.75f)
                lineTo(16.3398f, 18.1016f)
                curveTo(16.3398f, 16.5703f, 16.9297f, 15.7891f, 19.0508f, 14.5625f)
                curveTo(21.2969f, 13.2422f, 22.4609f, 11.5703f, 22.4609f, 9.1758f)
                curveTo(22.4609f, 5.4922f, 19.4492f, 2.9609f, 14.8906f, 2.9609f)
                close()
                moveTo(14.3164f, 21.7109f)
                curveTo(12.6953f, 21.7109f, 11.6836f, 22.6523f, 11.6836f, 24.1836f)
                curveTo(11.6836f, 25.7031f, 12.6992f, 26.6445f, 14.3164f, 26.6445f)
                curveTo(15.9375f, 26.6445f, 16.9336f, 25.7031f, 16.9336f, 24.1836f)
                curveTo(16.9336f, 22.6523f, 15.9414f, 21.7109f, 14.3164f, 21.7109f)
                close()
            }
        }
        .build()
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
