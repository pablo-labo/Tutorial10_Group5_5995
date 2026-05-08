package defpackage;

import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.video.g;
import com.datadog.android.core.internal.persistence.file.advanced.ScheduledWriter;
import com.datadog.android.rum.internal.tracking.AndroidXFragmentLifecycleCallbacks;
import com.oney.WebRTCModule.WebRTCModule;
import defpackage.j2;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vb0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidXFragmentLifecycleCallbacks.onFragmentStopped$lambda$2((AndroidXFragmentLifecycleCallbacks) this.b, (Fragment) this.c);
                break;
            case 1:
                List list = (List) this.b;
                bq2 bq2Var = (bq2) this.c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((aq2) it.next()).a(bq2Var.e);
                }
                break;
            case 2:
                ScheduledWriter.write$lambda$1((ScheduledWriter) this.b, (List) this.c);
                break;
            case 3:
                ebe ebeVar = (ebe) this.b;
                hz8 hz8Var = (hz8) this.c;
                if (ebeVar.a instanceof j2.b) {
                    hz8Var.cancel(false);
                }
                break;
            case 4:
                g.a aVar = (g.a) this.b;
                Exception exc = (Exception) this.c;
                g gVar = aVar.b;
                String str = vjg.a;
                gVar.f(exc);
                break;
            default:
                ((WebRTCModule) this.b).lambda$mediaStreamCreate$13((String) this.c);
                break;
        }
    }
}
