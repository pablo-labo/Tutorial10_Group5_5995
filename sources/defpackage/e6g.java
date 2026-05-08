package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface e6g {
    Uri a();

    Uri c(gk0 gk0Var);

    boolean delete();

    e6g e(String str, String str2);

    boolean exists();

    r6e<e6g> f();

    Long getCreationTime();

    String getFileName();

    String getType();

    e6g h(String str);

    boolean isDirectory();

    boolean isFile();

    long length();

    List<e6g> m();

    boolean n();

    Long o();

    OutputStream w();

    InputStream x();
}
