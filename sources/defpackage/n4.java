package defpackage;

import androidx.media3.exoplayer.drm.a;
import com.datadog.android.core.internal.persistence.AbstractStorage;
import com.datadog.android.privacy.TrackingConsent;
import com.facebook.react.bridge.Promise;
import com.oney.WebRTCModule.WebRTCModule;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                AbstractStorage.onConsentUpdated$lambda$3((TrackingConsent) obj3, (TrackingConsent) obj2, (AbstractStorage) obj);
                break;
            case 1:
                a.C0043a c0043a = (a.C0043a) obj3;
                ((a) obj2).R(c0043a.a, c0043a.b, (Exception) obj);
                break;
            default:
                ((WebRTCModule) obj3).lambda$mediaStreamTrackGetCameraFacingMode$20((String) obj2, (Promise) obj);
                break;
        }
    }
}
