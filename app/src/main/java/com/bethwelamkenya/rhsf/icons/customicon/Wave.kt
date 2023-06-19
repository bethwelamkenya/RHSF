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

public val CustomIcon.Wave: ImageVector
    get() {
        if (_wave != null) {
            return _wave!!
        }
        _wave = Builder(name = "Wave", defaultWidth = 1440.0.dp, defaultHeight = 320.0.dp,
                viewportWidth = 1440.0f, viewportHeight = 320.0f).apply {
            path(fill = SolidColor(Color(0xFF0099ff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 96.0f)
                lineTo(14.1f, 106.7f)
                curveTo(28.2f, 117.0f, 56.0f, 139.0f, 85.0f, 144.0f)
                curveTo(112.9f, 149.0f, 141.0f, 139.0f, 169.0f, 128.0f)
                curveTo(197.6f, 117.0f, 226.0f, 107.0f, 254.0f, 90.7f)
                curveTo(282.4f, 75.0f, 311.0f, 53.0f, 339.0f, 64.0f)
                curveTo(367.1f, 75.0f, 395.0f, 117.0f, 424.0f, 154.7f)
                curveTo(451.8f, 192.0f, 480.0f, 224.0f, 508.0f, 245.3f)
                curveTo(536.5f, 267.0f, 565.0f, 277.0f, 593.0f, 234.7f)
                curveTo(621.2f, 192.0f, 649.0f, 96.0f, 678.0f, 101.3f)
                curveTo(705.9f, 107.0f, 734.0f, 213.0f, 762.0f, 250.7f)
                curveTo(790.6f, 288.0f, 819.0f, 256.0f, 847.0f, 240.0f)
                curveTo(875.3f, 224.0f, 904.0f, 224.0f, 932.0f, 218.7f)
                curveTo(960.0f, 213.0f, 988.0f, 203.0f, 1016.0f, 181.3f)
                curveTo(1044.7f, 160.0f, 1073.0f, 128.0f, 1101.0f, 117.3f)
                curveTo(1129.4f, 107.0f, 1158.0f, 117.0f, 1186.0f, 144.0f)
                curveTo(1214.1f, 171.0f, 1242.0f, 213.0f, 1271.0f, 218.7f)
                curveTo(1298.8f, 224.0f, 1327.0f, 192.0f, 1355.0f, 154.7f)
                curveTo(1383.5f, 117.0f, 1412.0f, 75.0f, 1426.0f, 53.3f)
                lineTo(1440.0f, 32.0f)
                lineTo(1440.0f, 320.0f)
                lineTo(1425.9f, 320.0f)
                curveTo(1411.8f, 320.0f, 1384.0f, 320.0f, 1355.0f, 320.0f)
                curveTo(1327.1f, 320.0f, 1299.0f, 320.0f, 1271.0f, 320.0f)
                curveTo(1242.4f, 320.0f, 1214.0f, 320.0f, 1186.0f, 320.0f)
                curveTo(1157.6f, 320.0f, 1129.0f, 320.0f, 1101.0f, 320.0f)
                curveTo(1072.9f, 320.0f, 1045.0f, 320.0f, 1016.0f, 320.0f)
                curveTo(988.2f, 320.0f, 960.0f, 320.0f, 932.0f, 320.0f)
                curveTo(903.5f, 320.0f, 875.0f, 320.0f, 847.0f, 320.0f)
                curveTo(818.8f, 320.0f, 791.0f, 320.0f, 762.0f, 320.0f)
                curveTo(734.1f, 320.0f, 706.0f, 320.0f, 678.0f, 320.0f)
                curveTo(649.4f, 320.0f, 621.0f, 320.0f, 593.0f, 320.0f)
                curveTo(564.7f, 320.0f, 536.0f, 320.0f, 508.0f, 320.0f)
                curveTo(480.0f, 320.0f, 452.0f, 320.0f, 424.0f, 320.0f)
                curveTo(395.3f, 320.0f, 367.0f, 320.0f, 339.0f, 320.0f)
                curveTo(310.6f, 320.0f, 282.0f, 320.0f, 254.0f, 320.0f)
                curveTo(225.9f, 320.0f, 198.0f, 320.0f, 169.0f, 320.0f)
                curveTo(141.2f, 320.0f, 113.0f, 320.0f, 85.0f, 320.0f)
                curveTo(56.5f, 320.0f, 28.0f, 320.0f, 14.0f, 320.0f)
                lineTo(0.0f, 320.0f)
                close()
            }
        }
        .build()
        return _wave!!
    }

private var _wave: ImageVector? = null
