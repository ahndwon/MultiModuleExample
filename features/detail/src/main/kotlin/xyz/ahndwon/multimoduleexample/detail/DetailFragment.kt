package xyz.ahndwon.multimoduleexample.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_detail.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import xyz.ahndwon.multimoduleexample.detail.model.LaunchViewModel
import xyz.ahndwon.multimoduleexample.launch.R

class DetailFragment : Fragment(R.layout.fragment_detail) {

    private val viewModel by sharedViewModel<LaunchViewModel>()

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
        fun newInstance() = DetailFragment()
    }
}
