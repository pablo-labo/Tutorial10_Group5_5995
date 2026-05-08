package defpackage;

import com.indeed.android.reactnative.rntarebridge.RNTareBridge;
import kotlinx.serialization.KSerializer;
import okhttp3.OkHttpClient;
import okhttp3.sse.EventSource;

/* JADX INFO: loaded from: classes3.dex */
public final class sid {
    public final OkHttpClient a;
    public final String b;
    public final RNTareBridge.g c;
    public EventSource d;
    public EventSource e;
    public long f;
    public boolean g;
    public dad h;
    public int i;
    public final ra8 j;
    public final gse k;

    public sid(OkHttpClient okHttpClient, String str, RNTareBridge.g gVar) {
        okHttpClient.getClass();
        str.getClass();
        this.a = okHttpClient;
        this.b = str;
        this.c = gVar;
        this.h = new dad();
        this.j = sa8.a(new xr(12));
        this.k = hh2.e(sqc.a);
    }

    public final rw1 a(String str) {
        str.getClass();
        nj5 nj5Var = new nj5(wg2.W(new kv1(new kid(this, str, null), vr4.a, -2, eo1.a), new mid(this, null)), new oid(this, null));
        boolean z = nj5Var instanceof rw1;
        Object sw1Var = nj5Var;
        if (!z) {
            sw1Var = new sw1(nj5Var);
        }
        return (rw1) sw1Var;
    }

    public final <T> T b(String str, KSerializer<T> kSerializer, String str2) {
        try {
            return (T) this.j.c(kSerializer, str);
        } catch (Exception e) {
            lz2.b("SSEClient", t40.l("Failed ", str2, ": ", str), false, e);
            return null;
        }
    }
}
