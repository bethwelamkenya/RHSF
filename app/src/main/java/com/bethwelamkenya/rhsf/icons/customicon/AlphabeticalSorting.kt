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

public val CustomIcon.AlphabeticalSorting: ImageVector
    get() {
        if (_alphabeticalSorting != null) {
            return _alphabeticalSorting!!
        }
        _alphabeticalSorting = Builder(name = "AlphabeticalSorting", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.6953f, 3.9336f)
                curveTo(21.1523f, 3.9453f, 20.7148f, 4.3906f, 20.7227f, 4.9336f)
                lineTo(20.7227f, 22.2891f)
                lineTo(18.4609f, 20.0273f)
                curveTo(18.2773f, 19.832f, 18.0195f, 19.7305f, 17.75f, 19.7266f)
                curveTo(17.3516f, 19.7305f, 16.9922f, 19.9727f, 16.8398f, 20.3438f)
                curveTo(16.6875f, 20.7148f, 16.7773f, 21.1406f, 17.0664f, 21.4219f)
                lineTo(20.9258f, 25.2852f)
                curveTo(21.1133f, 25.5273f, 21.4023f, 25.668f, 21.7109f, 25.668f)
                curveTo(22.0195f, 25.668f, 22.3125f, 25.5273f, 22.4961f, 25.2813f)
                lineTo(26.3555f, 21.4219f)
                curveTo(26.6133f, 21.1758f, 26.7188f, 20.8047f, 26.625f, 20.4609f)
                curveTo(26.5352f, 20.1133f, 26.2656f, 19.8438f, 25.9219f, 19.7578f)
                curveTo(25.5781f, 19.6641f, 25.207f, 19.7695f, 24.9609f, 20.0273f)
                lineTo(22.6992f, 22.2891f)
                lineTo(22.6992f, 4.9336f)
                curveTo(22.7031f, 4.668f, 22.5977f, 4.4102f, 22.4102f, 4.2227f)
                curveTo(22.2188f, 4.0313f, 21.9609f, 3.9297f, 21.6953f, 3.9336f)
                close()
                moveTo(6.5f, 3.9492f)
                lineTo(3.5234f, 12.8281f)
                lineTo(5.7578f, 12.8281f)
                lineTo(6.3359f, 10.8789f)
                lineTo(9.2305f, 10.8789f)
                lineTo(9.7891f, 12.8281f)
                lineTo(12.2461f, 12.8281f)
                lineTo(9.2617f, 3.9492f)
                close()
                moveTo(7.7422f, 5.9492f)
                lineTo(7.8555f, 5.9492f)
                lineTo(8.8086f, 9.25f)
                lineTo(6.7656f, 9.25f)
                close()
                moveTo(4.4609f, 16.7773f)
                lineTo(4.4609f, 18.5938f)
                lineTo(8.5586f, 18.5938f)
                lineTo(8.5586f, 18.707f)
                lineTo(4.3945f, 24.2227f)
                lineTo(4.3945f, 25.6563f)
                lineTo(11.3945f, 25.6563f)
                lineTo(11.3945f, 23.8438f)
                lineTo(7.1016f, 23.8438f)
                lineTo(7.1016f, 23.7266f)
                lineTo(11.2695f, 18.2109f)
                lineTo(11.2695f, 16.7773f)
                close()
            }
        }
        .build()
        return _alphabeticalSorting!!
    }

private var _alphabeticalSorting: ImageVector? = null
