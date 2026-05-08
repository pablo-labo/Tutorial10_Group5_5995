package defpackage;

import android.content.SharedPreferences;
import com.microsoft.codepush.react.CodePushMalformedDataException;
import com.microsoft.codepush.react.a;
import com.microsoft.codepush.react.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class pbe {
    public SharedPreferences a;

    public final JSONArray a() {
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString("CODE_PUSH_FAILED_UPDATES", null);
        if (string == null) {
            return new JSONArray();
        }
        try {
            return new JSONArray(string);
        } catch (JSONException unused) {
            JSONArray jSONArray = new JSONArray();
            sharedPreferences.edit().putString("CODE_PUSH_FAILED_UPDATES", jSONArray.toString()).commit();
            return jSONArray;
        }
    }

    public final JSONObject b() {
        String string = this.a.getString("LATEST_ROLLBACK_INFO", null);
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            g.h("Unable to parse latest rollback metadata " + string + " stored in SharedPreferences");
            return null;
        }
    }

    public final JSONObject c() {
        String string = this.a.getString("CODE_PUSH_PENDING_UPDATE", null);
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            g.h("Unable to parse pending update metadata " + string + " stored in SharedPreferences");
            return null;
        }
    }

    public final boolean d(String str) {
        JSONArray jSONArrayA = a();
        if (str != null) {
            for (int i = 0; i < jSONArrayA.length(); i++) {
                try {
                    if (str.equals(jSONArrayA.getJSONObject(i).getString("packageHash"))) {
                        return true;
                    }
                } catch (JSONException e) {
                    a.a("Unable to read failedUpdates data stored in SharedPreferences.", e);
                }
            }
        }
        return false;
    }

    public final boolean e(String str) {
        JSONObject jSONObjectC = c();
        if (jSONObjectC != null) {
            try {
                if (!jSONObjectC.getBoolean("isLoading")) {
                    if (str == null) {
                        return true;
                    }
                    if (jSONObjectC.getString("hash").equals(str)) {
                        return true;
                    }
                }
            } catch (JSONException e) {
                a.a("Unable to read pending update metadata in isPendingUpdate.", e);
            }
        }
        return false;
    }

    public final void f(JSONObject jSONObject) {
        JSONArray jSONArray;
        SharedPreferences sharedPreferences = this.a;
        try {
            if (d(jSONObject.getString("packageHash"))) {
                return;
            }
            String string = sharedPreferences.getString("CODE_PUSH_FAILED_UPDATES", null);
            if (string == null) {
                jSONArray = new JSONArray();
            } else {
                try {
                    jSONArray = new JSONArray(string);
                } catch (JSONException e) {
                    throw new CodePushMalformedDataException(l5.m("Unable to parse failed updates information ", string, " stored in SharedPreferences"), e);
                }
            }
            jSONArray.put(jSONObject);
            sharedPreferences.edit().putString("CODE_PUSH_FAILED_UPDATES", jSONArray.toString()).commit();
        } catch (JSONException e2) {
            a.a("Unable to read package hash from package.", e2);
        }
    }

    public final void g(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hash", str);
            jSONObject.put("isLoading", z);
            this.a.edit().putString("CODE_PUSH_PENDING_UPDATE", jSONObject.toString()).commit();
        } catch (JSONException e) {
            a.a("Unable to save pending update.", e);
        }
    }

    public final void h(String str) {
        JSONObject jSONObjectB = b();
        int i = 0;
        if (jSONObjectB != null) {
            try {
                if (jSONObjectB.getString("packageHash").equals(str)) {
                    i = jSONObjectB.getInt("count");
                }
            } catch (JSONException unused) {
                g.h("Unable to parse latest rollback info.");
            }
        } else {
            jSONObjectB = new JSONObject();
        }
        try {
            jSONObjectB.put("packageHash", str);
            jSONObjectB.put("time", System.currentTimeMillis());
            jSONObjectB.put("count", i + 1);
            this.a.edit().putString("LATEST_ROLLBACK_INFO", jSONObjectB.toString()).commit();
        } catch (JSONException e) {
            a.a("Unable to save latest rollback info.", e);
        }
    }
}
