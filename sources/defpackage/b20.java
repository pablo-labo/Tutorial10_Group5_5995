package defpackage;

import defpackage.o97;

/* JADX INFO: loaded from: classes3.dex */
public enum b20 {
    INFO(fv6.q4),
    WARNING(fv6.ia),
    CRITICAL(fv6.Y1),
    SUCCESS(fv6.C1),
    AI(fv6.Z);

    private final fv6 iconName;

    b20(fv6 fv6Var) {
        this.iconName = fv6Var;
    }

    public final long a(o97 o97Var) {
        o97.a aVar = o97Var.c;
        o97.a.e eVar = aVar.a;
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return eVar.h.b.a;
        }
        if (iOrdinal == 1) {
            return eVar.h.e.a;
        }
        if (iOrdinal == 2) {
            return aVar.b.i.c.a;
        }
        if (iOrdinal == 3) {
            return eVar.h.d.a;
        }
        if (iOrdinal == 4) {
            return eVar.c;
        }
        l.g();
        return 0L;
    }

    public final fv6 c() {
        return this.iconName;
    }
}
