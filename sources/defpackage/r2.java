package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class r2 extends ka6 {
    public final /* synthetic */ t2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ SerialDescriptor f;

    public r2(t2 t2Var, String str, SerialDescriptor serialDescriptor) {
        this.d = t2Var;
        this.e = str;
        this.f = serialDescriptor;
    }

    @Override // defpackage.ka6, kotlinx.serialization.encoding.Encoder
    public final void E(String str) {
        str.getClass();
        this.d.X(this.e, new ta8(str, false, this.f));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final v1 a() {
        return this.d.b.b;
    }
}
