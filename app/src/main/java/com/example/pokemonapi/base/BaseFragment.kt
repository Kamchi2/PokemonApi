package com.example.pokemonapi.base

import com.example.pokemonapi.common.Resource
import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel>(@LayoutRes private val layoutId: Int) :
    Fragment(layoutId) {

    protected abstract val binding: VB
    protected abstract val viewModel: VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListener()
        setupSubscribes()
        setupRequest()
    }

    protected open fun initialize() {

    }

    protected open fun setupListener() {

    }

    protected open fun setupSubscribes() {

    }

    protected open fun setupRequest() {

    }

    protected open fun <T> LiveData<Resource<T>>.subscribe(
        onSuccess: (result: T) -> Unit,
        onError: (message: String) -> Unit
    ) {
        observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Error -> {
                    onError(it.message.toString())
                }
                is Resource.Loading -> {}
                is Resource.Success -> {
                    it.data?.let {
                        data -> onSuccess(data)
                    }
                }
            }
        }
    }
}