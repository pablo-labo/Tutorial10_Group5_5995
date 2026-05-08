package defpackage;

import defpackage.jwa;

/* JADX INFO: loaded from: classes.dex */
public final class fgd extends p03 {
    @Override // defpackage.p03
    public final p03 b(t03 t03Var, t03 t03Var2, t03 t03Var3, t03 t03Var4) {
        return new fgd(t03Var, t03Var2, t03Var3, t03Var4);
    }

    @Override // defpackage.p03
    public final jwa d(long j, float f, float f2, float f3, float f4, vl8 vl8Var) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new jwa.b(web.a(0L, j));
        }
        qtc qtcVarA = web.a(0L, j);
        vl8 vl8Var2 = vl8.a;
        float f5 = vl8Var == vl8Var2 ? f : f2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        float f6 = vl8Var == vl8Var2 ? f2 : f;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        float f7 = vl8Var == vl8Var2 ? f3 : f4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
        float f8 = vl8Var == vl8Var2 ? f4 : f3;
        return new jwa.c(new zfd(qtcVarA.a, qtcVarA.b, qtcVarA.c, qtcVarA.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgd)) {
            return false;
        }
        fgd fgdVar = (fgd) obj;
        return wl7.b(this.a, fgdVar.a) && wl7.b(this.b, fgdVar.b) && wl7.b(this.c, fgdVar.c) && wl7.b(this.d, fgdVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
