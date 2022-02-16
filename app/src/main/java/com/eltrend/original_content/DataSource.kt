package com.eltrend.original_content

import com.eltrend.original_content.models.BlogPost

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "MiMi REVIEW | ميمي رفيو",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/109957818_2631117093795137_4042653499366019006_o.jpg?_nc_cat=100&_nc_sid=730e14&_nc_ohc=TPJVfu_A0wwAX_fdD8B&_nc_ht=scontent.fcai19-1.fna&oh=db1d1ba3d157cc2416e2217f21a05c41&oe=5F4279B1",
                    "Ahmed Negm"
                )
            )

            list.add(
                BlogPost(
                    "نجم نيوز:مع ايمان المستكاوي",
                    "Justin has been producing online courses for YouTube, Udemy, and his website CodingForEntrepreneurs.com for over 5 years.",
                    "https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-0/p180x540/111021944_2636599306580249_2365790506055212372_o.jpg?_nc_cat=101&_nc_sid=730e14&_nc_ohc=hCJS8j8uLmYAX-jORNV&_nc_ht=scontent.fcai19-1.fna&_nc_tp=6&oh=4811ff5e30bf7f4df916b49d99a90a71&oe=5F464EFD",
                    "Ahmed Negm"
                )
            )
            list.add(
                BlogPost(
                    "بودكاست",
                    "Vasiliy has been a freelance android developer for several years. He also has some of the best android development courses I've had the pleasure of taking on Udemy.com.",
                    "https://scontent-hbe1-1.xx.fbcdn.net/v/t1.0-0/p180x540/107488334_2625708477669332_5542481815079337790_o.jpg?_nc_cat=109&_nc_sid=730e14&_nc_ohc=Nxq9dY1YpJ8AX-n5ht7&_nc_ht=scontent-hbe1-1.xx&_nc_tp=6&oh=153d037abc3ac35024190d8a80eb3f3d&oe=5F457875",
                    "Ahmed Negm"
                )
            )

            list.add(
                BlogPost(
                    "OTHERS",
                    "What kind of hobbies do software developers have? It sounds like many software developers don't have a lot of hobbies and choose to focus on work. Is that a good idea?",
                    "https://scontent-hbe1-1.xx.fbcdn.net/v/t1.0-0/p180x540/116796952_2645199662386880_5821948834004619046_o.jpg?_nc_cat=109&_nc_sid=730e14&_nc_eui2=AeELP_skDA4MiZUsuK4373uf2vCvj4r0IcXa8K-PivQhxa6-Op0qJBA3braeSa27KEMyWGMDcrLZLAtq_6EetXA3&_nc_ohc=nEn3ixJnj3MAX9u1Fv1&_nc_oc=AQm8t5KRlByvVAcR3uslbXNuGF3_8ZGqybDfKZMJ9K8u4A51X1b0IZUvBgusvWgznBU&_nc_ht=scontent-hbe1-1.xx&_nc_tp=6&oh=345bb30d86728a652e3146ee6cc3f6e3&oe=5F557CC7",
                    "Ahmed Negm"
                )
            )

            return list
        }
    }
}