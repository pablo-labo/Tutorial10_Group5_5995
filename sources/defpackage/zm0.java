package defpackage;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import com.indeed.android.tare.broadcast.JSTBroadcast;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzm0;", "Landroidx/fragment/app/f;", "<init>", "()V", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class zm0 extends f {
    public final Lazy f0 = boa.E(qt8.a, new a(this));
    public final d2f g0 = new d2f(new ym0(0));

    public static final class a extends mj8 implements gu5<r81> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zm0 zm0Var) {
            super(0);
            this.$this_inject = zm0Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, r81] */
        @Override // defpackage.gu5
        public final r81 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(r81.class), a9cVar);
        }
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        g activity;
        super.onCreate(bundle);
        if (((r81) this.f0.getValue()).a || (activity = getActivity()) == null) {
            return;
        }
        boa.M(activity, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        JSTBroadcast jSTBroadcast = (JSTBroadcast) cr8.p(JSTBroadcast.class);
        String strR = fwc.a.b(getClass()).r();
        if (strR == null) {
            strR = ViewUtilsKt.UNKNOWN_DESTINATION_URL;
        }
        jSTBroadcast.dispatch(new JSTBroadcastEvent.ViewWillDisappear(strR, (String) this.g0.getValue()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        JSTBroadcast jSTBroadcast = (JSTBroadcast) cr8.p(JSTBroadcast.class);
        String strR = fwc.a.b(getClass()).r();
        if (strR == null) {
            strR = ViewUtilsKt.UNKNOWN_DESTINATION_URL;
        }
        jSTBroadcast.dispatch(new JSTBroadcastEvent.ViewWillAppear(strR, (String) this.g0.getValue()));
    }
}
