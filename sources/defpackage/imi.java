package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class imi extends rmi {
    public final yfi e;

    public /* synthetic */ imi(yfi yfiVar) {
        super(false, null, null);
        this.e = yfiVar;
    }

    @Override // defpackage.rmi
    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            l5.r(e);
            return null;
        }
    }
}
