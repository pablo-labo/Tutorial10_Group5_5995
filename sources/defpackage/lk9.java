package defpackage;

import android.text.TextUtils;
import androidx.media3.session.LegacyConversions;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.r;
import androidx.media3.session.t;
import androidx.media3.session.u;
import defpackage.aw5;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lk9 implements t.g {
    public final /* synthetic */ t a;
    public final /* synthetic */ MediaDescriptionCompat b;
    public final /* synthetic */ int c;

    public /* synthetic */ lk9(t tVar, MediaDescriptionCompat mediaDescriptionCompat, int i) {
        this.a = tVar;
        this.b = mediaDescriptionCompat;
        this.c = i;
    }

    @Override // androidx.media3.session.t.g
    public final void d(r.d dVar) {
        MediaDescriptionCompat mediaDescriptionCompat = this.b;
        if (TextUtils.isEmpty(mediaDescriptionCompat.a)) {
            zkd.T("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        ij9 ij9VarJ = LegacyConversions.j(mediaDescriptionCompat);
        t tVar = this.a;
        hz8<List<ij9>> hz8VarM = tVar.g.m(dVar, e47.n(ij9VarJ));
        hz8VarM.a(new aw5.a(hz8VarM, new u(tVar, dVar, this.c)), h54.a);
    }
}
