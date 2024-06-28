#!/usr/bin/env kscript

@file:DependsOn("com.github.kittinunf.fuel:fuel:2.3.1")

import com.github.kittinunf.fuel.httpGet

val (request, response, result) = "https://httpbin.org/get".httpGet().responseString()
println(result.get())
