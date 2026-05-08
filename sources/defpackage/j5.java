package defpackage;

import androidx.media3.common.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.vuf;

/* JADX INFO: loaded from: classes.dex */
public final class j5 implements jp4 {
    public final f4b a;
    public final g4b b;
    public final String c;
    public final int d;
    public final String e;
    public String f;
    public zpf g;
    public int h;
    public int i;
    public boolean j;
    public long k;
    public a l;
    public int m;
    public long n;

    public j5(String str, int i, String str2) {
        f4b f4bVar = new f4b(new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT], IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        this.a = f4bVar;
        this.b = new g4b((byte[]) f4bVar.d);
        this.h = 0;
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02bf  */
    @Override // defpackage.jp4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.g4b r23) {
        /*
            Method dump skipped, instruction units count: 967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5.a(g4b):void");
    }

    @Override // defpackage.jp4
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.jp4
    public final void d(boolean z) {
    }

    @Override // defpackage.jp4
    public final void e(o55 o55Var, vuf.c cVar) {
        cVar.a();
        cVar.b();
        this.f = cVar.e;
        cVar.b();
        this.g = o55Var.o(cVar.d, 1);
    }

    @Override // defpackage.jp4
    public final void f(int i, long j) {
        this.n = j;
    }

    public j5(String str) {
        this(null, 0, str);
    }
}
