package defpackage;

import android.app.Activity;
import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.webkit.CookieManager;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.reactnative.rntarebridge.RNTareBridgeDetachmentException;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import okhttp3.Headers;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m87 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m87(o87 o87Var, Activity activity, String str, Response response, Function1 function1) {
        this.c = activity;
        this.b = str;
        this.d = response;
        this.e = function1;
    }

    @Override // java.lang.Runnable
    public final void run() throws RNTareBridgeDetachmentException {
        int i = this.a;
        Object obj = this.e;
        String str = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Activity activity = (Activity) obj3;
                Function1 function1 = (Function1) obj;
                Integer numValueOf = Integer.valueOf(R.string.download_failed_please_retry);
                Headers headers = ((Response) obj2).f;
                String strA = headers.a("Content-Disposition");
                if (strA == null) {
                    strA = null;
                }
                if (strA == null) {
                    ArrayList arrayList = lz2.a;
                    lz2.a("IndeedDownloadListener", "Downloading file failed: No Content-Disposition", str);
                    function1.invoke(numValueOf);
                } else {
                    List listK0 = zve.k0(strA, new String[]{"filename="});
                    if (listK0.size() < 2) {
                        ArrayList arrayList2 = lz2.a;
                        lz2.a("IndeedDownloadListener", "Downloading file failed: Content-Disposition format error", str);
                        function1.invoke(numValueOf);
                    } else {
                        String strI = wve.I(wve.I((String) listK0.get(1), "filename=", ""), "\"", "");
                        String strA2 = headers.a(TracingInterceptor.HEADER_CT);
                        String str2 = strA2 != null ? strA2 : null;
                        if (str2 == null) {
                            str2 = "application/octet-stream";
                        }
                        List listK02 = zve.k0(str2, new String[]{"charset="});
                        if (listK02.isEmpty()) {
                            ArrayList arrayList3 = lz2.a;
                            lz2.a("IndeedDownloadListener", "Downloading file failed: Content-Type format error", str);
                            function1.invoke(numValueOf);
                        } else {
                            String str3 = (String) listK02.get(0);
                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                            request.setTitle(strI);
                            request.setMimeType(str3);
                            String cookie = CookieManager.getInstance().getCookie(str);
                            if (cookie != null) {
                                request.addRequestHeader("Cookie", cookie);
                            }
                            request.setVisibleInDownloadsUi(true);
                            request.allowScanningByMediaScanner();
                            request.setNotificationVisibility(1);
                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strI);
                            Object systemService = activity.getSystemService("download");
                            systemService.getClass();
                            DownloadManager downloadManager = (DownloadManager) systemService;
                            try {
                                function1.invoke(Integer.valueOf(R.string.downloading_file));
                                downloadManager.enqueue(request);
                            } catch (Exception e) {
                                ArrayList arrayList4 = lz2.a;
                                lz2.a("IndeedDownloadListener", "Downloading file failed: " + e.getMessage(), str);
                                function1.invoke(numValueOf);
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                RNJSTNavigator.navigateTo$lambda$0((RNJSTNavigator) obj3, (jq7) obj2, str, (Promise) obj);
                break;
        }
    }

    public /* synthetic */ m87(RNJSTNavigator rNJSTNavigator, jq7 jq7Var, String str, Promise promise) {
        this.c = rNJSTNavigator;
        this.d = jq7Var;
        this.b = str;
        this.e = promise;
    }
}
