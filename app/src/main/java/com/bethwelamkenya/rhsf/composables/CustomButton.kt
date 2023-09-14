package com.bethwelamkenya.rhsf.composables

import android.app.Activity
import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bethwelamkenya.rhsf.MainActivity
import com.bethwelamkenya.rhsf.icons.CustomIcon
import com.bethwelamkenya.rhsf.icons.customicon.Check
import com.bethwelamkenya.rhsf.icons.customicon.Checkmark

@Composable
fun CustomButton(
    context: Context,
    modifier: Modifier = Modifier,
    text: String,
    icon: ImageVector,
    onClick: () -> Unit,
    enabled: Boolean = true,
    height: Dp = 60.dp,
    elevation: Dp = 5.dp
) {
    Row(
        modifier = modifier
            .height(height)
            .clip(RoundedCornerShape(20.dp))
            .padding(5.dp)
            .border(width = 1.dp, color = Color.Transparent, shape = RoundedCornerShape(20.dp))
            .shadow(elevation = elevation, shape = RoundedCornerShape(20.dp))
            .background(color = MaterialTheme.colorScheme.background)
            .clickable(enabled = enabled, onClick = onClick)
            .padding(horizontal = 5.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            icon,
            contentDescription = text,
            modifier = Modifier.size((height * 2) / 3)
        )
        Text(
            text = text,
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.width(0.dp))
    }
}

@Preview(name = "CustomButton", showBackground = true)
@Composable
private fun PreviewCustomButton() {
    val mainActivity: Activity = MainActivity()
    val context = mainActivity as Context
    var text = "Test Button"
    var number = 0
    CustomButton(
        context = context,
        text = text,
        icon = CustomIcon.Checkmark,
        onClick = {
            number++
            text = "Test Button $number"
        }
    )
}