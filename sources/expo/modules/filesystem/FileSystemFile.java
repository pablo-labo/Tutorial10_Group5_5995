package expo.modules.filesystem;

import android.net.Uri;
import android.util.Base64;
import defpackage.a32;
import defpackage.e8b;
import defpackage.nn2;
import defpackage.th6;
import defpackage.wg2;
import defpackage.yid;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/filesystem/FileSystemFile;", "Lexpo/modules/filesystem/FileSystemPath;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemFile extends FileSystemPath {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemFile(Uri uri) {
        super(uri);
        uri.getClass();
    }

    public final void B0(CreateOptions createOptions) throws InvalidTypeFileException, UnableToCreateException {
        File parentFile;
        o0();
        m0(e8b.b);
        if (!createOptions.getOverwrite() && d0().exists()) {
            throw new UnableToCreateException("it already exists");
        }
        if (yid.g(this.c)) {
            throw new UnableToCreateException("create function does not work with SAF Uris, use `createDirectory` and `createFile` instead");
        }
        if (createOptions.getOverwrite() && L0()) {
            f0().delete();
        }
        if (createOptions.getIntermediates() && (parentFile = f0().getParentFile()) != null) {
            parentFile.mkdirs();
        }
        if (!f0().createNewFile()) {
            throw new UnableToCreateException("file already exists or could not be created");
        }
    }

    public final boolean L0() {
        if (Q(e8b.a)) {
            return d0().isFile();
        }
        return false;
    }

    public final String N0() throws NoSuchAlgorithmException, IOException {
        m0(e8b.a);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        InputStream inputStreamX = d0().x();
        try {
            byte[] bArrDigest = messageDigest.digest(wg2.U(inputStreamX));
            bArrDigest.getClass();
            String strG = th6.g(bArrDigest);
            inputStreamX.close();
            return strG;
        } finally {
        }
    }

    public final String P0() throws InvalidTypeFileException, IOException {
        o0();
        m0(e8b.a);
        InputStream inputStreamX = d0().x();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamX, a32.b), 8192);
            try {
                String strY = nn2.y(bufferedReader);
                bufferedReader.close();
                inputStreamX.close();
                return strY;
            } finally {
            }
        } finally {
        }
    }

    @Override // expo.modules.filesystem.FileSystemPath
    public final void o0() throws InvalidTypeFileException {
        m0(e8b.a);
        if (d0().exists() && d0().isDirectory()) {
            throw new InvalidTypeFileException();
        }
    }

    public final String r0() throws InvalidTypeFileException, IOException {
        o0();
        m0(e8b.a);
        InputStream inputStreamX = d0().x();
        try {
            String strEncodeToString = Base64.encodeToString(wg2.U(inputStreamX), 2);
            strEncodeToString.getClass();
            inputStreamX.close();
            return strEncodeToString;
        } finally {
        }
    }

    public final byte[] s0() throws InvalidTypeFileException, IOException {
        o0();
        m0(e8b.a);
        InputStream inputStreamX = d0().x();
        try {
            byte[] bArrU = wg2.U(inputStreamX);
            inputStreamX.close();
            return bArrU;
        } finally {
        }
    }
}
