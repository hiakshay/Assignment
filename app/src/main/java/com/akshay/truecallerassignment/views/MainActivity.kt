package com.akshay.truecallerassignment.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.akshay.truecallerassignment.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.LiveData
import com.akshay.truecallerassignment.databinding.ActivityMainBinding
import debouncedOnClick


@AndroidEntryPoint
open class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setUpView()
        setUpObservers()
    }

    private fun setUpObservers() {
        viewModel.loading.observe {
            binding.progressCircular.isVisible = it
        }
        viewModel.tenthChar.observe {
            binding.tenthCharacter.text = "Tenth char is: $it"
        }
        viewModel.wordCounterText.observe {
            binding.wordCount.text = "Total word count is: $it"
        }
        viewModel.tenthCharArray.observe {
            binding.tenthCharacterList.text = "Tenth char List is: $it"
        }

        viewModel.errorMessage.observe {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
    }

    private fun setUpView() {

        binding.makeRequestButton.debouncedOnClick {
            viewModel.makeThreeSimultaneousRequests()
        }
    }

    //Can put this function inside a BaseActivity
    private fun <T> LiveData<T>.observe(action: (T) -> Unit) {
        observe(this@MainActivity, {
            action.invoke(it)
        })
    }


}