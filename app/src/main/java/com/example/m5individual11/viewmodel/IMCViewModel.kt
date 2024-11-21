package com.example.m5individual11.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.m5individual11.model.ImcState
import java.text.DecimalFormat

class IMCViewModel : ViewModel() {
    var state by mutableStateOf(ImcState())
        private set


    // Cálculo del IMC
    fun calcularIMC(peso:String, altura : String) : String{



            var imc = 0.0

            if (altura.toDouble() > 0) {
                var imc = (peso.toDouble() /(alturaAcm(altura.toDouble()) * (alturaAcm(altura.toDouble()))))
                val dec = DecimalFormat("#.##")
                var imcString:String
                imcString = dec.format(imc)
                return imcString
            } else {
                return 0.0.toString()
        }
    }

    private fun alturaAcm(altura:Double):Double{
        val alturacm =(altura/100)
        return alturacm
    }
}
