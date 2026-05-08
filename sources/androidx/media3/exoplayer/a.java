package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import defpackage.n2f;
import defpackage.qx0;
import defpackage.rx0;
import defpackage.sf6;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Context a;
    public final C0040a b;
    public final sf6 c;
    public boolean d;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.a$a, reason: collision with other inner class name */
    public final class C0040a extends BroadcastReceiver {
        public final b a;
        public final sf6 b;

        public C0040a(sf6 sf6Var, b bVar) {
            this.b = sf6Var;
            this.a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.i(new rx0(this, 0));
            }
        }
    }

    public interface b {
    }

    public a(Context context, Looper looper, Looper looper2, b bVar, n2f n2fVar) {
        this.a = context.getApplicationContext();
        this.c = n2fVar.c(looper, null);
        this.b = new C0040a(n2fVar.c(looper2, null), bVar);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void a() {
        if (this.d) {
            this.c.i(new qx0(this, 0));
            this.d = false;
        }
    }
}
