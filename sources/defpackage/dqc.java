package defpackage;

import defpackage.bqc;

/* JADX INFO: loaded from: classes3.dex */
public final class dqc extends bqc.a {
    public final /* synthetic */ bqc.b b;

    public dqc(bqc.b bVar) {
        this.b = bVar;
    }

    @Override // bqc.a
    public final void f(String[] strArr) {
        if (strArr != null) {
            bqc.this.e = strArr;
        } else {
            l5.q("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
        }
    }
}
