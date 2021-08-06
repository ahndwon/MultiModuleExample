package xyz.ahndwon.multimoduleexample.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import xyz.ahndwon.multimoduleexample.home.model.MainViewModel

class MainFragment : Fragment(R.layout.fragment_main) {

    private val viewModel by sharedViewModel<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindView()
    }

    private fun bindView() {
        btnActivity.setOnClickListener {
            viewModel.onUserClicksOnActivity()
        }
        btnActivityResult.setOnClickListener {
            viewModel.onUserClicksOnActivityForResult()
        }
        btnFragment.setOnClickListener {
            viewModel.onUserClicksOnFragment()
        }
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}
