package defpackage;

import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.upstream.c;

/* JADX INFO: loaded from: classes.dex */
public final class ao3 implements yi6 {
    @Override // defpackage.yi6
    public final c.a<xi6> a() {
        return new HlsPlaylistParser(androidx.media3.exoplayer.hls.playlist.c.n, null);
    }

    @Override // defpackage.yi6
    public final c.a<xi6> b(androidx.media3.exoplayer.hls.playlist.c cVar, b bVar) {
        return new HlsPlaylistParser(cVar, bVar);
    }
}
