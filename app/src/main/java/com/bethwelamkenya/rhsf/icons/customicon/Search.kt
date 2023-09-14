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

public val CustomIcon.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 6.0f)
                curveTo(12.5096f, 6.0f, 6.0f, 12.5096f, 6.0f, 20.5f)
                curveTo(6.0f, 28.4904f, 12.5096f, 35.0f, 20.5f, 35.0f)
                curveTo(23.9564f, 35.0f, 27.1337f, 33.779f, 29.6289f, 31.75f)
                lineTo(39.4395f, 41.5605f)
                arcTo(1.5001f, 1.5001f, 0.0f, true, false, 41.5605f, 39.4395f)
                lineTo(31.75f, 29.6289f)
                curveTo(33.779f, 27.1337f, 35.0f, 23.9564f, 35.0f, 20.5f)
                curveTo(35.0f, 12.5096f, 28.4904f, 6.0f, 20.5f, 6.0f)
                close()
                moveTo(20.5f, 9.0f)
                curveTo(26.869f, 9.0f, 32.0f, 14.131f, 32.0f, 20.5f)
                curveTo(32.0f, 23.6026f, 30.7762f, 26.4057f, 28.791f, 28.4707f)
                arcTo(1.5001f, 1.5001f, 0.0f, false, false, 28.4707f, 28.791f)
                curveTo(26.4057f, 30.7762f, 23.6026f, 32.0f, 20.5f, 32.0f)
                curveTo(14.131f, 32.0f, 9.0f, 26.869f, 9.0f, 20.5f)
                curveTo(9.0f, 14.131f, 14.131f, 9.0f, 20.5f, 9.0f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
