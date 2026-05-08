package okhttp3.internal.io;

import defpackage.c0h;
import defpackage.dxa;
import defpackage.hf7;
import defpackage.ja;
import defpackage.kmf;
import defpackage.l6;
import defpackage.ppa;
import defpackage.r40;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/io/FileSystem;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FileSystem {
    public static final FileSystem a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", "", "()V", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "SystemFileSystem", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ int a = 0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public final void a(File file) throws IOException {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    r40.h(l6.g(file, "not a readable directory: "));
                    return;
                }
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        a(file2);
                    }
                    if (!file2.delete()) {
                        r40.h(l6.g(file2, "failed to delete "));
                        return;
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public final boolean b(File file) {
                file.getClass();
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public final dxa c(File file) {
                file.getClass();
                try {
                    Logger logger = ppa.a;
                    return new dxa(new FileOutputStream(file, true), new kmf());
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    Logger logger2 = ppa.a;
                    return new dxa(new FileOutputStream(file, true), new kmf());
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public final long d(File file) {
                file.getClass();
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public final hf7 e(File file) {
                file.getClass();
                return c0h.R(file);
            }

            @Override // okhttp3.internal.io.FileSystem
            public final dxa f(File file) {
                file.getClass();
                try {
                    return c0h.Q(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return c0h.Q(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public final void g(File file, File file2) throws IOException {
                file.getClass();
                file2.getClass();
                h(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                ja.o("failed to rename ", file, file2);
            }

            @Override // okhttp3.internal.io.FileSystem
            public final void h(File file) throws IOException {
                file.getClass();
                if (file.delete() || !file.exists()) {
                    return;
                }
                r40.h(l6.g(file, "failed to delete "));
            }

            public final String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i = Companion.a;
        a = new Companion.SystemFileSystem();
    }

    void a(File file);

    boolean b(File file);

    dxa c(File file);

    long d(File file);

    hf7 e(File file);

    dxa f(File file);

    void g(File file, File file2);

    void h(File file);
}
