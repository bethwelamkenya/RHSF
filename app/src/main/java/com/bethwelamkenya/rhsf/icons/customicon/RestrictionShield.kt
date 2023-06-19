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

public val CustomIcon.RestrictionShield: ImageVector
    get() {
        if (_restrictionShield != null) {
            return _restrictionShield!!
        }
        _restrictionShield = Builder(name = "RestrictionShield", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8008f, 2.9609f)
                curveTo(10.2617f, 2.9609f, 5.5352f, 3.9844f, 5.5352f, 3.9844f)
                curveTo(4.6094f, 4.1719f, 3.9492f, 4.9805f, 3.9492f, 5.9219f)
                lineTo(3.9492f, 11.8438f)
                curveTo(3.9492f, 22.1055f, 13.8359f, 26.3945f, 13.8359f, 26.3945f)
                curveTo(14.1328f, 26.5547f, 14.4648f, 26.6445f, 14.8008f, 26.6445f)
                curveTo(15.1367f, 26.6445f, 15.4688f, 26.5547f, 15.7617f, 26.3945f)
                lineTo(15.7695f, 26.3945f)
                curveTo(15.7695f, 26.3945f, 25.6563f, 22.1055f, 25.6563f, 11.8438f)
                lineTo(25.6563f, 5.9219f)
                curveTo(25.6563f, 4.9766f, 24.9922f, 4.168f, 24.0703f, 3.9844f)
                curveTo(24.0703f, 3.9844f, 19.3438f, 2.9609f, 14.8008f, 2.9609f)
                close()
                moveTo(14.8008f, 6.9063f)
                curveTo(18.0664f, 6.9063f, 20.7227f, 9.5625f, 20.7227f, 12.8281f)
                curveTo(20.7227f, 16.0938f, 18.0664f, 18.75f, 14.8008f, 18.75f)
                curveTo(11.5391f, 18.75f, 8.8828f, 16.0938f, 8.8828f, 12.8281f)
                curveTo(8.8828f, 9.5625f, 11.5391f, 6.9063f, 14.8008f, 6.9063f)
                close()
                moveTo(14.8008f, 8.8828f)
                curveTo(14.0742f, 8.8828f, 13.3945f, 9.0938f, 12.8086f, 9.4414f)
                lineTo(18.1914f, 14.8203f)
                curveTo(18.5391f, 14.2344f, 18.75f, 13.5586f, 18.75f, 12.8281f)
                curveTo(18.75f, 10.6523f, 16.9805f, 8.8828f, 14.8008f, 8.8828f)
                close()
                moveTo(11.4141f, 10.8359f)
                curveTo(11.0664f, 11.4219f, 10.8555f, 12.1016f, 10.8555f, 12.8281f)
                curveTo(10.8555f, 15.0078f, 12.625f, 16.7773f, 14.8008f, 16.7773f)
                curveTo(15.5313f, 16.7773f, 16.2109f, 16.5625f, 16.7969f, 16.2188f)
                close()
            }
        }
        .build()
        return _restrictionShield!!
    }

private var _restrictionShield: ImageVector? = null
