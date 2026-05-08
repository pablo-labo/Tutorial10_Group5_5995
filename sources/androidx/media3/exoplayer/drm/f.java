package androidx.media3.exoplayer.drm;

import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import defpackage.sdb;
import defpackage.ws5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    public static final class a {
        public final byte[] a;
        public final String b;

        public a(String str, byte[] bArr) {
            this.a = bArr;
            this.b = str;
        }
    }

    public static final class b {
        public final byte[] a;
        public final String b;

        public b(String str, byte[] bArr) {
            this.a = bArr;
            this.b = str;
        }
    }

    Map<String, String> a(byte[] bArr);

    b b();

    byte[] c();

    void d(byte[] bArr, byte[] bArr2);

    void e(DefaultDrmSessionManager.a aVar);

    void f(byte[] bArr);

    int g();

    default void h(byte[] bArr, sdb sdbVar) {
    }

    ws5 i(byte[] bArr);

    void j(byte[] bArr);

    byte[] k(byte[] bArr, byte[] bArr2);

    a l(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> map);

    boolean m(String str, byte[] bArr);

    void release();
}
