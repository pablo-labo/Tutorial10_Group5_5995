package defpackage;

import androidx.media3.session.r;
import androidx.media3.session.s;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.blob.BlobCollector;
import com.facebook.react.modules.blob.BlobModule;
import com.indeed.android.rninterviewprep.RNResumeCoachModule;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ph1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ph1(s sVar, r.d dVar, Runnable runnable) {
        this.a = 2;
        this.b = sVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                BlobCollector.a((ReactApplicationContext) obj2, (BlobModule) obj);
                break;
            case 1:
                s sVar = (s) obj2;
                r.d dVar = (r.d) obj;
                if (!sVar.k()) {
                    sVar.p(dVar);
                    break;
                }
                break;
            case 2:
                ((s) obj2).getClass();
                ((Runnable) obj).run();
                break;
            case 3:
                RNResumeCoachModule.requestMicrophonePermission$lambda$1((qec) obj2, (Promise) obj);
                break;
            default:
                ((Promise) obj2).reject("E_OPERATION_ERROR", (String) obj);
                break;
        }
    }

    public /* synthetic */ ph1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
