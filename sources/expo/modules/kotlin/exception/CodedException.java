package expo.modules.kotlin.exception;

import defpackage.pxc;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/exception/CodedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "", "providedCode", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CodedException extends Exception {
    private String providedCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodedException(String str, String str2, Throwable th) {
        super(str2, th);
        str.getClass();
        this.providedCode = str;
    }

    public final String getCode() {
        String str = this.providedCode;
        if (str != null) {
            return str;
        }
        String strE = new pxc("(.)([A-Z])").e(new pxc("(Exception)$").e(getClass().getSimpleName(), ""), "$1_$2");
        Locale locale = Locale.ROOT;
        locale.getClass();
        String upperCase = strE.toUpperCase(locale);
        upperCase.getClass();
        return "ERR_".concat(upperCase);
    }

    public CodedException() {
        super(null, null);
    }
}
