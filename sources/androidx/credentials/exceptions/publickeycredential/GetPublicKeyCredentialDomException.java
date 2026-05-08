package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import defpackage.ala;
import defpackage.be3;
import defpackage.c0h;
import defpackage.cm7;
import defpackage.dac;
import defpackage.dla;
import defpackage.eia;
import defpackage.em7;
import defpackage.et4;
import defpackage.fm7;
import defpackage.h0;
import defpackage.hqc;
import defpackage.i2f;
import defpackage.ie3;
import defpackage.j5h;
import defpackage.o47;
import defpackage.p84;
import defpackage.vfa;
import defpackage.xh6;
import defpackage.y8a;
import defpackage.yp2;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;", "Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "Lp84;", "domError", "Lp84;", "getDomError", "()Lp84;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetPublicKeyCredentialDomException extends GetPublicKeyCredentialException {
    public static final /* synthetic */ int b = 0;
    private final p84 domError;

    public static final class a {
        public static GetCredentialException a(String str, String str2) {
            Exception excG;
            try {
                GetPublicKeyCredentialDomException getPublicKeyCredentialDomException = new GetPublicKeyCredentialDomException(new yp2(1), null);
                if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                    excG = c0h.g(new h0(0), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                    excG = c0h.g(new yp2(0), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                    excG = c0h.g(new be3("androidx.credentials.TYPE_DATA_CLONE_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                    excG = c0h.g(new ie3(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                    excG = c0h.g(new et4(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                    excG = c0h.g(new xh6("androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                    excG = c0h.g(new o47("androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                    excG = c0h.g(new xh6("androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                    excG = c0h.g(new cm7("androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                    excG = c0h.g(new em7("androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                    excG = c0h.g(new fm7(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                    excG = c0h.g(new y8a("androidx.credentials.TYPE_NAMESPACE_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                    excG = c0h.g(new vfa(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                    excG = c0h.g(new eia("androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                    excG = c0h.g(new ala(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                    excG = c0h.g(new dla("androidx.credentials.TYPE_NOT_FOUND_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                    excG = c0h.g(new h0(1), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                    excG = c0h.g(new xh6(), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                    excG = c0h.g(new fm7("androidx.credentials.TYPE_OPERATION_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                    excG = c0h.g(new be3("androidx.credentials.TYPE_OPT_OUT_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                    excG = c0h.g(new dac("androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                    excG = c0h.g(new hqc("androidx.credentials.TYPE_READ_ONLY_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                    excG = c0h.g(new dla(1), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                    excG = c0h.g(new i2f("androidx.credentials.TYPE_SYNTAX_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                    excG = c0h.g(new dla(2), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                    excG = c0h.g(new fm7("androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                    excG = c0h.g(new yp2(1), str2, getPublicKeyCredentialDomException);
                } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                    excG = c0h.g(new xh6("androidx.credentials.TYPE_VERSION_ERROR"), str2, getPublicKeyCredentialDomException);
                } else {
                    if (!str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                        throw new FrameworkClassParsingException();
                    }
                    excG = c0h.g(new j5h("androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"), str2, getPublicKeyCredentialDomException);
                }
                return (GetCredentialException) excG;
            } catch (FrameworkClassParsingException unused) {
                return new GetCredentialCustomException(str, str2);
            }
        }
    }

    public GetPublicKeyCredentialDomException(p84 p84Var, String str) {
        super(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(p84Var.a));
        this.domError = p84Var;
    }
}
