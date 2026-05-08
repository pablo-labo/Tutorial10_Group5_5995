package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import defpackage.a91;
import defpackage.gf3;
import defpackage.vjg;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ContentDataSource extends a91 {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public static class ContentDataSourceException extends DataSourceException {
    }

    public ContentDataSource(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // androidx.media3.datasource.a
    public final Uri a() {
        return this.f;
    }

    @Override // androidx.media3.datasource.a
    public final long b(gf3 gf3Var) throws ContentDataSourceException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = gf3Var.a;
                long j = gf3Var.g;
                long j2 = gf3Var.f;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f = uriNormalizeScheme;
                q(gf3Var);
                boolean zEquals = Objects.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new ContentDataSourceException(2000, new IOException("Could not open file descriptor for: " + uriNormalizeScheme));
                    } catch (IOException e) {
                        e = e;
                        throw new ContentDataSourceException(e instanceof FileNotFoundException ? 2005 : i, e);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.h = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new ContentDataSourceException(2008, null);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new ContentDataSourceException(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.i = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSourceException(2008, null);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.i = j3;
                    if (j3 < 0) {
                        throw new ContentDataSourceException(2008, null);
                    }
                }
                if (j != -1) {
                    long j4 = this.i;
                    this.i = j4 == -1 ? j : Math.min(j4, j);
                }
                this.j = true;
                r(gf3Var);
                return j != -1 ? j : this.i;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (ContentDataSourceException e3) {
            throw e3;
        }
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new ContentDataSourceException(2000, e);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        p();
                    }
                }
            } catch (Throwable th) {
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            p();
                        }
                        throw th;
                    } finally {
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            p();
                        }
                    }
                } catch (IOException e2) {
                    throw new ContentDataSourceException(2000, e2);
                }
            }
        } catch (IOException e3) {
            throw new ContentDataSourceException(2000, e3);
        }
    }

    @Override // defpackage.te3
    public final int read(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ContentDataSourceException(2000, e);
                }
            }
            FileInputStream fileInputStream = this.h;
            String str = vjg.a;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.i;
                if (j2 != -1) {
                    this.i = j2 - ((long) i3);
                }
                o(i3);
                return i3;
            }
        }
        return -1;
    }
}
