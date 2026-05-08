package defpackage;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class ue3 extends a91 {
    public gf3 e;
    public byte[] f;
    public int g;
    public int h;

    @Override // androidx.media3.datasource.a
    public final Uri a() {
        gf3 gf3Var = this.e;
        if (gf3Var != null) {
            return gf3Var.a;
        }
        return null;
    }

    @Override // androidx.media3.datasource.a
    public final long b(gf3 gf3Var) throws ParserException, DataSourceException {
        q(gf3Var);
        this.e = gf3Var;
        Uri uri = gf3Var.a;
        long j = gf3Var.g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        ka2.k("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = vjg.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException(p6.d(uriNormalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(l5.l("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            this.f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = gf3Var.f;
        byte[] bArr = this.f;
        if (j2 > bArr.length) {
            this.f = null;
            throw new DataSourceException(2008);
        }
        int i = (int) j2;
        this.g = i;
        int length = bArr.length - i;
        this.h = length;
        if (j != -1) {
            this.h = (int) Math.min(length, j);
        }
        r(gf3Var);
        return j != -1 ? j : this.h;
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        if (this.f != null) {
            this.f = null;
            p();
        }
        this.e = null;
    }

    @Override // defpackage.te3
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        String str = vjg.a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        o(iMin);
        return iMin;
    }
}
