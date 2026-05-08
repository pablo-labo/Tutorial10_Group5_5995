package defpackage;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class re3 {
    public final SharedPreferences a;
    public final Bundle b;
    public final d2f c;

    public re3(wi0 wi0Var) {
        SharedPreferences sharedPreferences = wi0Var.getSharedPreferences("expo.modules.kotlin.PersistentDataManager", 0);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        this.b = new Bundle();
        this.c = new d2f(new j30(this, 4));
    }

    public final Serializable a() {
        Bundle bundle = (Bundle) this.c.getValue();
        return Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable("random", Serializable.class) : bundle.getSerializable("random");
    }

    public final LinkedHashMap b() {
        Bundle bundle = ((Bundle) this.c.getValue()).getBundle("keyToParamsForFallbackCallback");
        if (bundle == null) {
            return null;
        }
        Set<String> setKeySet = bundle.keySet();
        setKeySet.getClass();
        Set<String> set = setKeySet;
        int iV = kc9.V(t92.r0(set, 10));
        if (iV < 16) {
            iV = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
        for (Object obj : set) {
            String str = (String) obj;
            Serializable serializable = Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable(str, Serializable.class) : bundle.getSerializable(str);
            if (serializable == null) {
                r6.g(l5.m("For a key '", str, "' there should be a serializable class available"));
                return null;
            }
            linkedHashMap.put(obj, serializable);
        }
        return linkedHashMap;
    }
}
