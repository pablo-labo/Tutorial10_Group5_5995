package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.y21;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class iy4 {

    @AutoValue.Builder
    public static abstract class a {
        public final void a(String str, String str2) {
            HashMap map = ((y21.a) this).f;
            if (map != null) {
                map.put(str, str2);
            } else {
                r6.g("Property \"autoMetadata\" has not been set");
            }
        }
    }

    public final String a(String str) {
        String str2 = b().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> b();

    public abstract Integer c();

    public abstract xs4 d();

    public abstract long e();

    public final int f(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String g();

    public abstract long h();

    public final y21.a i() {
        y21.a aVar = new y21.a();
        String strG = g();
        if (strG == null) {
            ja.k("Null transportName");
            return null;
        }
        aVar.a = strG;
        aVar.b = c();
        xs4 xs4VarD = d();
        if (xs4VarD == null) {
            ja.k("Null encodedPayload");
            return null;
        }
        aVar.c = xs4VarD;
        aVar.d = Long.valueOf(e());
        aVar.e = Long.valueOf(h());
        aVar.f = new HashMap(b());
        return aVar;
    }
}
