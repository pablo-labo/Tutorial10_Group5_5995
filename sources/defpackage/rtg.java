package defpackage;

import android.util.Base64;
import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rtg {

    public static final class a {
        public final String[] a;

        public a(String[] strArr) {
            this.a = strArr;
        }
    }

    public static final class b {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final byte[] g;

        public c(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = bArr;
        }
    }

    public static js9 a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String str2 = vjg.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                zkd.T("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(fab.d(new g4b(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    zkd.U("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new otg(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new js9(arrayList);
    }

    public static a b(g4b g4bVar, boolean z, boolean z2) throws ParserException {
        if (z) {
            c(3, g4bVar, false);
        }
        g4bVar.v((int) g4bVar.o(), StandardCharsets.UTF_8);
        long jO = g4bVar.o();
        String[] strArr = new String[(int) jO];
        for (int i = 0; i < jO; i++) {
            strArr[i] = g4bVar.v((int) g4bVar.o(), StandardCharsets.UTF_8);
        }
        if (z2 && (g4bVar.x() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new a(strArr);
    }

    public static boolean c(int i, g4b g4bVar, boolean z) {
        if (g4bVar.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "too short header: " + g4bVar.a());
        }
        if (g4bVar.x() != i) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "expected header type " + Integer.toHexString(i));
        }
        if (g4bVar.x() == 118 && g4bVar.x() == 111 && g4bVar.x() == 114 && g4bVar.x() == 98 && g4bVar.x() == 105 && g4bVar.x() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }
}
