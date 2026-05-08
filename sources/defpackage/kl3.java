package defpackage;

import android.os.Handler;
import com.datadog.android.core.internal.persistence.file.advanced.ScheduledWriter;
import expo.modules.speechrecognition.SpeechRecognitionOptions;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kl3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kl3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                sy0 sy0Var = (sy0) obj;
                ry0 ry0Var = og9.this.u1;
                Handler handler = ry0Var.a;
                if (handler != null) {
                    handler.post(new gj0(1, ry0Var, sy0Var));
                    return;
                }
                return;
            case 1:
                h45.a((h45) obj2, (SpeechRecognitionOptions) obj);
                return;
            case 2:
                ScheduledWriter.write$lambda$0((ScheduledWriter) obj2, obj);
                return;
            default:
                brf brfVar = (brf) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } finally {
                    brfVar.a();
                }
        }
    }
}
