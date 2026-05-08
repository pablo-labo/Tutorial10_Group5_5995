package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.datadog.android.core.internal.DatadogCore;
import com.github.douglasjunior.reactNativePdfRenderer.modules.c;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h50(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AndroidComposeView androidComposeView = (AndroidComposeView) obj;
                androidComposeView.r1 = false;
                MotionEvent motionEvent = androidComposeView.j1;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    androidComposeView.V(motionEvent);
                    return;
                } else {
                    r6.g("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 1:
                fw0 fw0Var = (fw0) obj;
                synchronized (fw0Var.a) {
                    try {
                        if (fw0Var.m) {
                            return;
                        }
                        long j = fw0Var.l - 1;
                        fw0Var.l = j;
                        if (j > 0) {
                            return;
                        }
                        if (j >= 0) {
                            fw0Var.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (fw0Var.a) {
                            fw0Var.n = illegalStateException;
                            break;
                        }
                        return;
                    } finally {
                    }
                }
            case 2:
                DatadogCore.setupShutdownHook$lambda$10((DatadogCore) obj);
                return;
            case 3:
                y55 y55Var = (y55) obj;
                y55Var.f = false;
                Trace.beginSection(jpf.g("BatchEventDispatchedListeners"));
                try {
                    Iterator<le1> it = y55Var.d.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        it.next().a();
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 4:
                jq5 jq5Var = (jq5) obj;
                Choreographer choreographer = Choreographer.getInstance();
                jq5Var.b = choreographer;
                if (choreographer != null) {
                    choreographer.removeFrameCallback(jq5Var);
                    return;
                }
                return;
            case 5:
                ((c) obj).n0();
                return;
            default:
                ((dd) obj).invoke();
                return;
        }
    }
}
