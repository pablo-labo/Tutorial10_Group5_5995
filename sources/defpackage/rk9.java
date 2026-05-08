package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.t;
import androidx.media3.session.x;
import defpackage.emf;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rk9 implements t.g, x.e {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rk9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.media3.session.t.g
    public void d(r.d dVar) {
        t tVar = (t) this.a;
        String str = ((MediaDescriptionCompat) this.b).a;
        if (TextUtils.isEmpty(str)) {
            zkd.T("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
            return;
        }
        vdb vdbVar = tVar.g.t;
        if (!vdbVar.O0(17)) {
            zkd.T("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
            return;
        }
        emf emfVarM = vdbVar.M();
        emf.d dVar2 = new emf.d();
        for (int i = 0; i < emfVarM.o(); i++) {
            if (TextUtils.equals(emfVarM.m(i, dVar2, 0L).b.a, str)) {
                vdbVar.w(i);
                return;
            }
        }
    }

    @Override // androidx.media3.session.x.e
    public Object g(final s sVar, final r.d dVar, int i) {
        x.e eVar = (x.e) this.a;
        final x.d dVar2 = (x.d) this.b;
        return sVar.k() ? aw5.K1(new x9e(-100)) : vjg.b0((hz8) eVar.g(sVar, dVar, i), new wu0() { // from class: yl9
            @Override // defpackage.wu0
            public final hz8 apply(Object obj) {
                s sVar2 = sVar;
                Handler handler = sVar2.l;
                ph1 ph1Var = new ph1(sVar2, dVar, new wf3(1, sVar2, dVar2, (r.e) obj));
                x9e x9eVar = new x9e(0);
                String str = vjg.a;
                ebe ebeVar = new ebe();
                vjg.T(handler, new odc(1, ebeVar, ph1Var, x9eVar));
                return ebeVar;
            }
        });
    }
}
