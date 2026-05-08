package defpackage;

import androidx.credentials.playservices.HiddenActivity;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.g;
import androidx.media3.session.k;
import androidx.media3.session.l;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.t;
import androidx.media3.session.x;
import androidx.media3.session.z;
import com.google.android.gms.tasks.OnFailureListener;
import defpackage.e75;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.vw8;
import java.util.Collections;
import org.apache.avro.AvroTypeException;
import org.apache.avro.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l35 implements lz8.a, e75.b, OnFailureListener, vw8.a, k.c, t.g, x.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l35(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // vw8.a
    public ww8 c(qi7 qi7Var) {
        h8f h8fVar = ((vw8) this.b).c;
        return h8fVar.b.a(thg.c(h8fVar.a, "openchat/v1", "terms/agreement"), h8f.a(qi7Var), Collections.EMPTY_MAP, h8f.d);
    }

    @Override // androidx.media3.session.t.g
    public void d(r.d dVar) {
        ((t) this.b).g.h(dVar, true);
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        return sVar.m(dVar, e47.n((ij9) this.b));
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        gVar.I(((k) this.b).c, i);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((gdb.c) obj).q0(((adb) obj2).f);
                break;
            case 5:
                ((gdb.c) obj).q0((PlaybackException) obj2);
                break;
            default:
                z zVar = ((l.c) obj2).a;
                ((gdb.c) obj).j0(zVar.j, zVar.k);
                break;
        }
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        throw new AvroTypeException(((f.a) this.b).toString());
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        HiddenActivity.handleBeginSignIn$lambda$10$lambda$9((HiddenActivity) this.b, exc);
    }
}
