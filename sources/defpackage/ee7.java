package defpackage;

import defpackage.fdd;

/* JADX INFO: loaded from: classes3.dex */
public final class ee7<Type extends fdd> extends hlg<Type> {
    public final n8a a;
    public final Type b;

    public ee7(n8a n8aVar, Type type) {
        n8aVar.getClass();
        type.getClass();
        this.a = n8aVar;
        this.b = type;
    }

    @Override // defpackage.hlg
    public final boolean a(n8a n8aVar) {
        return wl7.b(this.a, n8aVar);
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.a + ", underlyingType=" + this.b + ')';
    }
}
