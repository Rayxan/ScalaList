package br.unb.cic.ed
class ArrayList extends List {
    val elements = new Array[Int](10) //sempre que queremos definir um objeto que terá uma única atribuição, usamos val
    var total = 0
    
    def size(): Int = total
    
    def insert(pos: Int, value: Int): Unit = {
        if(pos >= 0 && pos <= total){
            elements(pos) = value
            total += 1
        }
    }

    def elementAt(pos: Int): Option[Int] = 
        if(pos >= 0 && pos < total)
            Some(elements(pos))
        else None

    def find(value: Int): Option[Int] ={
        var found = -1 
        var range = 10
        var  i = 0

        while( i < range ){
            if (value == elements(i)){
                found = i
            }
            i += 1;
        }

        if(found >=0)
            Some(found)
        else None
    }

    
}