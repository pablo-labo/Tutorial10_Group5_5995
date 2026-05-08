package defpackage;

import android.speech.SpeechRecognizer;
import androidx.activity.ComponentActivity;
import androidx.media3.exoplayer.video.g;
import com.facebook.react.bridge.Promise;
import com.github.douglasjunior.reactNativePdfRenderer.modules.PdfRendererViewManager;
import com.github.douglasjunior.reactNativePdfRenderer.modules.c;
import com.indeed.android.rnmyjobs.RNMyJobsModule;
import com.oney.WebRTCModule.WebRTCModule;
import java.io.File;
import java.io.IOException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cg2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cg2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        String absolutePath;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) obj2;
                int i2 = ComponentActivity.i0;
                componentActivity.a.a(new zf2((dqa) obj, componentActivity));
                break;
            case 1:
                h45 h45Var = (h45) obj2;
                ssc sscVar = (ssc) obj;
                try {
                    SpeechRecognizer speechRecognizer = h45Var.c;
                    if (speechRecognizer != null) {
                        speechRecognizer.cancel();
                    }
                    break;
                } catch (Exception unused) {
                }
                SpeechRecognizer speechRecognizer2 = h45Var.c;
                if (speechRecognizer2 != null) {
                    speechRecognizer2.destroy();
                }
                x35 x35Var = h45Var.g;
                if (x35Var != null) {
                    x35Var.a();
                }
                x35 x35Var2 = h45Var.g;
                if ((x35Var2 != null ? x35Var2.c : null) != null) {
                    h45Var.b.invoke("audioend", kc9.W(new Pair("uri", (x35Var2 == null || (file = x35Var2.c) == null || (absolutePath = file.getAbsolutePath()) == null) ? null : "file://".concat(absolutePath))));
                } else {
                    h45Var.b.invoke("audioend", kc9.W(new Pair("uri", null)));
                }
                h45Var.g = null;
                h45Var.b.invoke("end", null);
                h45Var.k = sscVar;
                qs3 qs3Var = h45Var.h;
                if (qs3Var != null) {
                    try {
                        qs3Var.b.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                h45Var.h = null;
                break;
            case 2:
                ((PdfRendererViewManager) obj2).lambda$setParams$0((c) obj);
                break;
            case 3:
                RNMyJobsModule.showPushOptInModal$lambda$1((RNMyJobsModule) obj2, (Promise) obj);
                break;
            case 4:
                g gVar = ((g.a) obj2).b;
                String str = vjg.a;
                gVar.d((String) obj);
                break;
            default:
                ((WebRTCModule) obj2).lambda$mediaStreamTrackRelease$17((String) obj);
                break;
        }
    }
}
