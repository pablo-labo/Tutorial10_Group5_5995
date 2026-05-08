package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import defpackage.akb;
import defpackage.l5;
import defpackage.l6;
import defpackage.p6;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    public static final String[] d = {"_display_name", "_size"};
    public static final File e = new File("/");
    public static final HashMap<String, a> f = new HashMap<>();
    public final Object a = new Object();
    public String b;
    public a c;

    public interface a {
        Uri a(File file);

        File b(Uri uri);
    }

    public static class b implements a {
        public final String a;
        public final HashMap<String, File> b = new HashMap<>();

        public b(String str) {
            this.a = str;
        }

        @Override // androidx.core.content.FileProvider.a
        public final Uri a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    String strA = FileProvider.a(canonicalPath);
                    String strA2 = FileProvider.a(path);
                    if (strA.equals(strA2) || strA.startsWith(strA2.concat("/"))) {
                        if (entry == null || path.length() > entry.getValue().getPath().length()) {
                            entry = entry2;
                        }
                    }
                }
                if (entry == null) {
                    l5.q(l5.l("Failed to find configured root that contains ", canonicalPath));
                    return null;
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                l5.q(l6.g(file, "Failed to resolve canonical path for "));
                return null;
            }
        }

        @Override // androidx.core.content.FileProvider.a
        public final File b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.b.get(strDecode);
            if (file == null) {
                l5.q(p6.d(uri, "Unable to find configured root for "));
                return null;
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                String path = canonicalFile.getPath();
                String path2 = file.getPath();
                String strA = FileProvider.a(path);
                String strA2 = FileProvider.a(path2);
                if (strA.equals(strA2) || strA.startsWith(strA2.concat("/"))) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                l5.q(l6.g(file2, "Failed to resolve canonical path for "));
                return null;
            }
        }
    }

    public static String a(String str) {
        return (str.length() <= 0 || str.charAt(str.length() - 1) != '/') ? str : akb.j(1, 0, str);
    }

    public static a c(Context context, String str) {
        a aVarE;
        HashMap<String, a> map = f;
        synchronized (map) {
            try {
                aVarE = map.get(str);
                if (aVarE == null) {
                    try {
                        try {
                            aVarE = e(context, str);
                            map.put(str, aVarE);
                        } catch (XmlPullParserException e2) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                        }
                    } catch (IOException e3) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVarE;
    }

    public static Uri d(Context context, String str, File file) {
        return c(context, str).a(file);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.content.FileProvider.b e(android.content.Context r7, java.lang.String r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.e(android.content.Context, java.lang.String):androidx.core.content.FileProvider$b");
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.a) {
            this.b = str;
        }
        HashMap<String, a> map = f;
        synchronized (map) {
            map.remove(str);
        }
    }

    public final a b() {
        a aVar;
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.c == null) {
                    this.c = c(getContext(), this.b);
                }
                aVar = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return b().b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File fileB = b().b(uri);
        int iLastIndexOf = fileB.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileB.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File fileB = b().b(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                l5.q(l5.l("Invalid mode: ", str));
                return null;
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(fileB, i);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File fileB = b().b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = d;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? fileB.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(fileB.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
