package defpackage;

import android.graphics.Shader;
import defpackage.jc7;
import defpackage.o97;

/* JADX INFO: loaded from: classes3.dex */
public final class qx6 extends tbe {
    public final /* synthetic */ o97 c;
    public final /* synthetic */ jc7.a d;

    public qx6(o97 o97Var, jc7.a aVar) {
        this.c = o97Var;
        this.d = aVar;
    }

    @Override // defpackage.tbe
    public final Shader b(long j) {
        int i = (int) (j >> 32);
        float fFloatValue = ((Number) this.d.getValue()).floatValue() * Float.intBitsToFloat(i);
        o97.a.c.C0351a c0351a = this.c.c.d.a;
        return pg8.e((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits((-Float.intBitsToFloat(i)) + fFloatValue) << 32), (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), c0351a.a, c0351a.b);
    }
}
