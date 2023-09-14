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

public val CustomIcon.CheckedUserMale: ImageVector
    get() {
        if (_checkedUserMale != null) {
            return _checkedUserMale!!
        }
        _checkedUserMale = Builder(name = "CheckedUserMale", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveTo(18.4949f, 4.0f, 14.0f, 8.4949f, 14.0f, 14.0f)
                curveTo(14.0f, 19.5051f, 18.4949f, 24.0f, 24.0f, 24.0f)
                curveTo(29.5051f, 24.0f, 34.0f, 19.5051f, 34.0f, 14.0f)
                curveTo(34.0f, 8.4949f, 29.5051f, 4.0f, 24.0f, 4.0f)
                close()
                moveTo(24.0f, 7.0f)
                curveTo(27.8838f, 7.0f, 31.0f, 10.1162f, 31.0f, 14.0f)
                curveTo(31.0f, 17.8838f, 27.8838f, 21.0f, 24.0f, 21.0f)
                curveTo(20.1162f, 21.0f, 17.0f, 17.8838f, 17.0f, 14.0f)
                curveTo(17.0f, 10.1162f, 20.1162f, 7.0f, 24.0f, 7.0f)
                close()
                moveTo(11.9785f, 28.0f)
                curveTo(9.7845f, 28.0f, 8.0f, 29.7845f, 8.0f, 31.9785f)
                lineTo(8.0f, 33.5f)
                curveTo(8.0f, 36.812f, 9.8846f, 39.6745f, 13.3066f, 41.5625f)
                curveTo(16.1546f, 43.1345f, 19.952f, 44.0f, 24.0f, 44.0f)
                curveTo(24.016f, 44.0f, 24.0328f, 43.998f, 24.0488f, 43.998f)
                lineTo(20.8359f, 40.7852f)
                curveTo(15.5679f, 40.0812f, 11.0f, 37.613f, 11.0f, 33.5f)
                lineTo(11.0f, 31.9785f)
                curveTo(11.0f, 31.4385f, 11.4385f, 31.0f, 11.9785f, 31.0f)
                lineTo(36.0215f, 31.0f)
                curveTo(36.5615f, 31.0f, 37.002f, 31.4395f, 37.002f, 31.9785f)
                lineTo(37.002f, 32.0508f)
                lineTo(39.3086f, 29.7422f)
                curveTo(38.5916f, 28.6922f, 37.3865f, 28.0f, 36.0215f, 28.0f)
                lineTo(11.9785f, 28.0f)
                close()
                moveTo(44.498f, 28.0f)
                curveTo(44.1143f, 28.0f, 43.7305f, 28.1465f, 43.4375f, 28.4395f)
                lineTo(29.498f, 42.3789f)
                lineTo(23.5605f, 36.4395f)
                curveTo(22.9745f, 35.8535f, 22.0255f, 35.8535f, 21.4395f, 36.4395f)
                curveTo(20.8535f, 37.0245f, 20.8535f, 37.9755f, 21.4395f, 38.5605f)
                lineTo(28.4395f, 45.5605f)
                curveTo(28.7325f, 45.8535f, 29.116f, 46.0f, 29.5f, 46.0f)
                curveTo(29.884f, 46.0f, 30.2676f, 45.8535f, 30.5586f, 45.5605f)
                lineTo(45.5586f, 30.5605f)
                curveTo(46.1446f, 29.9755f, 46.1446f, 29.0245f, 45.5586f, 28.4395f)
                curveTo(45.2656f, 28.1465f, 44.8818f, 28.0f, 44.498f, 28.0f)
                close()
            }
        }
        .build()
        return _checkedUserMale!!
    }

private var _checkedUserMale: ImageVector? = null
