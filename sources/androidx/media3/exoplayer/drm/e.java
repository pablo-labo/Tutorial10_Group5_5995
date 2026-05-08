package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import defpackage.ws5;
import defpackage.zr1;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class e implements DrmSession {
    public final DrmSession.DrmSessionException a;

    public e(DrmSession.DrmSessionException drmSessionException) {
        this.a = drmSessionException;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID a() {
        return zr1.a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException c() {
        return this.a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final ws5 d() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void e(a.C0043a c0043a) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void f(a.C0043a c0043a) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean g(String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        return 1;
    }
}
