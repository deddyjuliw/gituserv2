package com.djw.mygithubuserapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.djw.mygithubuserapp.database.UserRepository
import com.djw.mygithubuserapp.database.local.entity.User
import kotlinx.coroutines.launch

class DetailViewModel(private val userRepository: UserRepository) : ViewModel() {

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    fun getDetailUser(username: String) = userRepository.getDetailUser(username)

    fun getFavorite() = userRepository.getFavorite()

    fun saveFavorite(user: User) {
        viewModelScope.launch {
            userRepository.setFavorite(user, true)
        }
    }

    fun deleteFavorite(user: User) {
        viewModelScope.launch {
            userRepository.setFavorite(user, false)
        }
    }

    companion object {
        private const val TAG = "DetailViewModel"
    }
}