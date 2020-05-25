package br.com.nexaas.nexaascart.features.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import br.com.nexaas.nexaascart.features.R
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class HomeFragment : Fragment(R.layout.fragment_first) {

    private val homeAdapter by lazy { HomeAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        view.findViewById<Button>(R.id.button_first).setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }

        setupObservers()
        setupRecyclerView()
        loadViews()
    }


    private fun setupObservers() {

    }

    private fun setupRecyclerView() {

    }

    private fun loadViews() {
        titleHome.text = getString(R.string.home_header_name)
        amountItens.text = getString(R.string.home_amount_itens)
    }
}
