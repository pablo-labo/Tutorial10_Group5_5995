package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w7i implements t8i {
    public t8i[] a;

    @Override // defpackage.t8i
    public final u8i a(Class<?> cls) {
        for (t8i t8iVar : this.a) {
            if (t8iVar.b(cls)) {
                return t8iVar.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // defpackage.t8i
    public final boolean b(Class<?> cls) {
        for (t8i t8iVar : this.a) {
            if (t8iVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
