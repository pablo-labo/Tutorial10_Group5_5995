package defpackage;

import defpackage.bqc;

/* JADX INFO: loaded from: classes3.dex */
public final class gqc extends bqc.a {
    public final /* synthetic */ bqc.d b;

    public gqc(bqc.d dVar) {
        this.b = dVar;
    }

    @Override // bqc.a
    public final void f(String[] strArr) {
        if (strArr != null) {
            bqc.this.e = strArr;
        } else {
            l5.q("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
        }
    }
}
