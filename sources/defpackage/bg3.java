package defpackage;

import android.content.Context;
import com.datadog.android.Datadog;
import com.datadog.android.log.Logger;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class bg3 implements xh8 {
    public static volatile boolean c;
    public static volatile boolean d;
    public static final Lazy a = boa.E(qt8.a, new a(new bg3()));
    public static final d2f b = new d2f(new ag3(0));
    public static final d2f e = new d2f(new j7(2));

    public static final class a extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bg3 bg3Var) {
            super(0);
            this.$this_inject = bg3Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, java.lang.Object] */
        @Override // defpackage.gu5
        public final Context invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Context.class), a9cVar);
        }
    }

    public static Logger a() {
        if (c) {
            return new Logger.Builder(Datadog.getInstance("dd-jsma")).setNetworkInfoEnabled(true).setLogcatLogsEnabled(true).setBundleWithTraceEnabled(true).setBundleWithRumEnabled(true).setService("jsma-android-rn").setName("jsma-android-rn").build();
        }
        return null;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
