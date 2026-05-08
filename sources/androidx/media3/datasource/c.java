package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.a;
import androidx.media3.datasource.d;
import defpackage.gf3;
import defpackage.grf;
import defpackage.ka2;
import defpackage.l6;
import defpackage.ue3;
import defpackage.vjg;
import defpackage.zkd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c implements androidx.media3.datasource.a {
    public final Context a;
    public final ArrayList b;
    public final androidx.media3.datasource.a c;
    public FileDataSource d;
    public AssetDataSource e;
    public ContentDataSource f;
    public androidx.media3.datasource.a g;
    public UdpDataSource h;
    public ue3 i;
    public RawResourceDataSource j;
    public androidx.media3.datasource.a k;

    public static final class a implements a.InterfaceC0038a {
        public final Context a;
        public final d.a b;

        public a(Context context) {
            d.a aVar = new d.a();
            this.a = context.getApplicationContext();
            this.b = aVar;
        }

        @Override // androidx.media3.datasource.a.InterfaceC0038a
        public final androidx.media3.datasource.a a() {
            return new c(this.a, this.b.a());
        }
    }

    public c(Context context, androidx.media3.datasource.a aVar) {
        this.a = context.getApplicationContext();
        aVar.getClass();
        this.c = aVar;
        this.b = new ArrayList();
    }

    public static void p(androidx.media3.datasource.a aVar, grf grfVar) {
        if (aVar != null) {
            aVar.i(grfVar);
        }
    }

    @Override // androidx.media3.datasource.a
    public final Uri a() {
        androidx.media3.datasource.a aVar = this.k;
        if (aVar == null) {
            return null;
        }
        return aVar.a();
    }

    @Override // androidx.media3.datasource.a
    public final long b(gf3 gf3Var) {
        ka2.q(this.k == null);
        Uri uri = gf3Var.a;
        String scheme = uri.getScheme();
        String str = vjg.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    FileDataSource fileDataSource = new FileDataSource(false);
                    this.d = fileDataSource;
                    o(fileDataSource);
                }
                this.k = this.d;
            } else {
                if (this.e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(context);
                    this.e = assetDataSource;
                    o(assetDataSource);
                }
                this.k = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(context);
                this.e = assetDataSource2;
                o(assetDataSource2);
            }
            this.k = this.e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(context);
                this.f = contentDataSource;
                o(contentDataSource);
            }
            this.k = this.f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            androidx.media3.datasource.a aVar = this.c;
            if (zEquals) {
                if (this.g == null) {
                    try {
                        androidx.media3.datasource.a aVar2 = (androidx.media3.datasource.a) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = aVar2;
                        o(aVar2);
                    } catch (ClassNotFoundException unused) {
                        zkd.T("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        l6.p("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    if (this.g == null) {
                        this.g = aVar;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.h = udpDataSource;
                    o(udpDataSource);
                }
                this.k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    ue3 ue3Var = new ue3(false);
                    this.i = ue3Var;
                    o(ue3Var);
                }
                this.k = this.i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                    this.j = rawResourceDataSource;
                    o(rawResourceDataSource);
                }
                this.k = this.j;
            } else {
                this.k = aVar;
            }
        }
        return this.k.b(gf3Var);
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        androidx.media3.datasource.a aVar = this.k;
        if (aVar != null) {
            try {
                aVar.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> e() {
        androidx.media3.datasource.a aVar = this.k;
        return aVar == null ? Collections.EMPTY_MAP : aVar.e();
    }

    @Override // androidx.media3.datasource.a
    public final void i(grf grfVar) {
        grfVar.getClass();
        this.c.i(grfVar);
        this.b.add(grfVar);
        p(this.d, grfVar);
        p(this.e, grfVar);
        p(this.f, grfVar);
        p(this.g, grfVar);
        p(this.h, grfVar);
        p(this.i, grfVar);
        p(this.j, grfVar);
    }

    public final void o(androidx.media3.datasource.a aVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            aVar.i((grf) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.te3
    public final int read(byte[] bArr, int i, int i2) {
        androidx.media3.datasource.a aVar = this.k;
        aVar.getClass();
        return aVar.read(bArr, i, i2);
    }
}
