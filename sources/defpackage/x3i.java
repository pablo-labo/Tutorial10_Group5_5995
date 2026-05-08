package defpackage;

import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import io.jsonwebtoken.JwsHeader;

/* JADX INFO: loaded from: classes2.dex */
public final class x3i {
    public static final hth a = new hth("id");
    public static final hth b = new hth("type");

    static {
        nth.f("transports");
        nth.f("name");
        nth.f("icon");
        nth.f("displayName");
        nth.f(JwsHeader.ALGORITHM);
        nth.f("plat");
        nth.f("rk");
        nth.f("clientPin");
        nth.f(GesturesListener.SCROLL_DIRECTION_UP);
        nth.f("uv");
        nth.f("alwaysUv");
        nth.f("credMgmt");
        nth.f("authnrCfg");
        nth.f("bioEnroll");
        nth.f("largeBlobs");
        nth.f("pinUvAuthToken");
        nth.f("noMcGaPermissionsWithClientPin");
        nth.f("ep");
        nth.f("uvBioEnroll");
        nth.f("uvAcfg");
        nth.f("setMinPINLength");
        nth.f("makeCredUvNotRqd");
        nth.f("credentialMgmtPreview");
        nth.f("userVerificationMgmtPreview");
        nth.f("uvm");
        nth.f("multiAssertion");
        nth.f(RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY);
        nth.f("google_userVerificationOrigin");
    }
}
