package screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun RateUsScreen(
    id:Float,
    navController: NavController
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {

                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {

                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription =null )

                    }
                    Text(text = "Rate Us Screen")

                }

            )
        }


    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            Alignment.Center
        ) {
            Text(text = "You Rate Us $id")
        }
    }

}