package nitmeghalaya.shishir2020.screens

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Devansh on 6/3/20
 */

abstract class BaseViewHolder<T>(itemView: View): RecyclerView.ViewHolder(itemView) {

    abstract fun bind(item: T)
}