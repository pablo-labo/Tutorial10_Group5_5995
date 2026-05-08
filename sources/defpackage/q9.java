package defpackage;

import android.os.Trace;
import androidx.compose.ui.platform.d;
import androidx.media3.session.k;
import com.facebook.react.devsupport.LogBoxModule;
import org.webrtc.VideoFileRenderer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((gu5) obj).invoke();
                return;
            case 1:
                d dVar = (d) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    dVar.d.a(true);
                    j6g j6gVar = j6g.a;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        dVar.n();
                        Trace.endSection();
                        dVar.L = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                LogBoxModule.invalidate$lambda$2((LogBoxModule) obj);
                return;
            case 3:
                k kVar = (k) obj;
                k.d dVar2 = kVar.n;
                if (dVar2 != null) {
                    kVar.d.unbindService(dVar2);
                    kVar.n = null;
                }
                kVar.c.a.clear();
                return;
            default:
                ((VideoFileRenderer) obj).lambda$release$3();
                return;
        }
    }
}
