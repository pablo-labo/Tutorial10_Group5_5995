package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class cv7 extends File implements e6g {
    private final Uri uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv7(Uri uri) {
        super(URI.create(uri.toString()));
        uri.getClass();
        this.uri = uri;
    }

    @Override // defpackage.e6g
    public final Uri a() {
        return this.uri;
    }

    @Override // defpackage.e6g
    public final Uri c(gk0 gk0Var) {
        Uri uriD = FileProvider.d(gk0Var.e().getApplication(), gk0Var.e().getApplication().getPackageName() + ".FileSystemFileProvider", this);
        uriD.getClass();
        return uriD;
    }

    @Override // defpackage.e6g
    public final e6g e(String str, String str2) throws IOException {
        File file = new File(getParentFile(), str2);
        file.createNewFile();
        return new cv7(Uri.fromFile(file));
    }

    @Override // defpackage.e6g
    public final r6e<cv7> f() {
        return new xrf(new xa5(this, eb5.a, null), new tr(8));
    }

    @Override // defpackage.e6g
    public final Long getCreationTime() throws IOException {
        String path = getPath();
        path.getClass();
        Path path2 = Paths.get(path, new String[0]);
        path2.getClass();
        BasicFileAttributes attributes = Files.readAttributes(path2, (Class<BasicFileAttributes>) BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
        attributes.getClass();
        int i = wd4.d;
        return Long.valueOf(wd4.f(pg8.U(attributes.creationTime().toMillis(), be4.MILLISECONDS)));
    }

    @Override // defpackage.e6g
    public final String getFileName() {
        return getName();
    }

    @Override // defpackage.e6g
    public final String getType() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(getPath());
        if (fileExtensionFromUrl == null) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    @Override // defpackage.e6g
    public final e6g h(String str) {
        File file = new File(getParentFile(), str);
        file.mkdir();
        return new cv7(Uri.fromFile(file));
    }

    @Override // defpackage.e6g
    public final List<e6g> m() {
        File[] fileArrListFiles = listFiles();
        if (fileArrListFiles == null) {
            return zr4.a;
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            file.getClass();
            arrayList.add(new cv7(Uri.fromFile(file)));
        }
        return arrayList;
    }

    @Override // defpackage.e6g
    public final boolean n() {
        File[] fileArrListFiles;
        if (isDirectory() && (fileArrListFiles = listFiles()) != null) {
            for (File file : fileArrListFiles) {
                file.getClass();
                hb5.P(file);
            }
        }
        return delete();
    }

    @Override // defpackage.e6g
    public final /* bridge */ /* synthetic */ Long o() {
        return Long.valueOf(lastModified());
    }

    @Override // defpackage.e6g
    public final OutputStream w() {
        return new FileOutputStream(this);
    }

    @Override // defpackage.e6g
    public final InputStream x() {
        return new FileInputStream(this);
    }
}
