package com.bethwelamkenya.rhsf.composables

import android.app.Activity
import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bethwelamkenya.rhsf.MainActivity
import com.bethwelamkenya.rhsf.icons.CustomIcon
import com.bethwelamkenya.rhsf.icons.customicon.Eye
import com.bethwelamkenya.rhsf.icons.customicon.Invisible
import com.bethwelamkenya.rhsf.icons.customicon.Password
import com.bethwelamkenya.rhsf.icons.customicon.Visible
import com.bethwelamkenya.rhsf.ui.theme.Transparent

@Composable
fun CustomPassword(
    context: Context,
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    text: String = "",
    placeHolder: String = "",
    enabled: Boolean = true,
    readOnly: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    leadingIcon: ImageVector? = null
) {
    val containerColor = MaterialTheme.colorScheme.background
    var finalValue by remember { mutableStateOf(value) }
    var iconPath by remember { mutableStateOf(CustomIcon.Eye) }
    var visible by remember { mutableStateOf(false) }
    OutlinedTextField(
        modifier = modifier
            .padding(5.dp)
            .shadow(elevation = 5.dp, shape = RoundedCornerShape(20.dp))
            .background(color = MaterialTheme.colorScheme.background),
        value = finalValue,
        onValueChange = {
            finalValue = it
            onValueChange(it)
        },
        singleLine = true,
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = containerColor,
            unfocusedContainerColor = containerColor,
            disabledContainerColor = containerColor,
            focusedBorderColor = Transparent,
            unfocusedBorderColor = Transparent,
            disabledBorderColor = Transparent,
            errorBorderColor = Transparent,
        ),
        maxLines = 1,
        shape = RoundedCornerShape(30.dp),
        label = { Text(text = text) },
        placeholder = { Text(text = placeHolder) },
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        enabled = enabled,
        readOnly = readOnly,
        visualTransformation = if (visible) VisualTransformation.None else PasswordVisualTransformation(),
        leadingIcon = {
            if (leadingIcon != null) Icon(
                leadingIcon, contentDescription = text,
                modifier = Modifier
                    .size(28.dp)
            )
        },
        trailingIcon = {
            Icon(
                iconPath,
                contentDescription = "See Password",
                modifier = Modifier
                    .size(28.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .clickable(enabled = finalValue.isNotEmpty(), onClick = {
                        if (visible) {
                            visible = false
                            iconPath = CustomIcon.Eye
                        } else {
                            visible = true
                            iconPath = CustomIcon.Invisible
                        }
                    })
            )
        }
    )
}

@Preview(name = "CustomPassword")
@Composable
private fun PreviewCustomPassword() {
    val mainActivity: Activity = MainActivity()
    val context = mainActivity as Context
    var password by remember { mutableStateOf("") }
    CustomPassword(
        context = context,
        modifier = Modifier
            .fillMaxWidth(0.8F),
        value = password,
        onValueChange = {
            password = it
        },
        text = "Password",
        placeHolder = "Enter Your Password",
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        leadingIcon = CustomIcon.Password
    )
}