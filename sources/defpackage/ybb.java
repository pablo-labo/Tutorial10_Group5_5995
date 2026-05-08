package defpackage;

import android.view.View;
import android.widget.Magnifier;
import defpackage.xbb;

/* JADX INFO: loaded from: classes.dex */
public final class ybb implements wbb {
    public static final ybb a = new ybb();

    public static final class a extends xbb.a {
        @Override // xbb.a, defpackage.vbb
        public final void b(long j, long j2, float f) {
            if (!Float.isNaN(f)) {
                this.a.setZoom(f);
            }
            long j3 = 9223372034707292159L & j2;
            Magnifier magnifier = this.a;
            if (j3 != 9205357640488583168L) {
                magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            }
        }
    }

    @Override // defpackage.wbb
    public final boolean a() {
        return true;
    }

    @Override // defpackage.wbb
    public final vbb b(View view, boolean z, long j, float f, float f2, boolean z2, iy3 iy3Var, float f3) {
        if (z) {
            return new a(new Magnifier(view));
        }
        long jI1 = iy3Var.I1(j);
        float fT1 = iy3Var.t1(f);
        float fT12 = iy3Var.t1(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jI1 != 9205357640488583168L) {
            builder.setSize(gf9.b(Float.intBitsToFloat((int) (jI1 >> 32))), gf9.b(Float.intBitsToFloat((int) (jI1 & 4294967295L))));
        }
        if (!Float.isNaN(fT1)) {
            builder.setCornerRadius(fT1);
        }
        if (!Float.isNaN(fT12)) {
            builder.setElevation(fT12);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new a(builder.build());
    }
}
