package defpackage;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes.dex */
public final class yt1 extends mj8 implements gu5<MediaType> {
    final /* synthetic */ zt1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt1(zt1 zt1Var) {
        super(0);
        this.this$0 = zt1Var;
    }

    @Override // defpackage.gu5
    public final MediaType invoke() {
        String strA = this.this$0.f.a(TracingInterceptor.HEADER_CT);
        if (strA != null) {
            MediaType.e.getClass();
            try {
                return MediaType.Companion.a(strA);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
