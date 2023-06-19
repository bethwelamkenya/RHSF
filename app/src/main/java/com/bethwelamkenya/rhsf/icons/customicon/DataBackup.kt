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

public val CustomIcon.DataBackup: ImageVector
    get() {
        if (_dataBackup != null) {
            return _dataBackup!!
        }
        _dataBackup = Builder(name = "DataBackup", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.9219f, 3.9492f)
                curveTo(4.832f, 3.9492f, 3.9492f, 4.832f, 3.9492f, 5.9219f)
                lineTo(3.9492f, 8.8828f)
                curveTo(3.9492f, 9.4258f, 4.3906f, 9.8672f, 4.9336f, 9.8672f)
                lineTo(24.6719f, 9.8672f)
                curveTo(25.2148f, 9.8672f, 25.6563f, 9.4258f, 25.6563f, 8.8828f)
                lineTo(25.6563f, 5.9219f)
                curveTo(25.6563f, 4.832f, 24.7734f, 3.9492f, 23.6836f, 3.9492f)
                close()
                moveTo(4.9336f, 11.8438f)
                curveTo(4.3906f, 11.8438f, 3.9492f, 12.2852f, 3.9492f, 12.8281f)
                lineTo(3.9492f, 16.7773f)
                curveTo(3.9492f, 17.3203f, 4.3906f, 17.7617f, 4.9336f, 17.7617f)
                lineTo(15.3125f, 17.7617f)
                curveTo(16.9063f, 15.3828f, 19.6172f, 13.8164f, 22.6992f, 13.8164f)
                curveTo(23.7383f, 13.8164f, 24.7305f, 14.0039f, 25.6563f, 14.332f)
                lineTo(25.6563f, 12.8281f)
                curveTo(25.6563f, 12.2852f, 25.2148f, 11.8438f, 24.6719f, 11.8438f)
                close()
                moveTo(22.6992f, 15.7969f)
                curveTo(20.9297f, 15.7969f, 19.1602f, 16.4688f, 17.8125f, 17.8125f)
                curveTo(15.1211f, 20.5039f, 15.1211f, 24.8906f, 17.8125f, 27.582f)
                curveTo(20.4648f, 30.2344f, 24.7695f, 30.2656f, 27.4688f, 27.6836f)
                lineTo(28.6172f, 28.918f)
                lineTo(29.5781f, 23.7266f)
                lineTo(24.6719f, 24.6719f)
                lineTo(26.1289f, 26.2383f)
                curveTo(24.1875f, 28.1172f, 21.125f, 28.1016f, 19.207f, 26.1875f)
                curveTo(17.2734f, 24.25f, 17.2734f, 21.1445f, 19.207f, 19.207f)
                curveTo(21.1445f, 17.2734f, 24.25f, 17.2734f, 26.1875f, 19.207f)
                curveTo(26.4336f, 19.4688f, 26.8047f, 19.5703f, 27.1445f, 19.4805f)
                curveTo(27.4922f, 19.3906f, 27.7617f, 19.1211f, 27.8516f, 18.7734f)
                curveTo(27.9453f, 18.4297f, 27.8398f, 18.0586f, 27.582f, 17.8125f)
                curveTo(26.2344f, 16.4688f, 24.4648f, 15.7969f, 22.6992f, 15.7969f)
                close()
                moveTo(4.9336f, 19.7383f)
                curveTo(4.3906f, 19.7383f, 3.9492f, 20.1797f, 3.9492f, 20.7227f)
                lineTo(3.9492f, 23.6836f)
                curveTo(3.9492f, 24.7734f, 4.832f, 25.6563f, 5.9219f, 25.6563f)
                lineTo(14.332f, 25.6563f)
                curveTo(14.0039f, 24.7305f, 13.8164f, 23.7383f, 13.8164f, 22.6992f)
                curveTo(13.8164f, 21.6563f, 14.0039f, 20.6641f, 14.332f, 19.7383f)
                close()
            }
        }
        .build()
        return _dataBackup!!
    }

private var _dataBackup: ImageVector? = null
