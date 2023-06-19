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

public val CustomIcon.MusicalNotes: ImageVector
    get() {
        if (_musicalNotes != null) {
            return _musicalNotes!!
        }
        _musicalNotes = Builder(name = "MusicalNotes", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.6992f, 2.9609f)
                curveTo(22.6563f, 2.9609f, 22.6133f, 2.9648f, 22.5742f, 2.9688f)
                lineTo(22.5508f, 2.9727f)
                curveTo(22.5391f, 2.9727f, 22.5313f, 2.9766f, 22.5234f, 2.9766f)
                lineTo(9.7305f, 4.9414f)
                curveTo(9.2383f, 5.0156f, 8.8828f, 5.4297f, 8.8828f, 5.9219f)
                lineTo(8.8828f, 18.957f)
                curveTo(8.8828f, 20.1289f, 8.7461f, 20.7227f, 6.418f, 20.7227f)
                curveTo(3.8477f, 20.7227f, 2.9609f, 22.2227f, 2.9609f, 23.6914f)
                curveTo(2.9609f, 24.8867f, 3.6602f, 26.6523f, 6.4141f, 26.6523f)
                curveTo(9.5039f, 26.6523f, 10.8555f, 24.7578f, 10.8555f, 23.082f)
                lineTo(10.8555f, 10.3008f)
                lineTo(21.7109f, 8.5352f)
                lineTo(21.7109f, 16.9844f)
                curveTo(21.7109f, 18.1563f, 21.5742f, 18.75f, 19.2461f, 18.75f)
                curveTo(16.6758f, 18.75f, 15.7891f, 20.25f, 15.7891f, 21.7188f)
                curveTo(15.7891f, 22.9141f, 16.4883f, 24.6797f, 19.2422f, 24.6797f)
                curveTo(22.332f, 24.6797f, 23.6836f, 22.6016f, 23.6836f, 20.9258f)
                lineTo(23.6836f, 3.9492f)
                curveTo(23.6836f, 3.4023f, 23.2422f, 2.9609f, 22.6992f, 2.9609f)
                close()
            }
        }
        .build()
        return _musicalNotes!!
    }

private var _musicalNotes: ImageVector? = null
