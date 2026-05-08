package defpackage;

import android.net.Uri;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class wwg implements xh8 {
    public static final Lazy a = boa.E(qt8.a, new a(new wwg()));

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wwg wwgVar) {
            super(0);
            this.$this_inject = wwgVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static void a(nxg nxgVar, String str, int i, String str2) {
        str2.getClass();
        r97.a.getClass();
        boolean zJ = r97.j(str);
        if (!zJ) {
            if (zJ) {
                l.g();
                return;
            }
            str = wea.i(false, Uri.parse(str));
        }
        ((gz4) a.getValue()).a("webview_receive_error", new zy3(nxgVar, str, i, str2));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
