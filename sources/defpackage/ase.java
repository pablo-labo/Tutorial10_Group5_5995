package defpackage;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class ase {
    public static ase h;
    public volatile File b;
    public volatile File d;
    public long e;
    public volatile StatFs a = null;
    public volatile StatFs c = null;
    public volatile boolean g = false;
    public final ReentrantLock f = new ReentrantLock();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("INTERNAL", 0);
            a = aVar;
            a aVar2 = new a("EXTERNAL", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public static StatFs b(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return new StatFs(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                bf9.f(th);
                throw null;
            }
        }
        return null;
    }

    public final void a() {
        if (this.g) {
            return;
        }
        this.f.lock();
        try {
            if (!this.g) {
                this.b = Environment.getDataDirectory();
                this.d = Environment.getExternalStorageDirectory();
                this.a = b(this.a, this.b);
                this.c = b(this.c, this.d);
                this.e = SystemClock.uptimeMillis();
                this.g = true;
            }
        } finally {
            this.f.unlock();
        }
    }
}
