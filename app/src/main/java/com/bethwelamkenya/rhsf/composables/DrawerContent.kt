package com.bethwelamkenya.rhsf.composables

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
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
        drawerShape = RoundedCornerShape(0.dp, 30.dp, 0.dp, 0.dp),
        drawerContainerColor = MaterialTheme.colorScheme.tertiary,
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
            .clip(RoundedCornerShape(bottomEnd = 10.dp, bottomStart = 10.dp))
            .background(color = MaterialTheme.colorScheme.primary)
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
        Text(
            text = "Repentance And Holiness Students Fellowship",
            fontSize = 22.sp,
            fontFamily = FontFamily.Serif,
            color = Color.White,
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
        if (item == selectedItemId) MaterialTheme.colorScheme.secondary else Color.Transparent
    Row(
        modifier = Modifier
            .padding(end = 20.dp, top = 5.dp, bottom = 5.dp)
            .fillMaxWidth()
            .clip(
                RoundedCornerShape(
                    bottomEnd = 30.dp,
                    topEnd = 30.dp
                )
            )
            .background(backgroundColor)
            .clickable {
//                            if (drawerState.isClosed) {
//                                coroutineScope.launch {
//                                    drawerState.open()
//                                }
//                            } else {
//                                coroutineScope.launch {
//                                    drawerState.close()
//                                }
//                            }
                onItemClick(item)
//                Toast
//                    .makeText(context, "Clicked item $item", Toast.LENGTH_SHORT)
//                    .show()
            }
            .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.Start),
    ) {
        Image(
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
            color = Color.Black
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(name = "DrawerContent")
@Composable
private fun PreviewDrawerContent() {
    val mainActivity: Activity = MainActivity()
    val context = mainActivity as Context
    val coroutineScope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Open)
    DrawerContent(
        context = context,
        coroutineScope = coroutineScope,
        drawerState = drawerState,
        activeNo = 1,
        valueChanged = {

        }
    )
}