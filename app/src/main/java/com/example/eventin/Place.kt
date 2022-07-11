package com.example.eventin

class Place(private var namep:String = "name",         private var street:String = "street",
            private var postalCode:Int = 10000, private var city:String = "city",
            private var state:String = "state",        private var reference:String = "reference")
{

    fun setPlace(np:String, st:String, pc:Int, ct:String, sta:String, rf:String) {
        this.namep = np
        this.street = st
        this.postalCode = pc
        this.city = ct
        this.state = sta
        this.reference = rf
    }

    fun getNamePlace():String          { return this.namep      }
    fun getStreet():String             { return this.street     }
    fun getPostalCode():Int            { return this.postalCode }
    fun getCity():String               { return this.city       }
    fun getState():String              { return this.state      }
    fun getReference():String          { return this.reference  }

    fun setNamePlace(np:String)        { this.namep = np        }
    fun setStreet(st:String)           { this.street = st       }
    fun setPostalCode(pc:Int)          { this.postalCode = pc   }
    fun setCity(ct:String)             { this.city = ct         }
    fun setState(sta:String)           { this.state = sta       }
    fun setReference(rf:String)        { this.reference =rf     }

}