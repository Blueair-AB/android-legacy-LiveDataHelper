package io.flatcircle.livedatahelper

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

/**
 * Created by jacquessmuts on 2019-04-29
 */

/**
 * Kinda redundant to always ask for an Observer, so this just asks for a lambda to reduce boilerplate
 */
fun <T> LiveData<T>.observe(owner: LifecycleOwner, lambda: (it: T) -> Unit) {
    this.observe(owner, Observer(lambda))
}

/**
 * Observes for all non-null events
 */
fun <T> LiveData<T>.nonNullObserve(owner: LifecycleOwner, lambda: (t: T) -> Unit) {
    this.observe(owner, Observer {
        it?.let(lambda)
    })
}