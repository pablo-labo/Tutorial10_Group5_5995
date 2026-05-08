package retrofit2;

import defpackage.m6d;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;

    public HttpException(m6d<?> m6dVar) {
        StringBuilder sb = new StringBuilder("HTTP ");
        Response response = m6dVar.a;
        int i = response.d;
        sb.append(i);
        sb.append(" ");
        String str = response.c;
        sb.append(str);
        super(sb.toString());
        this.code = i;
        this.message = str;
    }
}
