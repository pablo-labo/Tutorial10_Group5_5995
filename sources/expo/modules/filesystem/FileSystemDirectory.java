package expo.modules.filesystem;

import android.net.Uri;
import defpackage.cc5;
import defpackage.e6g;
import defpackage.e8b;
import defpackage.wa;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/filesystem/FileSystemDirectory;", "Lexpo/modules/filesystem/FileSystemPath;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemDirectory extends FileSystemPath {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemDirectory(Uri uri) {
        super(uri);
        uri.getClass();
    }

    @Override // expo.modules.filesystem.FileSystemPath
    public final void o0() throws InvalidTypeFolderException {
        if (d0().exists() && !d0().isDirectory()) {
            throw new InvalidTypeFolderException();
        }
    }

    public final long r0() throws InvalidTypeFolderException {
        m0(e8b.a);
        o0();
        long length = 0;
        for (e6g e6gVar : new cc5(d0().f(), true, new wa(7))) {
            e6gVar.getClass();
            length += e6gVar.length();
        }
        return length;
    }
}
