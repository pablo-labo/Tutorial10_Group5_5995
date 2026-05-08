package com.facebook.cache.disk;

import android.os.Environment;
import com.facebook.cache.disk.b;
import com.facebook.common.file.FileUtils;
import defpackage.fia;
import defpackage.g95;
import defpackage.hh2;
import defpackage.l6;
import defpackage.m6;
import defpackage.nn2;
import defpackage.oo1;
import defpackage.ot1;
import defpackage.p6;
import defpackage.po1;
import defpackage.q6;
import defpackage.u13;
import defpackage.vs4;
import defpackage.w40;
import defpackage.wa5;
import defpackage.web;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultDiskStorage implements com.facebook.cache.disk.b {
    public final File a;
    public final boolean b;
    public final File c;
    public final fia d;
    public final nn2 e;

    public static class IncompleteFileException extends IOException {
    }

    public class a implements wa5 {
        public final ArrayList a = new ArrayList();

        public a() {
        }

        @Override // defpackage.wa5
        public final void a(File file) {
        }

        @Override // defpackage.wa5
        public final void b(File file) {
            c cVarH = DefaultDiskStorage.h(DefaultDiskStorage.this, file);
            if (cVarH == null || cVarH.a != ".cnt") {
                return;
            }
            this.a.add(new b(file, cVarH.b));
        }

        @Override // defpackage.wa5
        public final void c(File file) {
        }
    }

    public static class b implements b.a {
        public final String a;
        public final g95 b;
        public long c;
        public long d;

        public b(File file, String str) {
            str.getClass();
            this.a = str;
            this.b = new g95(file);
            this.c = -1L;
            this.d = -1L;
        }

        @Override // com.facebook.cache.disk.b.a
        public final long a() {
            if (this.c < 0) {
                this.c = this.b.a.length();
            }
            return this.c;
        }

        @Override // com.facebook.cache.disk.b.a
        public final long b() {
            if (this.d < 0) {
                this.d = this.b.a.lastModified();
            }
            return this.d;
        }

        @Override // com.facebook.cache.disk.b.a
        public final String getId() {
            return this.a;
        }
    }

    public static class c {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("(");
            return l6.i(sb, this.b, ")");
        }
    }

    public class d implements b.InterfaceC0126b {
        public final String a;
        public final File b;

        public d(String str, File file) {
            this.a = str;
            this.b = file;
        }

        public final g95 a() throws FileUtils.RenameException {
            DefaultDiskStorage defaultDiskStorage = DefaultDiskStorage.this;
            defaultDiskStorage.e.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            File fileI = defaultDiskStorage.i(this.a);
            try {
                FileUtils.b(this.b, fileI);
                if (fileI.exists()) {
                    fileI.setLastModified(jCurrentTimeMillis);
                }
                return new g95(fileI);
            } catch (FileUtils.RenameException e) {
                e.getCause();
                defaultDiskStorage.d.getClass();
                throw e;
            }
        }

        public final void b(oo1 oo1Var) throws IOException {
            File file = this.b;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    u13 u13Var = new u13(fileOutputStream);
                    u13Var.a = 0L;
                    vs4 vs4Var = oo1Var.a;
                    po1 po1Var = oo1Var.b;
                    vs4Var.getClass();
                    InputStream inputStreamV = vs4Var.v();
                    if (inputStreamV == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    po1Var.c.a(inputStreamV, u13Var);
                    u13Var.flush();
                    long j = u13Var.a;
                    fileOutputStream.close();
                    if (file.length() == j) {
                        return;
                    }
                    long length = file.length();
                    StringBuilder sbI = w40.i(j, "File was not written completely. Expected: ", ", found: ");
                    sbI.append(length);
                    throw new IncompleteFileException(sbI.toString());
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                DefaultDiskStorage.this.d.getClass();
                throw e;
            }
        }
    }

    public class e implements wa5 {
        public boolean a;

        public e() {
        }

        @Override // defpackage.wa5
        public final void a(File file) {
            DefaultDiskStorage defaultDiskStorage = DefaultDiskStorage.this;
            if (!defaultDiskStorage.a.equals(file) && !this.a) {
                file.delete();
            }
            if (this.a && file.equals(defaultDiskStorage.c)) {
                this.a = false;
            }
        }

        @Override // defpackage.wa5
        public final void b(File file) {
            DefaultDiskStorage defaultDiskStorage;
            c cVarH;
            if (this.a && (cVarH = DefaultDiskStorage.h((defaultDiskStorage = DefaultDiskStorage.this), file)) != null) {
                String str = cVarH.a;
                if (str != ".tmp") {
                    web.i(str == ".cnt");
                    return;
                }
                long jLastModified = file.lastModified();
                defaultDiskStorage.e.getClass();
                if (jLastModified > System.currentTimeMillis() - 1800000) {
                    return;
                }
            }
            file.delete();
        }

        @Override // defpackage.wa5
        public final void c(File file) {
            if (this.a || !file.equals(DefaultDiskStorage.this.c)) {
                return;
            }
            this.a = true;
        }
    }

    public DefaultDiskStorage(File file, int i, fia fiaVar) {
        this.a = file;
        boolean zContains = false;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                try {
                    zContains = file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException unused) {
                    fiaVar.getClass();
                }
            }
        } catch (Exception unused2) {
            fiaVar.getClass();
        }
        this.b = zContains;
        File file2 = new File(this.a, p6.c(i, "v2.ols100."));
        this.c = file2;
        this.d = fiaVar;
        File file3 = this.a;
        if (!file3.exists()) {
            FileUtils.a(file2);
        } else if (!file2.exists()) {
            hh2.o(file3);
            try {
                FileUtils.a(file2);
            } catch (FileUtils.CreateDirectoryException unused3) {
                fia fiaVar2 = this.d;
                Objects.toString(file2);
                fiaVar2.getClass();
            }
        }
        this.e = nn2.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.cache.disk.DefaultDiskStorage.c h(com.facebook.cache.disk.DefaultDiskStorage r8, java.io.File r9) {
        /*
            java.lang.String r0 = r9.getName()
            r1 = 46
            int r2 = r0.lastIndexOf(r1)
            r3 = 0
            if (r2 > 0) goto Lf
        Ld:
            r1 = r3
            goto L45
        Lf:
            java.lang.String r4 = r0.substring(r2)
            java.lang.String r5 = ".cnt"
            boolean r6 = r5.equals(r4)
            java.lang.String r7 = ".tmp"
            if (r6 == 0) goto L1e
            goto L27
        L1e:
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L26
            r5 = r7
            goto L27
        L26:
            r5 = r3
        L27:
            if (r5 != 0) goto L2a
            goto Ld
        L2a:
            r4 = 0
            java.lang.String r0 = r0.substring(r4, r2)
            boolean r2 = r5.equals(r7)
            if (r2 == 0) goto L40
            int r1 = r0.lastIndexOf(r1)
            if (r1 > 0) goto L3c
            goto Ld
        L3c:
            java.lang.String r0 = r0.substring(r4, r1)
        L40:
            com.facebook.cache.disk.DefaultDiskStorage$c r1 = new com.facebook.cache.disk.DefaultDiskStorage$c
            r1.<init>(r5, r0)
        L45:
            if (r1 != 0) goto L48
            goto L5e
        L48:
            java.lang.String r0 = r1.b
            java.io.File r2 = new java.io.File
            java.lang.String r8 = r8.j(r0)
            r2.<init>(r8)
            java.io.File r8 = r9.getParentFile()
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L5e
            return r1
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cache.disk.DefaultDiskStorage.h(com.facebook.cache.disk.DefaultDiskStorage, java.io.File):com.facebook.cache.disk.DefaultDiskStorage$c");
    }

    @Override // com.facebook.cache.disk.b
    public final void a() {
        File[] fileArrListFiles = this.a.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                hh2.o(file);
            }
        }
    }

    @Override // com.facebook.cache.disk.b
    public final void b() {
        hh2.L(this.a, new e());
    }

    @Override // com.facebook.cache.disk.b
    public final boolean c(String str, ot1 ot1Var) {
        return i(str).exists();
    }

    @Override // com.facebook.cache.disk.b
    public final b.InterfaceC0126b d(Object obj, String str) throws IOException {
        File file = new File(j(str));
        boolean zExists = file.exists();
        fia fiaVar = this.d;
        if (!zExists) {
            try {
                FileUtils.a(file);
            } catch (FileUtils.CreateDirectoryException e2) {
                fiaVar.getClass();
                throw e2;
            }
        }
        try {
            return new d(str, File.createTempFile(str.concat("."), ".tmp", file));
        } catch (IOException e3) {
            fiaVar.getClass();
            throw e3;
        }
    }

    @Override // com.facebook.cache.disk.b
    public final long e(b.a aVar) {
        File file = ((b) aVar).b.a;
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    @Override // com.facebook.cache.disk.b
    public final g95 f(Object obj, String str) {
        File fileI = i(str);
        if (!fileI.exists()) {
            return null;
        }
        this.e.getClass();
        fileI.setLastModified(System.currentTimeMillis());
        return new g95(fileI);
    }

    @Override // com.facebook.cache.disk.b
    public final Collection g() {
        a aVar = new a();
        hh2.L(this.c, aVar);
        return Collections.unmodifiableList(aVar.a);
    }

    public final File i(String str) {
        return new File(m6.h(q6.g(j(str)), File.separator, str, ".cnt"));
    }

    @Override // com.facebook.cache.disk.b
    public final boolean isExternal() {
        return this.b;
    }

    public final String j(String str) {
        String strValueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        return l6.i(sb, File.separator, strValueOf);
    }

    @Override // com.facebook.cache.disk.b
    public final long remove(String str) {
        File fileI = i(str);
        if (!fileI.exists()) {
            return 0L;
        }
        long length = fileI.length();
        if (fileI.delete()) {
            return length;
        }
        return -1L;
    }
}
