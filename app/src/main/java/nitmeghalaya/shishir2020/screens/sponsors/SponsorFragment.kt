package nitmeghalaya.shishir2020.screens.sponsors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_sponsor.view.*
import nitmeghalaya.shishir2020.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class SponsorFragment : Fragment() {

    private val viewModel: SponsorViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sponsor, container, false)

        viewModel.getSponsors().observe(this, Observer {
            view.recyclerView.adapter = SponsorRecyclerViewAdapter(it)

        })

        return view
    }


}