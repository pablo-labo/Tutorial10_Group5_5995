package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.datasource.a;
import defpackage.a91;
import defpackage.gf3;
import defpackage.u40;
import defpackage.vjg;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class FileDataSource extends a91 {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public static class FileDataSourceException extends DataSourceException {
    }

    public static final class a implements a.InterfaceC0038a {
        @Override // androidx.media3.datasource.a.InterfaceC0038a
        public final androidx.media3.datasource.a a() {
            return new FileDataSource(false);
        }
    }

    @Override // androidx.media3.datasource.a
    public final Uri a() {
        return this.f;
    }

    @Override // androidx.media3.datasource.a
    public final long b(gf3 gf3Var) throws FileDataSourceException {
        Uri uri = gf3Var.a;
        long j = gf3Var.f;
        this.f = uri;
        q(gf3Var);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = gf3Var.g;
                if (length == -1) {
                    length = this.e.length() - j;
                }
                this.g = length;
                if (length < 0) {
                    throw new FileDataSourceException(null, null, 2008);
                }
                this.h = true;
                r(gf3Var);
                return this.g;
            } catch (IOException e) {
                throw new FileDataSourceException(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbF = u40.f("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbF.append(fragment);
            throw new FileDataSourceException(sbF.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new FileDataSourceException(2006, e3);
        } catch (RuntimeException e4) {
            throw new FileDataSourceException(2000, e4);
        }
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(2000, e);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
                p();
            }
        }
    }

    @Override // defpackage.te3
    public final int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            String str = vjg.a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.g -= (long) i3;
                o(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new FileDataSourceException(2000, e);
        }
    }
}
