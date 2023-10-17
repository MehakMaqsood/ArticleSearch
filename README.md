Overview
Last unit we created the NYT Article Search App! All was working great... until you turn on Airplane mode and reopen the app. When a user doesn't have service, we usually want to maintain some functionality. (For example, think about how you are still able to see some of your email inbox even if you're on airplane mode.) Storing some data locally in this way is called "caching", and to do it, we're going to use a local database.

🎯 Goals
By the end of this lab you will be able to...

Create a local SQLite Database with the Room Library
Define DAOs and Entities to interact with your database
Load cached local data in our RecyclerView when fresh network data is unavailable
Application Features
Required Features
The core requirements for this project are similar to Unit 4, but this unit we will allow a user to see a list of article abstracts, with the article title, description, and media photo while offline.

Most recently fetched data is stored locally in a database
If user turns on airplane mode and closes and reopens app, old data from the database should be loaded
