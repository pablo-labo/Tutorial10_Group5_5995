package defpackage;

import defpackage.bqc;

/* JADX INFO: loaded from: classes3.dex */
public final class eqc extends bqc.a {
    public final /* synthetic */ bqc.c b;

    public eqc(bqc.c cVar) {
        this.b = cVar;
    }

    @Override // bqc.a
    public final void f(String[] strArr) {
        if (strArr != null) {
            bqc.this.h = strArr;
        } else {
            l5.q("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
        }
    }
}
