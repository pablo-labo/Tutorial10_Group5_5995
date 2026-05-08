package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.util.Base64;
import android.util.Log;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import defpackage.ala;
import defpackage.c36;
import defpackage.dla;
import defpackage.et4;
import defpackage.f63;
import defpackage.fib;
import defpackage.fm7;
import defpackage.h0;
import defpackage.ie3;
import defpackage.kc9;
import defpackage.l5;
import defpackage.lc9;
import defpackage.p84;
import defpackage.r6;
import defpackage.sy3;
import defpackage.vfa;
import defpackage.xh6;
import defpackage.yp2;
import defpackage.zve;
import io.jsonwebtoken.JwsHeader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;", "", "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicKeyCredentialControllerUtility {
    private static final int FLAGS = 11;
    private static final String TAG = "PublicKeyUtility";
    private static final LinkedHashMap<ErrorCode, p84> orderedErrorCodeToExceptions;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    private static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    private static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    private static final String JSON_KEY_SIGNATURE = "signature";
    private static final String JSON_KEY_USER_HANDLE = "userHandle";
    private static final String JSON_KEY_RESPONSE = "response";
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_RAW_ID = "rawId";
    private static final String JSON_KEY_TYPE = "type";
    private static final String JSON_KEY_RPID = "rpId";
    private static final String JSON_KEY_CHALLENGE = "challenge";
    private static final String JSON_KEY_APPID = "appid";
    private static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    private static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    private static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    private static final String JSON_KEY_RES_KEY = "residentKey";
    private static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    private static final String JSON_KEY_TIMEOUT = "timeout";
    private static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    private static final String JSON_KEY_TRANSPORTS = "transports";
    private static final String JSON_KEY_RP = "rp";
    private static final String JSON_KEY_NAME = "name";
    private static final String JSON_KEY_ICON = "icon";
    private static final String JSON_KEY_ALG = JwsHeader.ALGORITHM;
    private static final String JSON_KEY_USER = "user";
    private static final String JSON_KEY_DISPLAY_NAME = "displayName";
    private static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    private static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    private static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    private static final String JSON_KEY_EXTENSTIONS = "extensions";
    private static final String JSON_KEY_ATTESTATION = "attestation";
    private static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    private static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    private static final String JSON_KEY_RK = "rk";
    private static final String JSON_KEY_CRED_PROPS = "credProps";

    static {
        Pair[] pairArr = {new Pair(ErrorCode.UNKNOWN_ERR, new yp2(1)), new Pair(ErrorCode.ABORT_ERR, new h0(0)), new Pair(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new h0(1)), new Pair(ErrorCode.CONSTRAINT_ERR, new yp2(0)), new Pair(ErrorCode.DATA_ERR, new ie3()), new Pair(ErrorCode.INVALID_STATE_ERR, new fm7()), new Pair(ErrorCode.ENCODING_ERR, new et4()), new Pair(ErrorCode.NETWORK_ERR, new vfa()), new Pair(ErrorCode.NOT_ALLOWED_ERR, new ala()), new Pair(ErrorCode.NOT_SUPPORTED_ERR, new xh6()), new Pair(ErrorCode.SECURITY_ERR, new dla(1)), new Pair(ErrorCode.TIMEOUT_ERR, new dla(2))};
        LinkedHashMap<ErrorCode, p84> linkedHashMap = new LinkedHashMap<>(kc9.V(12));
        lc9.e0(linkedHashMap, pairArr);
        orderedErrorCodeToExceptions = linkedHashMap;
    }

    public static final PublicKeyCredentialCreationOptions convert(f63 f63Var) {
        return INSTANCE.convert(f63Var);
    }

    @Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\bL\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0019\u001a\u00020$¢\u0006\u0004\b&\u0010'J!\u0010.\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00103\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b4\u00102J\u001f\u00107\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b6\u00102J\u001f\u00109\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b8\u00102J\u001f\u0010;\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b:\u00102J\u001f\u0010=\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b<\u00102J\u0015\u0010?\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u0012¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u000e¢\u0006\u0004\bB\u0010CJ\u0015\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010NR\u001a\u0010Q\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010NR\u001a\u0010S\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bS\u0010L\u001a\u0004\bT\u0010NR\u001a\u0010U\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bU\u0010L\u001a\u0004\bV\u0010NR\u001a\u0010W\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bW\u0010L\u001a\u0004\bX\u0010NR\u001a\u0010Y\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bY\u0010L\u001a\u0004\bZ\u0010NR\u001a\u0010[\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b[\u0010L\u001a\u0004\b\\\u0010NR\u001a\u0010]\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b]\u0010L\u001a\u0004\b^\u0010NR\u001a\u0010_\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b_\u0010L\u001a\u0004\b`\u0010NR\u001a\u0010a\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\ba\u0010L\u001a\u0004\bb\u0010NR\u001a\u0010c\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bc\u0010L\u001a\u0004\bd\u0010NR\u001a\u0010e\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\be\u0010L\u001a\u0004\bf\u0010NR\u001a\u0010g\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bg\u0010L\u001a\u0004\bh\u0010NR\u001a\u0010i\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bi\u0010L\u001a\u0004\bj\u0010NR\u001a\u0010k\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bk\u0010L\u001a\u0004\bl\u0010NR\u001a\u0010m\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bm\u0010L\u001a\u0004\bn\u0010NR\u001a\u0010o\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bo\u0010L\u001a\u0004\bp\u0010NR\u001a\u0010q\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bq\u0010L\u001a\u0004\br\u0010NR\u001a\u0010s\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bs\u0010L\u001a\u0004\bt\u0010NR\u001a\u0010u\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bu\u0010L\u001a\u0004\bv\u0010NR\u001a\u0010w\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bw\u0010L\u001a\u0004\bx\u0010NR\u001a\u0010y\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\by\u0010L\u001a\u0004\bz\u0010NR\u001a\u0010{\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b{\u0010L\u001a\u0004\b|\u0010NR\u001a\u0010}\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b}\u0010L\u001a\u0004\b~\u0010NR\u001b\u0010\u007f\u001a\u00020\u00128\u0000X\u0080D¢\u0006\r\n\u0004\b\u007f\u0010L\u001a\u0005\b\u0080\u0001\u0010NR\u001d\u0010\u0081\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010L\u001a\u0005\b\u0082\u0001\u0010NR\u001d\u0010\u0083\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010L\u001a\u0005\b\u0084\u0001\u0010NR\u001d\u0010\u0085\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010L\u001a\u0005\b\u0086\u0001\u0010NR\u001d\u0010\u0087\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010L\u001a\u0005\b\u0088\u0001\u0010NR\u001d\u0010\u0089\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010L\u001a\u0005\b\u008a\u0001\u0010NR\u001d\u0010\u008b\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010L\u001a\u0005\b\u008c\u0001\u0010NR\u001d\u0010\u008d\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010L\u001a\u0005\b\u008e\u0001\u0010NR\u001d\u0010\u008f\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010L\u001a\u0005\b\u0090\u0001\u0010NR\u001d\u0010\u0091\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010L\u001a\u0005\b\u0092\u0001\u0010NR?\u0010\u0096\u0001\u001a\"\u0012\u0004\u0012\u00020(\u0012\u0005\u0012\u00030\u0094\u00010\u0093\u0001j\u0010\u0012\u0004\u0012\u00020(\u0012\u0005\u0012\u00030\u0094\u0001`\u0095\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0017\u0010\u009a\u0001\u001a\u00020D8\u0002X\u0082T¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0016\u0010\u009c\u0001\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010L¨\u0006\u009d\u0001"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;", "", "<init>", "()V", "Lf63;", "request", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "convert", "(Lf63;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "Lorg/json/JSONObject;", "json", "convertJSON$credentials_play_services_auth_release", "(Lorg/json/JSONObject;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "convertJSON", "", "clientDataJSON", "attestationObject", "", "", "transportArray", "Lj6g;", "addAuthenticatorAttestationResponse$credentials_play_services_auth_release", "([B[B[Ljava/lang/String;Lorg/json/JSONObject;)V", "addAuthenticatorAttestationResponse", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "cred", "toAssertPasskeyResponse", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Ljava/lang/String;", "Lc36;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "convertToPlayAuthPasskeyJsonRequest", "(Lc36;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "convertToPlayAuthPasskeyRequest", "(Lc36;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "Landroidx/credentials/exceptions/CreateCredentialException;", "publicKeyCredentialResponseContainsError", "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)Landroidx/credentials/exceptions/CreateCredentialException;", "Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;", "code", "msg", "Landroidx/credentials/exceptions/GetCredentialException;", "beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release", "(Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", "beginSignInPublicKeyCredentialResponseContainsError", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$a;", "builder", "parseOptionalExtensions$credentials_play_services_auth_release", "(Lorg/json/JSONObject;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$a;)V", "parseOptionalExtensions", "parseOptionalAuthenticatorSelection$credentials_play_services_auth_release", "parseOptionalAuthenticatorSelection", "parseOptionalTimeout$credentials_play_services_auth_release", "parseOptionalTimeout", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials", "parseRequiredRpAndParams$credentials_play_services_auth_release", "parseRequiredRpAndParams", "parseRequiredChallengeAndUser$credentials_play_services_auth_release", "parseRequiredChallengeAndUser", "str", "b64Decode", "(Ljava/lang/String;)[B", "data", "b64Encode", "([B)Ljava/lang/String;", "", JwsHeader.ALGORITHM, "", "checkAlgSupported", "(I)Z", "getChallenge", "(Lorg/json/JSONObject;)[B", "JSON_KEY_CLIENT_DATA", "Ljava/lang/String;", "getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release", "()Ljava/lang/String;", "JSON_KEY_ATTESTATION_OBJ", "getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release", "JSON_KEY_AUTH_DATA", "getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release", "JSON_KEY_SIGNATURE", "getJSON_KEY_SIGNATURE$credentials_play_services_auth_release", "JSON_KEY_USER_HANDLE", "getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release", "JSON_KEY_RESPONSE", "getJSON_KEY_RESPONSE$credentials_play_services_auth_release", "JSON_KEY_ID", "getJSON_KEY_ID$credentials_play_services_auth_release", "JSON_KEY_RAW_ID", "getJSON_KEY_RAW_ID$credentials_play_services_auth_release", "JSON_KEY_TYPE", "getJSON_KEY_TYPE$credentials_play_services_auth_release", "JSON_KEY_RPID", "getJSON_KEY_RPID$credentials_play_services_auth_release", "JSON_KEY_CHALLENGE", "getJSON_KEY_CHALLENGE$credentials_play_services_auth_release", "JSON_KEY_APPID", "getJSON_KEY_APPID$credentials_play_services_auth_release", "JSON_KEY_THIRD_PARTY_PAYMENT", "getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release", "JSON_KEY_AUTH_SELECTION", "getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release", "JSON_KEY_REQUIRE_RES_KEY", "getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release", "JSON_KEY_RES_KEY", "getJSON_KEY_RES_KEY$credentials_play_services_auth_release", "JSON_KEY_AUTH_ATTACHMENT", "getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release", "JSON_KEY_TIMEOUT", "getJSON_KEY_TIMEOUT$credentials_play_services_auth_release", "JSON_KEY_EXCLUDE_CREDENTIALS", "getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release", "JSON_KEY_TRANSPORTS", "getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release", "JSON_KEY_RP", "getJSON_KEY_RP$credentials_play_services_auth_release", "JSON_KEY_NAME", "getJSON_KEY_NAME$credentials_play_services_auth_release", "JSON_KEY_ICON", "getJSON_KEY_ICON$credentials_play_services_auth_release", "JSON_KEY_ALG", "getJSON_KEY_ALG$credentials_play_services_auth_release", "JSON_KEY_USER", "getJSON_KEY_USER$credentials_play_services_auth_release", "JSON_KEY_DISPLAY_NAME", "getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release", "JSON_KEY_USER_VERIFICATION_METHOD", "getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release", "JSON_KEY_KEY_PROTECTION_TYPE", "getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release", "JSON_KEY_MATCHER_PROTECTION_TYPE", "getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release", "JSON_KEY_EXTENSTIONS", "getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release", "JSON_KEY_ATTESTATION", "getJSON_KEY_ATTESTATION$credentials_play_services_auth_release", "JSON_KEY_PUB_KEY_CRED_PARAMS", "getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release", "JSON_KEY_CLIENT_EXTENSION_RESULTS", "getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release", "JSON_KEY_RK", "getJSON_KEY_RK$credentials_play_services_auth_release", "JSON_KEY_CRED_PROPS", "getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release", "Ljava/util/LinkedHashMap;", "Lp84;", "Lkotlin/collections/LinkedHashMap;", "orderedErrorCodeToExceptions", "Ljava/util/LinkedHashMap;", "getOrderedErrorCodeToExceptions$credentials_play_services_auth_release", "()Ljava/util/LinkedHashMap;", "FLAGS", "I", "TAG", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final byte[] getChallenge(JSONObject json) throws JSONException {
            String strOptString = json.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth_release(), "");
            strOptString.getClass();
            if (strOptString.length() != 0) {
                return b64Decode(strOptString);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth_release(byte[] clientDataJSON, byte[] attestationObject, String[] transportArray, JSONObject json) throws JSONException {
            clientDataJSON.getClass();
            attestationObject.getClass();
            transportArray.getClass();
            json.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release(), b64Encode(clientDataJSON));
            jSONObject.put(getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release(), b64Encode(attestationObject));
            jSONObject.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release(), new JSONArray(transportArray));
            json.put(getJSON_KEY_RESPONSE$credentials_play_services_auth_release(), jSONObject);
        }

        public final byte[] b64Decode(String str) {
            str.getClass();
            byte[] bArrDecode = Base64.decode(str, PublicKeyCredentialControllerUtility.FLAGS);
            bArrDecode.getClass();
            return bArrDecode;
        }

        public final String b64Encode(byte[] data) {
            data.getClass();
            String strEncodeToString = Base64.encodeToString(data, PublicKeyCredentialControllerUtility.FLAGS);
            strEncodeToString.getClass();
            return strEncodeToString;
        }

        public final GetCredentialException beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(ErrorCode code, String msg) {
            code.getClass();
            p84 p84Var = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(code);
            return p84Var == null ? new GetPublicKeyCredentialDomException(new yp2(1), l5.l("unknown fido gms exception - ", msg)) : (code == ErrorCode.CONSTRAINT_ERR && msg != null && zve.L(msg, "Unable to get sync account", false)) ? new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.") : new GetPublicKeyCredentialDomException(p84Var, msg);
        }

        public final boolean checkAlgSupported(int alg) {
            try {
                COSEAlgorithmIdentifier.a(alg);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final PublicKeyCredentialCreationOptions convert(f63 request) {
            request.getClass();
            return convertJSON$credentials_play_services_auth_release(new JSONObject((String) null));
        }

        public final PublicKeyCredentialCreationOptions convertJSON$credentials_play_services_auth_release(JSONObject json) throws JSONException, CreatePublicKeyCredentialDomException {
            json.getClass();
            PublicKeyCredentialCreationOptions.a aVar = new PublicKeyCredentialCreationOptions.a();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(json, aVar);
            parseRequiredRpAndParams$credentials_play_services_auth_release(json, aVar);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(json, aVar);
            parseOptionalTimeout$credentials_play_services_auth_release(json, aVar);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(json, aVar);
            parseOptionalExtensions$credentials_play_services_auth_release(json, aVar);
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = aVar.a;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = aVar.b;
            byte[] bArr = aVar.c;
            ArrayList arrayList = aVar.d;
            Double d = aVar.e;
            ArrayList arrayList2 = aVar.f;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = aVar.g;
            AttestationConveyancePreference attestationConveyancePreference = aVar.h;
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, arrayList, d, arrayList2, authenticatorSelectionCriteria, null, null, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), aVar.i);
        }

        public final BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest(c36 option) {
            option.getClass();
            return new BeginSignInRequest.PasskeyJsonRequestOptions(null, true);
        }

        @sy3
        public final BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest(c36 option) throws JSONException {
            option.getClass();
            JSONObject jSONObject = new JSONObject((String) null);
            String strOptString = jSONObject.optString(getJSON_KEY_RPID$credentials_play_services_auth_release(), "");
            strOptString.getClass();
            if (strOptString.length() != 0) {
                return new BeginSignInRequest.PasskeysRequestOptions(true, getChallenge(jSONObject), strOptString);
            }
            throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final LinkedHashMap<ErrorCode, p84> getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.a builder) throws JSONException {
            json.getClass();
            builder.getClass();
            if (json.has(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release());
                boolean zOptBoolean = jSONObject.optBoolean(getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release(), false);
                String strOptString = jSONObject.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth_release(), "");
                strOptString.getClass();
                ResidentKeyRequirement residentKeyRequirementA = strOptString.length() > 0 ? ResidentKeyRequirement.a(strOptString) : null;
                Boolean boolValueOf = Boolean.valueOf(zOptBoolean);
                String strOptString2 = jSONObject.optString(getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release(), "");
                strOptString2.getClass();
                Attachment attachmentA = strOptString2.length() > 0 ? Attachment.a(strOptString2) : null;
                builder.g = new AuthenticatorSelectionCriteria(attachmentA == null ? null : attachmentA.toString(), boolValueOf, null, residentKeyRequirementA == null ? null : residentKeyRequirementA.toString());
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.a builder) throws JSONException {
            json.getClass();
            builder.getClass();
            if (json.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release());
                String strOptString = jSONObject.optString(getJSON_KEY_APPID$credentials_play_services_auth_release(), "");
                strOptString.getClass();
                builder.i = new AuthenticationExtensions(strOptString.length() > 0 ? new FidoAppIdExtension(strOptString) : null, null, jSONObject.optBoolean("uvm", false) ? new UserVerificationMethodExtension(true) : null, null, null, null, null, null, jSONObject.optBoolean(getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release(), false) ? new GoogleThirdPartyPaymentExtension(true) : null, null);
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.a builder) {
            json.getClass();
            builder.getClass();
            if (json.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release())) {
                builder.e = Double.valueOf(json.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()) / 1000.0d);
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.a builder) throws JSONException, CreatePublicKeyCredentialDomException {
            ArrayList arrayList;
            json.getClass();
            builder.getClass();
            ArrayList arrayList2 = new ArrayList();
            if (json.has(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release())) {
                JSONArray jSONArray = json.getJSONArray(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
                    string.getClass();
                    byte[] bArrB64Decode = b64Decode(string);
                    String string2 = jSONObject.getString(getJSON_KEY_TYPE$credentials_play_services_auth_release());
                    string2.getClass();
                    if (string2.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (bArrB64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release());
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            try {
                                arrayList.add(Transport.a(jSONArray2.getString(i2)));
                            } catch (Transport.UnsupportedTransportException e) {
                                throw new CreatePublicKeyCredentialDomException(new et4(), e.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new PublicKeyCredentialDescriptor(string2, bArrB64Decode, arrayList));
                }
            }
            builder.f = arrayList2;
            String strOptString = json.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth_release(), "none");
            strOptString.getClass();
            builder.h = AttestationConveyancePreference.a(strOptString.length() != 0 ? strOptString : "none");
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.a builder) throws JSONException {
            json.getClass();
            builder.getClass();
            byte[] challenge = getChallenge(json);
            fib.i(challenge);
            builder.c = challenge;
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth_release());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            string.getClass();
            byte[] bArrB64Decode = b64Decode(string);
            String string2 = jSONObject.getString(getJSON_KEY_NAME$credentials_play_services_auth_release());
            String string3 = jSONObject.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release());
            String strOptString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            string3.getClass();
            if (string3.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (bArrB64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            string2.getClass();
            if (string2.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.b = new PublicKeyCredentialUserEntity(string2, strOptString, string3, bArrB64Decode);
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.a builder) throws JSONException {
            json.getClass();
            builder.getClass();
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth_release());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            String strOptString = jSONObject.optString(getJSON_KEY_NAME$credentials_play_services_auth_release(), "");
            String strOptString2 = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            strOptString2.getClass();
            if (strOptString2.length() == 0) {
                strOptString2 = null;
            }
            strOptString.getClass();
            if (strOptString.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            string.getClass();
            if (string.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            builder.a = new PublicKeyCredentialRpEntity(string, strOptString, strOptString2);
            JSONArray jSONArray = json.getJSONArray(getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                int i2 = (int) jSONObject2.getLong(getJSON_KEY_ALG$credentials_play_services_auth_release());
                String strOptString3 = jSONObject2.optString(getJSON_KEY_TYPE$credentials_play_services_auth_release(), "");
                strOptString3.getClass();
                if (strOptString3.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i2)) {
                    arrayList.add(new PublicKeyCredentialParameters(strOptString3, i2));
                }
            }
            builder.d = arrayList;
        }

        public final CreateCredentialException publicKeyCredentialResponseContainsError(PublicKeyCredential cred) {
            cred.getClass();
            SafeParcelable safeParcelable = cred.d;
            if (safeParcelable == null && (safeParcelable = cred.e) == null && (safeParcelable = cred.f) == null) {
                r6.g("No response set.");
                return null;
            }
            if (!(safeParcelable instanceof AuthenticatorErrorResponse)) {
                return null;
            }
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) safeParcelable;
            ErrorCode errorCode = authenticatorErrorResponse.a;
            errorCode.getClass();
            p84 p84Var = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(errorCode);
            String str = authenticatorErrorResponse.b;
            return p84Var == null ? new CreatePublicKeyCredentialDomException(new yp2(1), l5.l("unknown fido gms exception - ", str)) : (errorCode == ErrorCode.CONSTRAINT_ERR && str != null && zve.L(str, "Unable to get sync account", false)) ? new CreateCredentialCancellationException("Passkey registration was cancelled by the user.") : new CreatePublicKeyCredentialDomException(p84Var, str);
        }

        public final String toAssertPasskeyResponse(SignInCredential cred) throws GetCredentialException {
            cred.getClass();
            JSONObject jSONObject = new JSONObject();
            PublicKeyCredential publicKeyCredential = cred.X;
            Object obj = null;
            if (publicKeyCredential != null) {
                Object obj2 = publicKeyCredential.d;
                if (obj2 == null && (obj2 = publicKeyCredential.e) == null && (obj2 = publicKeyCredential.f) == null) {
                    r6.g("No response set.");
                    return null;
                }
                obj = obj2;
            }
            obj.getClass();
            if (obj instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
                ErrorCode errorCode = authenticatorErrorResponse.a;
                errorCode.getClass();
                throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(errorCode, authenticatorErrorResponse.b);
            }
            if (!(obj instanceof AuthenticatorAssertionResponse)) {
                Log.e(PublicKeyCredentialControllerUtility.TAG, "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                String string = jSONObject.toString();
                string.getClass();
                return string;
            }
            try {
                String strS0 = publicKeyCredential.s0();
                strS0.getClass();
                return strS0;
            } catch (Throwable th) {
                throw new GetCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
            }
        }

        private Companion() {
        }
    }
}
