package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.r;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.IndeedWebView;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import defpackage.ft4;
import defpackage.pgd;
import defpackage.xh8;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ly91;", "Ls2d;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class y91 extends s2d implements xh8 {
    public final z8<Intent> V;
    public final z8<Intent> W;
    public final z8<Intent> X;
    public mq6 d;
    public final Lazy c = boa.E(qt8.a, new a(this));
    public final g4a e = r.f(Boolean.FALSE);
    public final bp6 f = new bp6();

    public static final class a extends mj8 implements gu5<zw8> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y91 y91Var) {
            super(0);
            this.$this_inject = y91Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zw8] */
        @Override // defpackage.gu5
        public final zw8 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(zw8.class), a9cVar);
        }
    }

    public y91() {
        z8<Intent> z8VarRegisterForActivityResult = registerForActivityResult(new w8(), new r91(this));
        z8VarRegisterForActivityResult.getClass();
        this.V = z8VarRegisterForActivityResult;
        int i = 0;
        z8<Intent> z8VarRegisterForActivityResult2 = registerForActivityResult(new w8(), new t91(this, i));
        z8VarRegisterForActivityResult2.getClass();
        this.W = z8VarRegisterForActivityResult2;
        z8<Intent> z8VarRegisterForActivityResult3 = registerForActivityResult(new w8(), new u91(this, i));
        z8VarRegisterForActivityResult3.getClass();
        this.X = z8VarRegisterForActivityResult3;
    }

    public final mq6 G() {
        mq6 mq6Var = this.d;
        if (mq6Var != null) {
            return mq6Var;
        }
        wl7.g("webViewController");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(final boolean z) {
        g activity = getActivity();
        activity.getClass();
        WeakReference weakReference = new WeakReference((LaunchActivity) activity);
        final WeakReference weakReference2 = new WeakReference(this);
        LaunchActivity launchActivity = (LaunchActivity) weakReference.get();
        if (launchActivity != null) {
            xa6.b((xa6) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(xa6.class), null), new qa(launchActivity, 2), z, new ir(weakReference2, 1), new gu5() { // from class: x91
                @Override // defpackage.gu5
                public final Object invoke() {
                    y91 y91Var = (y91) weakReference2.get();
                    if (y91Var != null) {
                        y91Var.J(z);
                    }
                    return j6g.a;
                }
            }, 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(pgd.x xVar) {
        xVar.getClass();
        zw8 zw8Var = (zw8) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(zw8.class), null);
        LineAuthenticationParams.c cVar = new LineAuthenticationParams.c();
        cVar.b = xVar.e;
        cVar.a = xVar.c;
        cVar.c = xVar.f;
        cVar.d = xVar.g;
        LineAuthenticationParams lineAuthenticationParams = new LineAuthenticationParams(cVar);
        zw8Var.a = xVar.d;
        Context context = (Context) zw8Var.b.getValue();
        LineAuthenticationConfig lineAuthenticationConfig = new LineAuthenticationConfig(new LineAuthenticationConfig.b(xVar.b, context));
        if (!ft4.b) {
            ft4.b = true;
            Executors.newSingleThreadExecutor().execute(new ft4.a(context.getApplicationContext()));
        }
        int i = LineAuthenticationActivity.d;
        Intent intent = new Intent(context, (Class<?>) LineAuthenticationActivity.class);
        intent.putExtra("authentication_config", lineAuthenticationConfig);
        intent.putExtra("authentication_params", lineAuthenticationParams);
        this.X.a(intent);
        j6g j6gVar = j6g.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(boolean z) {
        ((ua6) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(ua6.class), null)).c(z, new hp0(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(String str) {
        mq6 mq6VarG = G();
        str.getClass();
        IndeedWebView indeedWebView = mq6VarG.V;
        if (indeedWebView == null) {
            return;
        }
        String str2 = String.format("token=%s&preExtRedirectUrl=%s", Arrays.copyOf(new Object[]{Uri.encode(str), Uri.encode(indeedWebView.getUrl())}, 2));
        mq6VarG.c0 = true;
        IndeedWebView indeedWebView2 = mq6VarG.V;
        if (indeedWebView2 != null) {
            String string = ((Context) (mq6VarG instanceof ai8 ? ((ai8) mq6VarG).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Context.class), null)).getString(R.string.indeed_passport_google_auth_endpoint);
            string.getClass();
            byte[] bytes = str2.getBytes(a32.b);
            bytes.getClass();
            indeedWebView2.postUrl(string, bytes);
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
