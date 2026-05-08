package defpackage;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class k9e {
    public final ee3 a;
    public final gu5<UUID> b;
    public final String c;
    public int d;
    public c9e e;

    public k9e() {
        throw null;
    }

    public k9e(int i) {
        ee3 ee3Var = ee3.X;
        j9e j9eVar = j9e.a;
        j9eVar.getClass();
        this.a = ee3Var;
        this.b = j9eVar;
        this.c = a();
        this.d = -1;
    }

    public final String a() {
        String string = this.b.invoke().toString();
        string.getClass();
        String lowerCase = wve.I(string, "-", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public final c9e b() {
        c9e c9eVar = this.e;
        if (c9eVar != null) {
            return c9eVar;
        }
        wl7.g("currentSession");
        throw null;
    }
}
