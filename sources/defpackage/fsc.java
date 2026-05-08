package defpackage;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fsc implements dra {
    public final gu5<j6g> a;

    public fsc(gu5<j6g> gu5Var) {
        this.a = gu5Var;
    }

    @Override // defpackage.dra
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (!webResourceRequest.isForMainFrame()) {
            ArrayList arrayList = lz2.a;
            lz2.a("ReceivedMainFrameHttpErrorForwarderComponent", "Error loading non-main-page resource", String.valueOf(webResourceRequest.getUrl()));
            return;
        }
        List listA0 = u63.a0(Integer.valueOf(DataOkHttpUploader.HTTP_UNAUTHORIZED), Integer.valueOf(DataOkHttpUploader.HTTP_FORBIDDEN), Integer.valueOf(DataOkHttpUploader.HTTP_TOO_MANY_REQUESTS));
        ArrayList arrayList2 = lz2.a;
        Log.d("ReceivedMainFrameHttpErrorForwarderComponent", "ErrorCode: " + webResourceResponse.getStatusCode() + " Url:" + webResourceRequest.getUrl(), null);
        if (listA0.contains(Integer.valueOf(webResourceResponse.getStatusCode()))) {
            return;
        }
        this.a.invoke();
    }
}
