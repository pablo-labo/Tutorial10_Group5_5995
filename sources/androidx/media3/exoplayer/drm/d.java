package androidx.media3.exoplayer.drm;

import android.media.MediaDrmException;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.f;
import defpackage.ws5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d implements f {
    @Override // androidx.media3.exoplayer.drm.f
    public final Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final f.b b() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final byte[] c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void d(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void e(DefaultDrmSessionManager.a aVar) {
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void f(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final int g() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final ws5 i(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void j(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final byte[] k(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final f.a l(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final boolean m(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void release() {
    }
}
