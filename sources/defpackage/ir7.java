package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ir7 implements hr7 {
    @Override // defpackage.hr7
    public final void c(Integer num, String str) {
        b(str, Long.valueOf(num.intValue()));
    }

    @Override // defpackage.hr7
    public final void d(String str, Boolean bool) {
        str.getClass();
        b(str, Long.valueOf(bool.booleanValue() ? 1L : 0L));
    }
}
