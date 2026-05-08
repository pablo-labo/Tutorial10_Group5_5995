package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.mediacodec.b;
import androidx.media3.exoplayer.video.c;
import defpackage.ll3;
import defpackage.og1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yp3 implements y1d {
    public final Context a;
    public final b b;
    public boolean c;

    public yp3(Context context) {
        this.a = context;
        this.b = new b(context);
    }

    @Override // defpackage.y1d
    public final k[] a(Handler handler, d.a aVar, d.a aVar2, d.a aVar3, d.a aVar4) {
        ArrayList arrayList = new ArrayList();
        boolean z = this.c;
        Context context = this.a;
        c.C0054c c0054c = new c.C0054c(context);
        b bVar = this.b;
        c0054c.c = bVar;
        c0054c.d = 5000L;
        c0054c.e = z;
        c0054c.f = handler;
        c0054c.g = aVar;
        c0054c.h = 50;
        ka2.q(!c0054c.b);
        Handler handler2 = c0054c.f;
        ka2.q((handler2 == null && c0054c.g == null) || !(handler2 == null || c0054c.g == null));
        c0054c.b = true;
        arrayList.add(new c(c0054c));
        ll3.d dVar = new ll3.d(context);
        ka2.q(!dVar.d);
        dVar.d = true;
        if (dVar.c == null) {
            dVar.c = new ll3.f(new AudioProcessor[0]);
        }
        if (dVar.g == null) {
            dVar.g = new hl3(context);
        }
        arrayList.add(new og9(context, bVar, this.c, handler, aVar2, new ll3(dVar)));
        arrayList.add(new ojf(aVar3, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new ss9(aVar4, looper));
        arrayList.add(new ss9(aVar4, looper));
        arrayList.add(new dw1());
        arrayList.add(new u27(new og1.a(context)));
        return (k[]) arrayList.toArray(new k[0]);
    }

    @Override // defpackage.y1d
    public final void b(k kVar) {
        kVar.getClass();
    }
}
