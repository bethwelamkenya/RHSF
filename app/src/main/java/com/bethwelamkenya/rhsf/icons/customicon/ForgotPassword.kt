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

public val CustomIcon.ForgotPassword: ImageVector
    get() {
        if (_forgotPassword != null) {
            return _forgotPassword!!
        }
        _forgotPassword = Builder(name = "ForgotPassword", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8008f, 1.9727f)
                curveTo(10.9961f, 1.9727f, 7.8945f, 5.0781f, 7.8945f, 8.8828f)
                lineTo(7.8945f, 10.8555f)
                lineTo(5.9219f, 10.8555f)
                curveTo(4.832f, 10.8555f, 3.9492f, 11.7383f, 3.9492f, 12.8281f)
                lineTo(3.9492f, 24.6719f)
                curveTo(3.9492f, 25.7617f, 4.832f, 26.6445f, 5.9219f, 26.6445f)
                lineTo(23.6836f, 26.6445f)
                curveTo(24.7734f, 26.6445f, 25.6563f, 25.7617f, 25.6563f, 24.6719f)
                lineTo(25.6563f, 12.8281f)
                curveTo(25.6563f, 11.7383f, 24.7734f, 10.8555f, 23.6836f, 10.8555f)
                lineTo(21.7109f, 10.8555f)
                lineTo(21.7109f, 8.8828f)
                curveTo(21.7109f, 5.2031f, 18.7852f, 2.2383f, 15.1523f, 2.043f)
                curveTo(15.043f, 2.0f, 14.9219f, 1.9766f, 14.8008f, 1.9727f)
                close()
                moveTo(14.8008f, 3.9492f)
                curveTo(17.5391f, 3.9492f, 19.7383f, 6.1445f, 19.7383f, 8.8828f)
                lineTo(19.7383f, 10.8555f)
                lineTo(9.8672f, 10.8555f)
                lineTo(9.8672f, 8.8828f)
                curveTo(9.8672f, 6.1445f, 12.0664f, 3.9492f, 14.8008f, 3.9492f)
                close()
                moveTo(14.8477f, 12.8281f)
                curveTo(17.1289f, 12.8281f, 18.6289f, 14.0977f, 18.6289f, 15.9375f)
                curveTo(18.6289f, 17.1328f, 18.0508f, 17.9688f, 16.9258f, 18.6289f)
                curveTo(15.8672f, 19.2422f, 15.5742f, 19.6367f, 15.5742f, 20.3984f)
                lineTo(15.5742f, 20.7227f)
                lineTo(13.457f, 20.7227f)
                lineTo(13.4414f, 20.3828f)
                curveTo(13.3359f, 19.1094f, 13.7773f, 18.3906f, 14.8789f, 17.7461f)
                curveTo(15.9063f, 17.1328f, 16.2188f, 16.75f, 16.2188f, 16.0078f)
                curveTo(16.2188f, 15.2695f, 15.6133f, 14.7422f, 14.7031f, 14.7422f)
                curveTo(13.7852f, 14.7422f, 13.1836f, 15.3086f, 13.1328f, 16.1875f)
                lineTo(13.1328f, 16.2813f)
                lineTo(10.9766f, 16.2813f)
                lineTo(10.9766f, 16.1875f)
                curveTo(11.0117f, 14.2031f, 12.4023f, 12.8281f, 14.8477f, 12.8281f)
                close()
                moveTo(14.5586f, 22.2031f)
                curveTo(15.3711f, 22.2031f, 15.8672f, 22.6758f, 15.8672f, 23.4414f)
                curveTo(15.8672f, 24.1992f, 15.3711f, 24.6719f, 14.5586f, 24.6719f)
                curveTo(13.75f, 24.6719f, 13.2461f, 24.1992f, 13.2461f, 23.4414f)
                curveTo(13.2461f, 22.6758f, 13.75f, 22.2031f, 14.5586f, 22.2031f)
                close()
            }
        }
        .build()
        return _forgotPassword!!
    }

private var _forgotPassword: ImageVector? = null
