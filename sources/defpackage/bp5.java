package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bp5 extends w1 {
    @Override // defpackage.w1
    public final boolean a(sc3 sc3Var, String str, Object obj) {
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            sc3Var.f(-1);
            return false;
        }
        if (!(obj instanceof String) || !Boolean.parseBoolean((String) obj)) {
            return false;
        }
        sc3Var.f(-1);
        return false;
    }
}
