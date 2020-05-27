package com.example.converter.view

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.converter.R
import com.example.converter.viewmodel.CurrencyViewModel
import com.example.converter.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.convert_fragment.*
import kotlinx.android.synthetic.main.convert_fragment.view.*

class ConvertFragment : Fragment() {

    private val viewModel: CurrencyViewModel by lazy {
        ViewModelProvider(this, ViewModelFactory).get(CurrencyViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.convert_fragment, container, false)

        view.button.setOnClickListener {
           setDataToConvert(view)
           getResult(view)

        }

        return view
    }
    private fun setDataToConvert(view: View){
        viewModel.getConvert(
            getString(R.string.key_api), view.edit_from.text.toString().toUpperCase(),
            view.edit_to.text.toString().toUpperCase(), view.edit_amount.text.toString().toInt()
        )
    }

    private fun getResult(view: View){
        viewModel.convert().observe(this, Observer {
            view.txt_result.text = it.result.toString()
            if(!it.success){
                view.txt_error.visibility = View.VISIBLE
                view.txt_error.requestFocus()
                view.hideKeyboard()
            }else{
                view.hideKeyboard()
            }
        })
    }
    fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }

}
