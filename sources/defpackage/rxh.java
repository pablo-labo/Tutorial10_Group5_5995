package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rxh implements y1i {
    public static final rxh a = new rxh();

    @Override // defpackage.y1i
    public final v1i zzb(Class cls) {
        if (!oyh.class.isAssignableFrom(cls)) {
            l5.q("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (v1i) oyh.f(cls.asSubclass(oyh.class)).e(3);
        } catch (Exception e) {
            l6.p("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // defpackage.y1i
    public final boolean zzc(Class cls) {
        return oyh.class.isAssignableFrom(cls);
    }
}
