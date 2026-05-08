package androidx.credentials.exceptions;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/exceptions/NoCredentialException;", "Landroidx/credentials/exceptions/GetCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NoCredentialException extends GetCredentialException {
    public NoCredentialException(String str) {
        super(str, "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL");
    }
}
