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

public val CustomIcon.SortByModifiedDate: ImageVector
    get() {
        if (_sortByModifiedDate != null) {
            return _sortByModifiedDate!!
        }
        _sortByModifiedDate = Builder(name = "SortByModifiedDate", defaultWidth = 480.0.dp,
                defaultHeight = 480.0.dp, viewportWidth = 480.0f, viewportHeight = 480.0f).apply {
            path(fill = SolidColor(Color(0xFF3F51B5)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(220.0f, 280.0f)
                lineTo(260.0f, 280.0f)
                lineTo(260.0f, 400.0f)
                lineTo(220.0f, 400.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3F51B5)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(310.0f, 360.0f)
                lineTo(170.0f, 360.0f)
                lineTo(240.0f, 430.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF90CAF9)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(400.0f, 240.0f)
                lineTo(400.0f, 270.0f)
                lineTo(80.0f, 270.02f)
                lineTo(80.0f, 240.0f)
                lineTo(40.0f, 240.0f)
                lineTo(40.0f, 270.0f)
                curveTo(40.0f, 292.059f, 57.941f, 310.0f, 80.0f, 310.0f)
                lineTo(400.0f, 310.0f)
                curveTo(422.059f, 310.0f, 440.0f, 292.059f, 440.0f, 270.0f)
                lineTo(440.0f, 240.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE57373)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(326.82f, 91.031f)
                lineTo(298.969f, 63.18f)
                curveTo(294.73f, 58.941f, 287.852f, 58.941f, 283.621f, 63.18f)
                lineTo(270.488f, 76.301f)
                lineTo(313.711f, 119.52f)
                lineTo(326.82f, 106.391f)
                curveTo(331.051f, 102.148f, 331.051f, 95.281f, 326.82f, 91.031f)
            }
            path(fill = SolidColor(Color(0xFFFF9800)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(174.531f, 172.227f)
                lineTo(248.875f, 97.883f)
                lineTo(292.102f, 141.109f)
                lineTo(217.758f, 215.453f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB0BEC5)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(313.73f, 119.52f)
                lineTo(292.129f, 141.137f)
                lineTo(248.891f, 97.922f)
                lineTo(270.496f, 76.309f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFC107)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(174.551f, 172.238f)
                lineTo(160.0f, 230.0f)
                lineTo(217.75f, 215.461f)
                close()
            }
            path(fill = SolidColor(Color(0xFF37474F)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(167.34f, 200.801f)
                lineTo(160.0f, 230.0f)
                lineTo(189.199f, 222.648f)
                close()
            }
        }
        .build()
        return _sortByModifiedDate!!
    }

private var _sortByModifiedDate: ImageVector? = null
