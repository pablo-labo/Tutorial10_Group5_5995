package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zyh implements n3i {
    public static final zyh a = new zyh();

    @Override // defpackage.n3i
    public final boolean zza(Class<?> cls) {
        return dzh.class.isAssignableFrom(cls);
    }

    @Override // defpackage.n3i
    public final g3i zzb(Class<?> cls) {
        if (!dzh.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (g3i) dzh.l(cls.asSubclass(dzh.class)).j(3);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }
}
