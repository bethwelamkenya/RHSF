package com.bethwelamkenya.rhsf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bethwelamkenya.rhsf.composables.DrawerContent
import com.bethwelamkenya.rhsf.composables.HomeContent
import com.bethwelamkenya.rhsf.composables.HomeDrawerContent
import com.bethwelamkenya.rhsf.composables.HomePage
import com.bethwelamkenya.rhsf.composables.HomeTopAppBar
import com.bethwelamkenya.rhsf.composables.LogInPage
import com.bethwelamkenya.rhsf.composables.ToolBar
import com.bethwelamkenya.rhsf.ui.theme.RHSFTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkTheme = isSystemInDarkTheme()
            val window = this.window
//            window.statusBarColor = 0xCBA6F0
//            window.statusBarColor = if (darkTheme) 0XFFFFFF else 0X333333
            RHSFTheme (darkTheme = darkTheme) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val activeNo = remember { mutableStateOf(1) }
                    val coroutineScope = rememberCoroutineScope()
                    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
                    ModalNavigationDrawer(
                        drawerContent = {
                            DrawerContent(
                                context = this,
                                drawerState = drawerState,
                                coroutineScope = coroutineScope,
                                activeNo = activeNo.value,
                                valueChanged = {
                                    activeNo.value = it
                                }
                            )
                        },
                        drawerState = drawerState
                    ) {
                        Scaffold(
                            modifier = Modifier.fillMaxSize(),
                            containerColor = MaterialTheme.colorScheme.tertiary.copy(0.25F),
                            topBar = { ToolBar(context = this, drawerState = drawerState, coroutineScope = coroutineScope) }
                        ) {
                            val pad = it
        //                    LogInPage(context = this)
                            HomePage(context = this)
        //                    Greeting("Android")
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RHSFTheme {
        Greeting("Android")
    }
}