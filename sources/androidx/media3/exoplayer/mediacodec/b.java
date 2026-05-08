package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.os.Build;
import androidx.media3.exoplayer.mediacodec.a;
import androidx.media3.exoplayer.mediacodec.c;
import androidx.media3.exoplayer.mediacodec.g;
import defpackage.cw0;
import defpackage.dw0;
import defpackage.st9;
import defpackage.vjg;
import defpackage.zkd;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c.b {
    public final Context a;
    public int b = 0;

    public b(Context context) {
        this.a = context;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c.b
    public final c a(c.a aVar) {
        int i;
        Context context;
        int i2 = this.b;
        if (i2 != 1 && (i2 != 0 || ((i = Build.VERSION.SDK_INT) < 31 && ((context = this.a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))))) {
            return new g.a().a(aVar);
        }
        int i3 = st9.i(aVar.c.n);
        zkd.D("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(vjg.F(i3)));
        return new a.C0049a(new cw0(i3), new dw0(i3)).a(aVar);
    }
}
