package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.datadog.android.core.internal.CoreFeature;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class sv0 {
    public static String a(int i) {
        String[] strArr = new String[i];
        Arrays.fill(strArr, CoreFeature.DEFAULT_APP_VERSION);
        return l6.i(new StringBuilder("key IN ("), TextUtils.join(", ", strArr), ")");
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(next);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject2 == null) {
                jSONObject.put(next, jSONObject2.get(next));
            } else {
                b(jSONObjectOptJSONObject2, jSONObjectOptJSONObject);
                jSONObject.put(next, jSONObjectOptJSONObject2);
            }
        }
    }

    public static boolean c(SQLiteDatabase sQLiteDatabase, String str, String str2) throws JSONException {
        String string;
        Cursor cursorQuery = sQLiteDatabase.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            if (cursorQuery.moveToFirst()) {
                string = cursorQuery.getString(0);
            } else {
                cursorQuery.close();
                string = null;
            }
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                b(jSONObject, new JSONObject(str2));
                str2 = jSONObject.toString();
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put("value", str2);
            return -1 != sQLiteDatabase.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5);
        } finally {
            cursorQuery.close();
        }
    }
}
