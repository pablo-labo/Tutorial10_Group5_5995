package defpackage;

import defpackage.a62;

/* JADX INFO: loaded from: classes3.dex */
public enum i7g {
    UBYTEARRAY(a62.a.a("kotlin/UByteArray", false)),
    USHORTARRAY(a62.a.a("kotlin/UShortArray", false)),
    UINTARRAY(a62.a.a("kotlin/UIntArray", false)),
    ULONGARRAY(a62.a.a("kotlin/ULongArray", false));

    private final a62 classId;
    private final n8a typeName;

    i7g(a62 a62Var) {
        this.classId = a62Var;
        this.typeName = a62Var.f();
    }

    public final n8a a() {
        return this.typeName;
    }
}
