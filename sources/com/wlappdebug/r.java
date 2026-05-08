package com.wlappdebug;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.z92;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final class a {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Flag(key=null, valueType=null)";
        }
    }

    public static final class b {
        public final SharedPreferences a;

        public b(Context context) {
            this.a = context.getSharedPreferences("debug_flags", 0);
        }

        public final void a(a aVar) {
            aVar.getClass();
            if (this.a.contains(null)) {
                defpackage.l.g();
            }
        }

        public final void b(String str, String str2) {
            a aVar = (a) r.a.get(str2);
            if (aVar == null) {
                return;
            }
            a(aVar);
        }

        public final boolean c(String str) {
            a aVar = (a) r.a.get(str);
            if (aVar == null) {
                return false;
            }
            a(aVar);
            return false;
        }
    }

    public static List a() {
        return z92.z1(a.values());
    }
}
