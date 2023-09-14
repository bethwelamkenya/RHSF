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

public val CustomIcon.Invisible: ImageVector
    get() {
        if (_invisible != null) {
            return _invisible!!
        }
        _invisible = Builder(name = "Invisible", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.4707f, 3.9863f)
                arcTo(1.5001f, 1.5001f, 0.0f, false, false, 41.4395f, 4.4395f)
                lineTo(4.4395f, 41.4395f)
                arcTo(1.5001f, 1.5001f, 0.0f, true, false, 6.5605f, 43.5605f)
                lineTo(16.916f, 33.2051f)
                curveTo(18.6847f, 35.1192f, 21.2003f, 36.3301f, 24.0f, 36.3301f)
                curveTo(29.33f, 36.3301f, 33.6699f, 31.9899f, 33.6699f, 26.6699f)
                curveTo(33.6699f, 23.8701f, 32.4592f, 21.3471f, 30.5449f, 19.5762f)
                lineTo(35.0527f, 15.0684f)
                curveTo(39.9045f, 17.9091f, 43.6688f, 22.4968f, 45.0508f, 27.8691f)
                curveTo(45.2208f, 28.5491f, 45.83f, 29.0f, 46.5f, 29.0f)
                curveTo(46.62f, 29.0f, 46.7491f, 28.9892f, 46.8691f, 28.9492f)
                curveTo(47.6791f, 28.7492f, 48.1592f, 27.9309f, 47.9492f, 27.1309f)
                curveTo(46.4094f, 21.1283f, 42.4612f, 16.0731f, 37.2773f, 12.8438f)
                lineTo(43.5605f, 6.5605f)
                arcTo(1.5001f, 1.5001f, 0.0f, false, false, 42.4707f, 3.9863f)
                close()
                moveTo(23.9902f, 9.0f)
                curveTo(12.8202f, 9.0f, 2.7508f, 16.6209f, 0.0508f, 27.1309f)
                curveTo(-0.1592f, 27.9309f, 0.3209f, 28.7492f, 1.1309f, 28.9492f)
                curveTo(1.9309f, 29.1592f, 2.7492f, 28.6791f, 2.9492f, 27.8691f)
                curveTo(5.2792f, 18.8191f, 14.3302f, 12.0f, 23.9902f, 12.0f)
                curveTo(25.7002f, 12.0f, 27.3895f, 12.2091f, 29.0195f, 12.6191f)
                lineTo(31.4805f, 10.1602f)
                curveTo(29.0905f, 9.4002f, 26.5702f, 9.0f, 23.9902f, 9.0f)
                close()
                moveTo(24.0f, 17.0f)
                curveTo(18.67f, 17.0f, 14.3398f, 21.3399f, 14.3398f, 26.6699f)
                curveTo(14.3398f, 26.8699f, 14.3494f, 27.0793f, 14.3594f, 27.2793f)
                lineTo(18.1504f, 23.4902f)
                curveTo(18.7604f, 22.3602f, 19.7001f, 21.4205f, 20.8301f, 20.8105f)
                lineTo(24.6191f, 17.0195f)
                curveTo(24.4091f, 17.0095f, 24.21f, 17.0f, 24.0f, 17.0f)
                close()
                moveTo(28.4258f, 21.6953f)
                curveTo(29.7964f, 22.9165f, 30.6699f, 24.6875f, 30.6699f, 26.6699f)
                curveTo(30.6699f, 30.3399f, 27.68f, 33.3301f, 24.0f, 33.3301f)
                curveTo(22.0254f, 33.3301f, 20.256f, 32.4566f, 19.0352f, 31.0859f)
                lineTo(28.4258f, 21.6953f)
                close()
            }
        }
        .build()
        return _invisible!!
    }

private var _invisible: ImageVector? = null
