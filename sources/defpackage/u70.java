package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes.dex */
public final class u70 implements wc6 {
    public static boolean f = true;
    public final AndroidComposeView a;
    public final Object b = new Object();
    public qqg c;
    public boolean d;
    public final s70 e;

    public static final class a {
        public static final long a(AndroidComposeView androidComposeView) {
            return androidComposeView.getUniqueDrawingId();
        }
    }

    public u70(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
        s70 s70Var = new s70();
        this.e = s70Var;
        if (androidComposeView.isAttachedToWindow()) {
            Context context = androidComposeView.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(s70Var);
                this.d = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new t70(this));
    }

    @Override // defpackage.wc6
    public final void a(xc6 xc6Var) {
        synchronized (this.b) {
            if (!xc6Var.s) {
                xc6Var.s = true;
                xc6Var.b();
            }
            j6g j6gVar = j6g.a;
        }
    }

    @Override // defpackage.wc6
    public final xc6 b() {
        zc6 gd6Var;
        zc6 fd6Var;
        xc6 xc6Var;
        synchronized (this.b) {
            try {
                AndroidComposeView androidComposeView = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    a.a(androidComposeView);
                }
                if (i >= 29) {
                    fd6Var = new fd6();
                } else {
                    if (f) {
                        try {
                            gd6Var = new ed6(this.a, new cx1(), new ax1());
                        } catch (Throwable unused) {
                            f = false;
                            gd6Var = new gd6(c(this.a));
                        }
                    } else {
                        gd6Var = new gd6(c(this.a));
                    }
                    fd6Var = gd6Var;
                }
                xc6Var = new xc6(fd6Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return xc6Var;
    }

    public final cb4 c(AndroidComposeView androidComposeView) {
        qqg qqgVar = this.c;
        if (qqgVar != null) {
            return qqgVar;
        }
        qqg qqgVar2 = new qqg(androidComposeView.getContext());
        qqgVar2.setClipChildren(false);
        qqgVar2.setClipToPadding(false);
        qqgVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        androidComposeView.addView(qqgVar2, -1);
        this.c = qqgVar2;
        return qqgVar2;
    }
}
