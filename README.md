# Noemojiedittext

Emojis are a popular way of expressing emotions in text-based communication. However, in some scenarios, such as professional applications or platforms that require strict text formatting, emojis may not be suitable. The NoEmojiEditText custom component addresses this by allowing users to input text without emojis, thereby enhancing the overall user experience.

# Installation
To integrate the NoEmojiEditText component into your Android project, follow these steps:

Add the following dependency to your app's build.gradle file:

# gradle
```gradle
implementation 'com.github.insomaniacvenkat:Noemojiedittext:Initial'
```
Sync your project to ensure the new dependency is resolved.

# Usage
Using the NoEmojiEditText component is straightforward. Simply include it in your XML layout file:

# xml
```xml
<com.shreyasvenkat.noemojiedittext.NoEmojiEditText
    android:id="@+id/noEmojiEditText"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Enter text without emojis" />
```
In your activity or fragment, you can interact with the NoEmojiEditText component programmatically:

java
```java
NoEmojiEditText editText = findViewById(R.id.noEmojiEditText);
String userText = editText.getText().toString();
```
