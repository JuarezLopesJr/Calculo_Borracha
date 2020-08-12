package com.example.calculoborracha.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.calculoborracha.R
import com.example.calculoborracha.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // usando data binding pra diminuir 'boilerplate' e evitar memory leaks
        val binding = DataBindingUtil.inflate<FragmentMenuBinding>(
            inflater,
            R.layout.fragment_menu,
            container,
            false
        )
        // acoplando esse fragment com o layout (fragment_menu.xml)
        binding.menu = this

        // usando a navegacao nativa (melhor performance)
        binding.btnPeso.setOnClickListener { view ->
            view.findNavController()
                .navigate(MenuFragmentDirections.actionMenuFragmentToPesoFragment())
        }


        binding.btnValor.setOnClickListener { view ->
            view.findNavController()
                .navigate(MenuFragmentDirections.actionMenuFragmentToValorFragment())
        }

        return binding.root
    }
}