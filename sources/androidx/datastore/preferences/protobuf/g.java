package androidx.datastore.preferences.protobuf;

import defpackage.sp9;
import defpackage.tr1;
import defpackage.uod;

/* JADX INFO: loaded from: classes.dex */
public final class g implements k0 {
    public final CodedOutputStream a;

    public g(CodedOutputStream codedOutputStream) {
        p.a(codedOutputStream, "output");
        this.a = codedOutputStream;
        codedOutputStream.d = this;
    }

    public final void a(int i, tr1 tr1Var) {
        this.a.Z1(i, tr1Var);
    }

    public final void b(int i, Object obj, uod uodVar) {
        CodedOutputStream codedOutputStream = this.a;
        codedOutputStream.n2(i, 3);
        uodVar.h((sp9) obj, codedOutputStream.d);
        codedOutputStream.n2(i, 4);
    }
}
