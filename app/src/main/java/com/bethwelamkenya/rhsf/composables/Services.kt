package com.bethwelamkenya.rhsf.composables

import android.app.Activity
import android.content.Context
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bethwelamkenya.rhsf.MainActivity

@Composable
fun Services(
    context: Context
) {
    Box() {
        Text(text = "Services")
    }
}

@Preview(name = "Services")
@Composable
private fun PreviewServices() {
    val mainActivity: Activity = MainActivity()
    val context = mainActivity as Context
    Services(context = context)
}