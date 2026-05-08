package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vfe extends e.c implements lm8, c5e {
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public long l0;
    public dce m0;
    public boolean n0;
    public long o0;
    public long p0;
    public int q0;
    public ufe r0;

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ w $placeable;
        final /* synthetic */ vfe this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar, vfe vfeVar) {
            super(1);
            this.$placeable = wVar;
            this.this$0 = vfeVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            w.a.C(aVar, this.$placeable, 0, 0, this.this$0.r0, 4);
            return j6g.a;
        }
    }

    @Override // defpackage.c5e
    public final boolean B() {
        return false;
    }

    @Override // defpackage.c5e
    public final void F0(s5e s5eVar) {
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        w wVarR = vf9Var.R(j);
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new a(wVarR, this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.d0);
        sb.append(", scaleY=");
        sb.append(this.e0);
        sb.append(", alpha = ");
        sb.append(this.f0);
        sb.append(", translationX=");
        sb.append(this.g0);
        sb.append(", translationY=");
        sb.append(this.h0);
        sb.append(", shadowElevation=");
        sb.append(this.i0);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.j0);
        sb.append(", cameraDistance=");
        sb.append(this.k0);
        sb.append(", transformOrigin=");
        sb.append((Object) mrf.b(this.l0));
        sb.append(", shape=");
        sb.append(this.m0);
        sb.append(", clip=");
        sb.append(this.n0);
        sb.append(", renderEffect=null, ambientShadowColor=");
        h5.j(this.o0, ", spotShadowColor=", sb);
        h5.j(this.p0, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", sb);
        sb.append((Object) hh1.Z(this.q0));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
