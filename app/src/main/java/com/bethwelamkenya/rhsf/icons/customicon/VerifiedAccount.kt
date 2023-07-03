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

public val CustomIcon.VerifiedAccount: ImageVector
    get() {
        if (_verifiedAccount != null) {
            return _verifiedAccount!!
        }
        _verifiedAccount = Builder(name = "VerifiedAccount", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(26.6445f, 14.8008f)
                curveTo(26.6445f, 13.0781f, 25.6641f, 11.5742f, 24.2344f, 10.8164f)
                curveTo(24.625f, 9.3281f, 24.2461f, 7.6797f, 23.0859f, 6.5195f)
                curveTo(22.2188f, 5.6523f, 21.0781f, 5.2188f, 19.9336f, 5.2188f)
                curveTo(19.5469f, 5.2188f, 19.1641f, 5.2695f, 18.7852f, 5.3711f)
                curveTo(18.0273f, 3.9414f, 16.5273f, 2.9609f, 14.8008f, 2.9609f)
                curveTo(13.0781f, 2.9609f, 11.5742f, 3.9414f, 10.8164f, 5.3711f)
                curveTo(10.4414f, 5.2695f, 10.0547f, 5.2188f, 9.668f, 5.2188f)
                curveTo(8.5273f, 5.2188f, 7.3867f, 5.6523f, 6.5195f, 6.5195f)
                curveTo(5.3594f, 7.6797f, 4.9766f, 9.3281f, 5.3672f, 10.8164f)
                curveTo(3.9414f, 11.5742f, 2.9609f, 13.0781f, 2.9609f, 14.8008f)
                curveTo(2.9609f, 16.5273f, 3.9414f, 18.0273f, 5.3711f, 18.7891f)
                curveTo(4.9805f, 20.2773f, 5.3594f, 21.9258f, 6.5195f, 23.0859f)
                curveTo(7.3867f, 23.9531f, 8.5273f, 24.3867f, 9.6719f, 24.3867f)
                curveTo(10.0586f, 24.3867f, 10.4414f, 24.3359f, 10.8203f, 24.2344f)
                curveTo(11.5742f, 25.6641f, 13.0781f, 26.6445f, 14.8008f, 26.6445f)
                curveTo(16.5273f, 26.6445f, 18.0273f, 25.6641f, 18.7891f, 24.2344f)
                curveTo(19.1641f, 24.3359f, 19.5508f, 24.3867f, 19.9375f, 24.3867f)
                curveTo(21.0781f, 24.3867f, 22.2188f, 23.9531f, 23.0859f, 23.0859f)
                curveTo(24.2461f, 21.9258f, 24.6289f, 20.2773f, 24.2383f, 18.7891f)
                curveTo(25.6641f, 18.0273f, 26.6445f, 16.5273f, 26.6445f, 14.8008f)
                close()
                moveTo(20.4336f, 12.5391f)
                lineTo(13.5273f, 19.4492f)
                curveTo(13.332f, 19.6406f, 13.082f, 19.7383f, 12.8281f, 19.7383f)
                curveTo(12.5742f, 19.7383f, 12.3242f, 19.6406f, 12.1328f, 19.4492f)
                lineTo(9.1719f, 16.4883f)
                curveTo(8.7852f, 16.1016f, 8.7852f, 15.4766f, 9.1719f, 15.0898f)
                curveTo(9.5547f, 14.707f, 10.1797f, 14.707f, 10.5664f, 15.0898f)
                lineTo(12.8281f, 17.3555f)
                lineTo(19.0391f, 11.1445f)
                curveTo(19.4258f, 10.7578f, 20.0508f, 10.7578f, 20.4336f, 11.1445f)
                curveTo(20.8203f, 11.5313f, 20.8203f, 12.1563f, 20.4336f, 12.5391f)
                close()
            }
        }
        .build()
        return _verifiedAccount!!
    }

private var _verifiedAccount: ImageVector? = null
