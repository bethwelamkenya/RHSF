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
        _search = Builder(name = "Search", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(7.489f, 3.0f, 3.0f, 7.489f, 3.0f, 13.0f)
                curveTo(3.0f, 18.511f, 7.489f, 23.0f, 13.0f, 23.0f)
                curveTo(15.3965f, 23.0f, 17.5974f, 22.149f, 19.3223f, 20.7363f)
                lineTo(25.293f, 26.707f)
                arcTo(1.0001f, 1.0001f, 0.0f, true, false, 26.707f, 25.293f)
                lineTo(20.7363f, 19.3223f)
                curveTo(22.149f, 17.5974f, 23.0f, 15.3965f, 23.0f, 13.0f)
                curveTo(23.0f, 7.489f, 18.511f, 3.0f, 13.0f, 3.0f)
                close()
                moveTo(13.0f, 5.0f)
                curveTo(17.4301f, 5.0f, 21.0f, 8.5699f, 21.0f, 13.0f)
                curveTo(21.0f, 17.4301f, 17.4301f, 21.0f, 13.0f, 21.0f)
                curveTo(8.5699f, 21.0f, 5.0f, 17.4301f, 5.0f, 13.0f)
                curveTo(5.0f, 8.5699f, 8.5699f, 5.0f, 13.0f, 5.0f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
