package androidx.media3.session;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.media3.session.p;
import androidx.media3.session.q;
import com.indeed.android.jobsearch.R;
import defpackage.g7;
import defpackage.ka2;
import defpackage.pla;
import defpackage.uj9;
import defpackage.yv5;
import defpackage.zkd;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p.b {
    public final Context a;
    public final NotificationManager b;
    public b c;
    public final int d;

    public static final class a {
        public final Context a;
        public final g7 b = new g7(12);
        public boolean c;

        public a(Context context) {
            this.a = context;
        }
    }

    public static class b implements yv5<Bitmap> {
        public final pla a;
        public final uj9 b;
        public boolean c;

        public b(pla plaVar, uj9 uj9Var) {
            this.a = plaVar;
            this.b = uj9Var;
        }

        @Override // defpackage.yv5
        public final void onSuccess(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (this.c) {
                return;
            }
            pla plaVar = this.a;
            plaVar.d(bitmap2);
            final p pVar = new p(plaVar.a());
            uj9 uj9Var = this.b;
            final q qVar = (q) uj9Var.b;
            final int i = uj9Var.a;
            final r rVar = (r) uj9Var.c;
            qVar.e.execute(new Runnable() { // from class: wj9
                @Override // java.lang.Runnable
                public final void run() {
                    q qVar2 = qVar;
                    if (i == qVar2.X) {
                        qVar2.d(rVar, pVar, qVar2.b(false));
                    }
                }
            });
        }

        @Override // defpackage.yv5
        public final void t(Throwable th) {
            if (this.c) {
                return;
            }
            zkd.T("NotificationProvider", "Failed to load bitmap: " + th.getMessage());
        }
    }

    public e(a aVar) {
        Context context = aVar.a;
        this.a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        ka2.r(notificationManager);
        this.b = notificationManager;
        this.d = R.drawable.media3_notification_small_icon;
    }
}
