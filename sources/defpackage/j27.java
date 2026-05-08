package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.webkit.MimeTypeMap;
import expo.modules.imagepicker.FailedToCreateFileException;
import expo.modules.imagepicker.FailedToExtractVideoMetadataException;
import expo.modules.imagepicker.MediaType;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class j27 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final File a(File file, String str) {
        str.getClass();
        String strU = pg8.u(file, "ImagePicker", str);
        try {
            File file2 = new File(strU);
            file2.createNewFile();
            return file2;
        } catch (IOException e) {
            throw new FailedToCreateFileException(l5.m("Failed to create the file '", strU, "'"), e);
        }
    }

    public static final int b(MediaMetadataRetriever mediaMetadataRetriever, int i) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(i);
        if (strExtractMetadata != null) {
            return Integer.parseInt(strExtractMetadata);
        }
        throw new FailedToExtractVideoMetadataException(null, null);
    }

    public static final String c(Uri uri) {
        uri.getClass();
        if (!wl7.b(uri.getAuthority(), "com.android.providers.media.documents")) {
            if (!wl7.b(uri.getAuthority(), "com.android.providers.downloads.documents")) {
                return null;
            }
            String documentId = DocumentsContract.getDocumentId(uri);
            documentId.getClass();
            if (!wve.K(documentId, "msf:", false)) {
                return null;
            }
        }
        String documentId2 = DocumentsContract.getDocumentId(uri);
        documentId2.getClass();
        return zve.M(documentId2, ':') ? (String) zve.j0(documentId2, new char[]{':'}).get(1) : documentId2;
    }

    public static final String d(ContentResolver contentResolver, Uri uri) {
        int columnIndex;
        uri.getClass();
        String type = contentResolver.getType(uri);
        if (type != null) {
            return type;
        }
        Cursor cursorQuery = contentResolver.query(uri, (String[]) u63.Z("mime_type").toArray(new String[0]), null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("mime_type")) != -1 && !cursorQuery.isNull(columnIndex)) {
                    cursorQuery.getString(columnIndex);
                }
            } finally {
            }
        }
        c0h.q(cursorQuery, null);
        String string = uri.toString();
        string.getClass();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(string);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public static final MediaType e(ContentResolver contentResolver, Uri uri) {
        uri.getClass();
        String strD = d(contentResolver, uri);
        if (strD != null && zve.L(strD, "image/", false)) {
            return MediaType.IMAGE;
        }
        if (strD == null || !zve.L(strD, "video/", false)) {
            return null;
        }
        return MediaType.VIDEO;
    }
}
