package com.example.distributedsystemsphase2.DB;


import androidx.room.*;

@Database(entities = {
            Response.class,
            Quiz.class,
            Instructor.class,
            MultipleChoiceQuestion.class,
    }, version = 1, exportSchema = true)
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase {
        public abstract InstructorDao instructorDao();
        public abstract StudentDao studentDao();
}



//initialize DB with this code:

//AppDatabase db = Room.databaseBuilder(getApplicationContext(),
//        AppDatabase.class, "database-name").build();