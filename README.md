# ButterKnifeDemo

this project demostarate how to use latest version of ButterKnife libarary.

    Field and method binding for Android views which uses annotation processing to generate boilerplate code for you.
    Eliminate findViewById calls by using @BindView on fields.
    Group multiple views in a list or array. Operate on all of them at once with actions, setters, or properties.
    Eliminate anonymous inner-classes for listeners by annotating methods with @OnClick and others.
    Eliminate resource lookups by using resource annotations on fields.
    
    
Requirements/Utilities

buld.gradle for app look like this.

apply plugin: 'com.android.application'

android {
    compileSdkVersion 23
    buildToolsVersion "23.0.3"

    defaultConfig {
        applicationId "software.ram.com.butterknifedemo"
        minSdkVersion 15
        targetSdkVersion 23
        versionCode 1
        versionName "1.0"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}


// required 
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
    }
}

apply plugin: 'com.neenbedankt.android-apt'


dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    testCompile 'junit:junit:4.12'
    compile 'com.android.support:appcompat-v7:23.4.0'
    
    //required
    compile 'com.jakewharton:butterknife:8.0.1'
    apt 'com.jakewharton:butterknife-compiler:8.0.1'
}


This Demo Help To How to use ButterKnife 8.0.1 versions( @BindView, @BindString, @OnClick ) Annotations.
