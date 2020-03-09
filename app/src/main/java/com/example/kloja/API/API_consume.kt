package com.example.kloja.API

import org.patriques.*



class API_consume {
    val api = apiConnect()
    val currencyRate = api.foreignExchange.currencyExchangeRate("USD", "SEK")
    val currencyExchangeData = this.currencyRate.data


    fun getInfos() {
        try {
            var code = currencyExchangeData.getFromCurrencyCode()
            var name = currencyExchangeData.getFromCurrencyName()
            var tocurrency = currencyExchangeData.getToCurrencyCode()
            var currencyName = currencyExchangeData.getToCurrencyName()
            var curencyRate = currencyExchangeData.getExchangeRate()
            var time = currencyExchangeData.getTime()
        } catch (e: Exception) {
            print("Não Funcionou")
        }
    }

}
