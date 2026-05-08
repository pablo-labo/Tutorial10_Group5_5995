package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import defpackage.op2;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zb1 extends WebChromeClient implements xh8 {
    public final gu5<Activity> a;
    public final gu5<String> b;
    public final vk3 c;
    public ValueCallback<Uri[]> d;
    public final d2f e = new d2f(new dd(this, 3));

    /* JADX WARN: Multi-variable type inference failed */
    public zb1(gu5<? extends Activity> gu5Var, gu5<String> gu5Var2, vk3 vk3Var) {
        this.a = gu5Var;
        this.b = gu5Var2;
        this.c = vk3Var;
    }

    public final void a() {
        LinkedHashMap linkedHashMap;
        op2 op2Var = (op2) this.e.getValue();
        op2.a aVar = op2Var.d;
        synchronized (aVar.c) {
            Set setEntrySet = aVar.b.a.entrySet();
            setEntrySet.getClass();
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry> setEntrySet2 = aVar.b.a.entrySet();
            setEntrySet2.getClass();
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            ((gz4) op2Var.b.getValue()).a("webview_console_count", new mp2(op2Var, (String) entry2.getKey(), ((Number) entry2.getValue()).intValue()));
        }
    }

    public abstract Intent b(WebChromeClient.FileChooserParams fileChooserParams, String str);

    public abstract String c(String str);

    public abstract String e();

    public abstract void f(int i, String str, String str2, String str3);

    public abstract void g(String str);

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public abstract void h(Intent intent);

    public final void i(String str, int i, Intent intent) {
        if (this.d == null) {
            return;
        }
        Uri[] result = WebChromeClient.FileChooserParams.parseResult(i, intent);
        if (result == null) {
            g(str);
            ValueCallback<Uri[]> valueCallback = this.d;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                this.d = null;
                return;
            }
            return;
        }
        String stringExtra = intent != null ? intent.getStringExtra("FILE_CHOOSER_EXTRAS_KEY") : null;
        String string = Arrays.toString(result);
        string.getClass();
        f(i, str, string, stringExtra);
        ValueCallback<Uri[]> valueCallback2 = this.d;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(result);
            this.d = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onConsoleMessage(android.webkit.ConsoleMessage r11) {
        /*
            r10 = this;
            r11.getClass()
            gu5<java.lang.String> r0 = r10.b
            java.lang.Object r0 = r0.invoke()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto Lf
            java.lang.String r0 = ""
        Lf:
            r1 = 35
            java.lang.String r4 = defpackage.zve.p0(r0, r1)
            d2f r0 = r10.e
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            op2 r3 = (defpackage.op2) r3
            r3.getClass()
            x42 r1 = r3.c
            monitor-enter(r1)
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4d
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            int r0 = (int) r5     // Catch: java.lang.Throwable -> L4d
            x42 r2 = r3.c     // Catch: java.lang.Throwable -> L4d
            r2.a(r0)     // Catch: java.lang.Throwable -> L4d
            x42 r2 = r3.c     // Catch: java.lang.Throwable -> L4d
            int r5 = r2.c     // Catch: java.lang.Throwable -> L4d
            int r6 = r2.b     // Catch: java.lang.Throwable -> L4d
            int r5 = r5 - r6
            int r6 = r2.d     // Catch: java.lang.Throwable -> L4d
            r5 = r5 & r6
            r6 = 30
            r8 = 1
            r9 = 0
            if (r5 <= r6) goto L4b
            int r2 = r2.b()     // Catch: java.lang.Throwable -> L4d
            int r0 = r0 - r2
            r2 = 2
            if (r0 >= r2) goto L4b
            r0 = r8
            goto L50
        L4b:
            r0 = r9
            goto L50
        L4d:
            r0 = move-exception
            r10 = r0
            goto Laa
        L50:
            monitor-exit(r1)
            if (r0 == 0) goto L6f
            java.util.ArrayList r0 = defpackage.lz2.a
            java.lang.String r0 = "ConsoleAnalyzer"
            java.lang.String r1 = r11.message()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Too many console messages. Discarding "
            r2.<init>(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            android.util.Log.d(r0, r1, r2)
            r6 = r11
            goto L8f
        L6f:
            java.lang.String r0 = r11.message()
            if (r0 != 0) goto L77
            java.lang.String r0 = ""
        L77:
            r5 = r0
            android.webkit.ConsoleMessage$MessageLevel r7 = r11.messageLevel()
            kotlin.Lazy r0 = r3.b
            java.lang.Object r0 = r0.getValue()
            gz4 r0 = (defpackage.gz4) r0
            java.lang.String r1 = "webview_console_line"
            np2 r2 = new np2
            r6 = r11
            r2.<init>()
            r0.a(r1, r2)
        L8f:
            op2$a r11 = r3.d
            java.lang.Object r0 = r11.b(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L9d
            int r9 = r0.intValue()
        L9d:
            int r9 = r9 + r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r11.c(r4, r0)
            boolean r10 = super.onConsoleMessage(r6)
            return r10
        Laa:
            monitor-exit(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb1.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        jsResult.getClass();
        gu5<Activity> gu5Var = this.a;
        if (gu5Var.invoke().isFinishing()) {
            return false;
        }
        new o98(gu5Var.invoke(), jsResult, null, null, str2, c(str), 28).a();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        jsResult.getClass();
        gu5<Activity> gu5Var = this.a;
        if (gu5Var.invoke().isFinishing()) {
            return false;
        }
        Activity activityInvoke = gu5Var.invoke();
        String strC = c(str);
        new o98(activityInvoke, jsResult, Integer.valueOf(R.string.js_dialog_before_unload_negative_button), null, gu5Var.invoke().getString(R.string.js_dialog_before_unload, str2), strC, 16).a();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        jsResult.getClass();
        gu5<Activity> gu5Var = this.a;
        if (gu5Var.invoke().isFinishing()) {
            return false;
        }
        new o98(gu5Var.invoke(), jsResult, Integer.valueOf(android.R.string.cancel), null, str2, c(str), 20).a();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        jsPromptResult.getClass();
        gu5<Activity> gu5Var = this.a;
        if (gu5Var.invoke().isFinishing()) {
            return false;
        }
        new o98(gu5Var.invoke(), jsPromptResult, Integer.valueOf(android.R.string.cancel), str3, str2, c(str), 4).a();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        vk3 vk3Var;
        permissionRequest.getClass();
        String[] resources = permissionRequest.getResources();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ct0 ct0VarQ = web.q(resources);
        while (ct0VarQ.hasNext()) {
            String str = (String) ct0VarQ.next();
            boolean zB = wl7.b(str, "android.webkit.resource.AUDIO_CAPTURE");
            gu5<Activity> gu5Var = this.a;
            if (zB) {
                if (ot2.a(gu5Var.invoke(), "android.permission.RECORD_AUDIO") == 0) {
                    arrayList.add(str);
                } else {
                    arrayList2.add("android.permission.RECORD_AUDIO");
                }
            } else if (wl7.b(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                if (ot2.a(gu5Var.invoke(), "android.permission.CAMERA") == 0) {
                    arrayList.add(str);
                } else {
                    arrayList2.add("android.permission.CAMERA");
                }
            }
        }
        int i = 0;
        if (arrayList2.isEmpty() || (vk3Var = this.c) == null) {
            if (arrayList.isEmpty()) {
                permissionRequest.deny();
                return;
            } else {
                permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
                return;
            }
        }
        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
        yb1 yb1Var = new yb1(i, arrayList, resources, permissionRequest);
        IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) vk3Var.b;
        strArr.getClass();
        indeedApplyWebViewFragment.B0 = yb1Var;
        indeedApplyWebViewFragment.C0.a(strArr);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        permissionRequest.getClass();
        ArrayList arrayList = lz2.a;
        String[] resources = permissionRequest.getResources();
        resources.getClass();
        Log.d("BaseWebChromeClient", "Permission request canceled for resources: ".concat(ut0.t0(resources, null, null, null, null, 63)), null);
        super.onPermissionRequestCanceled(permissionRequest);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        webView.getClass();
        if (fileChooserParams == null || valueCallback == null) {
            return false;
        }
        this.d = valueCallback;
        try {
            h(b(fileChooserParams, webView.getUrl()));
            return true;
        } catch (ActivityNotFoundException e) {
            ArrayList arrayList = lz2.a;
            lz2.b("BaseWebChromeClient", "onShowFileChooser error", false, e);
            return true;
        }
    }
}
