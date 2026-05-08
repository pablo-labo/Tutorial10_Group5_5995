package defpackage;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.a;
import androidx.emoji2.text.d;
import androidx.emoji2.text.e;
import androidx.emoji2.text.g;
import androidx.media3.exoplayer.video.g;
import com.facebook.react.bridge.ReadableArray;
import com.oney.WebRTCModule.WebRTCModule;
import defpackage.fm3;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dm3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dm3(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fm3.a.C0234a c0234a = (fm3.a.C0234a) this.b;
                jv1 jv1Var = (jv1) this.c;
                m6d m6dVar = (m6d) this.d;
                fm3.a aVar = fm3.a.this;
                if (aVar.b.s()) {
                    jv1Var.a(aVar, new IOException("Canceled"));
                    return;
                } else {
                    jv1Var.b(aVar, m6dVar);
                    return;
                }
            case 1:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.b;
                d.i iVar = (d.i) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    g gVarA = a.a(bVar.a);
                    if (gVarA == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    g.b bVar2 = (g.b) gVarA.a;
                    synchronized (bVar2.d) {
                        bVar2.f = threadPoolExecutor;
                        break;
                    }
                    gVarA.a.a(new e(iVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    iVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 2:
                g.a aVar2 = (g.a) this.b;
                androidx.media3.common.a aVar3 = (androidx.media3.common.a) this.c;
                dk3 dk3Var = (dk3) this.d;
                androidx.media3.exoplayer.video.g gVar = aVar2.b;
                String str = vjg.a;
                gVar.c(aVar3, dk3Var);
                return;
            default:
                ((WebRTCModule) this.b).lambda$mediaStreamTrackSetVideoEffects$23((String) this.c, (ReadableArray) this.d);
                return;
        }
    }
}
