package com.example.rolodex.data

import com.example.rolodex.model.Contact

class Datasource(){
    fun loadContacts(): List<Contact>{
        return listOf<Contact>(
            Contact("Charlie Brown", "347-568-4515","CBrown@aol.com"),
                Contact("Mandy Strings","718-785-7894","MrsStrings@gmail.com"),
                    Contact("Theo Rio","969-894-7825","Theo.Rio@gmail.com"),
                        Contact("Rena Hasan","787-856-1574","RenaChan@gmail.com"),
                            Contact("Anos Voligoad", "868-547-5952","TyrannyKing@gmail.com"),
                                Contact("Naruto Uzamaki","656-541-4587","MyNinjaWay@hotmail.com"),
                                    Contact("Ben Dover","201-452-4789","Ben.Dover@gmail.com"),
                                        Contact("Rias Gremory","347-852-9623","PrincessRias@gmail.com"),
                                            Contact("Sasuke Uchiha","848-785-7415","MyClanDead@gmail.com"),
                                                Contact("Issei Hyoudou","800-696-4200","HaremKing@gmail.com")
        )
    }

}
