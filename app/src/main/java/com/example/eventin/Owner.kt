package com.example.eventin

import android.widget.Toast

class Owner(name:String = "name", middlename:String? = "middlename", surname:String = "surname",
            telNumber:Int = 1000000000, mail:String = "example@company.com" ): User(name, middlename, surname, telNumber, mail)
{

    private var somethingHere: String? ="Hewouw"

    fun setUser(n:String, mn:String, sn:String, tn:Int, ml:String) { //all the data
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

    override fun sayHi(){
        super.sayHi()
        Toast.makeText(maincontext, "Bienvenido a tu cuenta empresarial", Toast.LENGHT_LONG).show()
    } //applied polymorphism

}