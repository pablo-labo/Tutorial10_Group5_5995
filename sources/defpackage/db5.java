package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class db5 {
    public static final /* synthetic */ int a = 0;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1024L);
        bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf)))));
        bigIntegerValueOf.multiply(BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L)));
    }

    public static void a(File file, String str) throws FileNotFoundException {
        if (file.isFile()) {
            return;
        }
        if (file.exists()) {
            h5.m("Parameter '", str, "' is not a file: ", file);
        } else {
            if (Files.isSymbolicLink(file.toPath())) {
                return;
            }
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(java.io.File r7, java.io.File r8) throws java.io.IOException {
        /*
            r0 = 2
            java.nio.file.CopyOption[] r0 = new java.nio.file.CopyOption[r0]
            java.nio.file.StandardCopyOption r1 = java.nio.file.StandardCopyOption.REPLACE_EXISTING
            r2 = 0
            r0[r2] = r1
            java.nio.file.LinkOption r1 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "srcDir"
            g(r7, r1)
            java.lang.String r1 = r7.getCanonicalPath()
            java.lang.String r3 = r8.getCanonicalPath()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L58
            java.lang.String r1 = r7.getCanonicalPath()
            java.lang.String r3 = r8.getCanonicalPath()
            boolean r1 = r3.startsWith(r1)
            if (r1 == 0) goto L53
            java.io.File[] r1 = e(r7)
            int r3 = r1.length
            if (r3 <= 0) goto L53
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.length
            r3.<init>(r4)
            int r4 = r1.length
        L3c:
            if (r2 >= r4) goto L54
            r5 = r1[r2]
            java.io.File r6 = new java.io.File
            java.lang.String r5 = r5.getName()
            r6.<init>(r8, r5)
            java.lang.String r5 = r6.getCanonicalPath()
            r3.add(r5)
            int r2 = r2 + 1
            goto L3c
        L53:
            r3 = 0
        L54:
            d(r7, r8, r3, r0)
            return
        L58:
            java.lang.String r0 = "File canonical paths are equal: '%s' (file1='%s', file2='%s')"
            java.lang.Object[] r7 = new java.lang.Object[]{r1, r7, r8}
            defpackage.t40.q(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db5.b(java.io.File, java.io.File):void");
    }

    public static void c(File file, File file2, CopyOption... copyOptionArr) throws IOException {
        a(file, "srcFile");
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.equals(file2.getCanonicalPath())) {
            t40.q("File canonical paths are equal: '%s' (file1='%s', file2='%s')", new Object[]{canonicalPath, file, file2});
            return;
        }
        f(file2.getParentFile());
        if (file2.exists()) {
            a(file2, "destFile");
        }
        Path path = file.toPath();
        Files.copy(path, file2.toPath(), copyOptionArr);
        if (Files.isSymbolicLink(path) || h(file, file2)) {
            return;
        }
        r40.h("Cannot set the file time.");
    }

    public static void d(File file, File file2, List list, CopyOption... copyOptionArr) throws IOException {
        File[] fileArrE = e(file);
        if (file2.exists() && !file2.isDirectory()) {
            w40.m("Parameter 'destDir' is not a directory: '", file2, "'");
            return;
        }
        f(file2);
        for (File file3 : fileArrE) {
            File file4 = new File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    d(file3, file4, list, copyOptionArr);
                } else {
                    c(file3, file4, copyOptionArr);
                }
            }
        }
        h(file, file2);
    }

    public static File[] e(File file) throws IOException {
        g(file, "directory");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            return fileArrListFiles;
        }
        r40.h(l6.g(file, "Unknown I/O error listing contents of directory: "));
        return null;
    }

    public static void f(File file) throws IOException {
        if (file == null || file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("Cannot create directory '" + file + "'.");
    }

    public static void g(File file, String str) throws FileNotFoundException {
        if (file.isDirectory()) {
            return;
        }
        if (file.exists()) {
            q6.l("Parameter '", str, "' is not a directory: '", file, "'");
            return;
        }
        throw new FileNotFoundException("Directory '" + file + "' does not exist.");
    }

    public static boolean h(File file, File file2) {
        try {
            BasicFileAttributes attributes = Files.readAttributes(file.toPath(), (Class<BasicFileAttributes>) BasicFileAttributes.class, new LinkOption[0]);
            ((BasicFileAttributeView) Files.getFileAttributeView(file2.toPath(), BasicFileAttributeView.class, new LinkOption[0])).setTimes(attributes.lastModifiedTime(), attributes.lastAccessTime(), attributes.creationTime());
            return true;
        } catch (IOException unused) {
            return file2.setLastModified(file.lastModified());
        }
    }
}
