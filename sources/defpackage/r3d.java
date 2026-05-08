package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$1;

/* JADX INFO: loaded from: classes2.dex */
public final class r3d {
    public static FileInputStream a(ReactApplicationContext reactApplicationContext, Uri uri) throws IOException {
        File fileCreateTempFile = File.createTempFile("RequestBodyUtil", "temp", reactApplicationContext.getApplicationContext().getCacheDir());
        fileCreateTempFile.deleteOnExit();
        URL url = new URL(uri.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenStream);
                try {
                    fileOutputStream.getChannel().transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                    c0h.q(readableByteChannelNewChannel, null);
                    c0h.q(inputStreamOpenStream, null);
                    fileOutputStream.close();
                    return fileInputStream;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static final RequestBody$Companion$toRequestBody$1 b(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == 79599 ? !str.equals("PUT") : !(iHashCode == 2461856 ? str.equals("POST") : iHashCode == 75900968 && str.equals("PATCH"))) {
            return null;
        }
        RequestBody.Companion companion = RequestBody.INSTANCE;
        vr1 vr1Var = vr1.c;
        companion.getClass();
        vr1Var.getClass();
        return new RequestBody$Companion$toRequestBody$1(null, vr1Var);
    }

    public static final InputStream c(ReactApplicationContext reactApplicationContext, String str) {
        Collection collectionQ1;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (scheme != null && wve.K(scheme, "http", false)) {
                return a(reactApplicationContext, uri);
            }
            if (!wve.K(str, "data:", false)) {
                return reactApplicationContext.getContentResolver().openInputStream(uri);
            }
            List<String> listG = new pxc(",").g(str, 0);
            if (listG.isEmpty()) {
                collectionQ1 = zr4.a;
            } else {
                ListIterator<String> listIterator = listG.listIterator(listG.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        collectionQ1 = z92.q1(listG, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                collectionQ1 = zr4.a;
            }
            return new ByteArrayInputStream(Base64.decode(((String[]) collectionQ1.toArray(new String[0]))[1], 0));
        } catch (Exception e) {
            s55.g("ReactNative", "Could not retrieve file for contentUri ".concat(str), e);
            return null;
        }
    }
}
