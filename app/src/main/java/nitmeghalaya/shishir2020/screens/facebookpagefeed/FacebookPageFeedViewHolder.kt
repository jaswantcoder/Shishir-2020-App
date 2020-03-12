package nitmeghalaya.shishir2020.screens.facebookpagefeed

import android.text.format.DateUtils
import android.view.View
import coil.api.load
import kotlinx.android.synthetic.main.item_facebook_page_feed.view.*
import nitmeghalaya.shishir2020.R
import nitmeghalaya.shishir2020.model.facebookpagefeed.FacebookPageFeedItem
import nitmeghalaya.shishir2020.screens.BaseViewHolder

/**
 * Created by Devansh on 8/3/20
 */

class FacebookPageFeedViewHolder(itemView: View, private val viewModel: FacebookPageFeedViewModel)
    : BaseViewHolder<FacebookPageFeedItem>(itemView) {

    override fun bind(item: FacebookPageFeedItem) {
        itemView.apply {
            messageTV.text = item.message

            val createdTimeEpoch = viewModel.getDateFromISO8601String(item.createdTime).time
            timeTV.text = DateUtils.getRelativeTimeSpanString(createdTimeEpoch)

            if (item.fullPictureUrl.isNotEmpty()) {
                feedItemImage.visibility = View.VISIBLE
                feedItemImage.load(item.fullPictureUrl) {
                    placeholder(R.drawable.facebook_icon)
                }
            } else {
                feedItemImage.visibility = View.GONE
            }
        }
    }
}