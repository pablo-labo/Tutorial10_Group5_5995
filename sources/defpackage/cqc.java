package defpackage;

import defpackage.bqc;

/* JADX INFO: loaded from: classes3.dex */
public final class cqc extends bqc.a {
    public final /* synthetic */ bqc.b b;

    public cqc(bqc.b bVar) {
        this.b = bVar;
    }

    @Override // bqc.a
    public final void f(String[] strArr) {
        if (strArr != null) {
            bqc.this.d = strArr;
        } else {
            l5.q("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
        }
    }
}
