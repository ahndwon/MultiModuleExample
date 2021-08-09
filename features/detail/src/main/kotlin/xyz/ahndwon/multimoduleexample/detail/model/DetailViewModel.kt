package xyz.ahndwon.multimoduleexample.detail.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

abstract class LaunchViewModel : ViewModel() {
    abstract fun onUserClicksOnActivity()
    abstract fun onUserClicksOnActivityForResult()
    abstract fun onUserClicksOnFragment()
}

class LaunchViewModelImpl : LaunchViewModel() {

    override fun onUserClicksOnActivity() {
//        router.navigateTo(HomeDirections.FeatureActivity(someFakeId))
    }

    override fun onUserClicksOnActivityForResult() {
        viewModelScope.launch {
//            val result = router.navigateForResult(HomeDirections.FeatureActivity(someFakeId, true))
//            if (result.hasData) {
//                val returns = result.getParcelable<FeatureActivityDirection.Returns>()
//                Log.d("TAG", "Result is $returns")
//            } else {
//                Log.d("TAG", "No result")
//            }
        }
    }

    override fun onUserClicksOnFragment() {
//        router.navigateTo(HomeDirections.FeatureFragment(someFakeId))
    }

    companion object {
        private const val someFakeId = "1234"
    }
}
