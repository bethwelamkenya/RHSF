package com.bethwelamkenya.rhsf.composables

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bethwelamkenya.rhsf.MainActivity
import com.bethwelamkenya.rhsf.R
import com.bethwelamkenya.rhsf.icons.CustomIcon
import com.bethwelamkenya.rhsf.icons.customicon.CheckedUserMale
import com.bethwelamkenya.rhsf.icons.customicon.Group
import com.bethwelamkenya.rhsf.icons.customicon.Home
import com.bethwelamkenya.rhsf.icons.customicon.Services
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun DrawerContent(
    context: Context,
    drawerState: DrawerState,
    coroutineScope: CoroutineScope,
    activeNo: Int,
    valueChanged: (Int) -> Unit
) {
    ModalDrawerSheet(
        modifier = Modifier.fillMaxWidth(0.75F),
        drawerShape = RoundedCornerShape(0.dp, 20.dp, 0.dp, 0.dp),
        drawerContainerColor = MaterialTheme.colorScheme.background,
        drawerTonalElevation = 10.dp
    ) {
        DrawerHeader()
        Spacer(modifier = Modifier.height(15.dp))
        DrawerItem(
            context = context,
            drawerState = drawerState,
            coroutineScope = coroutineScope,
            text = "Home",
            icon = CustomIcon.Home,
            item = 1,
            selectedItemId = activeNo,
            onItemClick = valueChanged
        )
        DrawerItem(
            context = context,
            drawerState = drawerState,
            coroutineScope = coroutineScope,
            text = "Members",
            icon = CustomIcon.Group,
            item = 2,
            selectedItemId = activeNo,
            onItemClick = valueChanged
        )
        DrawerItem(
            context = context,
            drawerState = drawerState,
            coroutineScope = coroutineScope,
            text = "Attendances",
            icon = CustomIcon.CheckedUserMale,
            item = 3,
            selectedItemId = activeNo,
            onItemClick = valueChanged
        )
        DrawerItem(
            context = context,
            drawerState = drawerState,
            coroutineScope = coroutineScope,
            text = "Services",
            icon = CustomIcon.Services,
            item = 4,
            selectedItemId = activeNo,
            onItemClick = valueChanged
        )
    }
}

@Composable
fun DrawerHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.18F)
            .background(color = MaterialTheme.colorScheme.background)
//            .background(color = MaterialTheme.colorScheme.primary.copy(alpha = 0.6F))
            .padding(horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = R.drawable.dove),
            contentDescription = "Church Image",
            modifier = Modifier
                .width(50.dp)
                .height(50.dp),
            contentScale = ContentScale.FillHeight
        )
        Spacer(modifier = Modifier.width(20.dp))
        Text(
            text = "Repentance And Holiness Students Fellowship",
            fontSize = 20.sp,
//            color = Color.White,
            fontWeight = FontWeight.Bold
        )
    }

}

@Composable
fun DrawerItem(
    context: Context,
    drawerState: DrawerState,
    coroutineScope: CoroutineScope,
    text: String,
    icon: ImageVector,
    item: Int,
    selectedItemId: Int,
    onItemClick: (Int) -> Unit
) {
    val backgroundColor =
        if (item == selectedItemId) MaterialTheme.colorScheme.primary else Color.Transparent
    Row(
        modifier = Modifier
            .padding(end = 20.dp, top = 5.dp, bottom = 5.dp)
            .fillMaxWidth()
            .clip(
                RoundedCornerShape(
                    bottomEnd = 20.dp,
                    topEnd = 20.dp
                )
            )
            .background(backgroundColor)
            .clickable {
                if (drawerState.isClosed) {
                    coroutineScope.launch {
                        drawerState.open()
                    }
                } else {
                    coroutineScope.launch {
                        drawerState.close()
                    }
                }
                onItemClick(item)
                Toast
                    .makeText(context, "Clicked item $item", Toast.LENGTH_SHORT)
                    .show()
            }
            .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.Start),
    ) {
        Icon(
            icon,
            contentDescription = text,
            modifier = Modifier
                .padding(5.dp)
                .size(30.dp)
        )
        Text(
            text = text,
//            modifier = Modifier.padding(horizontal = 16.dp),
            style = MaterialTheme.typography.titleMedium,
//            color = Color.Black
        )
    }
}

@Preview(name = "DrawerContent", showBackground = true)
@Composable
private fun PreviewDrawerContent() {
    val mainActivity: Activity = MainActivity()
    val context = mainActivity as Context
    val coroutineScope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Open)
    Box(modifier = Modifier.fillMaxWidth()) {
        DrawerContent(
            context = context,
            coroutineScope = coroutineScope,
            drawerState = drawerState,
            activeNo = 1,
            valueChanged = {

            }
        )
    }
}