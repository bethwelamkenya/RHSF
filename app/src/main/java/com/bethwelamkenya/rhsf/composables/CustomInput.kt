package com.bethwelamkenya.rhsf.composables

import android.app.Activity
import android.content.Context
import androidx.compose.foundation.background
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bethwelamkenya.rhsf.MainActivity
import com.bethwelamkenya.rhsf.icons.CustomIcon
import com.bethwelamkenya.rhsf.icons.customicon.User
import com.bethwelamkenya.rhsf.ui.theme.Transparent

@Composable
fun CustomInput(
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
    OutlinedTextField(
        modifier = modifier
            .padding(5.dp)
            .shadow(elevation = 5.dp, shape = RoundedCornerShape(20.dp))
            .background(color = MaterialTheme.colorScheme.background),
        value = value,
        onValueChange = { onValueChange(it) },
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
        leadingIcon = {
            if (leadingIcon != null) Icon(
                leadingIcon, contentDescription = text,
                modifier = Modifier
                    .size(28.dp)
            )
        },
    )
}

@Preview(name = "CustomInput", showBackground = true)
@Composable
private fun PreviewCustomInput() {
    val mainActivity: Activity = MainActivity()
    val context = mainActivity as Context
    var userName by remember { mutableStateOf("") }
    CustomInput(
        context = context,
        modifier = Modifier
            .fillMaxWidth(0.8F),
        value = userName,
        onValueChange = {
            userName = it
        },
        text = "User Name",
        placeHolder = "Enter Your User name",
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
        leadingIcon = CustomIcon.User
    )
}