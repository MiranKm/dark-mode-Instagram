package com.example.miranpc.instagramdarkmode.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.miranpc.instagramdarkmode.databinding.FragmentFeedBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FeedFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class FeedFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        val binding:FragmentFeedBinding = DataBindingUtil.inflate(
                inflater, com.example.miranpc.instagramdarkmode.R.layout.fragment_feed, container, false)
        val view = binding.root
        val toolbar = view.findViewById<androidx.appcompat.widget.Toolbar>(com.example.miranpc.instagramdarkmode.R.id.toolbar)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)

        val igHome = toolbar.findViewById<View>(com.example.miranpc.instagramdarkmode.R.id.ig_icon)
        val dmHome = toolbar.findViewById<View>(com.example.miranpc.instagramdarkmode.R.id.dm_icon)

        igHome.setOnClickListener {
            Toast.makeText(context, "IG", Toast.LENGTH_SHORT).show()
        }
        dmHome.setOnClickListener {
            Toast.makeText(context, "Direct Message", Toast.LENGTH_SHORT).show()
        }

        return view
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FeedFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                FeedFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}
