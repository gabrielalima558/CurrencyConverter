package com.example.converter.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.converter.R
import com.example.converter.viewmodel.CurrencyViewModel
import com.example.converter.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.list_fragment.view.*

class ListFragment : Fragment() {
    val list = ArrayList<String>()

    private val viewModel: CurrencyViewModel by lazy {
        ViewModelProvider(this, ViewModelFactory).get(CurrencyViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.list_fragment, container, false)
        val context = inflater.context


        viewModel.getList(getString(R.string.key_api))
        viewModel.list().observe(this, Observer {
            list.add("AED" + " " + it.currencies.AED)
            list.add("AFN" + " " + it.currencies.AFN)
            list.add("ALL" + " " + it.currencies.ALL)
            list.add("AMD" + " " + it.currencies.AMD)
            list.add("ANG" + " " + it.currencies.ANG)
            list.add("AOA" + " " + it.currencies.AOA)
            list.add("ARS" + " " + it.currencies.ARS)
            list.add("AUD" + " " + it.currencies.AUD)
            list.add("AWG" + " " + it.currencies.AWG)
            list.add("AZN" + " " + it.currencies.AZN)
            list.add("BAM" + " " + it.currencies.BAM)
            list.add("BBD" + " " + it.currencies.BBD)
            list.add("BDT" + " " + it.currencies.BDT)
            list.add("BGN" + " " + it.currencies.BGN)
            list.add("BHD" + " " + it.currencies.BHD)
            list.add("BIF" + " " + it.currencies.BIF)
            list.add("BMD" + " " + it.currencies.BMD)
            list.add("BND" + " " + it.currencies.BND)
            list.add("BOB" + " " + it.currencies.BOB)
            list.add("BRL" + " " + it.currencies.BRL)
            list.add("BSD" + " " + it.currencies.BSD)
            list.add("BTC" + " " + it.currencies.BTC)
            list.add("BTN" + " " + it.currencies.BTN)
            list.add("BWP" + " " + it.currencies.BWP)
            list.add("BYN" + " " + it.currencies.BYN)
            list.add("BYR" + " " + it.currencies.BYR)
            list.add("BZD" + " " + it.currencies.BZD)
            list.add("CAD" + " " + it.currencies.CAD)
            list.add("CDF" + " " + it.currencies.CDF)
            list.add("CHF" + " " + it.currencies.CHF)
            list.add("CLF" + " " + it.currencies.CLF)
            list.add("CLP" + " " + it.currencies.CLP)
            list.add("CNY" + " " + it.currencies.CNY)
            list.add("COP" + " " + it.currencies.COP)
            list.add("CRC" + " " + it.currencies.CRC)
            list.add("CUC" + " " + it.currencies.CUC)
            list.add("CUP" + " " + it.currencies.CUP)
            list.add("CVE" + " " + it.currencies.CVE)
            list.add("CZK" + " " + it.currencies.CZK)
            list.add("DJF" + " " + it.currencies.DJF)
            list.add("DKK" + " " + it.currencies.DKK)
            list.add("DOP" + " " + it.currencies.DOP)
            list.add("DZD" + " " + it.currencies.DZD)
            list.add("EGP" + " " + it.currencies.EGP)
            list.add("ERN" + " " + it.currencies.ERN)
            list.add("ETB" + " " + it.currencies.ETB)
            list.add("EUR" + " " + it.currencies.EUR)
            list.add("FJD" + " " + it.currencies.FJD)
            list.add("FKP" + " " + it.currencies.FKP)
            list.add("GBP" + " " + it.currencies.GBP)
            list.add("GEL" + " " + it.currencies.GEL)
            list.add("GGP" + " " + it.currencies.GGP)
            list.add("GHS" + " " + it.currencies.GHS)
            list.add("GIP" + " " + it.currencies.GIP)
            list.add("GMD" + " " + it.currencies.GMD)
            list.add("GNF" + " " + it.currencies.GNF)
            list.add("GTQ" + " " + it.currencies.GTQ)
            list.add("GYD" + " " + it.currencies.GYD)
            list.add("HKD" + " " + it.currencies.HKD)
            list.add("HNL" + " " + it.currencies.HNL)
            list.add("HRK" + " " + it.currencies.HRK)
            list.add("HTG" + " " + it.currencies.HTG)
            list.add("HUF" + " " + it.currencies.HUF)
            list.add("IDR" + " " + it.currencies.IDR)
            list.add("ILS" + " " + it.currencies.ILS)
            list.add("IMP" + " " + it.currencies.IMP)
            list.add("INR" + " " + it.currencies.INR)
            list.add("IQD" + " " + it.currencies.IQD)
            list.add("IRR" + " " + it.currencies.IRR)
            list.add("ISK" + " " + it.currencies.ISK)
            list.add("JEP" + " " + it.currencies.JEP)
            list.add("JMD" + " " + it.currencies.JMD)
            list.add("JOD" + " " + it.currencies.JOD)
            list.add("JPY" + " " + it.currencies.JPY)
            list.add("KES" + " " + it.currencies.KES)
            list.add("KGS" + " " + it.currencies.KGS)
            list.add("KHR" + " " + it.currencies.KHR)
            list.add("KMF" + " " + it.currencies.KMF)
            list.add("KPW" + " " + it.currencies.KPW)
            list.add("KRW" + " " + it.currencies.KRW)
            list.add("KWD" + " " + it.currencies.KWD)
            list.add("KYD" + " " + it.currencies.KYD)
            list.add("KZT" + " " + it.currencies.KZT)
            list.add("LAK" + " " + it.currencies.LAK)
            list.add("LBP" + " " + it.currencies.LBP)
            list.add("LKR" + " " + it.currencies.LKR)
            list.add("LRD" + " " + it.currencies.LRD)
            list.add("LSL" + " " + it.currencies.LSL)
            list.add("LTL" + " " + it.currencies.LTL)
            list.add("LVL" + " " + it.currencies.LVL)
            list.add("LYD" + " " + it.currencies.LYD)
            list.add("MAD" + " " + it.currencies.MAD)
            list.add("MDL" + " " + it.currencies.MDL)
            list.add("MGA" + " " + it.currencies.MGA)
            list.add("MKD" + " " + it.currencies.MKD)
            list.add("MMK" + " " + it.currencies.MMK)
            list.add("MNT" + " " + it.currencies.MNT)
            list.add("MOP" + " " + it.currencies.MOP)
            list.add("MRO" + " " + it.currencies.MRO)
            list.add("MUR" + " " + it.currencies.MUR)
            list.add("MVR" + " " + it.currencies.MVR)
            list.add("MWK" + " " + it.currencies.MWK)
            list.add("MXN" + " " + it.currencies.MXN)
            list.add("MYR" + " " + it.currencies.MYR)
            list.add("MZN" + " " + it.currencies.MZN)
            list.add("NAD" + " " + it.currencies.NAD)
            list.add("NGN" + " " + it.currencies.NGN)
            list.add("NIO" + " " + it.currencies.NIO)
            list.add("NOK" + " " + it.currencies.NOK)
            list.add("NPR" + " " + it.currencies.NPR)
            list.add("NZD" + " " + it.currencies.NZD)
            list.add("OMR" + " " + it.currencies.OMR)
            list.add("PAB" + " " + it.currencies.PAB)
            list.add("PEN" + " " + it.currencies.PEN)
            list.add("PGK" + " " + it.currencies.PGK)
            list.add("PHP" + " " + it.currencies.PHP)
            list.add("PKR" + " " + it.currencies.PKR)
            list.add("PLN" + " " + it.currencies.PLN)
            list.add("PYG" + " " + it.currencies.PYG)
            list.add("QAR" + " " + it.currencies.QAR)
            list.add("RON" + " " + it.currencies.RON)
            list.add("RSD" + " " + it.currencies.RSD)
            list.add("RUB" + " " + it.currencies.RUB)
            list.add("RWF" + " " + it.currencies.RWF)
            list.add("SAR" + " " + it.currencies.SAR)
            list.add("SBD" + " " + it.currencies.SBD)
            list.add("SCR" + " " + it.currencies.SCR)
            list.add("SDG" + " " + it.currencies.SDG)
            list.add("SEK" + " " + it.currencies.SEK)
            list.add("SGD" + " " + it.currencies.SGD)
            list.add("SHP" + " " + it.currencies.SHP)
            list.add("SLL" + " " + it.currencies.SLL)
            list.add("SOS" + " " + it.currencies.SOS)
            list.add("SRD" + " " + it.currencies.SRD)
            list.add("STD" + " " + it.currencies.STD)
            list.add("SVC" + " " + it.currencies.SVC)
            list.add("SYP" + " " + it.currencies.SYP)
            list.add("SZL" + " " + it.currencies.SZL)
            list.add("THB" + " " + it.currencies.THB)
            list.add("TJS" + " " + it.currencies.TJS)
            list.add("TMT" + " " + it.currencies.TMT)
            list.add("TND" + " " + it.currencies.TND)
            list.add("TOP" + " " + it.currencies.TOP)
            list.add("TRY" + " " + it.currencies.TRY)
            list.add("TTD" + " " + it.currencies.TTD)
            list.add("TWD" + " " + it.currencies.TWD)
            list.add("TZS" + " " + it.currencies.TZS)
            list.add("UAH" + " " + it.currencies.UAH)
            list.add("UGX" + " " + it.currencies.UGX)
            list.add("USD" + " " + it.currencies.USD)
            list.add("UYU" + " " + it.currencies.UYU)
            list.add("UZS" + " " + it.currencies.UZS)
            list.add("VEF" + " " + it.currencies.VEF)
            list.add("VND" + " " + it.currencies.VND)
            list.add("VUV" + " " + it.currencies.VUV)
            list.add("WST" + " " + it.currencies.WST)
            list.add("XAF" + " " + it.currencies.XAF)
            list.add("XAG" + " " + it.currencies.XAG)
            list.add("XAU" + " " + it.currencies.XAU)
            list.add("XCD" + " " + it.currencies.XCD)
            list.add("XDR" + " " + it.currencies.XDR)
            list.add("XOF" + " " + it.currencies.XOF)
            list.add("XPF" + " " + it.currencies.XPF)
            list.add("YER" + " " + it.currencies.YER)
            list.add("ZAR" + " " + it.currencies.ZAR)
            list.add("ZMK" + " " + it.currencies.ZMK)
            list.add("ZMW" + " " + it.currencies.ZMW)
            list.add("ZWL" + " " + it.currencies.ZWL)

            val adapter: ArrayAdapter<String> = ArrayAdapter(context,android.R.layout.simple_expandable_list_item_1, list)
            view.list_view.adapter = adapter

            search(view, context)

        })

        return view
    }
    private fun search(view: View, context: Context){
        val search = view.edit_search

        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(texto: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(texto: String?): Boolean {

                if (!texto.isNullOrBlank()) {

                    val itensFiltrados = filterBy(texto)
                    val adapter: ArrayAdapter<String> = ArrayAdapter(context,android.R.layout.simple_expandable_list_item_1, itensFiltrados)
                    view.list_view.adapter = adapter

                }

                return true
            }
        })
    }
    private fun filterBy(texto: String): List<String> {

        return list.filter { item -> item.contains(texto, true) }
    }

}
