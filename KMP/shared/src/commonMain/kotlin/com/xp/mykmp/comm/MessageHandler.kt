package com.xp.mykmp.comm

import com.xp.mykmp.getPlatform
import com.xp.mykmp.utility.sayHello

class MessageHandler {
    private val platform = getPlatform()

    fun readMsg(): String {
        return sayHello(platform.name)
    }
}