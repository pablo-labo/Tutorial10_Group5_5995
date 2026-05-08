package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.s;
import defpackage.h5;
import defpackage.l5;
import defpackage.o6;
import defpackage.r6;
import defpackage.v40;
import defpackage.wl7;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"TypeParameterUnusedInFormals"})
public final class u {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public static final class a {
        public static String a(Class cls) {
            LinkedHashMap linkedHashMap = u.b;
            String strValue = (String) linkedHashMap.get(cls);
            if (strValue == null) {
                s.b bVar = (s.b) cls.getAnnotation(s.b.class);
                strValue = bVar != null ? bVar.value() : null;
                if (strValue == null || strValue.length() <= 0) {
                    h5.k("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                    return null;
                }
                linkedHashMap.put(cls, strValue);
            }
            strValue.getClass();
            return strValue;
        }
    }

    public final void a(s sVar) {
        sVar.getClass();
        String strA = a.a(sVar.getClass());
        if (strA.length() <= 0) {
            l5.q("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        s sVar2 = (s) linkedHashMap.get(strA);
        if (wl7.b(sVar2, sVar)) {
            return;
        }
        if (sVar2 != null && sVar2.b) {
            o6.n("Navigator ", sVar, " is replacing an already attached ", sVar2);
        } else if (sVar.b) {
            v40.o("Navigator ", sVar, " is already attached to another NavController");
        }
    }

    public final <T extends s<?>> T b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            l5.q("navigator name cannot be an empty string");
            return null;
        }
        T t = (T) this.a.get(str);
        if (t != null) {
            return t;
        }
        r6.g(l5.m("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
