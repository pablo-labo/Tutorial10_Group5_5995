package androidx.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.source.n;
import androidx.media3.exoplayer.source.o;
import defpackage.g05;
import defpackage.g4b;
import defpackage.h05;
import defpackage.js9;
import defpackage.od3;
import defpackage.os9;
import defpackage.qk3;
import defpackage.ql0;
import defpackage.te3;
import defpackage.vjg;
import defpackage.zpf;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Handler.Callback {
    public boolean V;
    public boolean W;
    public boolean X;
    public final qk3 a;
    public final b b;
    public od3 f;
    public final TreeMap<Long, Long> e = new TreeMap<>();
    public final Handler d = vjg.p(this);
    public final h05 c = new h05();

    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public interface b {
    }

    public final class c implements zpf {
        public final o a;
        public final ql0 b = new ql0();
        public final os9 c = new os9(1);
        public long d = -9223372036854775807L;

        public c(qk3 qk3Var) {
            this.a = new o(qk3Var, null, null);
        }

        @Override // defpackage.zpf
        public final void a(long j, int i, int i2, int i3, zpf.a aVar) {
            long jH;
            long jR;
            this.a.a(j, i, i2, i3, aVar);
            while (this.a.w(false)) {
                os9 os9Var = this.c;
                os9Var.n();
                if (this.a.B(this.b, os9Var, 0, false) == -4) {
                    os9Var.r();
                } else {
                    os9Var = null;
                }
                if (os9Var != null) {
                    long j2 = os9Var.f;
                    js9 js9VarV = d.this.c.V(os9Var);
                    if (js9VarV != null) {
                        g05 g05Var = (g05) js9VarV.a[0];
                        String str = g05Var.a;
                        String str2 = g05Var.b;
                        if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                            try {
                                jR = vjg.R(vjg.q(g05Var.e));
                            } catch (ParserException unused) {
                                jR = -9223372036854775807L;
                            }
                            if (jR != -9223372036854775807L) {
                                a aVar2 = new a(j2, jR);
                                Handler handler = d.this.d;
                                handler.sendMessage(handler.obtainMessage(1, aVar2));
                            }
                        }
                    }
                }
            }
            o oVar = this.a;
            n nVar = oVar.a;
            synchronized (oVar) {
                int i4 = oVar.s;
                jH = i4 == 0 ? -1L : oVar.h(i4);
            }
            nVar.b(jH);
        }

        @Override // defpackage.zpf
        public final void b(g4b g4bVar, int i, int i2) {
            this.a.b(g4bVar, i, 0);
        }

        @Override // defpackage.zpf
        public final void d(androidx.media3.common.a aVar) {
            this.a.d(aVar);
        }

        @Override // defpackage.zpf
        public final int e(te3 te3Var, int i, boolean z) {
            return this.a.e(te3Var, i, z);
        }
    }

    public d(od3 od3Var, b bVar, qk3 qk3Var) {
        this.f = od3Var;
        this.b = bVar;
        this.a = qk3Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.X) {
            if (message.what != 1) {
                return false;
            }
            a aVar = (a) message.obj;
            long j = aVar.a;
            long j2 = aVar.b;
            Long lValueOf = Long.valueOf(j2);
            TreeMap<Long, Long> treeMap = this.e;
            Long l = treeMap.get(lValueOf);
            if (l == null) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                return true;
            }
            if (l.longValue() > j) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
            }
        }
        return true;
    }
}
