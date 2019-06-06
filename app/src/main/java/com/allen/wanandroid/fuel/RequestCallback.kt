package com.allen.wanandroid.fuel

abstract class RequestCallback<T> {
    abstract fun onError(error: String)
    abstract fun onSuccess(bean: T)
}