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

public val CustomIcon.SortByFollowUpDate: ImageVector
    get() {
        if (_sortByFollowUpDate != null) {
            return _sortByFollowUpDate!!
        }
        _sortByFollowUpDate = Builder(name = "SortByFollowUpDate", defaultWidth = 480.0.dp,
                defaultHeight = 480.0.dp, viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFF3F51B5)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(220.0f, 270.0f)
                lineTo(260.0f, 270.0f)
                lineTo(260.0f, 390.0f)
                lineTo(220.0f, 390.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3F51B5)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(170.0f, 350.0f)
                lineTo(310.0f, 350.0f)
                lineTo(240.0f, 420.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF90CAF9)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 230.0f)
                lineTo(80.0f, 260.0f)
                lineTo(400.0f, 260.02f)
                lineTo(400.0f, 230.0f)
                lineTo(440.0f, 230.0f)
                lineTo(440.0f, 260.0f)
                curveTo(440.0f, 282.059f, 422.059f, 300.0f, 400.0f, 300.0f)
                lineTo(80.0f, 300.0f)
                curveTo(57.941f, 300.0f, 40.0f, 282.059f, 40.0f, 260.0f)
                lineTo(40.0f, 230.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF448AFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(331.039f, 130.0f)
                lineTo(250.0f, 200.0f)
                lineTo(250.0f, 60.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF448AFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(150.0f, 110.0f)
                lineTo(290.0f, 110.0f)
                lineTo(290.0f, 150.0f)
                lineTo(150.0f, 150.0f)
                close()
            }
        }
        .build()
        return _sortByFollowUpDate!!
    }

private var _sortByFollowUpDate: ImageVector? = null
