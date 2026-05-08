package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import defpackage.ade;
import defpackage.z91;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zp4 implements a6b, z91.a, ks2 {
    public final j79 b;
    public final keb c;
    public final z91<?, PointF> d;
    public final u42 e;
    public boolean g;
    public final Path a = new Path();
    public final wm2 f = new wm2(0);

    public zp4(j79 j79Var, ba1 ba1Var, u42 u42Var) {
        this.b = j79Var;
        z91<?, ?> z91VarT = u42Var.c.t();
        this.c = (keb) z91VarT;
        z91<PointF, PointF> z91VarT2 = u42Var.b.t();
        this.d = z91VarT2;
        this.e = u42Var;
        ba1Var.f(z91VarT);
        ba1Var.f(z91VarT2);
        z91VarT.a(this);
        z91VarT2.a(this);
    }

    @Override // z91.a
    public final void a() {
        this.g = false;
        this.b.invalidateSelf();
    }

    @Override // defpackage.ks2
    public final void b(List<ks2> list, List<ks2> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            ks2 ks2Var = (ks2) arrayList.get(i);
            if (ks2Var instanceof juf) {
                juf jufVar = (juf) ks2Var;
                if (jufVar.c == ade.a.a) {
                    ((ArrayList) this.f.a).add(jufVar);
                    jufVar.f(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.a6b
    public final Path c() {
        boolean z = this.g;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        u42 u42Var = this.e;
        if (u42Var.e) {
            this.g = true;
            return path;
        }
        PointF pointFE = this.c.e();
        float f = pointFE.x / 2.0f;
        float f2 = pointFE.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (u42Var.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointFE2 = this.d.e();
        path.offset(pointFE2.x, pointFE2.y);
        path.close();
        this.f.a(path);
        this.g = true;
        return path;
    }
}
