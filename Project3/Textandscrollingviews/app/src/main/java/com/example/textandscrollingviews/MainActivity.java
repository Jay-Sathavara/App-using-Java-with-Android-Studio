package com.example.textandscrollingviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView contentTextView = findViewById(R.id.text_content);

        // Add your actual article content here
        String content = "Flutter is a Google-developed, open-source UI framework for building beautiful, natively compiled applications for mobile, web, desktop, and embedded devices. It is based on the Dart programming language and uses a widget-based approach to UI development.\n" +
                "\n" +
                "\bWhy Choose Flutter?\n" +
                "\n" +
                "There are many reasons why you might choose Flutter for your next development project. Some of the benefits include:\n" +
                "\n" +
                " \n\t--> Cross-platform development: With Flutter, you can write a single codebase and deploy it to multiple platforms, including Android, iOS, web, Windows, macOS, and Linux. This can save you time and money, as you don't need to develop and maintain separate codebases for each platform.\n" +
                " \n\t--> Hot reload: Hot reload is a feature that allows you to see changes to your code reflected in the running app in real time, without having to restart the app. This can make development much faster and more efficient.\n" +
                " \n\t--> Rich widget library: Flutter comes with a rich set of widgets that you can use to build your app's UI. This includes widgets for common UI elements such as buttons, text fields, and images, as well as more complex widgets such as animations and maps.\n" +
                " \n\t--> Customizable: Flutter is highly customizable, so you can create apps that look and feel unique.\n" +
                " \n\t--> Large community: Flutter has a large and active community of developers, so you can find plenty of help and support online.\n" +
                "\bGetting Started with Flutter\n" +
                "\n" +
                "If you're interested in getting started with Flutter, there are a few things you'll need to do:\n" +
                "\n" +
                " \n\t1. Install the Flutter SDK: The Flutter SDK includes everything you need to develop Flutter apps, including the Dart compiler, tools, and libraries. You can download the SDK from the Flutter website.\n" +
                " \n\t2. Set up your development environment: Once you've installed the SDK, you'll need to set up your development environment. This includes installing a code editor or IDE, such as Visual Studio Code or Android Studio.\n" +
                " \n\t3. Learn Dart: Flutter uses the Dart programming language. If you're not already familiar with Dart, you'll need to learn the basics before you can start developing Flutter apps.\n" +
                " \n\t4. Build your first app: There are many tutorials and resources available online to help you build your first Flutter app. A good place to start is the Flutter documentation..";

        contentTextView.setText(content);
    }
}