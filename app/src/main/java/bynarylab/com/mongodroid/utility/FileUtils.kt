package bynarylab.com.mongodroid.utility

import android.content.Context
import android.database.Cursor
import android.net.Uri
import java.net.URISyntaxException


/**
 * Created by beast on 13/7/17.
 */
class FileUtils {

    companion object {
        @Throws(URISyntaxException::class)
        fun getPath(context: Context, uri: Uri): String? {
            if ("content".equals(uri.getScheme(), ignoreCase = true)) {
                val projection = arrayOf("_data")
                var cursor: Cursor? = null

                try {
                    cursor = context.getContentResolver().query(uri, projection, null, null, null)
                    val column_index = cursor!!.getColumnIndexOrThrow("_data")
                    if (cursor!!.moveToFirst()) {
                        return cursor!!.getString(column_index)
                    }
                } catch (e: Exception) {
                    // Eat it
                }

            } else if ("file".equals(uri.getScheme(), ignoreCase = true)) {
                return uri.getPath()
            }

            return null
        }
    }
}