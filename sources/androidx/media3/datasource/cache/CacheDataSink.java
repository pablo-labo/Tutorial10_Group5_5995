package androidx.media3.datasource.cache;

import androidx.media3.datasource.cache.Cache;
import defpackage.gf3;
import defpackage.lad;
import defpackage.ve3;
import defpackage.vjg;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class CacheDataSink implements ve3 {
    public final Cache a;
    public final long b;
    public final int c;
    public gf3 d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public lad j;

    public static final class CacheDataSinkException extends Cache.CacheException {
    }

    public CacheDataSink(c cVar) {
        cVar.getClass();
        this.a = cVar;
        this.b = 5242880L;
        this.c = 20480;
    }

    public final void a() {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            vjg.g(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            this.a.d(file, this.h);
        } catch (Throwable th) {
            vjg.g(this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    @Override // defpackage.ve3
    public final void b(gf3 gf3Var) throws CacheDataSinkException {
        int i = gf3Var.i;
        gf3Var.h.getClass();
        if (gf3Var.g == -1 && (i & 2) == 2) {
            this.d = null;
            return;
        }
        this.d = gf3Var;
        this.e = (i & 4) == 4 ? this.b : Long.MAX_VALUE;
        this.i = 0L;
        try {
            c(gf3Var);
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    public final void c(gf3 gf3Var) {
        long j = gf3Var.g;
        long jMin = j != -1 ? Math.min(j - this.i, this.e) : -1L;
        String str = gf3Var.h;
        String str2 = vjg.a;
        this.f = this.a.g(gf3Var.f + this.i, str, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        int i = this.c;
        if (i > 0) {
            lad ladVar = this.j;
            if (ladVar == null) {
                this.j = new lad(fileOutputStream, i);
            } else {
                ladVar.a(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }

    @Override // defpackage.ve3
    public final void close() throws CacheDataSinkException {
        if (this.d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // defpackage.ve3
    public final void write(byte[] bArr, int i, int i2) throws CacheDataSinkException {
        gf3 gf3Var = this.d;
        if (gf3Var == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.h == this.e) {
                    a();
                    c(gf3Var);
                }
                int iMin = (int) Math.min(i2 - i3, this.e - this.h);
                OutputStream outputStream = this.g;
                String str = vjg.a;
                outputStream.write(bArr, i + i3, iMin);
                i3 += iMin;
                long j = iMin;
                this.h += j;
                this.i += j;
            } catch (IOException e) {
                throw new CacheDataSinkException(e);
            }
        }
    }
}
