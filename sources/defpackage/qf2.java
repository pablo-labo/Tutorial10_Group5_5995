package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qf2 implements lu2<Object> {
    public static final qf2 a = new qf2();

    @Override // defpackage.lu2
    public final v03 getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.lu2
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
