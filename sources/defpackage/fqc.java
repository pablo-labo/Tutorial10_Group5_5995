package defpackage;

import defpackage.bqc;

/* JADX INFO: loaded from: classes3.dex */
public final class fqc extends bqc.a {
    public final /* synthetic */ bqc.d b;

    public fqc(bqc.d dVar) {
        this.b = dVar;
    }

    @Override // bqc.a
    public final void f(String[] strArr) {
        if (strArr != null) {
            bqc.this.d = strArr;
        } else {
            l5.q("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
        }
    }
}
