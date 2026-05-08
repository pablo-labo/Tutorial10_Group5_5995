package defpackage;

import defpackage.a62;

/* JADX INFO: loaded from: classes3.dex */
public enum j7g {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(a62.a.a("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(a62.a.a("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(a62.a.a("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(a62.a.a("kotlin/ULong", false));

    private final a62 arrayClassId;
    private final a62 classId;
    private final n8a typeName;

    j7g(a62 a62Var) {
        this.classId = a62Var;
        n8a n8aVarF = a62Var.f();
        this.typeName = n8aVarF;
        this.arrayClassId = new a62(a62Var.a, n8a.h(n8aVarF.c() + "Array"));
    }

    public final a62 a() {
        return this.arrayClassId;
    }

    public final a62 c() {
        return this.classId;
    }

    public final n8a e() {
        return this.typeName;
    }
}
