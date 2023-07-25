package com.example.translator_kmm.android.translate.voice_to_text.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.translator_kmm.android.TranslatorTheme
import com.example.translator_kmm.android.translate.presentation.components.gradientSurface
import kotlin.math.PI
import kotlin.math.sin

@Composable
fun VoiceRecorderDisplay(
    powerRatios: List<Float>,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(20.dp)
            )
            .clip(RoundedCornerShape(20.dp)) 
            .gradientSurface()
            .padding(
                horizontal = 32.dp,
                vertical = 8.dp
            )
            .drawBehind {
                val powerRatioWidth = 3.dp.toPx()
                val powerRatioCount = (size.width / (2 *  powerRatioWidth)).toInt()
            }
    )
}

@Preview
@Composable
fun VoiceRecorderDisplayPreview() {
    TranslatorTheme {
        VoiceRecorderDisplay(
            powerRatios = (0..50).map {
                val percent = it / 100f
                sin(percent * 2 * PI).toFloat()
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        )
    }
}