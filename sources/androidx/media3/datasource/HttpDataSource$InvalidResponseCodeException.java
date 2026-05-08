package androidx.media3.datasource;

import defpackage.gf3;
import defpackage.p6;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map<String, List<String>> headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage;

    public HttpDataSource$InvalidResponseCodeException(int i, String str, DataSourceException dataSourceException, Map map, gf3 gf3Var, byte[] bArr) {
        super(p6.c(i, "Response code: "), dataSourceException, gf3Var, 2004);
        this.responseCode = i;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
