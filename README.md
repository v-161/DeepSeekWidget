# DeepSeek Widget

A custom home screen widget for DeepSeek AI — inspired by Nothing Phone's ChatGPT widget design.

![Android](https://img.shields.io/badge/Android-7.0+-green)
![Kotlin](https://img.shields.io/badge/Kotlin-1.9+-purple)
![License](https://img.shields.io/badge/License-MIT-blue)

## 🎨 Inspiration

Inspired by the Nothing Phone's ChatGPT widget which allows quick access to text, voice, and image modes directly from the home screen.

## ✨ What It Does

- Two widget sizes: **1x1 (icon)** and **2x1 (pill bar)**
- One-tap launch to open DeepSeek app
- Cyberpunk aesthetic: black background, neon blue accent
  
- Currently only supports text feature, voice and image extensions are in progress...

## 📂 Project Structure

```bash
DeepSeekWidget/
├── app/src/main/java/com/example/deepseekwidget/
│ ├── TextCircleWidget.kt # 2x1 pill bar widget logic
│ └── IconWidget.kt # 1x1 icon widget logic
├── app/src/main/res/
│ ├── layout/
│ │ ├── widget_text_circle.xml # 2x1 layout
│ │ └── widget_icon.xml # 1x1 layout
│ ├── drawable/
│ │ ├── widget_pill_bg.xml # Pill-shaped background
│ │ └── widget_circle_bg.xml # Circle background
│ └── xml/
│ ├── widget_text_circle_info.xml # 2x1 widget settings
│ └── widget_icon_info.xml # 1x1 widget settings
```


## 📱 Requirements

- Android 7.0 (API 24) or higher
- DeepSeek app installed on device

## 🌐 Future Goals

- Add option to switch from text to audio and image extensions

## 📄 License

MIT

---

*Built with Android Studio IDE*
