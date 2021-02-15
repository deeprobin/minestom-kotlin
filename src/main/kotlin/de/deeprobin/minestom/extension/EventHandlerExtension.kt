package de.deeprobin.minestom.extension

import net.minestom.server.event.Event
import net.minestom.server.event.handler.EventHandler

inline fun <reified E: Event> EventHandler.addEventCallback(crossinline callback: (event: E) -> Unit): Boolean {
    return addEventCallback(E::class.java) { event ->
        callback(event)
    }
}

inline fun <reified E: Event> EventHandler.removeEventCallback(crossinline callback: (event: E) -> Unit): Boolean {
    return removeEventCallback(E::class.java) { event ->
        callback(event)
    }
}
