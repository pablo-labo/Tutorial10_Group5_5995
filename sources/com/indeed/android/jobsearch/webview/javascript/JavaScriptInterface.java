package com.indeed.android.jobsearch.webview.javascript;

import android.os.Message;
import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.LaunchActivity;
import defpackage.boa;
import defpackage.c1f;
import defpackage.e13;
import defpackage.gz4;
import defpackage.j6g;
import defpackage.l5;
import defpackage.l98;
import defpackage.lu2;
import defpackage.lz2;
import defpackage.qt8;
import defpackage.qv8;
import defpackage.r6;
import defpackage.r7d;
import defpackage.u63;
import defpackage.uh3;
import defpackage.vh8;
import defpackage.wve;
import defpackage.xh8;
import defpackage.zv7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ-\u0010\r\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/indeed/android/jobsearch/webview/javascript/JavaScriptInterface;", "Lxh8;", "", "getDeviceId", "()Ljava/lang/String;", "jsCallId", "result", "Lj6g;", "reportJsCallResult", "(Ljava/lang/String;Ljava/lang/String;)V", "href", "referrer", "documentOuterHtml", "reportBlankPage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JavaScriptInterface implements xh8 {
    public final LaunchActivity a;
    public final qv8 b;
    public final AtomicInteger c = new AtomicInteger(-1);
    public final Map<String, l98> d = Collections.synchronizedMap(new LinkedHashMap());
    public final Lazy e = boa.E(qt8.a, new zv7(this));

    @uh3(c = "com.indeed.android.jobsearch.webview.javascript.JavaScriptInterface$reportBlankPage$1", f = "JavaScriptInterface.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $documentOuterHtml;
        final /* synthetic */ String $href;
        final /* synthetic */ String $referrer;
        int label;
        final /* synthetic */ JavaScriptInterface this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, JavaScriptInterface javaScriptInterface, String str3, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$href = str;
            this.$documentOuterHtml = str2;
            this.this$0 = javaScriptInterface;
            this.$referrer = str3;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$href, this.$documentOuterHtml, this.this$0, this.$referrer, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            try {
                ArrayList arrayList = lz2.a;
                lz2.h("JavaScriptInterface", "Blank page detected at " + this.$href + ", contents: " + this.$documentOuterHtml, null, 12);
                gz4 gz4Var = (gz4) this.this$0.e.getValue();
                final String str = this.$href;
                final String str2 = this.$referrer;
                final JavaScriptInterface javaScriptInterface = this.this$0;
                gz4Var.a("blank_webview_contents", new Function1() { // from class: yv7
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        y3b y3bVar = (y3b) obj2;
                        String str3 = str;
                        if (str3 == null) {
                            str3 = "null";
                        }
                        beb.f(UiRumDebugListener.DEFAULT_ALPHA, UiRumDebugListener.DEFAULT_ALPHA);
                        int length = str3.length();
                        int i = 0;
                        ArrayList arrayList2 = new ArrayList((length / UiRumDebugListener.DEFAULT_ALPHA) + (length % UiRumDebugListener.DEFAULT_ALPHA == 0 ? 0 : 1));
                        while (i >= 0 && i < length) {
                            int i2 = i + UiRumDebugListener.DEFAULT_ALPHA;
                            CharSequence charSequenceSubSequence = str3.subSequence(i, (i2 < 0 || i2 > length) ? length : i2);
                            charSequenceSubSequence.getClass();
                            arrayList2.add(charSequenceSubSequence.toString());
                            i = i2;
                        }
                        Iterator it = z92.G1(arrayList2).iterator();
                        while (true) {
                            oa7 oa7Var = (oa7) it;
                            if (!oa7Var.a.hasNext()) {
                                break;
                            }
                            ma7 ma7Var = (ma7) oa7Var.next();
                            y3bVar.b(p6.c(ma7Var.a, "href"), (String) ma7Var.b);
                        }
                        y3bVar.b("href", str3);
                        String str4 = str2;
                        y3bVar.b("referrer", str4 != null ? str4 : "null");
                        javaScriptInterface.a.E();
                        throw null;
                    }
                });
            } catch (Exception e) {
                ArrayList arrayList2 = lz2.a;
                lz2.b("JavaScriptInterface", "Error logging blank page", false, e);
            }
            return j6g.a;
        }
    }

    public JavaScriptInterface(LaunchActivity launchActivity, qv8 qv8Var) {
        this.a = launchActivity;
        this.b = qv8Var;
    }

    @JavascriptInterface
    @Keep
    public final String getDeviceId() {
        JobSearchApplication jobSearchApplication = JobSearchApplication.X;
        return JobSearchApplication.a.a();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @JavascriptInterface
    @Keep
    public final void reportBlankPage(String href, String referrer, String documentOuterHtml) {
        u63.Y(this.b, null, null, new a(href, documentOuterHtml, this, referrer, null), 3);
    }

    @JavascriptInterface
    @Keep
    public final void reportJsCallResult(String jsCallId, String result) {
        l98 l98VarRemove = this.d.remove(jsCallId);
        if (l98VarRemove == null) {
            ArrayList arrayList = lz2.a;
            lz2.c("JavaScriptInterface", l5.l("Received result for unregistered JsCall id ", jsCallId), false, null, 12);
        } else if (result == null || !wve.K(result, "#jsCallError:", false)) {
            l98VarRemove.sendMessage(Message.obtain(l98VarRemove, 0, result));
        } else {
            l98VarRemove.sendMessage(Message.obtain(l98VarRemove, 1, result.substring(13)));
        }
    }
}
