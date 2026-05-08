package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes3.dex */
public final class gjd extends xm8 {
    public ejd o0;
    public final float[] p0;
    public final float[] q0;
    public boolean r0;

    public gjd() {
        int[] iArr = trg.a;
        this.p0 = new float[9];
        this.q0 = new float[9];
        for (int i = 0; i < 9; i++) {
            this.p0[i] = Float.NaN;
            this.q0[i] = Float.NaN;
        }
    }

    public static float m0(cjd cjdVar, float f, float f2) {
        return cjdVar == cjd.a ? f2 : cjdVar == cjd.c ? Math.max(f, f2) : f + f2;
    }

    @Override // defpackage.loc, defpackage.koc
    public final void I(iaa iaaVar) {
        iaaVar.getClass();
        if (this.r0) {
            this.r0 = false;
            n0();
        }
    }

    @Override // defpackage.loc, defpackage.koc
    public final void m(Object obj) {
        fjd fjdVar;
        obj.getClass();
        if (obj instanceof ejd) {
            ejd ejdVar = this.o0;
            if (ejdVar != null && (fjdVar = ejdVar.b) != ((ejd) obj).b) {
                if (fjdVar == fjd.a) {
                    float[] fArr = this.p0;
                    r(fArr[1], 1);
                    r(fArr[2], 2);
                    r(fArr[3], 3);
                    r(fArr[0], 0);
                } else {
                    float[] fArr2 = this.q0;
                    i0(fArr2[1], 1);
                    i0(fArr2[2], 2);
                    i0(fArr2[3], 3);
                    i0(fArr2[0], 0);
                }
                b0();
            }
            this.o0 = (ejd) obj;
            this.r0 = false;
            n0();
        }
    }

    public final void n0() {
        ejd ejdVar = this.o0;
        if (ejdVar == null) {
            return;
        }
        fjd fjdVar = ejdVar.b;
        fjd fjdVar2 = fjd.a;
        float[] fArr = fjdVar == fjdVar2 ? this.p0 : this.q0;
        float f = fArr[8];
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = f;
        float f3 = f2;
        float f4 = f3;
        float f5 = fArr[7];
        if (!Float.isNaN(f5)) {
            f = f5;
            f3 = f;
        }
        float f6 = fArr[6];
        if (!Float.isNaN(f6)) {
            f2 = f6;
            f4 = f2;
        }
        float f7 = fArr[1];
        if (!Float.isNaN(f7)) {
            f = f7;
        }
        float f8 = fArr[2];
        if (!Float.isNaN(f8)) {
            f2 = f8;
        }
        float f9 = fArr[3];
        if (!Float.isNaN(f9)) {
            f3 = f9;
        }
        float f10 = fArr[0];
        if (!Float.isNaN(f10)) {
            f4 = f10;
        }
        float fG = nn2.G(f);
        float fG2 = nn2.G(f2);
        float fG3 = nn2.G(f3);
        float fG4 = nn2.G(f4);
        djd djdVar = ejdVar.c;
        cjd cjdVar = djdVar.d;
        cjd cjdVar2 = djdVar.c;
        cjd cjdVar3 = djdVar.b;
        gf4 gf4Var = ejdVar.a;
        cjd cjdVar4 = djdVar.a;
        if (fjdVar == fjdVar2) {
            r(m0(cjdVar4, gf4Var.a, fG), 1);
            r(m0(cjdVar3, gf4Var.b, fG2), 2);
            r(m0(cjdVar2, gf4Var.c, fG3), 3);
            r(m0(cjdVar, gf4Var.d, fG4), 0);
            return;
        }
        i0(m0(cjdVar4, gf4Var.a, fG), 1);
        i0(m0(cjdVar3, gf4Var.b, fG2), 2);
        i0(m0(cjdVar2, gf4Var.c, fG3), 3);
        i0(m0(cjdVar, gf4Var.d, fG4), 0);
    }

    @Override // defpackage.xm8
    @tnc(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        dynamic.getClass();
        this.q0[trg.b[i]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setMargins(i, dynamic);
        this.r0 = true;
    }

    @Override // defpackage.xm8
    @tnc(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        dynamic.getClass();
        this.p0[trg.b[i]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setPaddings(i, dynamic);
        this.r0 = true;
    }
}
