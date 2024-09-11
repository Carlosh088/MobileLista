package com.example.myapplication.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.unit.dp
import com.example.myapplication.models.Tarefa
import com.example.myapplication.views.widget.WidgetTarefa

@Composable
fun MainGui(){
    Box(){
        Text(modifier = Modifier.background(Blue).align(Alignment.BottomEnd), text = "+")
    }

    Column {
        var tarefa1 = Tarefa("Aniversário do amigo", "15/09")
        WidgetTarefa(tarefa1)

        var tarefa2 = Tarefa("Consulta médica", "17/09")
        WidgetTarefa(tarefa2)

        var tarefa3 = Tarefa("Passeio em família", "23/09")
        WidgetTarefa(tarefa3)
    }
}