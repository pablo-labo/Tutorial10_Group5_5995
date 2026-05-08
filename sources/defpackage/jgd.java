package defpackage;

import android.graphics.PointF;
import defpackage.z91;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jgd implements sce, z91.a {
    public final j79 a;
    public final z91<Float, Float> b;
    public ice c;

    public jgd(j79 j79Var, ba1 ba1Var, igd igdVar) {
        this.a = j79Var;
        z91<Float, Float> z91VarT = igdVar.a.t();
        this.b = z91VarT;
        ba1Var.f(z91VarT);
        z91VarT.a(this);
    }

    public static int f(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // z91.a
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // defpackage.ks2
    public final void b(List<ks2> list, List<ks2> list2) {
    }

    @Override // defpackage.sce
    public final ice d(ice iceVar) {
        ArrayList arrayList;
        float f;
        ice iceVar2 = iceVar;
        ArrayList arrayList2 = iceVar2.a;
        if (arrayList2.size() > 2) {
            float fFloatValue = this.b.e().floatValue();
            if (fFloatValue != 0.0f) {
                ArrayList arrayList3 = iceVar2.a;
                boolean z = iceVar2.c;
                boolean z2 = true;
                int size = arrayList3.size() - 1;
                int i = 0;
                while (size >= 0) {
                    m83 m83Var = (m83) arrayList3.get(size);
                    m83 m83Var2 = (m83) arrayList3.get(f(size - 1, arrayList3.size()));
                    PointF pointF = (size != 0 || z) ? m83Var2.c : iceVar2.b;
                    i = (((size != 0 || z) ? m83Var2.b : pointF).equals(pointF) && m83Var.a.equals(pointF) && !(!iceVar2.c && (size == 0 || size == arrayList3.size() - 1))) ? i + 2 : i + 1;
                    size--;
                }
                ice iceVar3 = this.c;
                if (iceVar3 == null || iceVar3.a.size() != i) {
                    ArrayList arrayList4 = new ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList4.add(new m83());
                    }
                    this.c = new ice(new PointF(0.0f, 0.0f), false, arrayList4);
                }
                ice iceVar4 = this.c;
                iceVar4.c = z;
                PointF pointF2 = iceVar2.b;
                iceVar4.a(pointF2.x, pointF2.y);
                ArrayList arrayList5 = iceVar4.a;
                boolean z3 = iceVar2.c;
                int i3 = 0;
                int i4 = 0;
                while (i3 < arrayList2.size()) {
                    m83 m83Var3 = (m83) arrayList2.get(i3);
                    m83 m83Var4 = (m83) arrayList2.get(f(i3 - 1, arrayList2.size()));
                    m83 m83Var5 = (m83) arrayList2.get(f(i3 - 2, arrayList2.size()));
                    PointF pointF3 = (i3 != 0 || z3) ? m83Var4.c : iceVar2.b;
                    PointF pointF4 = (i3 != 0 || z3) ? m83Var4.b : pointF3;
                    PointF pointF5 = m83Var3.a;
                    PointF pointF6 = m83Var5.c;
                    boolean z4 = z2;
                    PointF pointF7 = m83Var3.c;
                    boolean z5 = (iceVar2.c || !(i3 == 0 || i3 == arrayList2.size() + (-1))) ? false : z4;
                    if (pointF4.equals(pointF3) && pointF5.equals(pointF3) && !z5) {
                        float f2 = pointF3.x;
                        float f3 = f2 - pointF6.x;
                        float f4 = pointF3.y;
                        float f5 = f4 - pointF6.y;
                        float f6 = pointF7.x - f2;
                        float f7 = pointF7.y - f4;
                        arrayList = arrayList2;
                        float fHypot = (float) Math.hypot(f3, f5);
                        float fHypot2 = (float) Math.hypot(f6, f7);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f8 = pointF3.x;
                        float fB = k6.b(pointF6.x, f8, fMin, f8);
                        float f9 = pointF3.y;
                        float fB2 = k6.b(pointF6.y, f9, fMin, f9);
                        float fB3 = k6.b(pointF7.x, f8, fMin2, f8);
                        float fB4 = k6.b(pointF7.y, f9, fMin2, f9);
                        float f10 = fB - ((fB - f8) * 0.5519f);
                        float f11 = fB2 - ((fB2 - f9) * 0.5519f);
                        float f12 = fB3 - ((fB3 - f8) * 0.5519f);
                        float f13 = fB4 - ((fB4 - f9) * 0.5519f);
                        m83 m83Var6 = (m83) arrayList5.get(f(i4 - 1, arrayList5.size()));
                        m83 m83Var7 = (m83) arrayList5.get(i4);
                        f = fFloatValue;
                        m83Var6.b.set(fB, fB2);
                        m83Var6.c.set(fB, fB2);
                        if (i3 == 0) {
                            iceVar4.a(fB, fB2);
                        }
                        m83Var7.a.set(f10, f11);
                        m83 m83Var8 = (m83) arrayList5.get(i4 + 1);
                        m83Var7.b.set(f12, f13);
                        m83Var7.c.set(fB3, fB4);
                        m83Var8.a.set(fB3, fB4);
                        i4 += 2;
                    } else {
                        arrayList = arrayList2;
                        f = fFloatValue;
                        m83 m83Var9 = (m83) arrayList5.get(f(i4 - 1, arrayList5.size()));
                        m83 m83Var10 = (m83) arrayList5.get(i4);
                        PointF pointF8 = m83Var4.b;
                        m83Var9.b.set(pointF8.x, pointF8.y);
                        PointF pointF9 = m83Var4.c;
                        m83Var9.c.set(pointF9.x, pointF9.y);
                        PointF pointF10 = m83Var3.a;
                        m83Var10.a.set(pointF10.x, pointF10.y);
                        i4++;
                    }
                    i3++;
                    iceVar2 = iceVar;
                    z2 = z4;
                    arrayList2 = arrayList;
                    fFloatValue = f;
                }
                return iceVar4;
            }
        }
        return iceVar2;
    }

    @Override // defpackage.sce
    public final void g(hce hceVar) {
        this.b.a(hceVar);
    }
}
