package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ca2 implements CookieJar {
    public final Set<ba2> b;
    public final SharedPreferences c;

    public ca2(Context context) {
        context.getClass();
        Set<ba2> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.getClass();
        this.b = setNewSetFromMap;
        SharedPreferences sharedPreferences = context.getSharedPreferences("cookie_persistance", 0);
        sharedPreferences.getClass();
        this.c = sharedPreferences;
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = sharedPreferences.getAll();
        all.getClass();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String str = value instanceof String ? (String) value : null;
            if (str != null) {
                try {
                    this.b.add(new ba2(str));
                } catch (JSONException unused) {
                    key.getClass();
                    arrayList.add(key);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }

    @Override // okhttp3.CookieJar
    public final List<Cookie> b(HttpUrl httpUrl) {
        boolean zB;
        httpUrl.getClass();
        ArrayList<ba2> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Set<ba2> set = this.b;
        for (ba2 ba2Var : set) {
            Cookie cookie = ba2Var.a;
            if (cookie.c < System.currentTimeMillis()) {
                arrayList.add(ba2Var);
            } else {
                Cookie.Companion companion = Cookie.j;
                String str = cookie.d;
                boolean z = cookie.i;
                String str2 = httpUrl.d;
                if (z) {
                    zB = wl7.b(str2, str);
                } else {
                    companion.getClass();
                    zB = Cookie.Companion.b(str2, str);
                }
                boolean z2 = false;
                if (zB) {
                    String str3 = cookie.e;
                    companion.getClass();
                    String strB = httpUrl.b();
                    if ((strB.equals(str3) || (wve.K(strB, str3, false) && (wve.D(str3, "/", false) || strB.charAt(str3.length()) == '/'))) && (!cookie.f || httpUrl.j)) {
                        z2 = true;
                    }
                }
                if (z2) {
                    arrayList2.add(cookie);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            SharedPreferences.Editor editorEdit = this.c.edit();
            for (ba2 ba2Var2 : arrayList) {
                set.remove(ba2Var2);
                editorEdit.remove(ba2Var2.a());
            }
            editorEdit.apply();
        }
        return arrayList2;
    }

    @Override // okhttp3.CookieJar
    public final void d(HttpUrl httpUrl, List<Cookie> list) {
        httpUrl.getClass();
        List<Cookie> list2 = list;
        SharedPreferences.Editor editorEdit = this.c.edit();
        ArrayList<ba2> arrayList = new ArrayList(list2.size());
        Iterator<Cookie> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ba2(it.next()));
        }
        for (ba2 ba2Var : arrayList) {
            Set<ba2> set = this.b;
            set.remove(ba2Var);
            set.add(ba2Var);
            String strA = ba2Var.a();
            HashMap map = new HashMap();
            Cookie cookie = ba2Var.a;
            map.put("name", cookie.a);
            map.put("value", cookie.b);
            map.put("expiresAt", Long.valueOf(cookie.c));
            map.put("domain", cookie.d);
            map.put("path", cookie.e);
            String string = new JSONObject(map).toString();
            string.getClass();
            editorEdit.putString(strA, string);
        }
        editorEdit.apply();
    }
}
