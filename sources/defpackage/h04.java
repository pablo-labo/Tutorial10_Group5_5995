package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h04 {
    public final g04 a;
    public final o8a b;
    public final aj3 c;
    public final hyf d;
    public final cng e;
    public final xf1 f;
    public final c14 g;
    public final gxf h;
    public final gn9 i;

    public h04(g04 g04Var, o8a o8aVar, aj3 aj3Var, hyf hyfVar, cng cngVar, xf1 xf1Var, c14 c14Var, gxf gxfVar, List<l5c> list) {
        o8aVar.getClass();
        aj3Var.getClass();
        cngVar.getClass();
        xf1Var.getClass();
        this.a = g04Var;
        this.b = o8aVar;
        this.c = aj3Var;
        this.d = hyfVar;
        this.e = cngVar;
        this.f = xf1Var;
        this.g = c14Var;
        this.h = new gxf(this, gxfVar, list, "Deserializer for \"" + aj3Var.getName() + '\"', c14Var != null ? c14Var.a() : "[container not found]");
        this.i = new gn9(this);
    }

    public final h04 a(aj3 aj3Var, List<l5c> list, o8a o8aVar, hyf hyfVar, cng cngVar, xf1 xf1Var) {
        o8aVar.getClass();
        cngVar.getClass();
        xf1Var.getClass();
        int i = xf1Var.b;
        if ((i != 1 || xf1Var.c < 4) && i <= 1) {
            cngVar = this.e;
        }
        return new h04(this.a, o8aVar, aj3Var, hyfVar, cngVar, xf1Var, this.g, this.h, list);
    }
}
