package defpackage;

import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.indeed.android.rninterviewprep.RNInterviewPrepModule;
import com.indeed.android.rnonboarding.RnOnboardingModule;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class my0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ my0(int i, Object obj, Object obj2) {
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
                d.a aVar = ((ry0) obj2).b;
                String str = vjg.a;
                d.this.s.D((sy0) obj);
                break;
            case 1:
                DevLoadingModule.showMessage$lambda$0((DevLoadingModule) obj2, (String) obj);
                break;
            case 2:
                ((s) obj2).g.m1((r.d) obj, Integer.MIN_VALUE, 1, x.o1(new l(11)));
                break;
            case 3:
                ((VideoSink.a) obj2).a((tog) obj);
                break;
            case 4:
                RNInterviewPrepModule.closeReactFragment$lambda$4((idc) obj2, (Promise) obj);
                break;
            default:
                RnOnboardingModule.triggerPushPrimer$lambda$3((lr5) obj2, (Promise) obj);
                break;
        }
    }
}
