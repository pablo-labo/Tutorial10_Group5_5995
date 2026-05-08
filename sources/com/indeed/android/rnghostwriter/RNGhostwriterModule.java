package com.indeed.android.rnghostwriter;

import android.app.Activity;
import androidx.fragment.app.g;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseGhostwriterModule;
import defpackage.a74;
import defpackage.c1f;
import defpackage.cr8;
import defpackage.e13;
import defpackage.eq3;
import defpackage.eze;
import defpackage.f13;
import defpackage.f1g;
import defpackage.g13;
import defpackage.j6g;
import defpackage.l5;
import defpackage.lt;
import defpackage.lu2;
import defpackage.m89;
import defpackage.nmc;
import defpackage.no3;
import defpackage.np7;
import defpackage.r6;
import defpackage.r7d;
import defpackage.u63;
import defpackage.uh3;
import defpackage.v03;
import defpackage.wea;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseGhostwriterModule.MODULE_NAME)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/indeed/android/rnghostwriter/RNGhostwriterModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseGhostwriterModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lj6g;", "invalidate", "()V", "", "downloadUrl", "fileName", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "saveFileToDevice", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Le13;", "coroutineScope", "Le13;", "rnghostwriter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNGhostwriterModule extends IndeedRNBridgeBaseGhostwriterModule {
    private final e13 coroutineScope;
    private final ReactApplicationContext reactContext;

    @uh3(c = "com.indeed.android.rnghostwriter.RNGhostwriterModule$saveFileToDevice$1", f = "RNGhostwriterModule.kt", l = {45}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ g $activity;
        final /* synthetic */ String $downloadUrl;
        final /* synthetic */ String $fileName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, String str, String str2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$activity = gVar;
            this.$downloadUrl = str;
            this.$fileName = str2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$activity, this.$downloadUrl, this.$fileName, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    f1g f1gVar = (f1g) cr8.p(f1g.class);
                    g gVar = this.$activity;
                    String str = this.$downloadUrl;
                    String str2 = this.$fileName;
                    lt ltVar = new lt(7);
                    this.label = 1;
                    obj = f1gVar.a(gVar, str, str2, ltVar, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                if (((f1g.a) obj) == null) {
                    ((np7) cr8.p(np7.class)).f("RNGhostwriterModule", "saveFileToDevice: download failed or timed out", false, null);
                }
            } catch (Exception e) {
                ((np7) cr8.p(np7.class)).c("RNGhostwriterModule", l5.l("saveFileToDevice failed: ", e.getMessage()), false, e);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNGhostwriterModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
        eze ezeVarA = wea.a();
        eq3 eq3Var = a74.a;
        this.coroutineScope = f13.a(v03.a.C0438a.c(ezeVarA, m89.a));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        f13.c(this.coroutineScope, null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseGhostwriterModule
    @ReactMethod
    public void saveFileToDevice(String downloadUrl, String fileName, Promise promise) {
        downloadUrl.getClass();
        fileName.getClass();
        promise.getClass();
        Activity currentActivity = this.reactContext.getCurrentActivity();
        g gVar = currentActivity instanceof g ? (g) currentActivity : null;
        if (gVar == null) {
            promise.reject("NO_ACTIVITY", "Current activity is not available", (Throwable) null);
            return;
        }
        promise.resolve(null);
        e13 e13Var = this.coroutineScope;
        eq3 eq3Var = a74.a;
        u63.Y(e13Var, no3.c, null, new a(gVar, downloadUrl, fileName, null), 2);
    }
}
