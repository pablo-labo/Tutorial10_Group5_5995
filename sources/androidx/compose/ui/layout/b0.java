package androidx.compose.ui.layout;

import android.graphics.Rect;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.w;
import defpackage.bg9;
import defpackage.bs4;
import defpackage.dme;
import defpackage.g4a;
import defpackage.gme;
import defpackage.j6g;
import defpackage.jtf;
import defpackage.khd;
import defpackage.lm8;
import defpackage.mj8;
import defpackage.p3a;
import defpackage.q0h;
import defpackage.utc;
import defpackage.vf9;
import defpackage.z3a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends e.c implements lm8, jtf {
    public int d0 = -1;
    public f e0;
    public final b f0;

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ w $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar) {
            super(1);
            this.$placeable = wVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            aVar.r(this.$placeable, 0, 0, 0.0f);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<khd, j6g> {
        final /* synthetic */ f $insetsListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(1);
            this.$insetsListener = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(khd khdVar) {
            khd khdVar2 = khdVar;
            b0 b0Var = b0.this;
            b0Var.d0 = ((dme) b0Var.e0.V).e();
            if (b0.this.d0 > 0) {
                long jA = khdVar2.a1().a();
                z3a z3aVar = this.$insetsListener.f;
                int i = (int) (jA >> 32);
                int i2 = (int) (jA & 4294967295L);
                for (j0 j0Var : l0.b) {
                    V vD = z3aVar.d(j0Var);
                    vD.getClass();
                    q0h q0hVar = (q0h) vD;
                    l0.a(khdVar2, j0Var.c(), q0hVar.h, i, i2);
                    if (((Boolean) ((gme) q0hVar.b).getValue()).booleanValue()) {
                        l0.a(khdVar2, q0hVar.f, q0hVar.j, i, i2);
                        l0.a(khdVar2, q0hVar.g, q0hVar.k, i, i2);
                    }
                    l0.a(khdVar2, j0Var.a(), q0hVar.i, i, i2);
                }
                if (b0.this.e0.W.e()) {
                    b0 b0Var2 = b0.this;
                    p3a<g4a<Rect>> p3aVar = b0Var2.e0.W;
                    Object[] objArr = p3aVar.a;
                    int i3 = p3aVar.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        g4a g4aVar = (g4a) objArr[i4];
                        utc utcVar = b0Var2.e0.X.get(i4);
                        Rect rect = (Rect) g4aVar.getValue();
                        khdVar2.D0(utcVar.a(), rect.left);
                        khdVar2.D0(utcVar.b(), rect.top);
                        khdVar2.D0(utcVar.d(), rect.right);
                        khdVar2.D0(utcVar.c(), rect.bottom);
                    }
                }
            }
            return j6g.a;
        }
    }

    public b0(f fVar) {
        this.e0 = fVar;
        this.f0 = new b(fVar);
    }

    @Override // defpackage.jtf
    public final Object E() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        w wVarR = vf9Var.R(j);
        return qVar.z1(wVarR.a, wVarR.b, bs4.a, this.f0, new a(wVarR));
    }
}
