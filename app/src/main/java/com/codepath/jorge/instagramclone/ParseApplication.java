package com.codepath.jorge.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("bE0GGszOklBeJPMplWwV0JuhOvJcAgoGH9PRAcdd")
                .clientKey("o6llnrjLrpiFulpVbQzzurYkkjb7kGm835FPst0k")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
