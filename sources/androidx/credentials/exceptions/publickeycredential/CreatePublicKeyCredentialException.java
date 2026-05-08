package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.CreateCredentialException;
import defpackage.l5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class CreatePublicKeyCredentialException extends CreateCredentialException {
    private final String type;

    public CreatePublicKeyCredentialException(CharSequence charSequence, String str) {
        super(charSequence, str);
        this.type = str;
        if (str.length() > 0) {
            return;
        }
        l5.q("type must not be empty");
        throw null;
    }
}
