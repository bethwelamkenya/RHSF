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

public val CustomIcon.DeleteSign: ImageVector
    get() {
        if (_deleteSign != null) {
            return _deleteSign!!
        }
        _deleteSign = Builder(name = "DeleteSign", defaultWidth = 480.0.dp, defaultHeight =
                480.0.dp, viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFFF44336)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(360.207f, 84.434f)
                lineTo(395.57f, 119.797f)
                lineTo(119.801f, 395.566f)
                lineTo(84.438f, 360.203f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF44336)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(395.547f, 360.227f)
                lineTo(360.188f, 395.578f)
                lineTo(84.449f, 119.762f)
                lineTo(119.813f, 84.414f)
                close()
            }
        }
        .build()
        return _deleteSign!!
    }

private var _deleteSign: ImageVector? = null
