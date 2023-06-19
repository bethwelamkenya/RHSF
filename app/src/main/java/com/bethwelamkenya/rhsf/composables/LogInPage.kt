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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bethwelamkenya.rhsf.icons.CustomIcon
import com.bethwelamkenya.rhsf.icons.customicon.*
import com.bethwelamkenya.rhsf.ui.theme.*

@Composable
fun LogInPage(
    context: Context,
    modifier: Modifier = Modifier
) {
    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var enabled by remember { mutableStateOf(false) }
    val focusRequester = remember { List(2) { FocusRequester() } }
    Box(modifier) {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.tertiary) {
            Box(modifier = Modifier.fillMaxSize()) {
                Row(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .offset(y = 230.dp),
                    horizontalArrangement = Arrangement.spacedBy(
                        30.dp,
                        Alignment.CenterHorizontally
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .clickable { }
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(
                            10.dp,
                            Alignment.CenterVertically
                        )
                    ) {
                        Image(
                            CustomIcon.GoogleLogo,
                            contentDescription = "Google",
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(color = MaterialTheme.colorScheme.secondary.copy(alpha = 0.75F))
                                .padding(10.dp)
                                .size(30.dp)
                        )
                        Text(text = "Google", color = MaterialTheme.colorScheme.primary)
                    }
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .clickable { }
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(
                            10.dp,
                            Alignment.CenterVertically
                        )
                    ) {
                        Image(
                            CustomIcon.FacebookNew,
                            contentDescription = "Facebook",
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(color = MaterialTheme.colorScheme.secondary.copy(alpha = 0.75F))
                                .padding(10.dp)
                                .size(30.dp)
                        )
                        Text(text = "FaceBook", color = MaterialTheme.colorScheme.primary)
                    }
                }

                Column(
                    modifier = Modifier.align(Alignment.BottomCenter),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Terms And Conditions",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .clickable { }
                            .padding(5.dp),
                        color = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                }
            }
        }
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.3F),
            color = MaterialTheme.colorScheme.primary,
            shape = RoundedCornerShape(0, 0, 25, 25)
        ) {
            Box {
                Image(
                    CustomIcon.CircledUserMale,
                    contentDescription = "Log In",
                    modifier = Modifier
                        .size(150.dp)
                        .align(Alignment.TopCenter)
                        .offset(y = 20.dp)
                )
            }
        }
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.85F)
                .fillMaxHeight(0.5F)
                .align(Alignment.Center)
                .offset(y = (-50).dp),
            shape = RoundedCornerShape(60.dp),
            color = MaterialTheme.colorScheme.secondary,
            shadowElevation = 10.dp
        ) {
            Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Log In", fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                Spacer(modifier = Modifier.height(30.dp))
                CustomTextField(
                    context = context,
                    modifier = Modifier
                        .focusRequester(focusRequester[0])
                        .fillMaxWidth(0.8F),
                    value = userName,
                    onValueChange = {
                        userName = it
                        enabled = password.isNotEmpty() && userName.isNotEmpty()
                    },
                    text = "User Name",
                    placeHolder = "Enter Your User name",
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                    keyboardActions = KeyboardActions(onNext = { focusRequester[1].requestFocus() }),
                    leadingIcon = CustomIcon.User
                )
                Spacer(modifier = Modifier.height(10.dp))
                CustomPasswordField(
                    context = context,
                    modifier = Modifier
                        .focusRequester(focusRequester[1])
                        .fillMaxWidth(0.8F),
                    value = password,
                    onValueChange = {
                        password = it
                        enabled = password.isNotEmpty() && userName.isNotEmpty()
                    },
                    text = "Password",
                    placeHolder = "Enter Your Password",
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    leadingIcon = CustomIcon.Password
                )
                Spacer(modifier = Modifier.height(15.dp))
                Box(modifier = Modifier.fillMaxWidth(0.9F)) {
                    Text(
                        text = "Forgot Password?",
                        textAlign = TextAlign.End,
                        color = TextBlack,
                        modifier = Modifier
                            .align(Alignment.CenterEnd)
                            .clip(RoundedCornerShape(10.dp))
                            .clickable { }
                            .padding(5.dp)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                CustomButton(
                    context = context,
                    modifier = Modifier.fillMaxWidth(0.5F),
                    text = "Log In",
                    icon = CustomIcon.LoginRoundedRight,
                    onClick = { },
                    enabled = enabled
                )
            }
        }
    }
}

@Preview(name = "LogInPage")
@Composable
private fun PreviewLogInPage() {
//    val context: Context =
//    LogInPage(context)
}