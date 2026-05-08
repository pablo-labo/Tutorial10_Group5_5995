package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import defpackage.a91;
import defpackage.gf3;
import defpackage.vjg;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AssetDataSource extends a91 {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public static final class AssetDataSourceException extends DataSourceException {
    }

    public AssetDataSource(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // androidx.media3.datasource.a
    public final Uri a() {
        return this.f;
    }

    @Override // androidx.media3.datasource.a
    public final long b(gf3 gf3Var) throws AssetDataSourceException {
        try {
            Uri uri = gf3Var.a;
            long j = gf3Var.f;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            q(gf3Var);
            InputStream inputStreamOpen = this.e.open(path, 1);
            this.g = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSourceException(2008, null);
            }
            long j2 = gf3Var.g;
            if (j2 != -1) {
                this.h = j2;
            } else {
                long jAvailable = this.g.available();
                this.h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            r(gf3Var);
            return this.h;
        } catch (AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSourceException(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AssetDataSourceException(2000, e);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                p();
            }
        }
    }

    @Override // defpackage.te3
    public final int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new AssetDataSourceException(2000, e);
                }
            }
            InputStream inputStream = this.g;
            String str = vjg.a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.h;
                if (j2 != -1) {
                    this.h = j2 - ((long) i3);
                }
                o(i3);
                return i3;
            }
        }
        return -1;
    }
}
