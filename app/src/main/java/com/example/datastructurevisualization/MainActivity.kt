package com.example.datastructurevisualization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import com.example.datastructurevisualization.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var r: Int = 5
    var i: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener {
            insertElement()
        }

        binding.btnDelete.setOnClickListener {
            deleteElement()
        }
    }

    fun insertElement() {
        val element = binding.etInsertElemtent.text.toString()
        if (element.isNotBlank()) {
            if (i == 5) {
                Toast.makeText(this, "Stack is full can't insert", Toast.LENGTH_SHORT).show()
                binding.etInsertElemtent.setText("")
            }
            if (i == 0) {
                val element = binding.etInsertElemtent.text.toString()
                binding.tvFirstElement.text = element
                binding.firstTop.visibility = View.VISIBLE
                binding.etInsertElemtent.setText("")
                i++
            } else if (i == 1) {
                val element = binding.etInsertElemtent.text.toString()
                binding.tvSecondElement.text = element
                binding.secondTop.visibility = View.VISIBLE
                binding.firstTop.visibility = View.INVISIBLE
                binding.etInsertElemtent.setText("")
                i++
            } else if (i == 2) {
                val element = binding.etInsertElemtent.text.toString()
                binding.tvThirdElement.text = element
                binding.thirdTop.visibility = View.VISIBLE
                binding.secondTop.visibility = View.INVISIBLE
                binding.etInsertElemtent.setText("")
                i++
            } else if (i == 3) {
                val element = binding.etInsertElemtent.text.toString()
                binding.tvFourthElement.text = element
                binding.fourthTop.visibility = View.VISIBLE
                binding.thirdTop.visibility = View.INVISIBLE
                binding.etInsertElemtent.setText("")
                i++
            } else if (i == 4) {
                val element = binding.etInsertElemtent.text.toString()
                binding.tvFifthElement.text = element
                binding.fifthTop.visibility = View.VISIBLE
                binding.fourthTop.visibility = View.INVISIBLE
                binding.etInsertElemtent.setText("")
                i++
            }
        } else {
            Toast.makeText(this, "Please Enter a Number..", Toast.LENGTH_SHORT).show()
        }
    }

    fun deleteElement(){
        if (i == 0) {
            Toast.makeText(this, "Stack is Empty can't delete", Toast.LENGTH_SHORT).show()
        }
        if (i == 1) {
            binding.firstTop.visibility = View.INVISIBLE
            binding.tvFirstElement.setText("")
            i--
        } else if (i == 2) {
            binding.secondTop.visibility = View.INVISIBLE
            binding.firstTop.visibility = View.VISIBLE
            binding.tvSecondElement.setText("")
            i--
        } else if (i == 3) {
            binding.thirdTop.visibility = View.INVISIBLE
            binding.secondTop.visibility = View.VISIBLE
            binding.tvThirdElement.setText("")
            i--
        } else if (i == 4) {
            binding.fourthTop.visibility = View.INVISIBLE
            binding.thirdTop.visibility = View.VISIBLE
            binding.tvFourthElement.setText("")
            i--
        } else if (i == 5) {
            binding.fifthTop.visibility = View.INVISIBLE
            binding.fourthTop.visibility = View.VISIBLE
            binding.tvFifthElement.setText("")
            i--
        }
    }

}