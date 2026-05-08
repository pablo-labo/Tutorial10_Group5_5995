package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import defpackage.ht0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ds5 {
    public static final es5 a = new es5();
    public static final is5 b;

    static {
        is5 is5Var = null;
        try {
            is5Var = (is5) js5.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = is5Var;
    }

    public static final void a(Fragment fragment, Fragment fragment2, boolean z, ht0 ht0Var) {
        fragment.getClass();
        fragment2.getClass();
        if ((z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(ht0Var.c);
            Iterator it = ((ht0.a) ht0Var.entrySet()).iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(ht0Var.c);
            Iterator it2 = ((ht0.a) ht0Var.entrySet()).iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static final String b(ht0<String, String> ht0Var, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : (ht0.a) ht0Var.entrySet()) {
            if (wl7.b(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) z92.Q0(arrayList);
    }

    public static final void c(int i, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
