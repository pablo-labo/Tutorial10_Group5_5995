package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ew1 implements lm5 {
    public static final ew1 a = new ew1();
    public static Boolean b;

    @Override // defpackage.lm5
    public final void b(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // defpackage.lm5
    public final boolean d() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw l6.k("canFocus is read before it is written");
    }
}
