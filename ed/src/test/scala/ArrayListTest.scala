package br.unb.cic.ed

import org.scalatest.funsuite.AnyFunSuite

class ArrayListTest extends AnyFunSuite {
    
    test("An empty ArrayList must have size == 0"){
        val list = new ArrayList()

        assert(0 == list.size())
    }

    test("An list with three elements must have size == 3"){
        val list = new ArrayList()

        list.insert(0,10)
        list.insert(1,100)
        list.insert(2,1000)

        assert(3 == list.size())
    }

    test("The element of index 1 in the list [10, 100, 1000] must be 10"){
        val list = new ArrayList()

        list.insert(0,10)
        list.insert(1,100)
        list.insert(2,1000)

        assert(Some(100) == list.elementAt(1)) //Some indica situação onde não ocorreu um erro
    }

    test("A call to the element function with an invalid index should return None"){
        val list = new ArrayList()

        list.insert(0,10)
        list.insert(1,100)
        list.insert(2,1000)

        assert(Some(100) == list.elementAt(1))
        assert(None == list.elementAt(-1))//None é usado quando não cumprimos as pré-condições de uma determinada função
        assert(None == list.elementAt(3))
    }

    test("The element was found"){
        val list =  new ArrayList()

        list.insert(0, 50)
        list.insert(1, 60)
        list.insert(2, 70)

        var number = 60

        assert(Some(1) == list.find(number))
        assert(None == list.find(20))
        assert(None == list.find(35))

    }

    //TODO : Escrever casos de testes adicionais
    //para as seguintes opecacoes:
    //(a) remove
    //(b) find (done)
    //(c) testes adicionais para situacoes nao cobertas nos casos 
    //    de testes atuais.
}

//Na operação de remover eu faço isso:
/*
Acho o elemento,
Elimino ele,
Faço um for com os elementos posteriores a ele
Decremento a posição de todos em 1
*/