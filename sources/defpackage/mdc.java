package defpackage;

import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import defpackage.kv8;
import defpackage.xh8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmdc;", "Lija;", "Lxh8;", "<init>", "()V", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class mdc extends ija implements xh8 {

    @uh3(c = "com.indeed.android.reactnative.rntarebridge.nav.RNJSTBottomSheetFragment$onViewCreated$1", f = "RNJSTBottomSheetFragment.kt", l = {51}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        /* JADX INFO: renamed from: mdc$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.reactnative.rntarebridge.nav.RNJSTBottomSheetFragment$onViewCreated$1$1", f = "RNJSTBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
        public static final class C0314a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ mdc this$0;

            /* JADX INFO: renamed from: mdc$a$a$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.reactnative.rntarebridge.nav.RNJSTBottomSheetFragment$onViewCreated$1$1$1", f = "RNJSTBottomSheetFragment.kt", l = {53}, m = "invokeSuspend")
            public static final class C0315a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                int label;
                final /* synthetic */ mdc this$0;

                /* JADX INFO: renamed from: mdc$a$a$a$a, reason: collision with other inner class name */
                public static final class C0316a<T> implements wi5 {
                    public final /* synthetic */ mdc a;

                    public C0316a(mdc mdcVar) {
                        this.a = mdcVar;
                    }

                    @Override // defpackage.wi5
                    public final Object a(Object obj, lu2 lu2Var) {
                        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
                        WritableMap writableMap = (WritableMap) obj;
                        mdc mdcVar = this.a;
                        mdcVar.c = true;
                        hja hjaVar = mdcVar.b;
                        if (hjaVar != null) {
                            hjaVar.f(true);
                        }
                        ((np7) cr8.p(np7.class)).a("RNJSTBottomSheetFragment", "emitNavigateToModalDeviceEvent()");
                        try {
                            Object applicationContext = mdcVar.requireContext().getApplicationContext();
                            applicationContext.getClass();
                            rkc rkcVarB = ((pjc) applicationContext).b();
                            ReactContext reactContextA = rkcVarB != null ? rkcVarB.a() : null;
                            if (reactContextA != null && (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextA.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) != null) {
                                rCTDeviceEventEmitter.emit("rnJSTBottomSheetNavigateToModal", writableMap);
                            }
                        } catch (Exception e) {
                            ((np7) cr8.p(np7.class)).c("RNJSTBottomSheetFragment", "emitNavigateToModalDeviceEvent error", false, e);
                        }
                        return j6g.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0315a(mdc mdcVar, lu2<? super C0315a> lu2Var) {
                    super(2, lu2Var);
                    this.this$0 = mdcVar;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new C0315a(this.this$0, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) throws Throwable {
                    ((C0315a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                    return g13.a;
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) throws Throwable {
                    qpd qpdVarD;
                    int i = this.label;
                    if (i != 0) {
                        if (i == 1) {
                            throw s6.e(obj);
                        }
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    pmc pmcVar = this.this$0;
                    if (pmcVar instanceof ai8) {
                        qpdVarD = ((ai8) pmcVar).d();
                    } else {
                        pmcVar.getClass();
                        qpdVarD = (qpd) xh8.a.a().a.b;
                    }
                    nde ndeVarC = ((obc) qpdVarD.a(null, fwc.a.b(obc.class), null)).c();
                    C0316a c0316a = new C0316a(this.this$0);
                    this.label = 1;
                    ndeVarC.e(c0316a, this);
                    return g13.a;
                }
            }

            /* JADX INFO: renamed from: mdc$a$a$b */
            @uh3(c = "com.indeed.android.reactnative.rntarebridge.nav.RNJSTBottomSheetFragment$onViewCreated$1$1$2", f = "RNJSTBottomSheetFragment.kt", l = {59}, m = "invokeSuspend")
            public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                int label;
                final /* synthetic */ mdc this$0;

                /* JADX INFO: renamed from: mdc$a$a$b$a, reason: collision with other inner class name */
                public static final class C0317a<T> implements wi5 {
                    public final /* synthetic */ mdc a;

                    public C0317a(mdc mdcVar) {
                        this.a = mdcVar;
                    }

                    @Override // defpackage.wi5
                    public final Object a(Object obj, lu2 lu2Var) {
                        if (!((Boolean) obj).booleanValue()) {
                            mdc mdcVar = this.a;
                            mdcVar.c = true;
                            hja hjaVar = mdcVar.b;
                            if (hjaVar != null) {
                                hjaVar.f(false);
                            }
                        }
                        return j6g.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(mdc mdcVar, lu2<? super b> lu2Var) {
                    super(2, lu2Var);
                    this.this$0 = mdcVar;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new b(this.this$0, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) throws Throwable {
                    ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                    return g13.a;
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) throws Throwable {
                    qpd qpdVarD;
                    int i = this.label;
                    if (i != 0) {
                        if (i == 1) {
                            throw s6.e(obj);
                        }
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    pmc pmcVar = this.this$0;
                    if (pmcVar instanceof ai8) {
                        qpdVarD = ((ai8) pmcVar).d();
                    } else {
                        pmcVar.getClass();
                        qpdVarD = (qpd) xh8.a.a().a.b;
                    }
                    nde ndeVarD = ((obc) qpdVarD.a(null, fwc.a.b(obc.class), null)).d();
                    C0317a c0317a = new C0317a(this.this$0);
                    this.label = 1;
                    ndeVarD.e(c0317a, this);
                    return g13.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0314a(mdc mdcVar, lu2<? super C0314a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = mdcVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0314a c0314a = new C0314a(this.this$0, lu2Var);
                c0314a.L$0 = obj;
                return c0314a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0314a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                e13 e13Var = (e13) this.L$0;
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                u63.Y(e13Var, null, null, new C0315a(this.this$0, null), 3);
                u63.Y(e13Var, null, null, new b(this.this$0, null), 3);
                return j6g.a;
            }
        }

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return mdc.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                zv8 viewLifecycleOwner = mdc.this.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                C0314a c0314a = new C0314a(mdc.this, null);
                this.label = 1;
                Object objB = c2d.b(viewLifecycleOwner, kv8.b.d, c0314a, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // defpackage.ija, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        zv8 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        u63.Y(hh1.A(viewLifecycleOwner), null, null, new a(null), 3);
    }
}
