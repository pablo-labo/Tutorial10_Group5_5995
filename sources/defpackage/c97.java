package defpackage;

import android.content.Context;
import android.os.SystemClock;
import androidx.media3.session.g;
import androidx.media3.session.k;
import androidx.media3.session.o;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import defpackage.e47;
import defpackage.ij9;
import defpackage.oj9;
import defpackage.wr3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c97 implements OnCompleteListener, k.c, x.e, wr3.a {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c97(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        String str = (String) this.a;
        kj9 kj9Var = (kj9) this.b;
        o oVar = (o) sVar;
        oVar.getClass();
        if (!Objects.equals(str, "androidx.media3.session.recent.root")) {
            oVar.v(dVar);
            throw null;
        }
        if (oVar.h.m == null) {
            return aw5.K1(wu8.b(-6));
        }
        if (oVar.t.b() == 1) {
            new ebe();
            if (!oVar.y) {
                throw null;
            }
            oVar.e().getClass();
            throw null;
        }
        ij9.b.a aVar = new ij9.b.a();
        ryc rycVar = ryc.V;
        e47.b bVar = e47.b;
        qyc qycVar = qyc.e;
        List list = Collections.EMPTY_LIST;
        qyc qycVar2 = qyc.e;
        ij9.e.a aVar2 = new ij9.e.a();
        ij9.g gVar = ij9.g.d;
        oj9.a aVar3 = new oj9.a();
        aVar3.q = Boolean.FALSE;
        aVar3.r = Boolean.TRUE;
        qyc qycVarN = e47.n(new ij9("androidx.media3.session.recent.item", new ij9.c(aVar), null, new ij9.e(aVar2), new oj9(aVar3), gVar));
        String str2 = wu8.g;
        e47.b bVarListIterator = qycVarN.listIterator(0);
        while (bVarListIterator.hasNext()) {
            wu8.c((ij9) bVarListIterator.next());
        }
        return aw5.K1(new wu8(0, SystemClock.elapsedRealtime(), kj9Var, null, e47.j(qycVarN), 3));
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        gVar.O0(((k) this.a).c, i, ((ij9) this.b).b(true), true);
    }

    @Override // wr3.a
    public void j(j6c j6cVar) {
        wr3.a aVar = (wr3.a) this.a;
        wr3.a aVar2 = (wr3.a) this.b;
        aVar.j(j6cVar);
        aVar2.j(j6cVar);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        f97 f97Var = (f97) this.a;
        Context context = (Context) this.b;
        task.getClass();
        if (task.isSuccessful()) {
            jg7 jg7Var = (jg7) task.getResult();
            String strA = jg7Var != null ? jg7Var.a() : null;
            if (strA != null) {
                f97Var.b(context, strA, true);
                return;
            }
            return;
        }
        ArrayList arrayList = lz2.a;
        lz2.h("IndeedFcmManager", "getInstanceId failed " + task.getException(), null, 12);
    }

    public /* synthetic */ c97(String str, int i, int i2, kj9 kj9Var) {
        this.a = str;
        this.b = kj9Var;
    }
}
