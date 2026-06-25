package com.xp.mykmp


import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.xp.mykmp.comm.MessageHandler
import com.xp.mykmp.screen.MainScreen

@Composable
@Preview
fun App() {
    
//     val mainViewModel: MainViewModel by viewModel()
    
    MaterialTheme {
        MainScreen(
            MessageHandler().readMsg()
        )
    }
    
}

