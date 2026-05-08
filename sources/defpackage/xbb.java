package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class xbb implements wbb {
    public static final xbb a = new xbb();

    public static class a implements vbb {
        public final Magnifier a;

        public a(Magnifier magnifier) {
            this.a = magnifier;
        }

        @Override // defpackage.vbb
        public final long a() {
            return (((long) this.a.getWidth()) << 32) | (((long) this.a.getHeight()) & 4294967295L);
        }

        @Override // defpackage.vbb
        public void b(long j, long j2, float f) {
            this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }

        @Override // defpackage.vbb
        public final void c() {
            this.a.update();
        }

        @Override // defpackage.vbb
        public final void dismiss() {
            this.a.dismiss();
        }
    }

    @Override // defpackage.wbb
    public final boolean a() {
        return false;
    }

    @Override // defpackage.wbb
    public final vbb b(View view, boolean z, long j, float f, float f2, boolean z2, iy3 iy3Var, float f3) {
        return new a(new Magnifier(view));
    }
}
