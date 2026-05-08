package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.c;
import com.indeed.android.jobsearch.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ixg {
    public static c a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;
        private final String value = "nativeWebViewAppear";

        static {
            a aVar = new a();
            a = aVar;
            b = new a[]{aVar};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }

        public final String a() {
            return this.value;
        }
    }

    public static ArrayList a(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof WebView) {
            arrayList.add(view);
            return arrayList;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                arrayList.addAll(a(childAt));
            }
        }
        return arrayList;
    }

    public static void b(WebView webView, Activity activity, RenderProcessGoneDetail renderProcessGoneDetail, String str) {
        Object obj;
        activity.getClass();
        PackageInfo packageInfoA = uwg.a(activity);
        if (packageInfoA == null || (obj = packageInfoA.versionName) == null) {
            obj = 0;
        }
        String str2 = "onRenderProcessGone didCrash=" + (renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null) + " rendererPriorityAtExit=" + (renderProcessGoneDetail != null ? Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()) : null) + " WebViewPackageVersion " + obj + " WebViewUrl " + (webView != null ? webView.getUrl() : null);
        ArrayList arrayList = lz2.a;
        w40.n(str2, str, str2, false);
        if (webView == null || webView.getUrl() == null) {
            return;
        }
        try {
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.clearHistory();
            webView.clearCache(true);
            webView.onPause();
            webView.removeAllViews();
            webView.destroy();
            c(activity, str);
        } catch (Exception e) {
            ArrayList arrayList2 = lz2.a;
            lz2.b(str, "Error handling render process gone", false, e);
            c(activity, str);
        }
    }

    public static void c(final Activity activity, String str) {
        c cVar;
        c.a aVar = new c.a(activity);
        String string = activity.getString(R.string.webview_render_error_message);
        AlertController.b bVar = aVar.a;
        bVar.f = string;
        aVar.a(activity.getString(R.string.tos_update_banner_cta), new DialogInterface.OnClickListener() { // from class: gxg
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                c cVar2 = ixg.a;
                if (cVar2 != null) {
                    cVar2.dismiss();
                }
                ixg.a = null;
                activity.finish();
            }
        });
        bVar.m = false;
        a = aVar.create();
        try {
            if (activity.isFinishing() || activity.isDestroyed() || (cVar = a) == null) {
                return;
            }
            cVar.show();
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.b(str, "Failed to show WebView error alert", false, e);
            activity.finishAndRemoveTask();
        }
    }
}
