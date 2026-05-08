package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import defpackage.pra;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qra {
    public static final nde a = wg2.d(0, 0, null, 7);

    @uh3(c = "com.indeed.android.onboarding.util.OnboardingBridgeMessenger$emitOnboardingComplete$1", f = "OnboardingBridgeMessenger.kt", l = {BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $surfaceFactor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$surfaceFactor = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$surfaceFactor, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                nde ndeVar = qra.a;
                pra.a aVar = new pra.a(this.$surfaceFactor);
                this.label = 1;
                Object objA = ndeVar.a(aVar, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
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

    public static void a(String str) throws Throwable {
        str.getClass();
        u63.i0(vr4.a, new a(str, null));
    }
}
