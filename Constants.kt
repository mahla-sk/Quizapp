package com.example.quiz

object Constants {
    fun getQuestionList():ArrayList<Question>{
        val questionList=ArrayList<Question>()
        val question1=Question(
            1,
            "what is the capital of iran? ",
            "mashad",
            "tehran",
            "shiraz",
            "esfahan",
            2

        )
        questionList.add(question1)
        val question2=Question(
            2,
            "what is the capital of canada? ",
            "washington",
            "otawa",
            "ontario",
            "vankouer",
            2

        )
        questionList.add(question2)
        val question3=Question(
            3,
            "what is the capital of afghanistan? ",
            "herat",
            "eshq abad",
            "kabol",
            "idk",
            3

        )
        questionList.add(question3)
        val question4=Question(
            4,
            "in wich year corona appeared? ",
            "2019",
            "2020",
            "2021",
            "2018",
            2

        )
        questionList.add(question4)
        val question5=Question(
            5,
            "what linux is written based on ? ",
            "minix",
            "windows",
            "X windows",
            "unix",
            4

        )
        questionList.add(question5)
        val question6=Question(
            6,
            "who was the former president of US? ",
            "obama",
            "bush",
            "trump",
            "biden",
            3

        )
        questionList.add(question6)
        val question7=Question(
            7,
            "from wich country corona started ? ",
            "china",
            "USA",
            "pakistan",
            "turkey",
            1

        )
        questionList.add(question7)
        val question8=Question(
            8,
            "what is the more killing ? ",
            "heart attack",
            "cancer",
            "depression",
            "asthma",
            3

        )
        questionList.add(question8)
        val question9=Question(
            9,
            "how many hours a koala bear can sleep? ",
            "24",
            "22",
            "20",
            "18",
            4

        )
        questionList.add(question9)
        val question10=Question(
            10,
            "where is the middle east newyork? ",
            "singapour",
            "antalia",
            "dubai",
            "tehran",
            1

        )
        questionList.add(question10)
        return questionList

    }
}