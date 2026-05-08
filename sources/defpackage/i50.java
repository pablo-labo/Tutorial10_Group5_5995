package defpackage;

import android.os.Trace;
import android.speech.SpeechRecognizer;
import androidx.compose.ui.layout.n;
import androidx.work.CoroutineWorker;
import com.datadog.android.core.internal.DatadogCore;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.UIManagerModule;
import defpackage.f2;
import defpackage.y55;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i50(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                n nVar = (n) obj;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                try {
                    nVar.invoke();
                    return;
                } finally {
                    Trace.endSection();
                }
            case 1:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!wl7.b(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!wl7.b(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 2:
                CoroutineWorker coroutineWorker = (CoroutineWorker) obj;
                if (coroutineWorker.b.a instanceof f2.b) {
                    coroutineWorker.a.h(null);
                    return;
                }
                return;
            case 3:
                DatadogCore.clearAllData$lambda$2((DatadogCore) obj);
                return;
            case 4:
                h45 h45Var = (h45) obj;
                h45Var.k = ssc.d;
                try {
                    SpeechRecognizer speechRecognizer = h45Var.c;
                    if (speechRecognizer != null) {
                        speechRecognizer.stopListening();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                y55.a aVar = (y55.a) obj;
                if (aVar.a) {
                    return;
                }
                aVar.a = true;
                a aVar2 = a.f;
                if (aVar2 != null) {
                    aVar2.b(a.EnumC0132a.c, y55.this.e);
                    return;
                } else {
                    r6.g("ReactChoreographer needs to be initialized.");
                    return;
                }
            default:
                ((UIManagerModule) obj).getUIImplementation().e(-1);
                return;
        }
    }
}
