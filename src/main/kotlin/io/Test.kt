package io

import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {

    var stream = Files.newInputStream(Paths.get("/Users/hao/1111.txt"))
    var reader = stream.buffered().reader()
    var readLines = reader.readLines()
    readLines.forEach { println(it) }
}