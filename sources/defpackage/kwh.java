package defpackage;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class kwh {
    public final jvh a;
    public final jvh b;

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public kwh(jvh jvhVar, jvh jvhVar2) {
        this.a = jvhVar;
        this.b = jvhVar2;
    }

    public static String a(jvh jvhVar, String str) {
        tvh tvhVarA = jvhVar.a();
        if (tvhVarA == null) {
            return null;
        }
        try {
            return tvhVarA.b.getString(str);
        } catch (JSONException unused) {
            Log.w("FirebaseRemoteConfig", "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '" + str + "'.");
            return null;
        }
    }

    public static HashSet b(jvh jvhVar) {
        HashSet hashSet = new HashSet();
        tvh tvhVarA = jvhVar.a();
        if (tvhVarA != null) {
            Iterator<String> itKeys = tvhVarA.b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }
}
