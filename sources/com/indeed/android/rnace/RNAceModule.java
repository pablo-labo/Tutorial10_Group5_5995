package com.indeed.android.rnace;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import androidx.navigation.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAceNativeModule;
import com.indeed.android.reactnative.rntarebridge.RNTareBridgeDetachmentException;
import defpackage.a74;
import defpackage.abc;
import defpackage.aq1;
import defpackage.b0;
import defpackage.c1f;
import defpackage.cr8;
import defpackage.dbc;
import defpackage.dt3;
import defpackage.e13;
import defpackage.ebc;
import defpackage.eq3;
import defpackage.f13;
import defpackage.f1g;
import defpackage.h2g;
import defpackage.i1g;
import defpackage.j6g;
import defpackage.jq7;
import defpackage.l1g;
import defpackage.l5;
import defpackage.lr5;
import defpackage.lu2;
import defpackage.lx5;
import defpackage.mh2;
import defpackage.nmc;
import defpackage.no3;
import defpackage.np7;
import defpackage.pyd;
import defpackage.q2g;
import defpackage.r6;
import defpackage.r7d;
import defpackage.rq7;
import defpackage.u63;
import defpackage.uh3;
import defpackage.wi1;
import defpackage.wve;
import defpackage.z92;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseAceNativeModule.MODULE_NAME)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b$\u0010\u001bJ+\u0010&\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b(\u0010\u001dJ\u0017\u0010)\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b)\u0010\u001dJ'\u0010,\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b,\u0010'J\u0017\u0010-\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b-\u0010\u001dJ\u0017\u0010.\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b.\u0010\u001dJ\u0017\u0010/\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b/\u0010\u001dJ\u0017\u00100\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\tH\u0017¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00102\u0006\u00103\u001a\u000202H\u0017¢\u0006\u0004\b4\u00105JC\u0010;\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\t2\b\u00107\u001a\u0004\u0018\u00010\t2\b\u00108\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0010¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0010¢\u0006\u0004\b?\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lcom/indeed/android/rnace/RNAceModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseAceNativeModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/ReadableArray;", "tags", "", "", "readableArrayToList", "(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;", "Lcom/facebook/react/bridge/ReadableMap;", "readableMap", "Llx5$b;", "paramsBuilder", "Lj6g;", "addExtraParams", "(Lcom/facebook/react/bridge/ReadableMap;Llx5$b;)V", "eventName", "params", "emitEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "profileMergeData", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "openAceResumeCreation", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "closeAceResumeCreation", "(Lcom/facebook/react/bridge/Promise;)V", "commonEventName", "eventType", "extraParams", "logGenericEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "from", "navigateToPathfinder", "path", "navigateToPathfinderUrl", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "signalAceChatReady", "signalAceChatNotReady", "resumeUrl", "fileName", "showResumePreview", "getIpCountry", "isSearchTabActive", "isTareTopNavActive", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(D)V", "conversationId", "starterMessage", "agentType", "termType", "url", "emitDeeplinkEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "emitPopToAceRootViewEvent", "()V", "emitAceBottomNavTabBlurredEvent", "Lcom/facebook/react/bridge/ReactApplicationContext;", "latestUndeliveredDeeplinkEvent", "Lcom/facebook/react/bridge/ReadableMap;", "", "isReactNativeReady", "Z", "rnace_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNAceModule extends IndeedRNBridgeBaseAceNativeModule {
    public static final int $stable = 8;
    private boolean isReactNativeReady;
    private ReadableMap latestUndeliveredDeeplinkEvent;
    private final ReactApplicationContext reactContext;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @uh3(c = "com.indeed.android.rnace.RNAceModule$showResumePreview$1", f = "RNAceModule.kt", l = {233, 242, 249, 263}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ g $activity;
        final /* synthetic */ FragmentManager $fragmentManager;
        final /* synthetic */ String $pdfFileName;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $resumeUrl;
        Object L$0;
        int label;

        @uh3(c = "com.indeed.android.rnace.RNAceModule$showResumePreview$1$1", f = "RNAceModule.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ Promise $promise;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Promise promise, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.$promise = promise;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new a(this.$promise, lu2Var);
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
                this.$promise.reject("DOWNLOAD_FAILED", "Failed to download resume file", (Throwable) null);
                return j6g.a;
            }
        }

        /* JADX INFO: renamed from: com.indeed.android.rnace.RNAceModule$b$b, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.rnace.RNAceModule$showResumePreview$1$2", f = "RNAceModule.kt", l = {}, m = "invokeSuspend")
        public static final class C0180b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ g $activity;
            final /* synthetic */ f1g.a $downloadInfo;
            final /* synthetic */ FragmentManager $fragmentManager;
            final /* synthetic */ Promise $promise;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0180b(FragmentManager fragmentManager, g gVar, f1g.a aVar, Promise promise, lu2<? super C0180b> lu2Var) {
                super(2, lu2Var);
                this.$fragmentManager = fragmentManager;
                this.$activity = gVar;
                this.$downloadInfo = aVar;
                this.$promise = promise;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0180b(this.$fragmentManager, this.$activity, this.$downloadInfo, this.$promise, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0180b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                try {
                    ((f1g) cr8.p(f1g.class)).b(this.$fragmentManager, this.$activity, this.$downloadInfo, null);
                    this.$promise.resolve(null);
                } catch (Exception e) {
                    this.$promise.reject("PREVIEW_ERROR", "Failed to show document preview: " + e.getMessage(), e);
                }
                return j6g.a;
            }
        }

        @uh3(c = "com.indeed.android.rnace.RNAceModule$showResumePreview$1$3", f = "RNAceModule.kt", l = {}, m = "invokeSuspend")
        public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ Exception $e;
            final /* synthetic */ Promise $promise;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Promise promise, Exception exc, lu2<? super c> lu2Var) {
                super(2, lu2Var);
                this.$promise = promise;
                this.$e = exc;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new c(this.$promise, this.$e, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                this.$promise.reject("DOWNLOAD_ERROR", l5.l("Failed to download resume: ", this.$e.getMessage()), this.$e);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, String str, String str2, Promise promise, FragmentManager fragmentManager, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$activity = gVar;
            this.$resumeUrl = str;
            this.$pdfFileName = str2;
            this.$promise = promise;
            this.$fragmentManager = fragmentManager;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$activity, this.$resumeUrl, this.$pdfFileName, this.$promise, this.$fragmentManager, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
        
            if (defpackage.u63.q0(r0, r11, r17) == r10) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
        
            if (defpackage.u63.q0(r1, r2, r17) != r10) goto L37;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r5 = r17
                int r0 = r5.label
                r6 = 4
                r7 = 3
                r8 = 2
                r1 = 1
                r9 = 0
                g13 r10 = defpackage.g13.a
                if (r0 == 0) goto L3e
                if (r0 == r1) goto L38
                if (r0 == r8) goto L30
                if (r0 == r7) goto L24
                if (r0 != r6) goto L1e
                java.lang.Object r0 = r5.L$0
                java.lang.Exception r0 = (java.lang.Exception) r0
                defpackage.r7d.b(r18)
                goto Lb3
            L1e:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r0)
                return r9
            L24:
                java.lang.Object r0 = r5.L$0
                f1g$a r0 = (f1g.a) r0
                defpackage.r7d.b(r18)     // Catch: java.lang.Exception -> L2d
                goto Lb3
            L2d:
                r0 = move-exception
                goto L9d
            L30:
                java.lang.Object r0 = r5.L$0
                f1g$a r0 = (f1g.a) r0
                defpackage.r7d.b(r18)     // Catch: java.lang.Exception -> L2d
                goto L7e
            L38:
                defpackage.r7d.b(r18)     // Catch: java.lang.Exception -> L2d
                r0 = r18
                goto L63
            L3e:
                defpackage.r7d.b(r18)
                java.lang.Class<f1g> r0 = defpackage.f1g.class
                java.lang.Object r0 = defpackage.cr8.p(r0)     // Catch: java.lang.Exception -> L2d
                f1g r0 = (defpackage.f1g) r0     // Catch: java.lang.Exception -> L2d
                androidx.fragment.app.g r2 = r5.$activity     // Catch: java.lang.Exception -> L2d
                r3 = r2
                java.lang.String r2 = r5.$resumeUrl     // Catch: java.lang.Exception -> L2d
                r4 = r3
                java.lang.String r3 = r5.$pdfFileName     // Catch: java.lang.Exception -> L2d
                r11 = r4
                zg r4 = new zg     // Catch: java.lang.Exception -> L2d
                r12 = 9
                r4.<init>(r12)     // Catch: java.lang.Exception -> L2d
                r5.label = r1     // Catch: java.lang.Exception -> L2d
                r1 = r11
                java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L2d
                if (r0 != r10) goto L63
                goto Lb2
            L63:
                r14 = r0
                f1g$a r14 = (f1g.a) r14     // Catch: java.lang.Exception -> L2d
                if (r14 != 0) goto L81
                eq3 r0 = defpackage.a74.a     // Catch: java.lang.Exception -> L2d
                k89 r0 = defpackage.m89.a     // Catch: java.lang.Exception -> L2d
                com.indeed.android.rnace.RNAceModule$b$a r1 = new com.indeed.android.rnace.RNAceModule$b$a     // Catch: java.lang.Exception -> L2d
                com.facebook.react.bridge.Promise r2 = r5.$promise     // Catch: java.lang.Exception -> L2d
                r1.<init>(r2, r9)     // Catch: java.lang.Exception -> L2d
                r5.L$0 = r9     // Catch: java.lang.Exception -> L2d
                r5.label = r8     // Catch: java.lang.Exception -> L2d
                java.lang.Object r0 = defpackage.u63.q0(r0, r1, r5)     // Catch: java.lang.Exception -> L2d
                if (r0 != r10) goto L7e
                goto Lb2
            L7e:
                j6g r0 = defpackage.j6g.a     // Catch: java.lang.Exception -> L2d
                return r0
            L81:
                eq3 r0 = defpackage.a74.a     // Catch: java.lang.Exception -> L2d
                k89 r0 = defpackage.m89.a     // Catch: java.lang.Exception -> L2d
                com.indeed.android.rnace.RNAceModule$b$b r11 = new com.indeed.android.rnace.RNAceModule$b$b     // Catch: java.lang.Exception -> L2d
                androidx.fragment.app.FragmentManager r12 = r5.$fragmentManager     // Catch: java.lang.Exception -> L2d
                androidx.fragment.app.g r13 = r5.$activity     // Catch: java.lang.Exception -> L2d
                com.facebook.react.bridge.Promise r15 = r5.$promise     // Catch: java.lang.Exception -> L2d
                r16 = 0
                r11.<init>(r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> L2d
                r5.L$0 = r9     // Catch: java.lang.Exception -> L2d
                r5.label = r7     // Catch: java.lang.Exception -> L2d
                java.lang.Object r0 = defpackage.u63.q0(r0, r11, r5)     // Catch: java.lang.Exception -> L2d
                if (r0 != r10) goto Lb3
                goto Lb2
            L9d:
                eq3 r1 = defpackage.a74.a
                k89 r1 = defpackage.m89.a
                com.indeed.android.rnace.RNAceModule$b$c r2 = new com.indeed.android.rnace.RNAceModule$b$c
                com.facebook.react.bridge.Promise r3 = r5.$promise
                r2.<init>(r3, r0, r9)
                r5.L$0 = r9
                r5.label = r6
                java.lang.Object r0 = defpackage.u63.q0(r1, r2, r5)
                if (r0 != r10) goto Lb3
            Lb2:
                return r10
            Lb3:
                j6g r0 = defpackage.j6g.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.rnace.RNAceModule.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNAceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
    }

    private final void addExtraParams(ReadableMap readableMap, lx5.b paramsBuilder) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            int i = a.a[readableMap.getType(strNextKey).ordinal()];
            if (i == 1) {
                paramsBuilder.a(strNextKey, readableMap.getString(strNextKey));
            } else if (i == 2) {
                paramsBuilder.b(strNextKey, Long.valueOf((long) readableMap.getDouble(strNextKey)));
            } else if (i == 3) {
                paramsBuilder.a(strNextKey, String.valueOf(readableMap.getBoolean(strNextKey)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void closeAceResumeCreation$lambda$1(FragmentManager fragmentManager, Promise promise) {
        fragmentManager.getClass();
        Fragment fragmentD = fragmentManager.D(dbc.class.getSimpleName());
        if (fragmentD instanceof dbc) {
            ((i1g) cr8.p(i1g.class)).b(fragmentManager, (l1g) fragmentD);
        }
        promise.resolve(null);
    }

    public static /* synthetic */ void emitDeeplinkEvent$default(RNAceModule rNAceModule, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        rNAceModule.emitDeeplinkEvent(str, str2, str3, str4, str5);
    }

    private final void emitEvent(String eventName, ReadableMap params) {
        try {
            ReactApplicationContext reactApplicationContext = this.reactContext;
            reactApplicationContext.getClass();
            eventName.getClass();
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
        } catch (Exception unused) {
            if (this.isReactNativeReady || params == null) {
                return;
            }
            this.latestUndeliveredDeeplinkEvent = params;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g logGenericEvent$lambda$2(RNAceModule rNAceModule, ReadableMap readableMap, lx5.b bVar) {
        bVar.getClass();
        rNAceModule.addExtraParams(readableMap, bVar);
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openAceResumeCreation$lambda$0(FragmentManager fragmentManager, ebc ebcVar, Promise promise) {
        fragmentManager.getClass();
        ebcVar.getClass();
        if (pyd.h0 && ((h2g) cr8.p(h2g.class)).h()) {
            Bundle bundleA = aq1.a(new Pair("ace_resume_creation_props", ebcVar.toBundle()));
            dbc dbcVar = new dbc();
            dbcVar.setArguments(bundleA);
            ((i1g) cr8.p(i1g.class)).e(fragmentManager, dbcVar);
        }
        promise.resolve(null);
    }

    private final List<String> readableArrayToList(ReadableArray tags) {
        String string;
        ArrayList arrayList = new ArrayList();
        if (tags != null) {
            int size = tags.size();
            for (int i = 0; i < size; i++) {
                if (tags.getType(i) == ReadableType.String && (string = tags.getString(i)) != null) {
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAceNativeModule
    @ReactMethod
    public void addListener(String eventName) {
        eventName.getClass();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAceNativeModule
    @ReactMethod
    public void closeAceResumeCreation(Promise promise) {
        promise.getClass();
        if (!this.reactContext.hasCurrentActivity()) {
            b0.p("No activity in App", promise);
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        currentActivity.getClass();
        g gVar = (g) currentActivity;
        lr5 lr5VarU = gVar.u();
        lr5VarU.getClass();
        gVar.runOnUiThread(new dt3(4, lr5VarU, promise));
    }

    public final void emitAceBottomNavTabBlurredEvent() {
        try {
            ReactApplicationContext reactApplicationContext = this.reactContext;
            reactApplicationContext.getClass();
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("aceBottomNavTabBlurred", null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).f("RNAceModule", "Failed to emit aceBottomNavTabBlurred event", false, e);
        }
    }

    public final void emitDeeplinkEvent(String conversationId, String starterMessage, String agentType, String termType, String url) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (conversationId != null) {
            writableMapCreateMap.putString("conversationId", conversationId);
        }
        if (starterMessage != null) {
            writableMapCreateMap.putString("starterMessage", starterMessage);
        }
        if (agentType != null) {
            writableMapCreateMap.putString("agentType", agentType);
        }
        if (termType != null) {
            writableMapCreateMap.putString("termType", termType);
        }
        if (url != null) {
            writableMapCreateMap.putString("url", url);
        }
        writableMapCreateMap.getClass();
        if (this.isReactNativeReady) {
            emitEvent("refreshAceChat", writableMapCreateMap);
        } else {
            this.latestUndeliveredDeeplinkEvent = writableMapCreateMap;
        }
    }

    public final void emitPopToAceRootViewEvent() {
        try {
            ReactApplicationContext reactApplicationContext = this.reactContext;
            reactApplicationContext.getClass();
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("popToAceRootView", null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).f("RNAceModule", "Failed to emit popToAceRootView event", false, e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAceNativeModule
    @ReactMethod
    public void getIpCountry(Promise promise) {
        promise.getClass();
        promise.resolve(((q2g) cr8.p(q2g.class)).e());
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAceNativeModule
    @ReactMethod
    public void isSearchTabActive(Promise promise) {
        promise.getClass();
        try {
            promise.resolve(Boolean.valueOf(((h2g) cr8.p(h2g.class)).a()));
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c("RNAceModule", "Failed to check if search tab is active", false, e);
            promise.reject("SEARCH_TAB_ERROR", "Failed to check if search tab is active", e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAceNativeModule
    @ReactMethod
    public void isTareTopNavActive(Promise promise) {
        promise.getClass();
        try {
            promise.resolve(Boolean.valueOf(((h2g) cr8.p(h2g.class)).c()));
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c("RNAceModule", "Failed to check if TARE Top Nav active", false, e);
            promise.reject("SEARCH_TAB_ERROR", "Failed to check if TARE Top Nav active", e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAceNativeModule
    @ReactMethod
    public void logGenericEvent(String commonEventName, String eventName, String eventType, ReadableArray tags, ReadableMap extraParams, Promise promise) {
        commonEventName.getClass();
        eventName.getClass();
        eventType.getClass();
        tags.getClass();
        extraParams.getClass();
        promise.getClass();
        ((q2g) cr8.p(q2g.class)).a(new lx5(commonEventName, eventType, eventName, 1, readableArrayToList(tags), new wi1(2, this, extraParams)));
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAceNativeModule
    @ReactMethod
    public void navigateToPathfinder(String from, Promise promise) throws RNTareBridgeDetachmentException {
        e eVarK;
        promise.getClass();
        if (!this.reactContext.hasCurrentActivity()) {
            b0.p("No activity in App", promise);
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        g gVar = currentActivity instanceof g ? (g) currentActivity : null;
        if (gVar == null) {
            b0.p("Current activity is not a FragmentActivity", promise);
            return;
        }
        lr5 lr5VarU = gVar.u();
        lr5VarU.getClass();
        List<Fragment> listF = lr5VarU.c.f();
        listF.getClass();
        Fragment fragment = (Fragment) z92.Q0(listF);
        if (fragment == null || (eVarK = mh2.k(fragment)) == null) {
            throw new RNTareBridgeDetachmentException();
        }
        try {
            rq7 rq7Var = (rq7) cr8.p(rq7.class);
            jq7.s sVar = new jq7.s(null);
            if (from == null) {
                from = "rnace-module";
            }
            rq7Var.f(lr5VarU, eVarK, sVar, from);
            promise.resolve(null);
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAceNativeModule
    @ReactMethod
    public void navigateToPathfinderUrl(String from, String path, Promise promise) throws RNTareBridgeDetachmentException {
        e eVarK;
        promise.getClass();
        if (!this.reactContext.hasCurrentActivity()) {
            b0.p("No activity in App", promise);
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        g gVar = currentActivity instanceof g ? (g) currentActivity : null;
        if (gVar == null) {
            b0.p("Current activity is not a FragmentActivity", promise);
            return;
        }
        lr5 lr5VarU = gVar.u();
        lr5VarU.getClass();
        List<Fragment> listF = lr5VarU.c.f();
        listF.getClass();
        Fragment fragment = (Fragment) z92.Q0(listF);
        if (fragment == null || (eVarK = mh2.k(fragment)) == null) {
            throw new RNTareBridgeDetachmentException();
        }
        try {
            jq7.s sVar = path != null ? new jq7.s(path) : new jq7.s(null);
            rq7 rq7Var = (rq7) cr8.p(rq7.class);
            if (from == null) {
                from = "rnace-module";
            }
            rq7Var.f(lr5VarU, eVarK, sVar, from);
            promise.resolve(null);
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAceNativeModule
    @ReactMethod
    public void openAceResumeCreation(String profileMergeData, Promise promise) {
        profileMergeData.getClass();
        promise.getClass();
        if (!this.reactContext.hasCurrentActivity()) {
            b0.p("No activity in App", promise);
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        currentActivity.getClass();
        g gVar = (g) currentActivity;
        lr5 lr5VarU = gVar.u();
        lr5VarU.getClass();
        gVar.runOnUiThread(new abc(0, lr5VarU, new ebc(profileMergeData), promise));
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAceNativeModule
    @ReactMethod
    public void removeListeners(double count) {
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAceNativeModule
    @ReactMethod
    public void showResumePreview(String resumeUrl, String fileName, Promise promise) {
        resumeUrl.getClass();
        fileName.getClass();
        promise.getClass();
        if (!this.reactContext.hasCurrentActivity()) {
            promise.reject("NO_ACTIVITY", "No activity in App", (Throwable) null);
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        currentActivity.getClass();
        g gVar = (g) currentActivity;
        lr5 lr5VarU = gVar.u();
        lr5VarU.getClass();
        if (!wve.D(fileName, ".pdf", true)) {
            fileName = fileName.concat(".pdf");
        }
        String str = fileName;
        eq3 eq3Var = a74.a;
        u63.Y(f13.a(no3.c), null, null, new b(gVar, resumeUrl, str, promise, lr5VarU, null), 3);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAceNativeModule
    @ReactMethod
    public void signalAceChatNotReady(Promise promise) {
        promise.getClass();
        this.isReactNativeReady = false;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseAceNativeModule
    @ReactMethod
    public void signalAceChatReady(Promise promise) {
        promise.getClass();
        this.isReactNativeReady = true;
        ReadableMap readableMap = this.latestUndeliveredDeeplinkEvent;
        if (readableMap != null) {
            emitEvent("refreshAceChat", readableMap);
            this.latestUndeliveredDeeplinkEvent = null;
        }
    }
}
