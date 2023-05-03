package Utils
import scala.io.*
import java.io.*
import Utils.Control.*

object FileUtils {
  def printFromFile(file: String): Unit = {
    using(io.Source.fromFile(file)) { source => {
      for (line <- source.getLines) {
        println(line)
      }
    }}
  }

  def writeToFile(filename: String, s: String): Unit = {
    val file = new File(filename)
    val bw = new BufferedWriter(new FileWriter(file))

    using(bw) { source => {
      if (file.exists) source.append(s)
      else source.write(s)
    }}
  }

}
