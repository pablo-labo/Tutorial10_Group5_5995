package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.facebook.soloader.SysUtil;
import defpackage.l5;
import defpackage.l6;
import defpackage.m6;
import defpackage.p39;
import defpackage.p54;
import defpackage.q6;
import defpackage.r40;
import defpackage.rv0;
import defpackage.x95;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends p54 implements rv0 {
    public final Context d;

    public class a implements Runnable {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ File b;
        public final /* synthetic */ x95 c;

        public a(boolean z, File file, x95 x95Var) {
            this.a = z;
            this.b = file;
            this.c = x95Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            File file = g.this.a;
            p39.b("fb-UnpackingSoSource", "starting syncer worker");
            x95 x95Var = this.c;
            boolean z = this.a;
            if (z) {
                try {
                    try {
                        SysUtil.c(file);
                    } catch (Throwable th) {
                        p39.b("fb-UnpackingSoSource", "releasing dso store lock for " + file + " (from syncer thread)");
                        x95Var.close();
                        throw th;
                    }
                } catch (IOException e) {
                    l5.r(e);
                    return;
                }
            }
            g.j(this.b, (byte) 1, z);
            p39.b("fb-UnpackingSoSource", "releasing dso store lock for " + file + " (from syncer thread)");
            x95Var.close();
        }
    }

    public static class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public static final class c implements Closeable {
        public final b a;
        public final InputStream b;

        public c(b bVar, InputStream inputStream) {
            this.a = bVar;
            this.b = inputStream;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.b.close();
        }
    }

    public static abstract class d implements Closeable {
        public static void a(c cVar, byte[] bArr, File file) {
            RandomAccessFile randomAccessFile;
            int i;
            StringBuilder sb = new StringBuilder("extracting DSO ");
            b bVar = cVar.a;
            InputStream inputStream = cVar.b;
            sb.append(bVar.a);
            String string = sb.toString();
            if (Log.isLoggable("fb-UnpackingSoSource", 4)) {
                Log.i("fb-UnpackingSoSource", string);
            }
            File file2 = new File(file, bVar.a);
            try {
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                    try {
                        int iAvailable = inputStream.available();
                        if (iAvailable > 1) {
                            randomAccessFile = randomAccessFile2;
                            try {
                                SysUtil.LollipopSysdeps.fallocateIfSupported(randomAccessFile2.getFD(), iAvailable);
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    randomAccessFile.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } else {
                            randomAccessFile = randomAccessFile2;
                        }
                        int i2 = 0;
                        while (i2 < Integer.MAX_VALUE && (i = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i2))) != -1) {
                            randomAccessFile.write(bArr, 0, i);
                            i2 += i;
                        }
                        randomAccessFile.setLength(randomAccessFile.getFilePointer());
                        if (!file2.setExecutable(true, false)) {
                            throw new IOException("cannot make file executable: " + file2);
                        }
                        randomAccessFile.close();
                        if (!file2.exists() || file2.setWritable(false)) {
                            return;
                        }
                        Log.e("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                    } catch (Throwable th4) {
                        th = th4;
                        randomAccessFile = randomAccessFile2;
                    }
                } catch (IOException e) {
                    Log.e("fb-UnpackingSoSource", "error extracting dso  " + file2 + " due to: " + e);
                    SysUtil.b(file2);
                    throw e;
                }
            } catch (Throwable th5) {
                if (file2.exists() && !file2.setWritable(false)) {
                    Log.e("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                }
                throw th5;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public abstract b[] h();

        public abstract void p(File file);
    }

    public g(Context context, String str, boolean z) {
        super(new File(m6.h(new StringBuilder(), context.getApplicationInfo().dataDir, "/", str)), z ? 1 : 0);
        this.d = context;
    }

    public static void j(File file, byte b2, boolean z) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b2);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException e) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", e);
        }
    }

    @Override // defpackage.rv0
    public final void a() {
        File file = this.a;
        try {
            SysUtil.d(file, new File(file, "dso_lock")).close();
        } catch (Exception e) {
            Log.e("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + getClass().getName() + " (" + file + "): ", e);
        }
    }

    @Override // defpackage.ene
    public void e(int i) {
        File file = this.a;
        if (!file.mkdirs() && !file.isDirectory()) {
            r40.h(l6.g(file, "cannot mkdir: "));
            return;
        }
        if (!file.canWrite() && !file.setWritable(true)) {
            q6.k("error adding ", file.getCanonicalPath(), " write permission");
            return;
        }
        x95 x95Var = null;
        try {
            try {
                x95 x95VarD = SysUtil.d(file, new File(file, "dso_lock"));
                try {
                    p39.b("fb-UnpackingSoSource", "locked dso store " + file);
                    if (!file.canWrite() && !file.setWritable(true)) {
                        throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
                    }
                    if (!i(x95VarD, i)) {
                        String str = "dso store is up-to-date: " + file;
                        if (Log.isLoggable("fb-UnpackingSoSource", 4)) {
                            Log.i("fb-UnpackingSoSource", str);
                        }
                        x95Var = x95VarD;
                    }
                    if (x95Var != null) {
                        p39.b("fb-UnpackingSoSource", "releasing dso store lock for " + file);
                        x95Var.close();
                    } else {
                        p39.b("fb-UnpackingSoSource", "not releasing dso store lock for " + file + " (syncer thread started)");
                    }
                    if (!file.canWrite() || file.setWritable(false)) {
                        return;
                    }
                    q6.k("error removing ", file.getCanonicalPath(), " write permission");
                } catch (Throwable th) {
                    th = th;
                    x95Var = x95VarD;
                    if (x95Var != null) {
                        p39.b("fb-UnpackingSoSource", "releasing dso store lock for " + file);
                        x95Var.close();
                    } else {
                        p39.b("fb-UnpackingSoSource", "not releasing dso store lock for " + file + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (!file.canWrite() || file.setWritable(false)) {
                throw th3;
            }
            q6.k("error removing ", file.getCanonicalPath(), " write permission");
        }
    }

    public byte[] f() {
        Parcel parcelObtain = Parcel.obtain();
        d dVarH = h();
        try {
            b[] bVarArrH = dVarH.h();
            parcelObtain.writeInt(bVarArrH.length);
            for (b bVar : bVarArrH) {
                parcelObtain.writeString(bVar.a);
                parcelObtain.writeString(bVar.b);
            }
            dVarH.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            try {
                dVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public b[] g() {
        d dVarH = h();
        try {
            b[] bVarArrH = dVarH.h();
            dVarH.close();
            return bVarArrH;
        } catch (Throwable th) {
            try {
                dVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract d h();

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(defpackage.x95 r17, int r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.g.i(x95, int):boolean");
    }
}
