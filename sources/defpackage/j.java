package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final zp3 a = new zp3(0);

    public static final boolean a(v27 v27Var) {
        eib eibVar = v27Var.d;
        h74 h74Var = v27Var.u;
        int iOrdinal = eibVar.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                l.g();
                return false;
            }
            v27Var.x.getClass();
            if (!(h74Var instanceof h74)) {
                return false;
            }
        }
        return true;
    }
}
