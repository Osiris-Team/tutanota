package de.tutao.tutanota

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.os.Bundle

class MyWidgetProvider : AppWidgetProvider() {
	override fun onUpdate(
		context: Context?,
		appWidgetManager: AppWidgetManager?,
		appWidgetIds: IntArray?
	) {
		// Launch MainActivity when the widget is updated
		val intent = Intent(context, MainActivity::class.java)
		intent.action = AppWidgetManager.ACTION_APPWIDGET_UPDATE

		// Pass the widget IDs to MainActivity
		val extras = Bundle()
		extras.putIntArray(AppWidgetManager.EXTRA_APPWIDGET_IDS, appWidgetIds)
		intent.putExtras(extras)

		// Start the MainActivity
		context?.startActivity(intent)
	}
}