package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g5i implements t8i {
    public static final g5i a = new g5i();

    @Override // defpackage.t8i
    public final u8i a(Class<?> cls) {
        if (!a5i.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (u8i) a5i.h(cls.asSubclass(a5i.class)).g(3);
        } catch (Exception e) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
        }
    }

    @Override // defpackage.t8i
    public final boolean b(Class<?> cls) {
        return a5i.class.isAssignableFrom(cls);
    }
}
