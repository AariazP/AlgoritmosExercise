package preparcial1

class EJ26 {
    tailrec fun travelCaracol(matriz: Array<IntArray>, i: Int, j: Int, orient: String, count: Int): Array<IntArray> {
        if (count == matriz.size * matriz[0].size) return matriz
        if (orient == "B" && i == matriz.size) return travelCaracol(matriz, i - 1, j + 1, "D", count)
        if (orient == "B" && i < matriz.size - 1 && matriz[i + 1][j] != 0) return travelCaracol(matriz, i, j, "D", count)
        if (orient == "D" && j == matriz[i].size) return travelCaracol(matriz, i - 1, j - 1, "S", count)
        if (orient == "D" && j < matriz.size - 1 && matriz[i][j + 1] != 0) return travelCaracol(matriz, i, j, "S", count)
        if (orient == "S" && i < 0) return travelCaracol(matriz, i + 1, j - 1, "I", count)
        if (orient == "S" && i > 1 && matriz[i - 1][j] != 0) return travelCaracol(matriz, i, j - 1, "I", count)
        if (orient == "I" && matriz[i][j] != 0) return travelCaracol(matriz, i + 1, j + 1, "B", count)

        matriz[i][j] = count
        if (orient == "B") return travelCaracol(matriz, i + 1, j, "B", count + 1)
        if (orient == "D") return travelCaracol(matriz, i, j + 1, "D", count + 1)
        return if (orient == "S") travelCaracol(matriz, i - 1, j, "S", count + 1)
        else travelCaracol(matriz, i, j - 1, "I", count + 1)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ej26 = EJ26()
            var matrix = Array(5) { IntArray(5) }
            matrix = ej26.travelCaracol(matrix, 0, 0, "B", 1)

            for (row in matrix) {
                println(row.contentToString())
            }
        }
    }
}
