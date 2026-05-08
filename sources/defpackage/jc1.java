package defpackage;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import defpackage.s87;
import defpackage.xh8;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljc1;", "Landroid/appwidget/AppWidgetProvider;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class jc1 extends AppWidgetProvider implements xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));
    public final tx5 b = new tx5();

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jc1 jc1Var) {
            super(0);
            this.$this_inject = jc1Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String getC();

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        context.getClass();
        Lazy<s87> lazy = s87.f;
        gz4 gz4Var = (gz4) this.a.getValue();
        String strA = getC();
        az5 az5Var = az5.b;
        tx5 tx5Var = this.b;
        tx5Var.getClass();
        strA.getClass();
        az5Var.getClass();
        s87.a.a(gz4Var, new lx5("widget_uninstall", "other", "widgetUninstalls", 1, tx5Var.a, new bz5(strA, az5Var)));
        super.onDisabled(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        context.getClass();
        Lazy<s87> lazy = s87.f;
        gz4 gz4Var = (gz4) this.a.getValue();
        String strA = getC();
        yy5 yy5Var = yy5.b;
        tx5 tx5Var = this.b;
        tx5Var.getClass();
        strA.getClass();
        yy5Var.getClass();
        s87.a.a(gz4Var, new lx5("widget_install", "other", "widgetInstalls", 1, tx5Var.a, new zy5(strA, yy5Var)));
        super.onEnabled(context);
    }
}
