package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class lo7 extends na1 {
    public final int c;
    public final int d;
    public lfe e;

    public lo7(int i) {
        web.e(true);
        web.e(Boolean.valueOf(i > 0));
        this.c = 2;
        this.d = i;
    }

    @Override // defpackage.na1, defpackage.vhb
    public final ot1 c() {
        if (this.e == null) {
            this.e = new lfe(k20.l("i", this.c, this.d, "r"));
        }
        return this.e;
    }

    @Override // defpackage.na1
    public final void d(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.c, this.d);
    }
}
