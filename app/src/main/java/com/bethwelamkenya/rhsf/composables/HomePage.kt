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
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bethwelamkenya.rhsf.R
import com.bethwelamkenya.rhsf.icons.CustomIcon
import com.bethwelamkenya.rhsf.icons.customicon.CheckedUserMale
import com.bethwelamkenya.rhsf.icons.customicon.CircledMenu
import com.bethwelamkenya.rhsf.icons.customicon.CircledUserMale
import com.bethwelamkenya.rhsf.icons.customicon.Group
import com.bethwelamkenya.rhsf.icons.customicon.Home
import com.bethwelamkenya.rhsf.icons.customicon.HomeFilled
import com.bethwelamkenya.rhsf.icons.customicon.Search
import com.bethwelamkenya.rhsf.icons.customicon.Services
import com.bethwelamkenya.rhsf.icons.customicon.SortByClosingDate
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(
    context: Context,
    modifier: Modifier = Modifier
) {
    var isSearching by remember {
        mutableStateOf(false)
    }
    var searchQuery by remember {
        mutableStateOf("")
    }
    val coroutineScope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet(
                modifier = Modifier.fillMaxWidth(0.75F),
                drawerShape = RoundedCornerShape(0.dp, 30.dp, 30.dp, 0.dp),
                drawerContainerColor = MaterialTheme.colorScheme.tertiary,
//                drawerContentColor = MaterialTheme.colorScheme.primary,
                drawerTonalElevation = 10.dp
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                ) {

                    Surface(
                        modifier = Modifier
                            .fillMaxHeight(0.18F)
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(0.dp, 0.dp, 50.dp, 0.dp),
                        color = MaterialTheme.colorScheme.primary
                    ) {
                    }
                    Column(modifier = Modifier.fillMaxSize()) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(0.18F)
                                .padding(horizontal = 15.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
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
                                fontSize = 24.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.White,
                                fontWeight = FontWeight.ExtraBold
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
                            Image(
                                CustomIcon.Home,
                                contentDescription = "Home",
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(30.dp)
                            )
                            Text(
                                text = "Home",
                                style = MaterialTheme.typography.titleMedium,
                                color = Color.Black
                            )
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
                            Image(
                                CustomIcon.Group,
                                contentDescription = "Members",
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(30.dp)
                            )
                            Text(
                                text = "Members",
                                style = MaterialTheme.typography.titleMedium,
                                color = Color.Black
                            )
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
                            Image(
                                CustomIcon.CheckedUserMale,
                                contentDescription = "Attendances",
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(30.dp)
                            )
                            Text(
                                text = "Attendances",
                                style = MaterialTheme.typography.titleMedium,
                                color = Color.Black
                            )
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
                            Image(
                                CustomIcon.Services,
                                contentDescription = "Services",
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(30.dp)
                            )
                            Text(
                                text = "Services",
                                style = MaterialTheme.typography.titleMedium,
                                color = Color.Black
                            )
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
                            Image(
                                CustomIcon.HomeFilled,
                                contentDescription = "Home",
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(30.dp)
                            )
                            Text(
                                text = "Home",
                                style = MaterialTheme.typography.titleMedium,
                                color = Color.Black
                            )
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
                            Image(
                                CustomIcon.HomeFilled,
                                contentDescription = "Home",
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(30.dp)
                            )
                            Text(
                                text = "Home",
                                style = MaterialTheme.typography.titleMedium,
                                color = Color.Black
                            )
                        }
                    }
                }
            }
        },
        drawerState = drawerState
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = MaterialTheme.colorScheme.tertiary.copy(0.25F),
            topBar = {
                Box(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    TopAppBar(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .fillMaxWidth(),
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
                            if (isSearching) {
                                OutlinedTextField(
                                    value = searchQuery,
                                    onValueChange = {
                                        searchQuery = it
                                    },
                                    label = {Text(text = "Search")},
                                    placeholder = { Text(text = "Search Query")},
                                    singleLine = true,
                                    leadingIcon = {
                                                  Image(CustomIcon.Search, contentDescription = "Search", modifier = Modifier.size(25.dp))
                                    },
                                    shape = RoundedCornerShape(40),
                                    keyboardActions = KeyboardActions(onDone = {isSearching = false  }),
                                )
                            } else {
                                Image(
                                    CustomIcon.Search,
                                    contentDescription = "Search",
                                    modifier = Modifier
                                        .padding(5.dp)
                                        .size(30.dp)
                                        .clickable {
                                            isSearching = true
                                        }
                                )
                            }
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