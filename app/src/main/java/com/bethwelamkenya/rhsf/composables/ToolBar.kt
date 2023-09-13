package com.bethwelamkenya.rhsf.composables

import android.app.Activity
import android.content.Context
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bethwelamkenya.rhsf.MainActivity
import com.bethwelamkenya.rhsf.icons.CustomIcon
import com.bethwelamkenya.rhsf.icons.customicon.CircledMenu
import com.bethwelamkenya.rhsf.icons.customicon.CircledUserMale
import com.bethwelamkenya.rhsf.icons.customicon.Menu
import com.bethwelamkenya.rhsf.icons.customicon.Search
import com.bethwelamkenya.rhsf.icons.customicon.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolBar(
    context: Context,
    drawerState: DrawerState,
    coroutineScope: CoroutineScope,
    title: String = "Home"
) {
    var isSearching by remember {
        mutableStateOf(false)
    }
    var searchQuery by remember {
        mutableStateOf("")
    }
    val focusRequester = remember { FocusRequester() }
    TopAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 10.dp),
        title = {
            Row {
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge
                )
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.background,
//            containerColor = Color.Transparent,
        ),
        navigationIcon = {
            Icon(
                CustomIcon.Menu,
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
                    .size(28.dp)
            )
        },
        actions = {
            AnimatedVisibility(visible = isSearching) {
                OutlinedTextField(
                    modifier = Modifier.focusRequester(focusRequester),
                    value = searchQuery,
                    onValueChange = {
                        searchQuery = it
                    },
//                                    textStyle = TextStyle(fontSize = 12.sp),
                    label = { Text(text = "Search") },
                    placeholder = { Text(text = "Search Query") },
                    singleLine = true,
                    leadingIcon = {
                        Icon(
                            CustomIcon.Search,
                            contentDescription = "Search",
                            modifier = Modifier.size(25.dp)
                        )
                    },
                    shape = RoundedCornerShape(40),
                    keyboardActions = KeyboardActions(onDone = { isSearching = false }),
                )
            }
            AnimatedVisibility(visible = !isSearching) {
                Image(
                    CustomIcon.Search,
                    contentDescription = "Search",
                    modifier = Modifier
                        .padding(5.dp)
                        .size(28.dp)
                        .clickable {
                            isSearching = true
//                                focusRequester.requestFocus()
                        }
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                CustomIcon.User,
                contentDescription = "Search",
                modifier = Modifier
                    .padding(5.dp)
                    .size(28.dp)
            )
        }
    )
}

@Preview(name = "ToolBar", showBackground = true)
@Composable
private fun PreviewToolBar() {
    val mainActivity: Activity = MainActivity()
    val context = mainActivity as Context
    val coroutineScope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    ToolBar(context = context, coroutineScope = coroutineScope, drawerState = drawerState)
}