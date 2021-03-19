/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package codes.chrishorner.weatherchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    HomeUi()
}

@Composable
private fun HomeUi() {
    Surface(color = MaterialTheme.colors.background, modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                InsetAwareTopAppBar(
                    title = {
                        Text(
                            text = "Hello world",
                            style = MaterialTheme.typography.h6,
                        )
                    },
                    backgroundColor = MaterialTheme.colors.background,
                )
            }
        ) {
            Image(
                painter = painterResource(R.drawable.tree),
                contentDescription = stringResource(R.string.treeDesc),
                alignment = Alignment.CenterStart,
                contentScale = ContentScale.Fit,
                modifier = Modifier.fillMaxWidth().height(280.dp)
            )
        }
    }
}
