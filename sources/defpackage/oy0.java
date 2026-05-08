package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.media3.common.a;
import androidx.media3.exoplayer.d;
import androidx.media3.session.j;
import androidx.media3.session.legacy.h;
import androidx.media3.session.q;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.t;
import defpackage.aw5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oy0(q qVar, j jVar, String str, Bundle bundle) {
        this.a = 1;
        this.b = jVar;
        this.c = str;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        v8e v8eVar = null;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                d.a aVar = ((ry0) obj3).b;
                String str = vjg.a;
                d.this.s.y((a) obj2, (dk3) obj);
                break;
            case 1:
                j jVar = (j) obj3;
                String str2 = (String) obj2;
                Bundle bundle = (Bundle) obj;
                jVar.V0();
                j.b bVar = jVar.c;
                r6g<v8e> it = (!bVar.o0() ? w8e.b : bVar.M0()).a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        v8e next = it.next();
                        if (next.a == 0 && next.b.equals(str2)) {
                            v8eVar = next;
                        }
                    }
                }
                if (v8eVar != null) {
                    jVar.V0();
                    if ((!bVar.o0() ? w8e.b : bVar.M0()).a.contains(v8eVar)) {
                        v8e v8eVar2 = new v8e(str2, bundle);
                        Bundle bundle2 = Bundle.EMPTY;
                        jVar.V0();
                        hz8 hz8VarP0 = bVar.o0() ? bVar.P0(v8eVar2) : aw5.K1(new x9e(-100));
                        hz8VarP0.a(new aw5.a(hz8VarP0, new ke0(str2)), h54.a);
                    }
                }
                break;
            default:
                s.b bVar2 = (s.b) obj3;
                r.d dVar = (r.d) obj2;
                KeyEvent keyEvent = (KeyEvent) obj;
                s sVar = s.this;
                if (sVar.j(dVar)) {
                    sVar.b(keyEvent, false, false);
                } else {
                    t tVar = sVar.h;
                    h.b bVar3 = dVar.a;
                    bVar3.getClass();
                    tVar.getClass();
                    tVar.G(1, new i73(tVar, 8), bVar3, true);
                }
                bVar2.a = null;
                break;
        }
    }

    public /* synthetic */ oy0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
