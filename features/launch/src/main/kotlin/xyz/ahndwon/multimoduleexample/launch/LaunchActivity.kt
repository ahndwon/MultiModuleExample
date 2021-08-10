package xyz.ahndwon.multimoduleexample.launch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import org.koin.androidx.viewmodel.ext.android.viewModel
import xyz.ahndwon.multimoduleexample.launch.model.LaunchViewModel
import xyz.ahndwon.multimoduleexample.launch.navigation.Navigator
import javax.inject.Inject

class LaunchActivity : AppCompatActivity() {

    private val viewModel by viewModel<LaunchViewModel>()

    @Inject
    lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        bindViewModel()
        if (savedInstanceState == null) showFragment(LaunchFragment.newInstance())
    }

    private fun bindViewModel() = viewModel.run {
//        observeNavigation()
    }

    private fun showFragment(fragment: Fragment, addToBackStack: Boolean = false) {
        val transaction = supportFragmentManager.beginTransaction()
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .replace(R.id.content, fragment, fragment.tag)

        if (addToBackStack) transaction.addToBackStack(fragment.tag)

        transaction.commitAllowingStateLoss()
//        supportFragmentManager.commit {
//            val tag = fragment.tag
//            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
//            if (addToBackStack) addToBackStack(tag)
//            replace(R.id.content, fragment, tag)
//        }
    }
}
