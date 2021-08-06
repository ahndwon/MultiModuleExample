package xyz.ahndwon.multimoduleexample.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import org.koin.androidx.viewmodel.ext.android.viewModel
import xyz.ahndwon.multimoduleexample.home.model.MainViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindViewModel()
        if (savedInstanceState == null) showFragment(MainFragment.newInstance())
    }

    private fun bindViewModel() = viewModel.run {
//        observeNavigation()
    }

    private fun showFragment(fragment: Fragment, addToBackStack: Boolean = false) {
//        supportFragmentManager.commit {
//            val tag = fragment.tag
//            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
//            if (addToBackStack) addToBackStack(tag)
//            replace(R.id.content, fragment, tag)
//        }
    }
}
