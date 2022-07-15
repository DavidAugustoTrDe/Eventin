package com.example.eventin

import android.widget.Toast

open class User(protected var name:String = "name",       protected var middlename:String? = "middlename",
                protected var surname:String = "surname", protected var telNumber:Int? = 1000000000,
                protected var mail:String = "example@company.com" ) {

   /* fun setUser(n:String, mn:String, sn:String, tn:Int, ml:String) { //all the data
        this.name=n
        this.middlename=mn
        this.surname=sn
        this.telNumber=tn
        this.mail=ml
    }                                                                                   //Overloading up and down(2)
    fun setUser(n:String, sn:String, tn:Int, ml:String) {   //without the middlename
        this.name=n
        this.surname=sn
        this.telNumber=tn
        this.mail=ml
    }

    open fun sayHi(){  Toast.makeText(maincontext, "Bienvenido $name", Toast.LENGHT_LONG).show()  }

    internal fun getName(): String               { return this.name          }
    internal fun getMiddlename(): String?        { return this.middlename    }
    internal fun getSurname(): String            { return this.surname       }
    internal fun getTelNumber(): Int?             { return this.telNumber     }
    internal fun setName(n: String)              { this.name = n             }
    internal fun setMiddleName(mn: String)       { this.middlename = mn      }
    internal fun setSurName(sn: String)          { this.surname = sn         }
    internal fun setTelNumber(tn: Int)           { this.telNumber = tn       }
*/
}