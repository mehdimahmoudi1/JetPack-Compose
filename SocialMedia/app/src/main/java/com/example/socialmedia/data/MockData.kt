package com.example.socialmedia.data

import com.example.socialmedia.models.Post
import com.example.socialmedia.models.Story
import com.example.socialmedia.models.User

object MockData {
    val stories = ArrayList<Story>()
    val users = ArrayList<User>()
    val posts = ArrayList<Post>()
    init {
        stories.add(Story("John Smith","https://holosen.net/wp-content/uploads/2021/09/story-01.jpg",true))
        stories.add(Story("Mehrad","https://holosen.net/wp-content/uploads/2021/09/story-06.jpeg",false))
        stories.add(Story("Lucy Baker","https://holosen.net/wp-content/uploads/2021/09/story-02.jpeg",false))
        stories.add(Story("Tony","https://holosen.net/wp-content/uploads/2021/09/story-03.jpeg",false))
        stories.add(Story("Anna Stark","https://holosen.net/wp-content/uploads/2021/09/story-04.jpeg",false))
        stories.add(Story("Brayan","https://holosen.net/wp-content/uploads/2021/09/story-05.jpeg",false))
        stories.add(Story("Lucy Baker","https://holosen.net/wp-content/uploads/2021/09/story-02.jpeg",false))
        stories.add(Story("Tony","https://holosen.net/wp-content/uploads/2021/09/story-03.jpeg",false))
        stories.add(Story("Anna Stark","https://holosen.net/wp-content/uploads/2021/09/story-04.jpeg",false))
        stories.add(Story("Brayan","https://holosen.net/wp-content/uploads/2021/09/story-05.jpeg",false))


        users.add(User("immehdi75","Mehdi Mahmoudi","https://holosen.net/wp-content/uploads/2021/09/story-06.jpeg"))
        users.add(User("anna","Anna Stark","https://holosen.net/wp-content/uploads/2021/09/story-04.jpeg"))
        users.add(User("lucy","Lucy Baker","https://holosen.net/wp-content/uploads/2021/09/story-02.jpeg"))
        users.add(User("brayan","Brayan Baker","https://holosen.net/wp-content/uploads/2021/09/story-05.jpeg"))
        users.add(User("tony","Tony","https://holosen.net/wp-content/uploads/2021/09/story-03.jpeg"))

        posts.add(Post(users[0],"Tehran Iran","https://holosen.net/wp-content/uploads/2021/09/story-06.jpeg","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
        posts.add(Post(users[1],"Los Angeles","https://holosen.net/wp-content/uploads/2021/09/story-04.jpeg","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
        posts.add(Post(users[2],"NewYork City","https://holosen.net/wp-content/uploads/2021/09/story-02.jpeg","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
        posts.add(Post(users[3],"NewYork City","https://holosen.net/wp-content/uploads/2021/09/story-05.jpeg","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
        posts.add(Post(users[4],"NewYork City","https://holosen.net/wp-content/uploads/2021/09/story-03.jpeg","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))

    }
}