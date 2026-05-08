package expo.modules.filesystem;

import android.net.Uri;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.cv7;
import defpackage.du0;
import defpackage.e6g;
import defpackage.e8b;
import defpackage.eb5;
import defpackage.gb5;
import defpackage.gk0;
import defpackage.hb5;
import defpackage.j6g;
import defpackage.l5;
import defpackage.lqa;
import defpackage.p6;
import defpackage.shd;
import defpackage.wl7;
import defpackage.xa5;
import defpackage.yid;
import defpackage.z3;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.NoSuchFileException;
import kotlin.io.TerminateException;
import kotlin.jvm.functions.Function2;
import xa5.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/filesystem/FileSystemPath;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class FileSystemPath extends SharedObject {
    public Uri c;
    public e6g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemPath(Uri uri) {
        super(null);
        uri.getClass();
        this.c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Q(defpackage.e8b r4) {
        /*
            r3 = this;
            android.net.Uri r0 = r3.c
            boolean r0 = defpackage.yid.g(r0)
            if (r0 == 0) goto L9
            goto L1a
        L9:
            android.net.Uri r0 = r3.c
            r0.getClass()
            java.lang.String r0 = r0.getScheme()
            java.lang.String r1 = "asset"
            boolean r0 = defpackage.wl7.b(r0, r1)
            if (r0 == 0) goto L1c
        L1a:
            r3 = 1
            return r3
        L1c:
            gk0 r0 = r3.N()
            if (r0 == 0) goto L4a
            r1 = 0
            ey9 r0 = r0.a     // Catch: java.lang.Exception -> L2e
            java.lang.Class<ha5> r2 = defpackage.ha5.class
            java.util.HashMap r0 = r0.a     // Catch: java.lang.Exception -> L2e
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Exception -> L2e
            goto L2f
        L2e:
            r0 = r1
        L2f:
            ha5 r0 = (defpackage.ha5) r0
            if (r0 == 0) goto L4a
            gk0 r2 = r3.N()
            if (r2 == 0) goto L3d
            com.facebook.react.bridge.ReactApplicationContext r1 = r2.d()
        L3d:
            java.io.File r3 = r3.f0()
            java.lang.String r3 = r3.getPath()
            java.util.EnumSet r3 = r0.a(r1, r3)
            goto L50
        L4a:
            java.lang.Class<e8b> r3 = defpackage.e8b.class
            java.util.EnumSet r3 = java.util.EnumSet.noneOf(r3)
        L50:
            boolean r3 = r3.contains(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.filesystem.FileSystemPath.Q(e8b):boolean");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.io.a] */
    public final void W(FileSystemPath fileSystemPath) throws Exception {
        fileSystemPath.getClass();
        o0();
        fileSystemPath.o0();
        m0(e8b.a);
        fileSystemPath.m0(e8b.b);
        File fileF0 = f0();
        File fileH0 = h0(fileSystemPath);
        boolean zExists = fileF0.exists();
        final gb5 gb5Var = gb5.a;
        if (!zExists) {
            gb5Var.invoke(fileF0, new NoSuchFileException(fileF0, null, "The source file doesn't exist."));
            throw null;
        }
        try {
            xa5.b bVar = new xa5(fileF0, eb5.a, new Function2() { // from class: kotlin.io.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws TerminateException {
                    File file = (File) obj;
                    IOException iOException = (IOException) obj2;
                    file.getClass();
                    iOException.getClass();
                    if (gb5Var.invoke(file, iOException) != lqa.a) {
                        return j6g.a;
                    }
                    throw new TerminateException(file, null, null);
                }
            }).new b();
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (!next.exists()) {
                    gb5Var.invoke(next, new NoSuchFileException(next, null, "The source file doesn't exist."));
                    throw null;
                }
                File file = new File(fileH0, hb5.V(next, fileF0));
                if (file.exists() && (!next.isDirectory() || !file.isDirectory())) {
                    gb5Var.invoke(file, new FileAlreadyExistsException(next, file, "The destination file already exists."));
                    throw null;
                }
                if (next.isDirectory()) {
                    file.mkdirs();
                } else {
                    hb5.O(next, file);
                    if (file.length() != next.length()) {
                        gb5Var.invoke(next, new IOException("Source file wasn't copied completely, length of destination file differs."));
                        throw null;
                    }
                }
            }
        } catch (TerminateException unused) {
        }
    }

    public final void b0() throws UnableToDeleteException {
        if (!d0().exists()) {
            throw new UnableToDeleteException(z3.l("uri '", "' does not exist", d0().a()));
        }
        if (d0().isDirectory()) {
            if (!d0().n()) {
                throw new UnableToDeleteException(z3.l("failed to delete '", "'", d0().a()));
            }
        } else if (!d0().delete()) {
            throw new UnableToDeleteException(z3.l("failed to delete '", "'", d0().a()));
        }
    }

    public final e6g d0() throws Exception {
        e6g cv7Var;
        ReactApplicationContext reactApplicationContextD;
        ReactApplicationContext reactApplicationContextD2;
        e6g e6gVar = this.d;
        if (wl7.b(e6gVar != null ? e6gVar.a() : null, this.c)) {
            return e6gVar;
        }
        if (yid.g(this.c)) {
            gk0 gk0VarN = N();
            if (gk0VarN == null || (reactApplicationContextD2 = gk0VarN.d()) == null) {
                throw new Exception("No context");
            }
            cv7Var = new shd(reactApplicationContextD2, this.c);
        } else {
            Uri uri = this.c;
            uri.getClass();
            if (wl7.b(uri.getScheme(), "asset")) {
                gk0 gk0VarN2 = N();
                if (gk0VarN2 == null || (reactApplicationContextD = gk0VarN2.d()) == null) {
                    throw new Exception("No context");
                }
                cv7Var = new du0(reactApplicationContextD, this.c);
            } else {
                cv7Var = new cv7(this.c);
            }
        }
        this.d = cv7Var;
        return cv7Var;
    }

    public final File f0() throws Exception {
        if (yid.g(this.c)) {
            throw new Exception(p6.d(this.c, "This method cannot be used with content URIs: "));
        }
        Object objD0 = d0();
        objD0.getClass();
        return (File) objD0;
    }

    public final File h0(FileSystemPath fileSystemPath) throws CopyOrMoveDirectoryToFileException, DestinationDoesNotExistException {
        fileSystemPath.getClass();
        if (!(fileSystemPath instanceof FileSystemDirectory)) {
            if (!(this instanceof FileSystemFile)) {
                throw new CopyOrMoveDirectoryToFileException();
            }
            File parentFile = fileSystemPath.f0().getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                throw new DestinationDoesNotExistException();
            }
            return fileSystemPath.f0();
        }
        boolean z = this instanceof FileSystemFile;
        e8b e8bVar = e8b.a;
        if (z) {
            FileSystemDirectory fileSystemDirectory = (FileSystemDirectory) fileSystemPath;
            if (fileSystemDirectory.Q(e8bVar) ? fileSystemDirectory.d0().isDirectory() : false) {
                return new File(fileSystemPath.f0(), f0().getName());
            }
            throw new DestinationDoesNotExistException();
        }
        FileSystemDirectory fileSystemDirectory2 = (FileSystemDirectory) fileSystemPath;
        if (fileSystemDirectory2.Q(e8bVar) ? fileSystemDirectory2.d0().isDirectory() : false) {
            return new File(fileSystemPath.f0(), f0().getName());
        }
        File parentFile2 = fileSystemPath.f0().getParentFile();
        if (parentFile2 == null || !parentFile2.exists()) {
            throw new DestinationDoesNotExistException();
        }
        return fileSystemPath.f0();
    }

    public final void j0(FileSystemPath fileSystemPath) throws CopyOrMoveDirectoryToFileException, DestinationDoesNotExistException {
        fileSystemPath.getClass();
        o0();
        fileSystemPath.o0();
        e8b e8bVar = e8b.b;
        m0(e8bVar);
        fileSystemPath.m0(e8bVar);
        File fileH0 = h0(fileSystemPath);
        Path path = f0().toPath();
        path.getClass();
        Path path2 = fileH0.toPath();
        path2.getClass();
        Files.move(path, path2, (CopyOption[]) Arrays.copyOf(new CopyOption[0], 0)).getClass();
        this.c = Uri.fromFile(fileH0);
    }

    public final void k0(String str) {
        str.getClass();
        o0();
        m0(e8b.b);
        File file = new File(f0().getParent(), str);
        Path path = f0().toPath();
        path.getClass();
        Path path2 = file.toPath();
        path2.getClass();
        Files.move(path, path2, (CopyOption[]) Arrays.copyOf(new CopyOption[0], 0)).getClass();
        this.c = Uri.fromFile(file);
    }

    public final void m0(e8b e8bVar) {
        if (!Q(e8bVar)) {
            throw new InvalidPermissionException(l5.m("Missing '", e8bVar.name(), "' permission for accessing the file."), null);
        }
    }

    public abstract void o0();
}
