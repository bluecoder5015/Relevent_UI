package com.example.relevent.Fragments

import android.app.DatePickerDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.relevent.R
import kotlinx.android.synthetic.main.fragment_add.*
import java.text.SimpleDateFormat
import java.util.*
import javax.xml.datatype.DatatypeConstants.MONTHS


/**
 * A simple [Fragment] subclass.
 */
class AddFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView: View = inflater.inflate(R.layout.fragment_add, container, false)

        val button= rootView.findViewById<ImageButton>(R.id.open_calender)
        var text_time =rootView.findViewById<EditText>(R.id.time_input)



        val c = Calendar.getInstance()

        button.setOnClickListener(object :View.OnClickListener
        {
            var formate=SimpleDateFormat("dd MMM, YYYY",Locale.US)
                override fun onClick(v: View?) {
                    //TODO("Not yet implemented")
                    val datePicker =
                        getActivity()?.let {
                            DatePickerDialog(
                                it, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                                    val selectedDate=Calendar.getInstance()
                                    selectedDate.set(Calendar.YEAR,year)
                                    selectedDate.set(Calendar.MONTH,month)
                                    selectedDate.set(Calendar.DAY_OF_MONTH,dayOfMonth)
                                    val date = formate.format(selectedDate.time)
                                    text_time.setText(date)
                                },
                                c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH))
                        }

                    if (datePicker != null) {
                        datePicker.show()
                    }

                }

        })

        return rootView
    }

}



