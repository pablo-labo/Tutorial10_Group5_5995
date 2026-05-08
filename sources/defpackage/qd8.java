package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class qd8 extends pa5 {
    @Override // defpackage.pa5
    public final fie a(w5b w5bVar) {
        w5bVar.getClass();
        File file = w5bVar.toFile();
        Logger logger = ppa.a;
        return new dxa(new FileOutputStream(file, true), new kmf());
    }

    @Override // defpackage.pa5
    public void b(w5b w5bVar, w5b w5bVar2) throws IOException {
        w5bVar.getClass();
        w5bVar2.getClass();
        if (w5bVar.toFile().renameTo(w5bVar2.toFile())) {
            return;
        }
        ja.o("failed to move ", w5bVar, w5bVar2);
    }

    @Override // defpackage.pa5
    public final void d(w5b w5bVar) throws IOException {
        if (w5bVar.toFile().mkdir()) {
            return;
        }
        da5 da5VarJ = j(w5bVar);
        if (da5VarJ == null || !da5VarJ.b) {
            z3.p(w5bVar, "failed to create directory: ");
        }
    }

    @Override // defpackage.pa5
    public final void e(w5b w5bVar) throws IOException {
        w5bVar.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = w5bVar.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        z3.p(w5bVar, "failed to delete ");
    }

    @Override // defpackage.pa5
    public final List<w5b> h(w5b w5bVar) throws IOException {
        w5bVar.getClass();
        File file = w5bVar.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                z3.p(w5bVar, "failed to list ");
                return null;
            }
            n6.b(w5bVar, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(w5bVar.h(str));
        }
        w92.D0(arrayList);
        return arrayList;
    }

    @Override // defpackage.pa5
    public da5 j(w5b w5bVar) {
        w5bVar.getClass();
        File file = w5bVar.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new da5(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // defpackage.pa5
    public final p95 k(w5b w5bVar) {
        w5bVar.getClass();
        return new yc8(new RandomAccessFile(w5bVar.toFile(), "r"));
    }

    @Override // defpackage.pa5
    public final fie l(w5b w5bVar, boolean z) throws IOException {
        w5bVar.getClass();
        if (!z || !g(w5bVar)) {
            return c0h.Q(w5bVar.toFile());
        }
        throw new IOException(w5bVar + " already exists.");
    }

    @Override // defpackage.pa5
    public final pne m(w5b w5bVar) {
        w5bVar.getClass();
        return c0h.R(w5bVar.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
