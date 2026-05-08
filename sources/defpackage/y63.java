package defpackage;

import android.content.Context;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.internal.FrameworkClassParsingException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class y63 implements w63 {
    public final CredentialManager a;

    public static final class a extends mj8 implements gu5<j6g> {
        final /* synthetic */ t63<d06, GetCredentialException> $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kk0 kk0Var) {
            super(0);
            this.$callback = kk0Var;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            this.$callback.a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
            return j6g.a;
        }
    }

    public static final class b implements OutcomeReceiver {
        public final /* synthetic */ kk0 a;

        public b(kk0 kk0Var, y63 y63Var) {
            this.a = kk0Var;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onError(java.lang.Throwable r4) {
            /*
                r3 = this;
                android.credentials.GetCredentialException r4 = (android.credentials.GetCredentialException) r4
                r4.getClass()
                java.lang.String r0 = "CredManProvService"
                java.lang.String r1 = "GetCredentialResponse error returned from framework"
                android.util.Log.i(r0, r1)
                java.lang.String r0 = r4.getType()
                int r1 = r0.hashCode()
                switch(r1) {
                    case -781118336: goto L52;
                    case -45448328: goto L3f;
                    case 580557411: goto L2c;
                    case 627896683: goto L18;
                    default: goto L17;
                }
            L17:
                goto L5a
            L18:
                java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L21
                goto L5a
            L21:
                androidx.credentials.exceptions.NoCredentialException r0 = new androidx.credentials.exceptions.NoCredentialException
                java.lang.String r4 = r4.getMessage()
                r0.<init>(r4)
                goto Lab
            L2c:
                java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_USER_CANCELED"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L35
                goto L5a
            L35:
                androidx.credentials.exceptions.GetCredentialCancellationException r0 = new androidx.credentials.exceptions.GetCredentialCancellationException
                java.lang.String r4 = r4.getMessage()
                r0.<init>(r4)
                goto Lab
            L3f:
                java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_INTERRUPTED"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L48
                goto L5a
            L48:
                androidx.credentials.exceptions.GetCredentialInterruptedException r0 = new androidx.credentials.exceptions.GetCredentialInterruptedException
                java.lang.String r4 = r4.getMessage()
                r0.<init>(r4)
                goto Lab
            L52:
                java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_UNKNOWN"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto La2
            L5a:
                java.lang.String r0 = r4.getType()
                r0.getClass()
                java.lang.String r1 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
                r2 = 0
                boolean r0 = defpackage.wve.K(r0, r1, r2)
                if (r0 == 0) goto L91
                int r0 = androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException.a
                java.lang.String r0 = r4.getType()
                r0.getClass()
                java.lang.String r4 = r4.getMessage()
                boolean r1 = defpackage.wve.K(r0, r1, r2)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                if (r1 == 0) goto L84
                int r1 = androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException.b     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                androidx.credentials.exceptions.GetCredentialException r0 = androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException.a.a(r0, r4)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                goto Lab
            L84:
                androidx.credentials.internal.FrameworkClassParsingException r1 = new androidx.credentials.internal.FrameworkClassParsingException     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                r1.<init>()     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                throw r1     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
            L8a:
                androidx.credentials.exceptions.GetCredentialCustomException r1 = new androidx.credentials.exceptions.GetCredentialCustomException
                r1.<init>(r0, r4)
                r0 = r1
                goto Lab
            L91:
                androidx.credentials.exceptions.GetCredentialCustomException r0 = new androidx.credentials.exceptions.GetCredentialCustomException
                java.lang.String r1 = r4.getType()
                r1.getClass()
                java.lang.String r4 = r4.getMessage()
                r0.<init>(r1, r4)
                goto Lab
            La2:
                androidx.credentials.exceptions.GetCredentialUnknownException r0 = new androidx.credentials.exceptions.GetCredentialUnknownException
                java.lang.String r4 = r4.getMessage()
                r0.<init>(r4)
            Lab:
                kk0 r3 = r3.a
                r3.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y63.b.onError(java.lang.Throwable):void");
        }

        public final void onResult(Object obj) {
            q63 ma3Var;
            GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
            getCredentialResponse.getClass();
            Log.i("CredManProvService", "GetCredentialResponse returned from framework");
            Credential credential = getCredentialResponse.getCredential();
            credential.getClass();
            String type = credential.getType();
            type.getClass();
            Bundle data = credential.getData();
            data.getClass();
            try {
                if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    try {
                        String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                        String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                        string.getClass();
                        string2.getClass();
                        ma3Var = new m5b(string2, data);
                    } catch (Exception unused) {
                        throw new FrameworkClassParsingException();
                    }
                } else {
                    if (!type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        throw new FrameworkClassParsingException();
                    }
                    try {
                        String string3 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                        string3.getClass();
                        ma3Var = new o6c(string3, data);
                    } catch (Exception unused2) {
                        throw new FrameworkClassParsingException();
                    }
                }
            } catch (FrameworkClassParsingException unused3) {
                ma3Var = new ma3(type, data);
            }
            this.a.onResult(new d06(ma3Var));
        }
    }

    public y63(Context context) {
        context.getClass();
        this.a = (CredentialManager) context.getSystemService("credential");
    }

    @Override // defpackage.w63
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.a != null;
    }

    @Override // defpackage.w63
    public final void onGetCredential(Context context, c06 c06Var, CancellationSignal cancellationSignal, Executor executor, t63<d06, GetCredentialException> t63Var) {
        context.getClass();
        c06Var.getClass();
        kk0 kk0Var = (kk0) t63Var;
        a aVar = new a(kk0Var);
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            aVar.invoke();
            return;
        }
        b bVar = new b(kk0Var, this);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (v63 v63Var : c06Var.a) {
            v63Var.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", v63Var.a, v63Var.b).setIsSystemProviderRequired(true).setAllowedProviders(v63Var.c).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builder.build();
        getCredentialRequestBuild.getClass();
        credentialManager.getCredential(context, getCredentialRequestBuild, cancellationSignal, executor, bVar);
    }
}
