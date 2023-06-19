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

public val CustomIcon.ActivityFeed: ImageVector
    get() {
        if (_activityFeed != null) {
            return _activityFeed!!
        }
        _activityFeed = Builder(name = "ActivityFeed", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.6836f, 3.9492f)
                lineTo(5.9219f, 3.9492f)
                curveTo(4.832f, 3.9492f, 3.9492f, 4.832f, 3.9492f, 5.9219f)
                lineTo(3.9492f, 23.6836f)
                curveTo(3.9492f, 24.7734f, 4.832f, 25.6563f, 5.9219f, 25.6563f)
                lineTo(23.6836f, 25.6563f)
                curveTo(24.7734f, 25.6563f, 25.6563f, 24.7734f, 25.6563f, 23.6836f)
                lineTo(25.6563f, 5.9219f)
                curveTo(25.6563f, 4.832f, 24.7734f, 3.9492f, 23.6836f, 3.9492f)
                close()
                moveTo(20.7227f, 15.7891f)
                lineTo(8.8828f, 15.7891f)
                curveTo(8.3398f, 15.7891f, 7.8945f, 15.3477f, 7.8945f, 14.8008f)
                curveTo(7.8945f, 14.2578f, 8.3398f, 13.8164f, 8.8828f, 13.8164f)
                lineTo(20.7227f, 13.8164f)
                curveTo(21.2656f, 13.8164f, 21.7109f, 14.2578f, 21.7109f, 14.8008f)
                curveTo(21.7109f, 15.3477f, 21.2656f, 15.7891f, 20.7227f, 15.7891f)
                close()
                moveTo(20.7227f, 10.8555f)
                lineTo(8.8828f, 10.8555f)
                curveTo(8.3398f, 10.8555f, 7.8945f, 10.4102f, 7.8945f, 9.8672f)
                curveTo(7.8945f, 9.3242f, 8.3398f, 8.8828f, 8.8828f, 8.8828f)
                lineTo(20.7227f, 8.8828f)
                curveTo(21.2656f, 8.8828f, 21.7109f, 9.3242f, 21.7109f, 9.8672f)
                curveTo(21.7109f, 10.4102f, 21.2656f, 10.8555f, 20.7227f, 10.8555f)
                close()
                moveTo(20.7227f, 20.7227f)
                lineTo(8.8828f, 20.7227f)
                curveTo(8.3398f, 20.7227f, 7.8945f, 20.2813f, 7.8945f, 19.7383f)
                curveTo(7.8945f, 19.1914f, 8.3398f, 18.75f, 8.8828f, 18.75f)
                lineTo(20.7227f, 18.75f)
                curveTo(21.2656f, 18.75f, 21.7109f, 19.1914f, 21.7109f, 19.7383f)
                curveTo(21.7109f, 20.2813f, 21.2656f, 20.7227f, 20.7227f, 20.7227f)
                close()
            }
        }
        .build()
        return _activityFeed!!
    }

private var _activityFeed: ImageVector? = null
