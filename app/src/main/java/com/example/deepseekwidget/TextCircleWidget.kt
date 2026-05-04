package com.example.deepseekwidget

import android.appwidget.AppWidgetProvider
import android.appwidget.AppWidgetManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.util.Log
import android.widget.RemoteViews

class TextCircleWidget : AppWidgetProvider() {

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        for (appWidgetId in appWidgetIds) {
            val views = RemoteViews(
                context.packageName,
                R.layout.widget_text_circle
            )

            // Try to open DeepSeek directly
            val intent = context.packageManager
                .getLaunchIntentForPackage("com.deepseek.chat")

            if (intent != null) {
                Log.d("DeepSeekWidget", "DeepSeek found, opening directly")
            } else {
                Log.d("DeepSeekWidget", "DeepSeek not found or not launchable")
                // Fallback: Open Play Store to install
                val playStoreIntent = Intent(Intent.ACTION_VIEW)
                playStoreIntent.data = android.net.Uri.parse("market://details?id=com.deepseek.chat")
                startActivity(context, playStoreIntent)
                return
            }

            val pendingIntent = android.app.PendingIntent.getActivity(
                context, 0, intent,
                android.app.PendingIntent.FLAG_IMMUTABLE or android.app.PendingIntent.FLAG_UPDATE_CURRENT
            )

            views.setOnClickPendingIntent(R.id.widget_container, pendingIntent)
            appWidgetManager.updateAppWidget(appWidgetId, views)
        }
    }

    private fun startActivity(context: Context, intent: Intent) {
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}