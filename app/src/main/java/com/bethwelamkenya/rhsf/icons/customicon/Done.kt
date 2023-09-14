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

public val CustomIcon.Done: ImageVector
    get() {
        if (_done != null) {
            return _done!!
        }
        _done = Builder(name = "Done", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.4707f, 8.9863f)
                arcTo(1.5001f, 1.5001f, 0.0f, false, false, 42.4395f, 9.4395f)
                lineTo(16.5f, 35.3789f)
                lineTo(5.5605f, 24.4395f)
                arcTo(1.5001f, 1.5001f, 0.0f, true, false, 3.4395f, 26.5605f)
                lineTo(15.4395f, 38.5605f)
                arcTo(1.5001f, 1.5001f, 0.0f, false, false, 17.5605f, 38.5605f)
                lineTo(44.5605f, 11.5605f)
                arcTo(1.5001f, 1.5001f, 0.0f, false, false, 43.4707f, 8.9863f)
                close()
            }
        }
        .build()
        return _done!!
    }

private var _done: ImageVector? = null
