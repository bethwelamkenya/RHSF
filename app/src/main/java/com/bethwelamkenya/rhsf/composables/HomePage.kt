package com.bethwelamkenya.rhsf.composables

import android.content.Context
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
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bethwelamkenya.rhsf.R
import com.bethwelamkenya.rhsf.icons.CustomIcon
import com.bethwelamkenya.rhsf.icons.customicon.CircledMenu
import com.bethwelamkenya.rhsf.icons.customicon.CircledUserMale
import com.bethwelamkenya.rhsf.icons.customicon.HomeFilled
import com.bethwelamkenya.rhsf.icons.customicon.Search
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(
    context: Context,
    modifier: Modifier = Modifier
) {
    val coroutineScope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet(
                drawerShape = RoundedCornerShape(0.dp, 30.dp, 30.dp, 0.dp),
                drawerContainerColor = MaterialTheme.colorScheme.tertiary,
                drawerContentColor = MaterialTheme.colorScheme.primary,
                drawerTonalElevation = 10.dp
            ) {
                Box(modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()) {

                    Surface(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth(0.5F),
                        shape = RoundedCornerShape(0, 50, 50, 0),
                        color = MaterialTheme.colorScheme.secondary.copy(alpha = 0.8F)
                    ) {
                    }
                    Column(modifier = Modifier.fillMaxSize()) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.height(10.dp))
                            Image(
                                painter = painterResource(id = R.drawable.church),
                                contentDescription = "Church Image",
                                modifier = Modifier
                                    .width(75.dp)
                                    .height(100.dp),
                                contentScale = ContentScale.FillHeight
                            )
                            Text(
                                text = "Repentance And Holiness\nStudents Fellowship",
                                style = MaterialTheme.typography.titleLarge
                            )
                        }
                        Spacer(modifier = Modifier.height(15.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(15.dp),
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 5.dp)
                                .fillMaxWidth(0.95F)
                                .align(Alignment.CenterHorizontally)
                                .clip(RoundedCornerShape(10.dp))
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
                                }
                                .padding(5.dp)
                        ) {
                            Icon(
                                CustomIcon.HomeFilled,
                                contentDescription = "Home",
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(30.dp)
                            )
                            Text(text = "Home", style = MaterialTheme.typography.titleMedium)
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(15.dp),
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 5.dp)
                                .fillMaxWidth(0.95F)
                                .align(Alignment.CenterHorizontally)
                                .clip(RoundedCornerShape(10.dp))
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
                                }
                                .padding(5.dp)
                        ) {
                            Icon(
                                CustomIcon.HomeFilled,
                                contentDescription = "Home",
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(30.dp)
                            )
                            Text(text = "Home", style = MaterialTheme.typography.titleMedium)
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(15.dp),
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 5.dp)
                                .fillMaxWidth(0.95F)
                                .align(Alignment.CenterHorizontally)
                                .clip(RoundedCornerShape(10.dp))
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
                                }
                                .padding(5.dp)
                        ) {
                            Icon(
                                CustomIcon.HomeFilled,
                                contentDescription = "Home",
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(30.dp)
                            )
                            Text(text = "Home", style = MaterialTheme.typography.titleMedium)
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(15.dp),
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 5.dp)
                                .fillMaxWidth(0.95F)
                                .align(Alignment.CenterHorizontally)
                                .clip(RoundedCornerShape(10.dp))
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
                                }
                                .padding(5.dp)
                        ) {
                            Icon(
                                CustomIcon.HomeFilled,
                                contentDescription = "Home",
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(30.dp)
                            )
                            Text(text = "Home", style = MaterialTheme.typography.titleMedium)
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(15.dp),
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 5.dp)
                                .fillMaxWidth(0.95F)
                                .align(Alignment.CenterHorizontally)
                                .clip(RoundedCornerShape(10.dp))
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
                                }
                                .padding(5.dp)
                        ) {
                            Icon(
                                CustomIcon.HomeFilled,
                                contentDescription = "Home",
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(30.dp)
                            )
                            Text(text = "Home", style = MaterialTheme.typography.titleMedium)
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(15.dp),
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 5.dp)
                                .fillMaxWidth(0.95F)
                                .align(Alignment.CenterHorizontally)
                                .clip(RoundedCornerShape(10.dp))
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
                                }
                                .padding(5.dp)
                        ) {
                            Icon(
                                CustomIcon.HomeFilled,
                                contentDescription = "Home",
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(30.dp)
                            )
                            Text(text = "Home", style = MaterialTheme.typography.titleMedium)
                        }
                    }
                }
            }
        },
        drawerState = drawerState
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = MaterialTheme.colorScheme.tertiary,
            topBar = {
                Box(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    TopAppBar(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .fillMaxWidth(0.95F),
                        title = {
                            Text(
                                text = "Home",
                                style = MaterialTheme.typography.titleLarge
                            )
                        },
                        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                            containerColor = Color.Transparent,
                        ),
                        navigationIcon = {
                            Image(
                                CustomIcon.CircledMenu,
                                contentDescription = "Menu",
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
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
                                    }
                                    .padding(5.dp)
                                    .size(35.dp)
                            )
                        },
                        actions = {
                            Image(
                                CustomIcon.Search,
                                contentDescription = "Search",
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(30.dp)
                            )
                            Image(
                                CustomIcon.CircledUserMale,
                                contentDescription = "Search",
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(35.dp)
                            )
                        }
                    )
                }
            }
        ) {
            val pad = it
        }
    }

}

@Preview(name = "HomePage")
@Composable
private fun PreviewHomePage() {
//    HomePage()
}