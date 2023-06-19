package com.bethwelamkenya.rhsf.composables

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bethwelamkenya.rhsf.icons.CustomIcon
import com.bethwelamkenya.rhsf.icons.customicon.Invisible
import com.bethwelamkenya.rhsf.icons.customicon.Visible
import com.bethwelamkenya.rhsf.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
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
    OutlinedTextField(
        modifier = modifier,
        value = value,
        onValueChange = { onValueChange(it) },
        singleLine = true,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = MaterialTheme.colorScheme.tertiary.copy(alpha = 0.5F),
            focusedBorderColor = Transparent,
            disabledBorderColor = Transparent,
            errorBorderColor = Transparent,
            unfocusedBorderColor = Transparent
//                    focusedTextColor = Color.White,
//                    unfocusedTextColor = Color.White
        ),
        maxLines = 1,
        shape = RoundedCornerShape(10.dp),
        label = { Text(text = text) },
        placeholder = { Text(text = placeHolder) },
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        enabled = enabled,
        readOnly = readOnly,
        leadingIcon = {
            if (leadingIcon != null) Image(
                leadingIcon, contentDescription = text,
                modifier = Modifier
                    .size(28.dp)
            )
        },
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomPasswordField(
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
    var finalValue by remember { mutableStateOf(value) }
    var iconPath by remember { mutableStateOf(CustomIcon.Visible) }
    var visibility by remember {
        mutableStateOf(VisualTransformation {
            TransformedText(
                AnnotatedString('\u2022'.toString().repeat(finalValue.length)),
                OffsetMapping.Identity
//                ValidatingOffsetMapping(AnnotatedString(value), AnnotatedString('\u2022'.toString().repeat(value.length)))
            )
        })
    }
    OutlinedTextField(
        modifier = modifier,
        value = finalValue,
        onValueChange = {
            finalValue = it
            onValueChange(it)
        },
        maxLines = 1,
        singleLine = true,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = MaterialTheme.colorScheme.tertiary.copy(alpha = 0.5F),
            focusedBorderColor = Transparent,
            disabledBorderColor = Transparent,
            errorBorderColor = Transparent,
            unfocusedBorderColor = Transparent
//                    focusedTextColor = Color.White,
//                    unfocusedTextColor = Color.White
        ),
        shape = RoundedCornerShape(10.dp),
        label = { Text(text = text) },
        placeholder = { Text(text = placeHolder) },
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visibility,
        leadingIcon = {
            if (leadingIcon != null) Image(
                leadingIcon, contentDescription = text,
                modifier = Modifier
                    .size(28.dp)
            )
        },
        trailingIcon = {
            Image(
                iconPath,
                contentDescription = "See Password",
                modifier = Modifier
                    .size(28.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .clickable(enabled = finalValue.isNotEmpty(), onClick = {
                        if (visibility == VisualTransformation.None) {
                            visibility = PasswordVisualTransformation()
                            iconPath = CustomIcon.Visible
                        } else {
                            visibility = VisualTransformation.None
                            iconPath = CustomIcon.Invisible
                        }
                    })
            )
        }
    )
}

@Composable
fun CustomButton(
    context: Context,
    modifier: Modifier = Modifier,
    text: String,
    icon: ImageVector,
    onClick: () -> Unit,
    enabled: Boolean = true,
    height: Dp = 50.dp
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.75F),
            disabledContainerColor = MaterialTheme.colorScheme.tertiary.copy(alpha = 0.5F)
        ),
        shape = RoundedCornerShape(10.dp),
        enabled = enabled,
        contentPadding = PaddingValues(horizontal = 30.dp, vertical = 10.dp),
    ) {
        Image(
            icon,
            contentDescription = text,
            modifier = Modifier.size((height - 10.dp))
        )
        Spacer(modifier = Modifier.width(20.dp))
        Text(
            text = text,
            fontSize = 20.sp
        )
    }
}
