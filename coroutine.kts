#!/usr/bin/env kscript

@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")

import kotlinx.coroutines.*

println("Start")

GlobalScope.launch {
  delay(1000)
  println("Stop")
}

Thread.sleep(2000)
println("Hello")