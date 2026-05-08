package defpackage;

import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.upstream.c;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ac5 implements yi6 {
    public final yi6 a;
    public final List<StreamKey> b;

    public ac5(ao3 ao3Var, List list) {
        this.a = ao3Var;
        this.b = list;
    }

    @Override // defpackage.yi6
    public final c.a<xi6> a() {
        return new bc5(this.a.a(), this.b);
    }

    @Override // defpackage.yi6
    public final c.a<xi6> b(androidx.media3.exoplayer.hls.playlist.c cVar, b bVar) {
        return new bc5(this.a.b(cVar, bVar), this.b);
    }
}
