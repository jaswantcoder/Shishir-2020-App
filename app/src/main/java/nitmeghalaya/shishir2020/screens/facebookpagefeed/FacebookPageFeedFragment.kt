package nitmeghalaya.shishir2020.screens.facebookpagefeed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_facebook_page_feed.view.*
import nitmeghalaya.shishir2020.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class FacebookPageFeedFragment : Fragment() {

    private val facebookPageFeedViewModel: FacebookPageFeedViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_facebook_page_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = FacebookPageFeedRecyclerViewAdapter()
        view.recyclerView.adapter = adapter

        facebookPageFeedViewModel.pageFeedItemPagedList.observe(viewLifecycleOwner, Observer {
            adapter.submitList(it)

        })
    }
}