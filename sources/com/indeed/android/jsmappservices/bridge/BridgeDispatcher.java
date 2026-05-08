package com.indeed.android.jsmappservices.bridge;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.Keep;
import com.indeed.android.jsmappservices.bridge.results.BridgeResult;
import com.indeed.android.jsmappservices.bridge.results.ErrorResult;
import com.indeed.android.jsmappservices.bridge.results.NativeResultObj;
import com.indeed.android.jsmappservices.bridge.results.NativeResultWrapper;
import com.indeed.android.jsmappservices.bridge.results.NativeStringResultObj;
import defpackage.ee3;
import defpackage.ic2;
import defpackage.jm1;
import defpackage.lz2;
import defpackage.sm1;
import defpackage.tm1;
import defpackage.um1;
import defpackage.wi0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/BridgeDispatcher;", "", "", "getAppVersion", "()Ljava/lang/String;", "json", "Lj6g;", "dispatchCommand", "(Ljava/lang/String;)V", "Companion", "a", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BridgeDispatcher {
    public final wi0 a;
    public final WebView b;
    public final Function1<String, Boolean> c;
    public final jm1 d;

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ic2.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[14] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[16] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[15] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[17] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[18] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[21] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[22] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[20] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[23] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[24] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[25] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[26] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[27] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[29] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[30] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[31] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[32] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[33] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[34] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[35] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[36] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            a = iArr;
        }
    }

    public static final class c implements sm1 {
        public final /* synthetic */ String a;
        public final /* synthetic */ BridgeDispatcher b;

        public c(String str, BridgeDispatcher bridgeDispatcher) {
            this.a = str;
            this.b = bridgeDispatcher;
        }

        @Override // defpackage.sm1
        public final void a(BridgeResult bridgeResult) {
            String strB = um1.a.b(NativeResultWrapper.INSTANCE.serializer(), new NativeResultWrapper(new NativeResultObj(this.a, bridgeResult)));
            this.b.b.evaluateJavascript("JSMABridgeReceiver.receiveAppResult(JSON.stringify(" + strB + "))", null);
            ArrayList arrayList = lz2.a;
            lz2.d("BridgeDispatcher", "Sent bridge result: ".concat(strB), false, null);
        }

        @Override // defpackage.sm1
        public final void b(String str) {
            str.getClass();
            String strB = um1.a.b(NativeResultWrapper.INSTANCE.serializer(), new NativeResultWrapper(new NativeStringResultObj(this.a, str)));
            this.b.b.evaluateJavascript("JSMABridgeReceiver.receiveAppResult(JSON.stringify(" + strB + "))", null);
            ArrayList arrayList = lz2.a;
            lz2.d("BridgeDispatcher", "Sent bridge result: ".concat(strB), false, null);
        }

        @Override // defpackage.sm1
        public final void c() {
            String strB = um1.a.b(NativeResultWrapper.INSTANCE.serializer(), new NativeResultWrapper(new NativeResultObj(this.a, null)));
            this.b.b.evaluateJavascript("JSMABridgeReceiver.receiveAppResult(JSON.stringify(" + strB + "))", null);
            ArrayList arrayList = lz2.a;
            lz2.d("BridgeDispatcher", "Sent bridge result: ".concat(strB), false, null);
        }

        public final void d(String str) {
            a(new ErrorResult(str));
            ArrayList arrayList = lz2.a;
            lz2.c("BridgeDispatcher", "Sent bridge error result: ".concat(str), false, null, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BridgeDispatcher(wi0 wi0Var, WebView webView, Function1<? super String, Boolean> function1, jm1 jm1Var) {
        wi0Var.getClass();
        webView.getClass();
        this.a = wi0Var;
        this.b = webView;
        this.c = function1;
        this.d = jm1Var;
    }

    @JavascriptInterface
    @Keep
    public final void dispatchCommand(String json) {
        json.getClass();
        this.a.runOnUiThread(new tm1(0, this, json));
    }

    @JavascriptInterface
    @Keep
    public final String getAppVersion() {
        return ee3.m(this.a);
    }
}
