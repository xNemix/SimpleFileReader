import scala.io.*
import scala.io.StdIn.readLine

import Utils.FileUtils.*

@main
def main(): Unit = {
  val filepath = "C:\\Users\\oscar\\Dev\\Scala\\SimpleFileReader\\"

  while (true){
    print("Select Action: Read = 1. Write = 2. Exit = 3: ")
    val action = readLine()

    print("Filename: ")
    val fileName = readLine()
    print("Filetype: .txt = 1. .csv = 2: ")
    val fileTypeInput = readLine()
    val fileType = fileTypeInput match {
      case "1" => ".txt"
      case "2" => ".csv"
      case _ => ".txt"
    }
    val file = filepath + fileName + fileType

    action match {
      case "1" =>
        printFromFile(file)
      case "2" =>
        print(s"What do you want to write to ${fileName + fileType}?: ")
        val content = readLine()
        writeToFile(file, content)
      case _ => return
    }
  }
}