package defpackage;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class is9 {
    public static final Charset b = Charset.forName("UTF-8");
    public final oa5 a;

    public is9(oa5 oa5Var) {
        this.a = oa5Var;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(sed.a(string));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static String e(List<sed> list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(sed.a.a(list.get(i))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final Map<String, String> c(String str, boolean z) throws Throwable {
        String str2;
        File fileB;
        FileInputStream fileInputStream;
        Exception e;
        oa5 oa5Var = this.a;
        if (z) {
            str2 = "internal-keys";
            fileB = oa5Var.b(str, "internal-keys");
        } else {
            str2 = "keys";
            fileB = oa5Var.b(str, "keys");
        }
        if (!fileB.exists() || fileB.length() == 0) {
            f(fileB);
            return Collections.EMPTY_MAP;
        }
        ?? r5 = 0;
        try {
            try {
                fileInputStream = new FileInputStream(fileB);
            } catch (Exception e2) {
                fileInputStream = null;
                e = e2;
            } catch (Throwable th) {
                th = th;
                wc2.b(r5, "Failed to close user metadata file.");
                throw th;
            }
            try {
                HashMap mapA = a(wc2.i(fileInputStream));
                wc2.b(fileInputStream, "Failed to close user metadata file.");
                return mapA;
            } catch (Exception e3) {
                e = e3;
                Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                f(fileB);
                wc2.b(fileInputStream, "Failed to close user metadata file.");
                return Collections.EMPTY_MAP;
            }
        } catch (Throwable th2) {
            th = th2;
            r5 = str2;
            wc2.b(r5, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        File fileB = this.a.b(str, "user-data");
        ?? r5 = 0;
        if (fileB.exists()) {
            ?? r2 = (fileB.length() > 0L ? 1 : (fileB.length() == 0L ? 0 : -1));
            try {
                if (r2 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileB);
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        wc2.b(r5, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(wc2.i(fileInputStream));
                        String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                        String str2 = "Loaded userId " + strOptString + " for session " + str;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str2, null);
                        }
                        wc2.b(fileInputStream, "Failed to close user metadata file.");
                        return strOptString;
                    } catch (Exception e2) {
                        e = e2;
                        Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                        f(fileB);
                        wc2.b(fileInputStream, "Failed to close user metadata file.");
                        return null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r5 = r2;
            }
        }
        String strL = l5.l("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strL, null);
        }
        f(fileB);
        return null;
    }

    public final void g(String str, Map<String, String> map, boolean z) throws Throwable {
        BufferedWriter bufferedWriter;
        Exception e;
        String string;
        oa5 oa5Var = this.a;
        File fileB = z ? oa5Var.b(str, "internal-keys") : oa5Var.b(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            string = new JSONObject(map).toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), b));
        } catch (Exception e2) {
            bufferedWriter = null;
            e = e2;
        } catch (Throwable th) {
            th = th;
            wc2.b(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
        try {
            try {
                bufferedWriter.write(string);
                bufferedWriter.flush();
                wc2.b(bufferedWriter, "Failed to close key/value metadata file.");
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                wc2.b(bufferedWriter2, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            f(fileB);
            wc2.b(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(String str, List<sed> list) throws Throwable {
        BufferedWriter bufferedWriter;
        Exception e;
        String strE;
        File fileB = this.a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            f(fileB);
            return;
        }
        a15 a15Var = 0;
        try {
            try {
                strE = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), b));
            } catch (Exception e2) {
                bufferedWriter = null;
                e = e2;
            } catch (Throwable th) {
                th = th;
                wc2.b(a15Var, "Failed to close rollouts state file.");
                throw th;
            }
            try {
                bufferedWriter.write(strE);
                bufferedWriter.flush();
                wc2.b(bufferedWriter, "Failed to close rollouts state file.");
            } catch (Exception e3) {
                e = e3;
                Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                f(fileB);
                wc2.b(bufferedWriter, "Failed to close rollouts state file.");
            }
        } catch (Throwable th2) {
            th = th2;
            a15Var = "rollouts-state";
            wc2.b(a15Var, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public final void i(String str, String str2) {
        File fileB = this.a.b(str, "user-data");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                hs9 hs9Var = new hs9();
                hs9Var.put("userId", str2);
                String string = hs9Var.toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    wc2.b(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                    wc2.b(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    wc2.b(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
