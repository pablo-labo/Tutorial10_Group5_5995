package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import android.os.Build;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.f;
import defpackage.g7;
import defpackage.ka2;
import defpackage.sdb;
import defpackage.vjg;
import defpackage.ws5;
import defpackage.zkd;
import defpackage.zr1;
import io.jsonwebtoken.JwsHeader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f {
    public static final g7 d = new g7(12);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str, int i) {
            return mediaDrm.requiresSecureDecoder(str, i);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, sdb sdbVar) {
            LogSessionId logSessionIdA = sdbVar.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            playbackComponent.setLogSessionId(logSessionIdA);
        }
    }

    public g(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = zr1.b;
        ka2.k("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(zr1.c)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (zr1.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final Map<String, String> a(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final f.b b() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new f.b(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final byte[] c() {
        return this.b.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void d(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void e(final DefaultDrmSessionManager.a aVar) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: xs5
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                DefaultDrmSessionManager.b bVar = DefaultDrmSessionManager.this.x;
                bVar.getClass();
                bVar.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void f(byte[] bArr) throws DeniedByServerException {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final int g() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void h(byte[] bArr, sdb sdbVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                a.b(this.b, bArr, sdbVar);
            } catch (UnsupportedOperationException unused) {
                zkd.T("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final ws5 i(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i < 27 && Objects.equals(uuid, zr1.c)) {
            uuid = zr1.b;
        }
        return new ws5(uuid, bArr);
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void j(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final byte[] k(byte[] bArr, byte[] bArr2) {
        if (zr1.c.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(vjg.q(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString(JwsHeader.KEY_ID).replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                zkd.x("ClearKeyUtil", "Failed to adjust response data: ".concat(vjg.q(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f9  */
    @Override // androidx.media3.exoplayer.drm.f
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.exoplayer.drm.f.a l(byte[] r17, java.util.List<androidx.media3.common.DrmInitData.SchemeData> r18, int r19, java.util.HashMap<java.lang.String, java.lang.String> r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.g.l(byte[], java.util.List, int, java.util.HashMap):androidx.media3.exoplayer.drm.f$a");
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final boolean m(String str, byte[] bArr) throws Throwable {
        boolean zEquals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i >= 31) {
            boolean zEquals2 = uuid.equals(zr1.d);
            MediaDrm mediaDrm = this.b;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(zr1.c);
            }
            if (zEquals) {
                return a.a(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto((i >= 27 || !Objects.equals(uuid, zr1.c)) ? uuid : zr1.b, bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z = !uuid.equals(zr1.c);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }
}
