package com.cgh.myquiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answer"




    fun getQuestions():ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "A qué país pertenece esta bandera",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "A qué país pertenece esta bandera",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "A qué país pertenece esta bandera",
            R.drawable.ic_flag_of_belgium,
            "Belgica",
            "Australia",
            "Armenia",
            "Argentina",
            1
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "A qué país pertenece esta bandera",
            R.drawable.ic_flag_of_brazil,
            "Alemania",
            "Argentina",
            "India",
            "Brasil",
            4
        )
        questionsList.add(que4)


        val que5 = Question(
            5, "A qué país pertenece esta bandera",
            R.drawable.ic_flag_of_fiji,
            "Dinamarca",
            "Argentina",
            "Fiji",
            "Brasil",
            3
        )
        questionsList.add(que5)


        val que6 = Question(
            6, "A qué país pertenece esta bandera",
            R.drawable.ic_flag_of_germany,
            "Dinamarca",
            "Alemania",
            "Fiji",
            "Nueva Zelanda",
            2
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "A qué país pertenece esta bandera",
            R.drawable.ic_flag_of_new_zealand,
            "Nueva Zelanda",
            "Alemania",
            "Argentina",
            "India",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "A qué país pertenece esta bandera",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "Chile",
            "Argentina",
            "India",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "A qué país pertenece esta bandera",
            R.drawable.ic_flag_of_india,
            "Uruguay",
            "Chile",
            "Argentina",
            "India",
            4
        )
        questionsList.add(que9)

        return questionsList
    }
}