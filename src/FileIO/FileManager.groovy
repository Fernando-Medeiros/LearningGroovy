package FileIO

import Domain.Entity

class FileManager {
    String path = "B:\\github\\LearningGroovy\\src\\FileIO\\"
    String charset = "UTF-8"

    FileManager(){
        ReadyCommand.call(new File("$path\\raw.txt"))
        WriteCommand.call(new File("$path\\raw.txt"))
        WriteObjectCommand.call(new File("$path\\raw.bin"), new Entity("Mike", "Ekim"))
    }

    def ReadyCommand = { File file ->
        file.eachLine(charset) { content, line->
            println "L$line:: $content"
        }
    }

    def WriteCommand = { File file ->
        file.withWriter (charset) { write ->
            write.writeLine("****")
            write.writeLine("****")
            write.writeLine("****")
            write.append("####")
            write << "+&"
        }
    }

    def WriteObjectCommand = { File file, Object object ->
       file.withObjectOutputStream { out ->
           out.writeObject(object)
       }
    }
}
