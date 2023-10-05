package com.bethwelamkenya.rhsf.composables

import android.app.Activity
import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bethwelamkenya.rhsf.MainActivity

@Composable
fun Services(
    context: Context
) {
    Column(
        modifier = Modifier.padding(top = 60.dp)
//        modifier = Modifier.padding(top = 60.dp, start = 10.dp, end = 10.dp)
    ) {
        Row(
            modifier = Modifier.background(MaterialTheme.colorScheme.primary.copy(alpha = 0.4F)),
            horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Day",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1F, true)
                    .padding(10.dp)
            )
            Text(
                text = "Event(s)",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(2F, true)
                    .padding(10.dp)
            )
            Text(
                text = "Venue",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1F, true)
                    .padding(10.dp)
            )
            Text(
                text = "Time",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1F, true)
                    .padding(10.dp)
            )
        }
        Row(
            modifier = Modifier.background(MaterialTheme.colorScheme.background),
            horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Monday",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .weight(1F, true)
                    .padding(10.dp)
            )
            Column(
                modifier = Modifier
                    .weight(4F, true)
            ) {
                Row {
                    Text(
                        text = "1. Morning Prayers",
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .weight(2F, true)
                            .padding(10.dp)
                    )
                    Text(
                        text = "Altar",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .weight(1F, true)
                            .padding(10.dp)
                    )
                    Text(
                        text = "5.00AM\n-\n6.00AM",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .weight(1F, true)
                            .padding(10.dp)
                    )
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.4F))
                )
                Row {
                    Text(
                        text = "2. Departmental Prayers",
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .weight(2F, true)
                            .padding(10.dp)
                    )
                    Text(
                        text = "Altar",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .weight(1F, true)
                            .padding(10.dp)
                    )
                    Text(
                        text = "5.00PM\n-\n6.00PM",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .weight(1F, true)
                            .padding(10.dp)
                    )
                }

            }
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.4F))
        )
        Row(
            modifier = Modifier.background(MaterialTheme.colorScheme.background),
            horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Teusday",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .weight(1F, true)
                    .padding(10.dp)
            )
            Column(
                modifier = Modifier
                    .weight(4F, true)
            ) {
                Row {
                    Text(
                        text = "1. Morning Prayers",
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .weight(2F, true)
                            .padding(10.dp)
                    )
                    Text(
                        text = "Altar",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .weight(1F, true)
                            .padding(10.dp)
                    )
                    Text(
                        text = "5.00AM\n-\n6.00AM",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .weight(1F, true)
                            .padding(10.dp)
                    )
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.4F))
                )
                Row {
                    Text(
                        text = "2. Departmental Prayers",
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .weight(2F, true)
                            .padding(10.dp)
                    )
                    Text(
                        text = "Altar",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .weight(1F, true)
                            .padding(10.dp)
                    )
                    Text(
                        text = "5.00PM\n-\n6.00PM",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .weight(1F, true)
                            .padding(10.dp)
                    )
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.4F))
                )
                Row {
                    Text(
                        text = "3. Students Fellowship",
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .weight(2F, true)
                            .padding(10.dp)
                    )
                    Text(
                        text = "NCT8",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .weight(1F, true)
                            .padding(10.dp)
                    )
                    Text(
                        text = "7.00PM\n-\n8.30PM",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .weight(1F, true)
                            .padding(10.dp)
                    )
                }
            }
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.4F))
        )

    }
}

@Preview(name = "Services", showBackground = true)
@Composable
private fun PreviewServices() {
    val mainActivity: Activity = MainActivity()
    val context = mainActivity as Context
    Services(context = context)
}