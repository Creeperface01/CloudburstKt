package com.creeperface.cloudburst.kotlin.util

import org.cloudburstmc.server.utils.TextFormat

operator fun TextFormat.plus(str: String) = this.toString() + str