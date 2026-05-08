package defpackage;

import android.util.Log;
import java.util.ArrayList;
import okhttp3.OkHttpClient;
import okhttp3.sse.EventSource;

/* JADX INFO: loaded from: classes2.dex */
public final class tid {
    public final OkHttpClient a;
    public EventSource b;
    public EventSource c;
    public long d;
    public boolean e;
    public cad f;
    public int g;
    public final ra8 h;

    public tid(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.a = okHttpClient;
        this.f = new cad();
        this.h = sa8.a(new xi(14));
    }

    public final boolean a() {
        ArrayList arrayList = lz2.a;
        Log.d("SSEClient", "Heartbeat duration: " + (System.currentTimeMillis() - this.d), null);
        return this.d != 0 && System.currentTimeMillis() - this.d > 20000;
    }
}
